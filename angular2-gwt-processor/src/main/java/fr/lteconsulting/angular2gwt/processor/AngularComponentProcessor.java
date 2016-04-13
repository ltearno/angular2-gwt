package fr.lteconsulting.angular2gwt.processor;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
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

		String aSelector = annotation.selector();
		String aTemplate = annotation.template().isEmpty() ? "" : "template: \"" + annotation.template() + "\",";
		String aTemplateUrl = annotation.templateUrl().isEmpty() ? ""
				: "templateUrl: \"" + annotation.templateUrl() + "\",";
		String aDirectives = "";
		if (annotation.directives().length > 0) {
			aDirectives = "directives: [";
			for (int i = 0; i < annotation.directives().length; i++) {
				if (i > 0)
					aDirectives += ", ";
				aDirectives += "@" + annotation.directives()[i] + HELPER_CLASS_SUFFIX + "::get()()";
			}
			aDirectives += "]";
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

		template = template.replace("SELECTOR", aSelector);
		template = template.replace("TEMPLATE_URL", aTemplateUrl);
		template = template.replace("TEMPLATE", aTemplate);
		template = template.replace("DIRECTIVES", aDirectives);
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
