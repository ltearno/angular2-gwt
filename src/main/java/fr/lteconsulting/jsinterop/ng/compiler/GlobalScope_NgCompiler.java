package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Error;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfTAndT;
import fr.lteconsulting.jsinterop.ng.UnionOfProxyClassAndStaticSymbol;
import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.AST;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.Element;
import fr.lteconsulting.jsinterop.ng.compiler.output.Expression;
import fr.lteconsulting.jsinterop.ng.compiler.output.ExternalReference;
import fr.lteconsulting.jsinterop.ng.compiler.output.Statement;
import fr.lteconsulting.jsinterop.ng.compiler.schema.ElementSchemaRegistry;
import fr.lteconsulting.jsinterop.ng.core.InjectionToken;
import fr.lteconsulting.jsinterop.ng.core.NodeFlags;
import fr.lteconsulting.jsinterop.ng.core.SecurityContext;
import fr.lteconsulting.jsinterop.ng.core.Version;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.compiler (java fr.lteconsulting.jsinterop.ng.compiler) package
 */
@JsType(isNative=true, namespace="ng", name="compiler")
public class GlobalScope_NgCompiler
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.compiler", name="VERSION")
    public static Version VERSION;

    @JsProperty(namespace="ng.compiler", name="LIFECYCLE_HOOKS_VALUES")
    public static Array<LifecycleHooks> LIFECYCLE_HOOKS_VALUES;

    @JsProperty(namespace="ng.compiler", name="TEMPLATE_TRANSFORMS")
    public static InjectionToken<Object> TEMPLATE_TRANSFORMS;

    @JsProperty(namespace="ng.compiler", name="DEFAULT_PACKAGE_URL_PROVIDER")
    public static Object DEFAULT_PACKAGE_URL_PROVIDER;

    @JsProperty(namespace="ng.compiler", name="SyncAsync")
    public static Object SyncAsync;

    @JsProperty(namespace="ng.compiler", name="ERROR_COLLECTOR_TOKEN")
    public static InjectionToken<Object> ERROR_COLLECTOR_TOKEN;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.compiler", name = "typeSourceSpan")
    public static native ParseSourceSpan typeSourceSpan(String kind, CompileIdentifierMetadata type);
    @JsMethod(namespace="ng.compiler", name = "hasLifecycleHook")
    public static native Boolean hasLifecycleHook(CompileReflector reflector, LifecycleHooks hook, Object token);
    @JsMethod(namespace="ng.compiler", name = "getAllLifecycleHooks")
    public static native Array<LifecycleHooks> getAllLifecycleHooks(CompileReflector reflector, Object token);
    @JsMethod(namespace="ng.compiler", name = "identifierName")
    public static native String identifierName(CompileIdentifierMetadata compileIdentifier);
    @JsMethod(namespace="ng.compiler", name = "identifierModuleUrl")
    public static native String identifierModuleUrl(CompileIdentifierMetadata compileIdentifier);
    @JsMethod(namespace="ng.compiler", name = "viewClassName")
    public static native String viewClassName(Object compType, Number embeddedTemplateIndex);
    @JsMethod(namespace="ng.compiler", name = "rendererTypeName")
    public static native String rendererTypeName(Object compType);
    @JsMethod(namespace="ng.compiler", name = "hostViewClassName")
    public static native String hostViewClassName(Object compType);
    @JsMethod(namespace="ng.compiler", name = "componentFactoryName")
    public static native String componentFactoryName(Object compType);
    @JsMethod(namespace="ng.compiler", name = "tokenName")
    public static native String tokenName(CompileTokenMetadata token);
    @JsMethod(namespace="ng.compiler", name = "tokenReference")
    public static native Object tokenReference(CompileTokenMetadata token);
    @JsMethod(namespace="ng.compiler", name = "createHostComponentMeta")
    public static native CompileDirectiveMetadata createHostComponentMeta(Object hostTypeReference, CompileDirectiveMetadata compMeta, UnionOfProxyClassAndStaticSymbol hostViewType);
    @JsMethod(namespace="ng.compiler", name = "flatten")
    public static native <T> Array<T> flatten(Array<UnionOfArrayOfTAndT<T>> list);
    @JsMethod(namespace="ng.compiler", name = "sourceUrl")
    public static native String sourceUrl(String url);
    @JsMethod(namespace="ng.compiler", name = "templateSourceUrl")
    public static native String templateSourceUrl(CompileIdentifierMetadata ngModuleType, Object compMeta, Object templateMeta);
    @JsMethod(namespace="ng.compiler", name = "sharedStylesheetJitUrl")
    public static native String sharedStylesheetJitUrl(CompileStylesheetMetadata meta, Number id);
    @JsMethod(namespace="ng.compiler", name = "ngModuleJitUrl")
    public static native String ngModuleJitUrl(CompileNgModuleMetadata moduleMeta);
    @JsMethod(namespace="ng.compiler", name = "templateJitUrl")
    public static native String templateJitUrl(CompileIdentifierMetadata ngModuleType, CompileDirectiveMetadata compMeta);
    @JsMethod(namespace="ng.compiler", name = "templateVisitAll")
    public static native Array<Object> templateVisitAll(TemplateAstVisitor visitor, Array<TemplateAst> asts, Object context /* optional */);
    @JsMethod(namespace="ng.compiler", name = "preserveWhitespacesDefault")
    public static native Boolean preserveWhitespacesDefault(Boolean preserveWhitespacesOption, Boolean defaultSetting /* optional */);
    @JsMethod(namespace="ng.compiler", name = "splitClasses")
    public static native Array<String> splitClasses(String classAttrValue);
    @JsMethod(namespace="ng.compiler", name = "createElementCssSelector")
    public static native CssSelector createElementCssSelector(String elementName, Array<Tuple<String, String>> attributes);
    @JsMethod(namespace="ng.compiler", name = "removeSummaryDuplicates")
    public static native <T> Array<T> removeSummaryDuplicates(Array<T> items);
    @JsMethod(namespace="ng.compiler", name = "createUrlResolverWithoutPackagePrefix")
    public static native UrlResolver createUrlResolverWithoutPackagePrefix();
    @JsMethod(namespace="ng.compiler", name = "createOfflineCompileUrlResolver")
    public static native UrlResolver createOfflineCompileUrlResolver();
    @JsMethod(namespace="ng.compiler", name = "getUrlScheme")
    public static native String getUrlScheme(String url);
    @JsMethod(namespace="ng.compiler", name = "camelCaseToDashCase")
    public static native String camelCaseToDashCase(String input);
    @JsMethod(namespace="ng.compiler", name = "dashCaseToCamelCase")
    public static native String dashCaseToCamelCase(String input);
    @JsMethod(namespace="ng.compiler", name = "splitAtColon")
    public static native Array<String> splitAtColon(String input, Array<String> defaultValues);
    @JsMethod(namespace="ng.compiler", name = "splitAtPeriod")
    public static native Array<String> splitAtPeriod(String input, Array<String> defaultValues);
    @JsMethod(namespace="ng.compiler", name = "visitValue")
    public static native Object visitValue(Object value, ValueVisitor visitor, Object context);
    @JsMethod(namespace="ng.compiler", name = "isDefined")
    public static native Boolean isDefined(Object val);
    @JsMethod(namespace="ng.compiler", name = "noUndefined")
    public static native <T> T noUndefined(T val);
    @JsMethod(namespace="ng.compiler", name = "syntaxError")
    public static native Error syntaxError(String msg, Array<ParseError> parseErrors /* optional */);
    @JsMethod(namespace="ng.compiler", name = "isSyntaxError")
    public static native Boolean isSyntaxError(Error error);
    @JsMethod(namespace="ng.compiler", name = "getParseErrors")
    public static native Array<ParseError> getParseErrors(Error error);
    @JsMethod(namespace="ng.compiler", name = "escapeRegExp")
    public static native String escapeRegExp(String s);
    @JsMethod(namespace="ng.compiler", name = "utf8Encode")
    public static native String utf8Encode(String str);
    @JsMethod(namespace="ng.compiler", name = "findLast")
    public static native <T> T findLast(Array<T> arr, Function1<T, Boolean> condition);
    @JsMethod(namespace="ng.compiler", name = "assertArrayOfStrings")
    public static native void assertArrayOfStrings(String identifier, Object value);
    @JsMethod(namespace="ng.compiler", name = "assertInterpolationSymbols")
    public static native void assertInterpolationSymbols(String identifier, Object value);
    @JsMethod(namespace="ng.compiler", name = "isWhitespace")
    public static native Boolean isWhitespace(Number code);
    @JsMethod(namespace="ng.compiler", name = "isDigit")
    public static native Boolean isDigit(Number code);
    @JsMethod(namespace="ng.compiler", name = "isAsciiLetter")
    public static native Boolean isAsciiLetter(Number code);
    @JsMethod(namespace="ng.compiler", name = "isAsciiHexDigit")
    public static native Boolean isAsciiHexDigit(Number code);
    @JsMethod(namespace="ng.compiler", name = "convertActionBinding")
    public static native ConvertActionBindingResult convertActionBinding(LocalResolver localResolver, Expression implicitReceiver, AST action, String bindingId);
    @JsMethod(namespace="ng.compiler", name = "convertPropertyBindingBuiltins")
    public static native AST convertPropertyBindingBuiltins(BuiltinConverterFactory converterFactory, AST ast);
    @JsMethod(namespace="ng.compiler", name = "convertPropertyBinding")
    public static native ConvertPropertyBindingResult convertPropertyBinding(LocalResolver localResolver, Expression implicitReceiver, AST expressionWithoutBuiltins, String bindingId);
    @JsMethod(namespace="ng.compiler", name = "temporaryDeclaration")
    public static native Statement temporaryDeclaration(String bindingId, Number temporaryNumber);
    @JsMethod(namespace="ng.compiler", name = "createTokenForReference")
    public static native CompileTokenMetadata createTokenForReference(Object reference);
    @JsMethod(namespace="ng.compiler", name = "createTokenForExternalReference")
    public static native CompileTokenMetadata createTokenForExternalReference(CompileReflector reflector, ExternalReference reference);
    @JsMethod(namespace="ng.compiler", name = "CompilerInjectable")
    public static native Function1<Object, Object> CompilerInjectable();
    @JsMethod(namespace="ng.compiler", name = "processRules")
    public static native String processRules(String input, Function1<CssRule, CssRule> ruleCallback);
    @JsMethod(namespace="ng.compiler", name = "isStyleUrlResolvable")
    public static native Boolean isStyleUrlResolvable(String url);
    @JsMethod(namespace="ng.compiler", name = "extractStyleUrls")
    public static native StyleWithImports extractStyleUrls(UrlResolver resolver, String baseUrl, String cssText);
    @JsMethod(namespace="ng.compiler", name = "calcPossibleSecurityContexts")
    public static native Array<SecurityContext> calcPossibleSecurityContexts(ElementSchemaRegistry registry, String selector, String propName, Boolean isAttribute);
    @JsMethod(namespace="ng.compiler", name = "preparseElement")
    public static native PreparsedElement preparseElement(Element ast);
    @JsMethod(namespace="ng.compiler", name = "providerDef")
    public static native Object providerDef(OutputContext ctx, ProviderAst providerAst);
    @JsMethod(namespace="ng.compiler", name = "depDef")
    public static native Expression depDef(OutputContext ctx, CompileDiDependencyMetadata dep);
    @JsMethod(namespace="ng.compiler", name = "lifecycleHookToNodeFlag")
    public static native NodeFlags lifecycleHookToNodeFlag(LifecycleHooks lifecycleHook);
    @JsMethod(namespace="ng.compiler", name = "componentFactoryResolverProviderDef")
    public static native Object componentFactoryResolverProviderDef(CompileReflector reflector, OutputContext ctx, NodeFlags flags, Array<CompileEntryComponentMetadata> entryComponents);
}
