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

import fr.lteconsulting.angular2gwt.AngularComponent;

import javax.tools.JavaFileObject;

@SupportedAnnotationTypes(AngularComponentProcessor.AnnotationFqn)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class AngularComponentProcessor extends AbstractProcessor {
	public final static String AnnotationFqn = "fr.lteconsulting.angular2gwt.AngularComponent";

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

		AngularComponent annotation = element.getAnnotation(AngularComponent.class);

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

		template = template.replace("SELECTOR", aSelector);
		template = template.replace("TEMPLATE_URL", aTemplateUrl);
		template = template.replace("TEMPLATE", aTemplate);
		template = template.replace("DIRECTIVES", aDirectives);

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
