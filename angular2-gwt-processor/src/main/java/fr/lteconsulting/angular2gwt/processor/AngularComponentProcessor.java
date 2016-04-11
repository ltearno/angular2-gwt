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
		String angularComponentName = element.getSimpleName() + "_AngularComponent";

		template = template.replaceAll("PACKAGE", packageName);
		template = template.replaceAll("CLASS_NAME", angularComponentName);
		template = template.replaceAll("COMPONENT_CLASS_FQN", element.getQualifiedName().toString());

		AngularComponent annotation = element.getAnnotation(AngularComponent.class);

		template = template.replace("SELECTOR", annotation.selector());
		template = template.replace("TEMPLATE", annotation.template());

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
