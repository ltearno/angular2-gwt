package fr.lteconsulting.angular2gwt.processor;

import fr.lteconsulting.angular2gwt.ng.core.*;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.CompilePipeMetadata;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.roaster.Block;
import fr.lteconsulting.roaster.JavaClassText;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;
import javax.tools.Diagnostic.Kind;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import static fr.lteconsulting.angular2gwt.processor.AngularComponentProcessor.*;

public class JsInteropOutputProcessor {
    private final ProcessingEnvironment processingEnv;
    private final Checks checks;

    public JsInteropOutputProcessor(ProcessingEnvironment processingEnv) {
        this.processingEnv = processingEnv;

        checks = new Checks(processingEnv.getMessager());
    }

    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement element : ElementFilter.typesIn(roundEnv
                .getElementsAnnotatedWith(processingEnv.getElementUtils().getTypeElement(NgModuleAnnotationFqn)))) {
            processModule(element);
        }

        for (TypeElement element : ElementFilter.typesIn(roundEnv
                .getElementsAnnotatedWith(processingEnv.getElementUtils().getTypeElement(ComponentAnnotationFqn)))) {
            processComponent(element);
        }

        for (TypeElement element : ElementFilter.typesIn(roundEnv
                .getElementsAnnotatedWith(processingEnv.getElementUtils().getTypeElement(DirectiveAnnotationFqn)))) {
            processDirective(element);
        }

        for (TypeElement element : ElementFilter.typesIn(roundEnv
                .getElementsAnnotatedWith(processingEnv.getElementUtils().getTypeElement(PipeAnnotationFqn)))) {
            processPipe(element);
        }

        for (TypeElement element : ElementFilter.typesIn(roundEnv
                .getElementsAnnotatedWith(processingEnv.getElementUtils().getTypeElement(InjectableAnnotationFqn)))) {
            processInjectable(element);
        }

        roundEnv.errorRaised();

        return true;
    }

    private void processModule(TypeElement element) {
        checks.checkIsJsTypeNonNative(element);

        String packageName = ((PackageElement) element.getEnclosingElement()).getQualifiedName().toString();
        String angularModuleName = element.getSimpleName() + NG_MODULE_HELPER_CLASS_SUFFIX;

        HashMap<String, String> generatedAccessorTypestypes = new HashMap<>();

        JavaClassText javaClassText = new JavaClassText(packageName);

        javaClassText.addImport(JsProperty.class.getName());
        javaClassText.addImport(Array.class.getName());
        javaClassText.addImport(Type.class.getName());
        javaClassText.addImport(fr.lteconsulting.jsinterop.ng.core.NgModule.class.getName());

        Block classBlock = javaClassText.rootBlock().clazz(angularModuleName);

        String imports = findModuleAttributes(element, "imports", classBlock, generatedAccessorTypestypes);
        String exports = findModuleAttributes(element, "exports", classBlock, generatedAccessorTypestypes);
        String providers = findModuleAttributes(element, "providers", classBlock, generatedAccessorTypestypes);
        String declarations = findModuleAttributes(element, "declarations", classBlock, generatedAccessorTypestypes);
        String entryComponents = findModuleAttributes(element, "entryComponents", classBlock, generatedAccessorTypestypes);
        String bootstrap = findModuleAttributes(element, "bootstrap", classBlock, generatedAccessorTypestypes);

        classBlock.line("@JsProperty( namespace = [{#}], name = [{#}] )", packageName, element.getSimpleName());
        classBlock.line("private native static Type<?> constructorFunction();");
        classBlock.line();

        classBlock.line("public static Type<?> [{}]()", NgModuleConstructorGetterName);
        classBlock.block((e) -> {
            e.line("Type<?> constructorFunction = constructorFunction();");

            e.separator();

            e.line("if( constructorFunction.annotations == null )").block((i) -> {
                i.line("NgModule ngModule = new NgModule(null);");
                if (imports != null)
                    i.line("ngModule.imports = [{}];", imports);
                if (exports != null)
                    i.line("ngModule.exports = [{}];", exports);
                if (declarations != null)
                    i.line("ngModule.declarations = [{}];", declarations);
                if (providers != null)
                    i.line("ngModule.providers = [{}];", providers);
                if (bootstrap != null)
                    i.line("ngModule.bootstrap = [{}];", bootstrap);
                if (entryComponents != null)
                    i.line("ngModule.entryComponents = [{}];", entryComponents);

                i.separator();
                i.line("constructorFunction.annotations = ngModule;");
            });

            e.separator();

            e.line("return constructorFunction;");
        });

        try {
            String targetClassFqn = packageName + "." + angularModuleName;
            JavaFileObject jfo = processingEnv.getFiler().createSourceFile(targetClassFqn, element);

            OutputStream os = jfo.openOutputStream();
            OutputStreamWriter pw = new OutputStreamWriter(os, "UTF-8");
            StringBuilder sb = new StringBuilder();
            javaClassText.render(sb);
            pw.write(sb.toString());
            pw.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            processingEnv.getMessager().printMessage(Kind.ERROR, "AngularModule not generated !" + e, element);
        }
    }

    private void processComponent(TypeElement element) {
        checks.checkIsJsTypeNonNative(element);

        String packageName = ((PackageElement) element.getEnclosingElement()).getQualifiedName().toString();
        String angularComponentName = element.getSimpleName() + COMPONENT_HELPER_CLASS_SUFFIX;

        Component annotation = element.getAnnotation(Component.class);

        HashMap<String, String> generatedAccessorTypes = new HashMap<>();

        JavaClassText javaClassText = new JavaClassText(packageName);

        javaClassText.addImport(JsProperty.class.getName());
        javaClassText.addImport(Array.class.getName());
        javaClassText.addImport(Type.class.getName());
        javaClassText.addImport(fr.lteconsulting.jsinterop.ng.core.Component.class.getName());

        Block classBlock = javaClassText.rootBlock().clazz(angularComponentName);

        String aSelector = "".equals(annotation.selector()) ? null : annotation.selector();
        String aTemplate = annotation.template().isEmpty() ? null : annotation.template();
        String aTemplateUrl = annotation.templateUrl().isEmpty() ? null : annotation.templateUrl();
        String aStyles = findComponentStyles(annotation);
        String aStyleUrls = findComponentStyleUrls(annotation);
        String directives = findComponentDirectives(element, classBlock, generatedAccessorTypes);
        String providers = findComponentProviders(element, classBlock, generatedAccessorTypes);
        String outputs = findComponentOutputs(element);
        String parameters = findComponentConstructorParameters(element, classBlock, generatedAccessorTypes);
        String host = findDirectiveHostsEventActions(element, classBlock);
        String animations = findAnimationProviders(element);
        String inputs = findInputs(element);

        findPropertyGetters(element);

        Map<String, ViewChildrenInfo> viewChildFields = findComponentViewChildFields(element, classBlock,
                generatedAccessorTypes);

        classBlock.line("@JsProperty( namespace = [{#}], name = [{#}] )", packageName, element.getSimpleName());
        classBlock.line("private native static Type<?> constructorFunction();");
        classBlock.line();

        classBlock.line("public static Type<?> [{}]()", ComponentConstructorGetterName);
        classBlock.block((e) -> {
            e.line("Type<?> constructorFunction = constructorFunction();");

            if (parameters != null) {
                e.line();
                e.line("if( constructorFunction.parameters == null )").block((i) -> {
                    i.line("constructorFunction.parameters = [{}];", parameters);
                });
            }

            e.separator();

            e.line("if( constructorFunction.annotations == null )").block((i) -> {
                i.line("Component component = new Component(null);");
                if (aSelector != null)
                    i.line("component.selector = [{#}];", aSelector);
                if (aTemplate != null)
                    i.line("component.template = [{#}];", aTemplate);
                if (aTemplateUrl != null)
                    i.line("component.templateUrl = [{#}];", aTemplateUrl);
                if (aStyles != null)
                    i.line("component.styles = [{}];", aStyles);
                if (aStyleUrls != null)
                    i.line("component.styleUrls = [{}];", aStyleUrls);
                if (directives != null)
                    i.line("component.directives = [{}];", directives);
                if (providers != null)
                    i.line("component.providers = [{}];", providers);
                if (inputs != null)
                    i.line("component.inputs = [{}];", inputs);
                if (outputs != null)
                    i.line("component.outputs = [{}];", outputs);
                if (host != null)
                    i.line("component.host = [{}];", host);
                if (animations != null)
                    i.line("component.animations = [{}];", animations);
                if (!viewChildFields.isEmpty()) {
                    i.line("JsObject queries = new JsObject();");
                    /*for( Entry<String, ViewChildrenInfo> entry : viewChildFields.entrySet() )
					{
						if( entry.getValue().isMultiple )
						{
							javaClassText.addImport(
									fr.lteconsulting.angular2gwt.client.interop.ng.core.ViewChildren.class.getName() );
							i.line( "queries.set( [{#}], new ViewChildren( [{}] ) );", entry.getKey(),
									entry.getValue().accessCode );
						}
						else
						{
							javaClassText.addImport(
									fr.lteconsulting.angular2gwt.client.interop.ng.core.ViewChild.class.getName() );
							i.line( "queries.set( [{#}], new ViewChild( [{}] ) );", entry.getKey(),
									entry.getValue().accessCode );
						}
					}*/
                    i.line("options.set( \"queries\", queries );");
                }
                i.line();
                i.line("constructorFunction.annotations = component;");
            });

            e.separator();

            e.line("return constructorFunction;");
        });

        try {
            String targetClassFqn = packageName + "." + angularComponentName;
            JavaFileObject jfo = processingEnv.getFiler().createSourceFile(targetClassFqn, element);

            OutputStream os = jfo.openOutputStream();
            OutputStreamWriter pw = new OutputStreamWriter(os, "UTF-8");
            StringBuilder sb = new StringBuilder();
            javaClassText.render(sb);
            pw.write(sb.toString());
            pw.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            processingEnv.getMessager().printMessage(Kind.ERROR, "AngularComponent not generated !" + e, element);
        }
    }

    private void processInjectable(TypeElement element) {
        checks.checkIsJsTypeNonNative(element);

        String packageName = ((PackageElement) element.getEnclosingElement()).getQualifiedName().toString();
        String angularComponentName = element.getSimpleName() + INJECTABLE_HELPER_CLASS_SUFFIX;

        JavaClassText javaClassText = new JavaClassText(packageName);

        javaClassText.addImport(JsProperty.class.getName());
        javaClassText.addImport(Array.class.getName());
        javaClassText.addImport(Type.class.getName());
        javaClassText.addImport(fr.lteconsulting.jsinterop.ng.core.Injectable.class.getName());

        Block classBlock = javaClassText.rootBlock().clazz(angularComponentName);

        HashMap<String, String> generatedAccessorTypestypes = new HashMap<>();
        String parameters = findComponentConstructorParameters(element, classBlock, generatedAccessorTypestypes);

        classBlock.line("@JsProperty( namespace = [{#}], name = [{#}] )", packageName, element.getSimpleName());
        classBlock.line("private native static Type<?> constructorFunction();");

        classBlock.separator();

        classBlock.line("public static Type<?> [{}]()", InjectableConstructorGetterName);
        classBlock.block((e) -> {
            e.line("Type<?> constructorFunction = constructorFunction();");

            if (parameters != null) {
                e.separator();

                e.line("if( constructorFunction.parameters == null )").block((i) -> {
                    i.line("constructorFunction.parameters = [{}];", parameters);
                });
            }

            e.separator();

            e.line("if( constructorFunction.annotations == null )").block((i) -> {
                i.line("constructorFunction.annotations = Array.of( new Injectable() );");
            });

            e.separator();

            e.line("return constructorFunction;");
        });

        try {
            String targetClassFqn = packageName + "." + angularComponentName;
            JavaFileObject jfo = processingEnv.getFiler().createSourceFile(targetClassFqn, element);

            OutputStream os = jfo.openOutputStream();
            OutputStreamWriter pw = new OutputStreamWriter(os, "UTF-8");
            StringBuilder sb = new StringBuilder();
            javaClassText.render(sb);
            pw.write(sb.toString());
            pw.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            processingEnv.getMessager().printMessage(Kind.ERROR, "AngularComponent non généré !" + e, element);
        }
    }

    private void processPipe(TypeElement element) {
        checks.checkIsJsTypeNonNative(element);

        String packageName = ((PackageElement) element.getEnclosingElement()).getQualifiedName().toString();
        String angularPipeName = element.getSimpleName() + PIPE_HELPER_CLASS_SUFFIX;

        JavaClassText javaClassText = new JavaClassText(packageName);

        Pipe pipe = element.getAnnotation(Pipe.class);
        String pipeName = pipe.name();
        boolean purePipe = pipe.pure();

        javaClassText.addImport(JsProperty.class.getName());
        javaClassText.addImport(Array.class.getName());
        javaClassText.addImport(fr.lteconsulting.jsinterop.ng.core.Pipe.class.getName());
        javaClassText.addImport(CompilePipeMetadata.class.getName());
        javaClassText.addImport(Type.class.getName());

        Block classBlock = javaClassText.rootBlock().clazz(angularPipeName);

        HashMap<String, String> generatedAccessorTypestypes = new HashMap<>();
        String parameters = findComponentConstructorParameters(element, classBlock, generatedAccessorTypestypes);

        classBlock.line("@JsProperty( namespace = [{#}], name = [{#}] )", packageName, element.getSimpleName());
        classBlock.line("private native static Type<?> constructorFunction();");

        classBlock.separator();

        classBlock.line("public static Type<?> [{}]()", PipeConstructorGetterName);
        classBlock.block((e) -> {
            e.line("Type<?> constructorFunction = constructorFunction();");

            e.separator();

            e.line("if( constructorFunction.parameters == null )").block((i) -> {
                i.line("constructorFunction.parameters = [{}];", parameters);
            });

            e.separator();

            e.line("if( constructorFunction.annotations == null )").block((i) -> {
                i.line("JsPropertyMap options = JsPropertyMap.of();");
                i.line("options.set(\"name\", [{#}]);", pipeName);
                i.line("options.set(\"pure\", [{}]);", purePipe);

                e.separator();
                i.line("CompilePipeMetadata metadata = new CompilePipeMetadata(options);");

                e.separator();
                i.line("constructorFunction.annotations = Array.of( new Pipe( metadata ) );");
            });

            e.separator();

            e.line("return constructorFunction;");
        });

        try {
            String targetClassFqn = packageName + "." + angularPipeName;
            JavaFileObject jfo = processingEnv.getFiler().createSourceFile(targetClassFqn, element);

            OutputStream os = jfo.openOutputStream();
            OutputStreamWriter pw = new OutputStreamWriter(os, "UTF-8");
            StringBuilder sb = new StringBuilder();
            javaClassText.render(sb);
            pw.write(sb.toString());
            pw.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            processingEnv.getMessager().printMessage(Kind.ERROR, "AngularPipe could not be generated !" + e, element);
        }
    }

    private void processDirective(TypeElement element) {
        checks.checkIsJsTypeNonNative(element);

        String packageName = ((PackageElement) element.getEnclosingElement()).getQualifiedName().toString();
        String angularComponentName = element.getSimpleName() + DIRECTIVE_HELPER_CLASS_SUFFIX;

        JavaClassText javaClassText = new JavaClassText(packageName);

        javaClassText.addImport(JsProperty.class.getName());
        javaClassText.addImport(Array.class.getName());
        javaClassText.addImport(fr.lteconsulting.jsinterop.ng.core.Directive.class.getName());
        javaClassText.addImport(Type.class.getName());
        javaClassText.addImport(fr.lteconsulting.jsinterop.ng.core.Injectable.class.getName());

        Block classBlock = javaClassText.rootBlock().clazz(angularComponentName);

        HashMap<String, String> generatedAccessorTypestypes = new HashMap<>();
        String parameters = findComponentConstructorParameters(element, classBlock, generatedAccessorTypestypes);

        Directive directive = element.getAnnotation(Directive.class);
        String aSelector = directive.selector();
        String host = findDirectiveHostsEventActions(element, classBlock);
        String animations = findAnimationProviders(element);

        // input fields
        String inputs = findInputs(element);

        findPropertyGetters(element);

        classBlock.line("@JsProperty( namespace = [{#}], name = [{#}] )", packageName, element.getSimpleName());
        classBlock.line("private native static Type<?> constructorFunction();");

        classBlock.separator();

        classBlock.line("public static Type<?> [{}]()", DirectiveConstructorGetterName);
        classBlock.block((e) -> {
            e.line("Type<?> constructorFunction = constructorFunction();");

            e.separator();

            e.line("if( constructorFunction.parameters == null )").block((i) -> {
                i.line("constructorFunction.parameters = [{}];", parameters);
            });

            e.line();
            e.line("if( constructorFunction.annotations == null )").block((i) -> {
                i.line("Directive directive = new Directive(null);");

                i.line("directive.selector = [{#}];", aSelector);
                if (host != null)
                    i.line("directive.host = [{}];", host);
                if (inputs != null)
                    i.line("directive.inputs = [{}];", inputs);
                if (animations != null)
                    i.line("directive.animations = [{}];", animations);

                e.separator();

                i.line("constructorFunction.annotations = directive;");
            });

            e.separator();

            e.line("return constructorFunction;");
        });

        try {
            String targetClassFqn = packageName + "." + angularComponentName;
            JavaFileObject jfo = processingEnv.getFiler().createSourceFile(targetClassFqn, element);

            OutputStream os = jfo.openOutputStream();
            OutputStreamWriter pw = new OutputStreamWriter(os, "UTF-8");
            StringBuilder sb = new StringBuilder();
            javaClassText.render(sb);
            pw.write(sb.toString());
            pw.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            processingEnv.getMessager().printMessage(Kind.ERROR, "AngularDirective could not be generated !" + e,
                    element);
        }
    }

    /**
     * returns the processed accessor or the generated accessor method
     *
     * @param fqn
     * @return
     */
    private String getConstructorFunctionAccessorName(String fqn, Block classBlock,
                                                      HashMap<String, String> generatedAccessorTypes) {
        TypeElement element = processingEnv.getElementUtils().getTypeElement(fqn);
        if (element != null) {
            if (element.getAnnotation(Directive.class) != null)
                return fqn + DIRECTIVE_HELPER_CLASS_SUFFIX + "." + DirectiveConstructorGetterName + "()";

            if (element.getAnnotation(Component.class) != null)
                return fqn + COMPONENT_HELPER_CLASS_SUFFIX + "." + ComponentConstructorGetterName + "()";

            if (element.getAnnotation(Injectable.class) != null)
                return fqn + INJECTABLE_HELPER_CLASS_SUFFIX + "." + InjectableConstructorGetterName + "()";

            if (element.getAnnotation(Pipe.class) != null)
                return fqn + PIPE_HELPER_CLASS_SUFFIX + "." + PipeConstructorGetterName + "()";

            if (element.getAnnotation(NgModule.class) != null)
                return fqn + NG_MODULE_HELPER_CLASS_SUFFIX + "." + NgModuleConstructorGetterName + "()";

            Optional<? extends TypeMirror> optProviderWrapper = element.getInterfaces().stream()
                    .filter((t) -> t.toString().equals(ProviderWrapper.class.getName())).findFirst();
            if (optProviderWrapper.isPresent())
                return "new " + fqn + "().get()";

            if (generatedAccessorTypes.containsKey(fqn))
                return generatedAccessorTypes.get(fqn);

            String name = element.getSimpleName().toString();
            String ns = element.getEnclosingElement().toString().replace("package ", "");

            Optional<? extends AnnotationMirror> optAM = getElementAnnotation(element, JsType.class.getName());
            if (optAM.isPresent()) {
                AnnotationMirror am = optAM.get();

                Optional<? extends AnnotationValue> optName = getAnnotationValue(am, "name");
                if (optName.isPresent()) {
                    name = optName.get().toString();
                    name = name.replaceAll("\"", "");
                }

                Optional<? extends AnnotationValue> optNamespace = getAnnotationValue(am, "namespace");
                if (optNamespace.isPresent()) {
                    ns = optNamespace.get().toString();
                    ns = ns.replaceAll("\"", "");
                }
            }

            String constructorFunctionName = "constructorFunctionOf_" + ns.replaceAll("\\.", "_") + "_" + name;

            classBlock.line("@JsProperty( namespace = [{#}], name = [{#}] )", ns, name);
            classBlock.line("private native static Type<?> [{}]();", constructorFunctionName);
            classBlock.line();

            String result = constructorFunctionName + "()";

            generatedAccessorTypes.put(fqn, result);

            return result;
        }

        return "/* no type element for " + fqn + " ! */ $wnd." + fqn;
    }

    /**
     * @param element
     * @param memberName                  imports, exports, declarations, providers, bootstrap
     * @param classBlock
     * @param generatedAccessorTypestypes
     * @return
     */
    private String findModuleAttributes(TypeElement element, String memberName, Block classBlock,
                                        HashMap<String, String> generatedAccessorTypestypes) {
        List<String> classNames = getAnnotationClassListValue(element, NgModuleAnnotationFqn, memberName);
        if (classNames == null || classNames.isEmpty())
            return null;

        StringBuilder directives = new StringBuilder();

        directives.append("Array.of( ");

        boolean add = false;
        if (!classNames.isEmpty()) {
            directives.append(classNames.stream()
                    .map(name -> getConstructorFunctionAccessorName(name, classBlock, generatedAccessorTypestypes))
                    .collect(Collectors.joining(", ")));
            if (add)
                directives.append(", ");
            else
                add = true;
        }

        directives.append(" )");

        return directives.toString();
    }

    private String findComponentStyles(Component annotation) {
        if (annotation.styles().length == 0)
            return null;

        StringBuilder aStyles = new StringBuilder();

        aStyles.append("Array.of( ");

        for (int i = 0; i < annotation.styles().length; i++) {
            if (i > 0)
                aStyles.append(", ");

            aStyles.append("\"" + annotation.styles()[i] + "\"");
        }

        aStyles.append(" )");

        return aStyles.toString();
    }

    private String findComponentStyleUrls(Component annotation) {
        if (annotation.styleUrls().length == 0)
            return null;

        StringBuilder aStyleUrls = new StringBuilder();

        aStyleUrls.append("Array.of( ");

        for (int i = 0; i < annotation.styleUrls().length; i++) {
            if (i > 0)
                aStyleUrls.append(", ");

            aStyleUrls.append("\"" + annotation.styleUrls()[i] + "\"");
        }

        aStyleUrls.append(" )");

        return aStyleUrls.toString();
    }

    private String findComponentDirectives(TypeElement element, Block classBlock,
                                           HashMap<String, String> generatedAccessorTypestypes) {
        List<String> directiveClassNames = getAnnotationClassListValue(element, ComponentAnnotationFqn, "directives");
        if (directiveClassNames == null || directiveClassNames.isEmpty())
            return null;

        StringBuilder directives = new StringBuilder();

        directives.append("Array.of( ");

        boolean add = false;
        if (!directiveClassNames.isEmpty()) {
            directives.append(directiveClassNames.stream()
                    .map(name -> getConstructorFunctionAccessorName(name, classBlock, generatedAccessorTypestypes))
                    .collect(Collectors.joining(", ")));
            if (add)
                directives.append(", ");
            else
                add = true;
        }

        directives.append(" )");

        return directives.toString();
    }

    private String findComponentProviders(TypeElement element, Block classBlock,
                                          HashMap<String, String> generatedAccessorTypestypes) {
        List<String> providerClassNames = getAnnotationClassListValue(element, ComponentAnnotationFqn, "providers");
        if (providerClassNames == null || providerClassNames.isEmpty())
            return null;

        StringBuilder providers = new StringBuilder();

        providers.append("Array.of( ");

        if (!providerClassNames.isEmpty()) {
            providers.append(providerClassNames.stream()
                    .map(name -> getConstructorFunctionAccessorName(name, classBlock, generatedAccessorTypestypes))
                    .collect(Collectors.joining(", ")));
        }

        providers.append(" )");

        return providers.toString();
    }

    private String findAnimationProviders(TypeElement element) {
        List<String> animationProviderClassNames = getAnnotationClassListValue(element, ComponentAnnotationFqn,
                "animations");
        if (animationProviderClassNames == null || animationProviderClassNames.isEmpty())
            return null;

        StringBuilder providers = new StringBuilder();

        providers.append("Array.of( ");

        if (!animationProviderClassNames.isEmpty()) {
            providers.append(animationProviderClassNames.stream().map(name -> "new " + name + "().get()")
                    .collect(Collectors.joining(", ")));
        }

        providers.append(" )");

        return providers.toString();
    }

    private String findComponentOutputs(TypeElement element) {
        StringBuilder outputs = new StringBuilder();

        ElementFilter.fieldsIn(processingEnv.getElementUtils().getAllMembers(element)).stream()
                .filter(f -> f.getAnnotation(Output.class) != null)
                .map(f -> checks.checkIsJsProperty(f).getSimpleName().toString()).forEach(name -> {
            if (outputs.length() > 0)
                outputs.append(", ");
            outputs.append("\"");
            outputs.append(name);
            outputs.append("\"");
        });

        if (outputs.length() == 0)
            return null;

        return "Array.of( " + outputs.toString() + " )";
    }

    private String findComponentConstructorParameters(TypeElement element, Block classBlock,
                                                      HashMap<String, String> generatedAccessorTypestypes) {
        StringBuilder parameters = new StringBuilder();

        List<ExecutableElement> constructors = ElementFilter.constructorsIn(element.getEnclosedElements());
        if (constructors != null && !constructors.isEmpty()) {
            if (constructors.size() > 1) {
                processingEnv.getMessager().printMessage(Kind.ERROR, "Multiple constructors not yet supported",
                        element);
                return null;
            }

            ExecutableElement constructor = constructors.get(0);
            constructor.getParameters().forEach(p -> {
                if (parameters.length() > 0)
                    parameters.append(", ");

                String parameterName = p.getSimpleName().toString();
                String fqn = p.asType().toString();
                Host host = p.getAnnotation(Host.class);
                fr.lteconsulting.angular2gwt.ng.core.Optional optional = p
                        .getAnnotation(fr.lteconsulting.angular2gwt.ng.core.Optional.class);

                List<String> parts = new ArrayList<>();

                switch (fqn) {
                    case "boolean":
                    case "short":
                    case "char":
                    case "int":
                    case "long":
                    case "float":
                    case "double":
                    case "java.lang.Boolean":
                    case "java.lang.Short":
                    case "java.lang.Char":
                    case "java.lang.Integer":
                    case "java.lang.Long":
                    case "java.lang.Float":
                    case "java.lang.Double":
                    case "java.lang.String":
                        parts.add("\"" + parameterName + "\"");
                        break;

                    default:
                        parts.add(getConstructorFunctionAccessorName(fqn, classBlock, generatedAccessorTypestypes));
                }

                if (host != null)
                    parts.add("new " + fr.lteconsulting.jsinterop.ng.core.Host.class.getName() + "()");
                if (optional != null)
                    parts.add("new " + fr.lteconsulting.jsinterop.ng.core.Optional.class.getName()
                            + "()");

                parameters.append("Array.of( " + concat(parts) + " )");
            });
        }

        if (parameters.length() == 0)
            return null;

        return "Array.of( " + parameters.toString() + " )";
    }

    private Map<String, ViewChildrenInfo> findComponentViewChildFields(TypeElement element, Block classBlock,
                                                                       HashMap<String, String> generatedAccessorTypes) {
        Map<String, ViewChildrenInfo> result = new HashMap<>();

        ElementFilter.fieldsIn(processingEnv.getElementUtils().getAllMembers(element)).stream()
                .filter(f -> f.getAnnotation(ViewChild.class) != null).forEach(field -> {
            String fieldName = field.getSimpleName().toString();

            ViewChild annotation = field.getAnnotation(ViewChild.class);
            if (annotation.selector() != null && !annotation.selector().isEmpty()) {
                result.put(fieldName, ViewChildrenInfo.child("\"" + annotation.selector() + "\""));
            } else {
                Holder<Boolean> holder = new Holder<>();
                holder.value = false;

                Optional<? extends AnnotationMirror> annotationMirror = getElementAnnotation(field,
                        ViewChild.class.getName());
                annotationMirror.ifPresent(am -> {
                    Optional<AnnotationValue> value = getAnnotationValue(am, "component");
                    value.ifPresent(v -> {
                        String componentClassName = v.getValue().toString();
                        String accessorName = getConstructorFunctionAccessorName(componentClassName, classBlock,
                                generatedAccessorTypes);
                        result.put(fieldName, ViewChildrenInfo.child(accessorName));
                        holder.value = true;
                    });

                });

                if (!holder.value)
                    processingEnv.getMessager().printMessage(Kind.ERROR,
                            "@ViewChild annotation should specify either a selector or a component !", field);
            }
        });

        ElementFilter.fieldsIn(processingEnv.getElementUtils().getAllMembers(element)).stream()
                .filter(f -> f.getAnnotation(ViewChildren.class) != null).forEach(field -> {
            String fieldName = field.getSimpleName().toString();

            ViewChildren annotation = field.getAnnotation(ViewChildren.class);
            if (annotation.selector() != null && !annotation.selector().isEmpty()) {
                result.put(fieldName, ViewChildrenInfo.children("\"" + annotation.selector() + "\""));
            } else {
                Holder<Boolean> holder = new Holder<>();
                holder.value = false;

                Optional<? extends AnnotationMirror> annotationMirror = getElementAnnotation(field,
                        ViewChildren.class.getName());
                annotationMirror.ifPresent(am -> {
                    Optional<AnnotationValue> value = getAnnotationValue(am, "component");
                    value.ifPresent(v -> {
                        String componentClassName = v.getValue().toString();
                        String accessorName = getConstructorFunctionAccessorName(componentClassName, classBlock,
                                generatedAccessorTypes);
                        result.put(fieldName, ViewChildrenInfo.children(accessorName));
                        holder.value = true;
                    });

                });

                if (!holder.value)
                    processingEnv.getMessager().printMessage(Kind.ERROR,
                            "@ViewChildren annotation should specify either a selector or a component !",
                            field);
            }
        });

        return result;
    }

    private void findPropertyGetters(TypeElement element) {
        ElementFilter.methodsIn(processingEnv.getElementUtils().getAllMembers(element)).stream().forEach(method -> {
            PropertyGetter propertyGetter = method.getAnnotation(PropertyGetter.class);
            if (propertyGetter == null)
                return;

            if (!method.getParameters().isEmpty()) {
                processingEnv.getMessager().printMessage(Kind.ERROR, "@PropertyGetter method should have no argument",
                        method);
                return;
            }

            String getterMethodName = method.getSimpleName().toString();
            if (propertyGetter.name() != null && !propertyGetter.name().trim().isEmpty()) {
            } else {
                if (!getterMethodName.startsWith("get")) {
                    processingEnv.getMessager().printMessage(Kind.ERROR,
                            "@PropertyGetter method name should begin by 'get', or you should use the 'name' attribute of the @PropertyGetter annotation",
                            method);
                    return;
                }
            }
        });
    }

    private String findInputs(TypeElement element) {
        List<InputInformation> inputs = new ArrayList<>();

        // gather fields
        ElementFilter.fieldsIn(processingEnv.getElementUtils().getAllMembers(element)).stream().forEach(field -> {
            Input input = field.getAnnotation(Input.class);
            if (input == null)
                return;

            checks.checkIsJsProperty(field);

            String propertyName = field.getSimpleName().toString();
            String inputName = input.name();
            if (inputName == null || inputName.trim().isEmpty())
                inputName = propertyName;

            inputs.add(new InputInformation(inputName, propertyName));
        });

        // gather methods
        ElementFilter.methodsIn(processingEnv.getElementUtils().getAllMembers(element)).stream().forEach(method -> {
            Input input = method.getAnnotation(Input.class);
            if (input == null)
                return;

            checks.checkIsJsProperty(method);

            // TODO get property name from JsInterop if possible!

            String methodName = method.getSimpleName().toString();
            if (!methodName.startsWith("set")) {
                processingEnv.getMessager().printMessage(Kind.ERROR, "@Input method name should begin by 'set'",
                        method);
                return;
            }

            if (method.getParameters().size() != 1) {
                processingEnv.getMessager().printMessage(Kind.ERROR,
                        "@Input method should have one and only one argument", method);
                return;
            }

            String propertyName = methodName.substring(3, 4).toLowerCase() + methodName.substring(4);
            String inputName = input.name();
            if (inputName == null || inputName.trim().isEmpty())
                inputName = propertyName;

            inputs.add(new InputInformation(inputName, propertyName));
        });

        if (inputs.isEmpty())
            return null;

        StringBuilder sb = new StringBuilder();

        for (InputInformation input : inputs) {
            if (sb.length() > 0)
                sb.append(", ");

            sb.append("\"");
            if (input.inputName.equals(input.propertyName)) {
                sb.append(input.inputName);
            } else {
                sb.append(input.propertyName);
                sb.append(": ");
                sb.append(input.inputName);
            }
            sb.append("\"");
        }

        return "Array.of( " + sb.toString() + " )";
    }

    private String findDirectiveHostsEventActions(TypeElement element, Block classBlock) {
        List<String> hostsEventActions = new ArrayList<>();

        ElementFilter.methodsIn(processingEnv.getElementUtils().getAllMembers(element)).stream()
                .filter(method -> method.getAnnotation(HostListener.class) != null).forEach(method -> {
            checks.checkIsJsMethod(method);

            HostListener hostListener = method.getAnnotation(HostListener.class);

            String eventName = hostListener.value();
            if ("".equals(eventName))
                eventName = method.getSimpleName().toString();

            hostsEventActions
                    .add(".set( \"(" + eventName + ")\", \"" + method.getSimpleName().toString() + "()\" )");
        });

        ElementFilter.fieldsIn(processingEnv.getElementUtils().getAllMembers(element)).stream()
                .filter(field -> field.getAnnotation(HostBinding.class) != null).forEach(field -> {
            checks.checkIsJsProperty(field);

            HostBinding hostBinding = field.getAnnotation(HostBinding.class);

            String propertyName = hostBinding.value();
            if ("".equals(propertyName))
                propertyName = field.getSimpleName().toString();

            hostsEventActions
                    .add(".set( \"[" + propertyName + "]\", \"" + field.getSimpleName().toString() + "\" )");
        });

        if (hostsEventActions.isEmpty())
            return null;

        return "new JsObject()" + hostsEventActions.stream().collect(Collectors.joining());
    }

    static class ViewChildrenInfo {
        boolean isMultiple; // determines if we use ViewChild or ViewChildren
        String accessCode;

        static ViewChildrenInfo child(String accessCode) {
            ViewChildrenInfo res = new ViewChildrenInfo();
            res.isMultiple = false;
            res.accessCode = accessCode;
            return res;
        }

        static ViewChildrenInfo children(String accessCode) {
            ViewChildrenInfo res = new ViewChildrenInfo();
            res.isMultiple = true;
            res.accessCode = accessCode;
            return res;
        }
    }

    private static class InputInformation {
        private final String inputName;
        private final String propertyName;

        public InputInformation(String inputName, String propertyName) {
            this.inputName = inputName;
            this.propertyName = propertyName;
        }
    }

    private static class Holder<T> {
        T value;
    }

    private String concat(List<String> s) {
        StringBuilder sb = new StringBuilder();
        s.forEach(i -> sb.append((sb.length() == 0 ? "" : ", ") + i));
        return sb.toString();
    }

    private Optional<? extends AnnotationMirror> getElementAnnotation(Element element, String annotationFqn) {
        Optional<? extends AnnotationMirror> optAnnotationMirror = element.getAnnotationMirrors().stream().filter(m -> {
            return processingEnv.getTypeUtils().isSameType(m.getAnnotationType(),
                    processingEnv.getElementUtils().getTypeElement(annotationFqn).asType());
        }).findFirst();
        return optAnnotationMirror;
    }

    private List<String> getAnnotationClassListValue(TypeElement element, String annotationFqn,
                                                     String annotationFieldName) {
        List<String> result = new ArrayList<>();

        Optional<? extends AnnotationMirror> optAnnotationMirror = getElementAnnotation(element, annotationFqn);

        if (optAnnotationMirror.isPresent()) {
            AnnotationMirror annotationMirror = optAnnotationMirror.get();
            Optional<? extends AnnotationValue> optValue = getAnnotationValue(annotationMirror, annotationFieldName);
            if (optValue.isPresent()) {
                AnnotationValue value = optValue.get();

                value.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
                    @Override
                    public Void visitArray(List<? extends AnnotationValue> vals, Void p) {
                        for (AnnotationValue v : vals) {
                            v.accept(new SimpleAnnotationValueVisitor8<Void, Void>() {
                                @Override
                                public Void visitType(javax.lang.model.type.TypeMirror t, Void p) {
                                    String name = t.toString();
                                    result.add(name);
                                    return null;
                                }

                                ;
                            }, null);
                        }
                        return null;
                    }
                }, null);
            }
        }

        return result;
    }

    private Optional<AnnotationValue> getAnnotationValue(AnnotationMirror annotationMirror,
                                                         String annotationFieldName) {
        for (Entry<? extends ExecutableElement, ? extends AnnotationValue> e : annotationMirror.getElementValues()
                .entrySet()) {
            if (e.getKey().getSimpleName().toString().equals(annotationFieldName)) {
                return Optional.of(e.getValue());
            }
        }

        return Optional.empty();
    }
}
