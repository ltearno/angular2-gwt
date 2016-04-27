package fr.lteconsulting.angular2gwt.processor;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

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
import fr.lteconsulting.angular2gwt.RouteConfigs;
import fr.lteconsulting.angular2gwt.client.interop.angular.RouteParams;
import fr.lteconsulting.angular2gwt.client.interop.angular.Router;
import fr.lteconsulting.angular2gwt.client.interop.angular.RouterDirectives;
import fr.lteconsulting.angular2gwt.client.interop.angular.RouterProviders;

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
		List<String> directiveClassNames = getAnnotationClassListValue(element, AnnotationFqn, "directives");
		if (!directiveClassNames.isEmpty()) {
			directives.append("directives: [");
			directives.append(directiveClassNames.stream()
					.map(name -> RouterDirectives.class.getName().equals(name)
							? "$wnd.ng.router.ROUTER_DIRECTIVES" : ("@" + name + HELPER_CLASS_SUFFIX + "::get()()"))
					.collect(Collectors.joining(", ")));
			directives.append("],");
		}

		// providers
		StringBuilder providers = new StringBuilder();
		List<String> providerClassNames = getAnnotationClassListValue(element, AnnotationFqn, "providers");
		if (!providerClassNames.isEmpty()) {
			providers.append("providers: [");
			providers
					.append(providerClassNames.stream()
							.map(name -> RouterProviders.class.getName().equals(name)
									? "$wnd.ng.router.ROUTER_PROVIDERS" : ("$wnd." + name))
							.collect(Collectors.joining(", ")));
			providers.append("],");
		}

		// routeconfigs
		List<RouteConfigDto> routeConfigs = new ArrayList<>();
		element.getAnnotationMirrors().stream().filter(m -> {
			System.out.println(m.getAnnotationType().toString());
			return processingEnv.getTypeUtils().isSameType(m.getAnnotationType(),
					processingEnv.getElementUtils().getTypeElement(RouteConfigs.class.getName()).asType());
		}).forEach(annotationMirror -> {
			Optional<? extends ExecutableElement> optKey = annotationMirror.getElementValues().keySet().stream()
					.filter(k -> k.getSimpleName().toString().equals("value")).findFirst();
			if (optKey.isPresent()) {
				ExecutableElement key = optKey.get();
				AnnotationValue value = annotationMirror.getElementValues().get(key);

				value.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
					@Override
					public Void visitArray(List<? extends AnnotationValue> vals, Void p) {
						for (AnnotationValue v : vals) {
							v.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
								@Override
								public Void visitAnnotation(AnnotationMirror annotationMirror, Void p) {
									RouteConfigDto dto = new RouteConfigDto();
									routeConfigs.add(dto);

									for (Entry<? extends ExecutableElement, ? extends AnnotationValue> entry : annotationMirror
											.getElementValues().entrySet()) {
										String name = entry.getKey().getSimpleName().toString();
										Object value = entry.getValue().getValue();

										dto.set(name, value);
									}
									return null;
								}
							}, null);
						}
						return null;
					}
				}, null);
			}

		});
		StringBuilder routeConfisBuilder = new StringBuilder();
		if (!routeConfigs.isEmpty()) {
			routeConfisBuilder.append(", new $wnd.ng.router.RouteConfig([");
			for (RouteConfigDto dto : routeConfigs)
				routeConfisBuilder.append(dto.toString() + ", ");
			routeConfisBuilder.append("])");
		}

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
				String fqn = p.asType().toString();
				if (RouteParams.class.getName().equals(fqn))
					parameters.append("$wnd.ng.router.RouteParams");
				else if(Router.class.getName().equals(fqn))
					parameters.append("$wnd.ng.router.Router");
				else
					parameters.append("$wnd." + fqn);
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
		template = template.replace("ROUTECONFIGS", routeConfisBuilder.toString());

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

	static class RouteConfigDto {
		String path;
		String name;
		String component;
		boolean useAsDefault;

		void set(String fieldName, Object value) {
			if ("name".equals(fieldName))
				name = String.valueOf(value);
			else if ("path".equals(fieldName))
				path = String.valueOf(value);
			else if ("component".equals(fieldName))
				component = String.valueOf(value);
			else if ("useAsDefault".equals(fieldName))
				useAsDefault = "true".equals(String.valueOf(value));
		}

		@Override
		public String toString() {
			return "{ path: '" + path + "', name: '" + name + "', component: @" + component + HELPER_CLASS_SUFFIX
					+ "::get()(), " + (useAsDefault ? "useAsDefault: true" : "") + "}";
		}
	}

	private List<String> getAnnotationClassListValue(TypeElement element, String annotationFqn,
			String annotationFieldName) {
		List<String> result = new ArrayList<>();

		Optional<? extends AnnotationMirror> optAnnotationMirror = element.getAnnotationMirrors().stream().filter(m -> {
			return processingEnv.getTypeUtils().isSameType(m.getAnnotationType(),
					processingEnv.getElementUtils().getTypeElement(annotationFqn).asType());
		}).findFirst();

		if (optAnnotationMirror.isPresent()) {
			AnnotationMirror annotationMirror = optAnnotationMirror.get();
			Optional<? extends ExecutableElement> optKey = annotationMirror.getElementValues().keySet().stream()
					.filter(k -> k.getSimpleName().toString().equals(annotationFieldName)).findFirst();
			if (optKey.isPresent()) {
				ExecutableElement key = optKey.get();
				AnnotationValue value = annotationMirror.getElementValues().get(key);

				value.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
					@Override
					public Void visitArray(List<? extends AnnotationValue> vals, Void p) {
						for (AnnotationValue v : vals) {
							v.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
								public Void visitType(javax.lang.model.type.TypeMirror t, Void p) {
									String name = t.toString();
									result.add(name);
									return null;
								};
							}, null);
						}
						return null;
					}
				}, null);
			}
		}

		return result;
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
