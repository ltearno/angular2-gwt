package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.CompileMetadataResolver;
import fr.lteconsulting.jsinterop.ng.compiler.OutputContext;
import fr.lteconsulting.jsinterop.ng.compiler.SummaryResolver;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.compiler.aot (java fr.lteconsulting.jsinterop.ng.compiler.aot) package
 */
@JsType(isNative=true, namespace="ng", name="compiler.aot")
public class GlobalScope_NgCompilerAot
{

    /*
        Static methods
    */
    @JsMethod(namespace="ng.compiler.aot", name = "unescapeIdentifier")
    public static native String unescapeIdentifier(String identifier);
    @JsMethod(namespace="ng.compiler.aot", name = "toTypeScript")
    public static native String toTypeScript(GeneratedFile file, String preamble /* optional */);
    @JsMethod(namespace="ng.compiler.aot", name = "analyzeNgModules")
    public static native NgAnalyzedModules analyzeNgModules(Array<StaticSymbol> programStaticSymbols, NgAnalyzeModulesHost host, CompileMetadataResolver metadataResolver);
    @JsMethod(namespace="ng.compiler.aot", name = "analyzeAndValidateNgModules")
    public static native NgAnalyzedModules analyzeAndValidateNgModules(Array<StaticSymbol> programStaticSymbols, NgAnalyzeModulesHost host, CompileMetadataResolver metadataResolver);
    @JsMethod(namespace="ng.compiler.aot", name = "extractProgramSymbols")
    public static native Array<StaticSymbol> extractProgramSymbols(StaticSymbolResolver staticSymbolResolver, Array<String> files, NgAnalyzeModulesHost host);
    @JsMethod(namespace="ng.compiler.aot", name = "createAotCompiler")
    public static native Object createAotCompiler(AotCompilerHost compilerHost, AotCompilerOptions options);
    @JsMethod(namespace="ng.compiler.aot", name = "serializeSummaries")
    public static native Object serializeSummaries(OutputContext forJitCtx, SummaryResolver<StaticSymbol> summaryResolver, StaticSymbolResolver symbolResolver, Array<ResolvedStaticSymbol> symbols, Array<Object> types);
    @JsMethod(namespace="ng.compiler.aot", name = "deserializeSummaries")
    public static native Object deserializeSummaries(StaticSymbolCache symbolCache, String json);
    @JsMethod(namespace="ng.compiler.aot", name = "createForJitStub")
    public static native void createForJitStub(OutputContext outputCtx, StaticSymbol reference);
    @JsMethod(namespace="ng.compiler.aot", name = "ngfactoryFilePath")
    public static native String ngfactoryFilePath(String filePath, Boolean forceSourceFile /* optional */);
    @JsMethod(namespace="ng.compiler.aot", name = "stripGeneratedFileSuffix")
    public static native String stripGeneratedFileSuffix(String filePath);
    @JsMethod(namespace="ng.compiler.aot", name = "isGeneratedFile")
    public static native Boolean isGeneratedFile(String filePath);
    @JsMethod(namespace="ng.compiler.aot", name = "splitTypescriptSuffix")
    public static native Array<String> splitTypescriptSuffix(String path, Boolean forceSourceFile /* optional */);
    @JsMethod(namespace="ng.compiler.aot", name = "summaryFileName")
    public static native String summaryFileName(String fileName);
    @JsMethod(namespace="ng.compiler.aot", name = "summaryForJitFileName")
    public static native String summaryForJitFileName(String fileName, Boolean forceSourceFile /* optional */);
    @JsMethod(namespace="ng.compiler.aot", name = "stripSummaryForJitFileSuffix")
    public static native String stripSummaryForJitFileSuffix(String filePath);
    @JsMethod(namespace="ng.compiler.aot", name = "summaryForJitName")
    public static native String summaryForJitName(String symbolName);
    @JsMethod(namespace="ng.compiler.aot", name = "stripSummaryForJitNameSuffix")
    public static native String stripSummaryForJitNameSuffix(String symbolName);
}
