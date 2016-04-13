package fr.lteconsulting.angular2gwt.processor;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import javax.tools.Diagnostic.Kind;
import javax.tools.JavaFileObject;

import fr.lteconsulting.angular2gwt.Component;
import fr.lteconsulting.angular2gwt.Input;
import fr.lteconsulting.angular2gwt.Output;

@SupportedAnnotationTypes(AngularComponentProcessor.AnnotationFqn)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class AngularComponentProcessor extends AbstractProcessor {
	public final static String AnnotationFqn = "fr.lteconsulting.angular2gwt.Component";

	private final static String HELPER_CLASS_SUFFIX = "_AngularComponent";

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for (TypeElement element : ElementFilter.typesIn(
				roundEnv.getElementsAnnotatedWith(processingEnv.getElementUtils().getTypeElement(AnnotationFqn)))) {
			processClass(element);
		}

		roundEnv.errorRaised();

		return true;
	}

	private void processClass(TypeElement element) {
		String template = readResource("fr/lteconsulting/angular2gwt/processor/AngularComponent.txt");

		String packageName = ((PackageElement) element.getEnclosingElement()).getQualifiedName().toString();
		String angularComponentName = element.getSimpleName() + HELPER_CLASS_SUFFIX;

		template = template.replaceAll("PACKAGE", packageName);
		template = template.replaceAll("CLASS_NAME", angularComponentName);
		template = template.replaceAll("COMPONENT_CLASS_FQN", element.getQualifiedName().toString());

		Component annotation = element.getAnnotation(Component.class);

		// selector
		String aSelector = annotation.selector();

		// template
		String aTemplate = annotation.template().isEmpty() ? "" : "template: \"" + annotation.template() + "\",";

		// templateUrl
		String aTemplateUrl = annotation.templateUrl().isEmpty() ? ""
				: "templateUrl: \"" + annotation.templateUrl() + "\",";

		// styles
		String aStyles = annotation.styles().isEmpty() ? "" : "styles: [" + annotation.styles() + "],";

		StringBuilder aStyleUrls = new StringBuilder();
		for (int i = 0; i < annotation.styleUrls().length; i++) {
			if (i == 0)
				aStyleUrls.append("styleUrls: [");
			else
				aStyleUrls.append(", ");
			aStyleUrls.append("'" + annotation.styleUrls()[i] + "'");
		}
		if (annotation.styleUrls().length > 0)
			aStyleUrls.append("],");

		// directives
		StringBuilder directives = new StringBuilder();
		Optional<? extends AnnotationMirror> optAnnotationMirror = element.getAnnotationMirrors().stream().filter(m -> {
			return processingEnv.getTypeUtils().isSameType(m.getAnnotationType(),
					processingEnv.getElementUtils().getTypeElement(AnnotationFqn).asType());
		}).findFirst();
		if (optAnnotationMirror.isPresent()) {
			AnnotationMirror annotationMirror = optAnnotationMirror.get();
			Optional<? extends ExecutableElement> optKey = annotationMirror.getElementValues().keySet().stream()
					.filter(k -> k.getSimpleName().toString().equals("directives")).findFirst();
			if (optKey.isPresent()) {
				ExecutableElement key = optKey.get();
				AnnotationValue value = annotationMirror.getElementValues().get(key);

				value.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
					@Override
					public Void visitArray(List<? extends AnnotationValue> vals, Void p) {
						for (AnnotationValue v : vals) {
							v.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
								public Void visitType(javax.lang.model.type.TypeMirror t, Void p) {
									if (directives.length() == 0)
										directives.append("directives: [");
									else
										directives.append(", ");

									directives.append("@" + t.toString() + HELPER_CLASS_SUFFIX + "::get()()");
									return null;
								};
							}, null);
						}
						return null;
					}
				}, null);
			}
		}
		if (directives.length() > 0)
			directives.append("],");

		// providers
		StringBuilder providers = new StringBuilder();
		if (optAnnotationMirror.isPresent()) {
			AnnotationMirror annotationMirror = optAnnotationMirror.get();
			Optional<? extends ExecutableElement> optKey = annotationMirror.getElementValues().keySet().stream()
					.filter(k -> k.getSimpleName().toString().equals("providers")).findFirst();
			if (optKey.isPresent()) {
				ExecutableElement key = optKey.get();
				AnnotationValue value = annotationMirror.getElementValues().get(key);

				value.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
					@Override
					public Void visitArray(List<? extends AnnotationValue> vals, Void p) {
						for (AnnotationValue v : vals) {
							v.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
								public Void visitType(javax.lang.model.type.TypeMirror t, Void p) {
									if (providers.length() == 0)
										providers.append("providers: [");
									else
										providers.append(", ");

									providers.append("$wnd." + t.toString());
									return null;
								};
							}, null);
						}
						return null;
					}
				}, null);
			}
		}
		if (providers.length() > 0)
			providers.append("],");

		// input fields
		StringBuilder inputs = new StringBuilder();
		ElementFilter.fieldsIn(processingEnv.getElementUtils().getAllMembers(element)).stream()
				.filter(f -> f.getAnnotation(Input.class) != null).map(f -> f.getSimpleName().toString())
				.forEach(name -> {
					if (inputs.length() > 0)
						inputs.append(", ");
					else
						inputs.append("inputs: [");
					inputs.append("'");
					inputs.append(name);
					inputs.append("'");
				});
		if (inputs.length() > 0)
			inputs.append("],");

		// output fields
		StringBuilder outputs = new StringBuilder();
		ElementFilter.fieldsIn(processingEnv.getElementUtils().getAllMembers(element)).stream()
				.filter(f -> f.getAnnotation(Output.class) != null).map(f -> f.getSimpleName().toString())
				.forEach(name -> {
					if (outputs.length() > 0)
						outputs.append(", ");
					else
						outputs.append("outputs: [");
					outputs.append("'");
					outputs.append(name);
					outputs.append("'");
				});
		if (outputs.length() > 0)
			outputs.append("],");

		// parameters
		// trouver le constructeur (soit aucun et c'est bon, soit un seul et
		// c'est celui la, soit plusieurs et c'est celui qui a @JsConstructor
		// parcourir ses paramètres, et les ajouter dans les métadonnées
		StringBuilder parameters = new StringBuilder();
		List<ExecutableElement> constructors = ElementFilter.constructorsIn(element.getEnclosedElements());
		if (constructors != null && !constructors.isEmpty()) {
			if (constructors.size() > 1) {
				processingEnv.getMessager().printMessage(Kind.ERROR, "Multiple constructors not yet supported",
						element);
				return;
			}

			ExecutableElement constructor = constructors.get(0);
			constructor.getParameters().forEach(p -> {
				if (parameters.length() > 0)
					parameters.append(", ");
				parameters.append("$wnd." + p.asType().toString());
			});
		}

		template = template.replace("PARAMETERS", parameters.toString());
		template = template.replace("SELECTOR", aSelector);
		template = template.replace("TEMPLATE_URL", aTemplateUrl);
		template = template.replace("TEMPLATE", aTemplate);
		template = template.replace("STYLES", aStyles);
		template = template.replace("STYLE_URLS", aStyleUrls.toString());
		template = template.replace("DIRECTIVES", directives.toString());
		template = template.replace("PROVIDERS", providers.toString());
		template = template.replace("INPUTS", inputs.toString());
		template = template.replace("OUTPUTS", outputs.toString());

		String targetClassFqn = packageName + "." + angularComponentName;

		try {
			JavaFileObject jfo = processingEnv.getFiler().createSourceFile(targetClassFqn, element);

			OutputStream os = jfo.openOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.print(template);
			pw.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
			processingEnv.getMessager().printMessage(Kind.ERROR, "AngularComponent non généré !" + e, element);
		}
	}

	@SuppressWarnings("resource")
	private static String readResource(String fqn) {
		try {
			return new Scanner(AngularComponentProcessor.class.getClassLoader().getResourceAsStream(fqn))
					.useDelimiter("\\A").next();
		} catch (Exception e) {
			return null;
		}
	}
}
