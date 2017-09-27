package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.ng.compiler.CompileMetadataResolver;
import fr.lteconsulting.jsinterop.ng.compiler.CompilerConfig;
import fr.lteconsulting.jsinterop.ng.compiler.NgModuleCompiler;
import fr.lteconsulting.jsinterop.ng.compiler.StyleCompiler;
import fr.lteconsulting.jsinterop.ng.compiler.SummaryResolver;
import fr.lteconsulting.jsinterop.ng.compiler.TemplateParser;
import fr.lteconsulting.jsinterop.ng.compiler.ViewCompiler;
import fr.lteconsulting.jsinterop.ng.compiler.output.OutputEmitter;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler".AotCompiler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts:997
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="AotCompiler")
public class AotCompiler
{

    /*
        Constructors
    */
    public AotCompiler(CompilerConfig _config, AotCompilerHost _host, StaticReflector _reflector, CompileMetadataResolver _metadataResolver, TemplateParser _templateParser, StyleCompiler _styleCompiler, ViewCompiler _viewCompiler, NgModuleCompiler _ngModuleCompiler, OutputEmitter _outputEmitter, SummaryResolver<StaticSymbol> _summaryResolver, String _localeId, String _translationFormat, Boolean _enableSummariesForJit, StaticSymbolResolver _symbolResolver){
    }

    /*
        Properties
    */

    public Object _config;

    @JsProperty( name = "_config")
    public native Object get_config();

    @JsProperty( name = "_config")
    public native void set_config( Object value );

    public Object _enableSummariesForJit;

    @JsProperty( name = "_enableSummariesForJit")
    public native Object get_enableSummariesForJit();

    @JsProperty( name = "_enableSummariesForJit")
    public native void set_enableSummariesForJit( Object value );

    public Object _host;

    @JsProperty( name = "_host")
    public native Object get_host();

    @JsProperty( name = "_host")
    public native void set_host( Object value );

    public Object _localeId;

    @JsProperty( name = "_localeId")
    public native Object get_localeId();

    @JsProperty( name = "_localeId")
    public native void set_localeId( Object value );

    public Object _metadataResolver;

    @JsProperty( name = "_metadataResolver")
    public native Object get_metadataResolver();

    @JsProperty( name = "_metadataResolver")
    public native void set_metadataResolver( Object value );

    public Object _ngModuleCompiler;

    @JsProperty( name = "_ngModuleCompiler")
    public native Object get_ngModuleCompiler();

    @JsProperty( name = "_ngModuleCompiler")
    public native void set_ngModuleCompiler( Object value );

    public Object _outputEmitter;

    @JsProperty( name = "_outputEmitter")
    public native Object get_outputEmitter();

    @JsProperty( name = "_outputEmitter")
    public native void set_outputEmitter( Object value );

    public Object _reflector;

    @JsProperty( name = "_reflector")
    public native Object get_reflector();

    @JsProperty( name = "_reflector")
    public native void set_reflector( Object value );

    public Object _styleCompiler;

    @JsProperty( name = "_styleCompiler")
    public native Object get_styleCompiler();

    @JsProperty( name = "_styleCompiler")
    public native void set_styleCompiler( Object value );

    public Object _summaryResolver;

    @JsProperty( name = "_summaryResolver")
    public native Object get_summaryResolver();

    @JsProperty( name = "_summaryResolver")
    public native void set_summaryResolver( Object value );

    public Object _symbolResolver;

    @JsProperty( name = "_symbolResolver")
    public native Object get_symbolResolver();

    @JsProperty( name = "_symbolResolver")
    public native void set_symbolResolver( Object value );

    public Object _templateParser;

    @JsProperty( name = "_templateParser")
    public native Object get_templateParser();

    @JsProperty( name = "_templateParser")
    public native void set_templateParser( Object value );

    public Object _translationFormat;

    @JsProperty( name = "_translationFormat")
    public native Object get_translationFormat();

    @JsProperty( name = "_translationFormat")
    public native void set_translationFormat( Object value );

    public Object _viewCompiler;

    @JsProperty( name = "_viewCompiler")
    public native Object get_viewCompiler();

    @JsProperty( name = "_viewCompiler")
    public native void set_viewCompiler( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_codegenSourceModule,3,,P(d3),P(d3))
      * TE Signature : S(_codegenSourceModule,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2953
     */
    public native Object _codegenSourceModule(Object srcFileUrl, Object ctx);
    /** 
      * Std Signature : S(_codegenStyles,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_codegenStyles,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2871
     */
    public native Object _codegenStyles(Object srcFileUrl, Object compMeta, Object stylesheetMetadata, Object fileSuffix);
    /** 
      * Std Signature : S(_compileComponent,3,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_compileComponent,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2711
     */
    public native Object _compileComponent(Object outputCtx, Object compMeta, Object ngModule, Object directiveIdentifiers, Object componentStyles, Object fileSuffix);
    /** 
      * Std Signature : S(_compileComponentFactory,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_compileComponentFactory,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2630
     */
    public native Object _compileComponentFactory(Object outputCtx, Object compMeta, Object ngModule, Object fileSuffix);
    /** 
      * Std Signature : S(_compileImplFile,3,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_compileImplFile,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2368
     */
    public native Object _compileImplFile(Object srcFileUrl, Object ngModuleByPipeOrDirective, Object directives, Object pipes, Object ngModules, Object injectables);
    /** 
      * Std Signature : S(_compileModule,3,,P(d3),P(d3))
      * TE Signature : S(_compileModule,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2577
     */
    public native Object _compileModule(Object outputCtx, Object ngModuleType);
    /** 
      * Std Signature : S(_compileStubFile,3,,P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_compileStubFile,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2287
     */
    public native Object _compileStubFile(Object srcFileUrl, Object directives, Object pipes, Object ngModules, Object partial);
    /** 
      * Std Signature : S(_createOutputContext,3,,P(d3))
      * TE Signature : S(_createOutputContext,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2824
     */
    public native Object _createOutputContext(Object genFilePath);
    /** 
      * Std Signature : S(_createSummary,3,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_createSummary,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2480
     */
    public native Object _createSummary(Object srcFileUrl, Object directives, Object pipes, Object ngModules, Object injectables, Object ngFactoryCtx);
    /** 
      * Std Signature : S(analyzeModulesAsync,88<592>,,P(d7<1>))
      * TE Signature : S(analyzeModulesAsync,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2002
     */
    public native Promise<NgAnalyzedModules> analyzeModulesAsync(Array<String> rootFiles);
    /** 
      * Std Signature : S(analyzeModulesSync,592,,P(d7<1>))
      * TE Signature : S(analyzeModulesSync,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@1938
     */
    public native NgAnalyzedModules analyzeModulesSync(Array<String> rootFiles);
    /** 
      * Std Signature : S(clearCache,429,,)
      * TE Signature : S(clearCache,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@1914
     */
    public native void clearCache();
    /** 
      * Std Signature : S(emitAllImpls,7<582>,,P(d592))
      * TE Signature : S(emitAllImpls,P(d592))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2218
     */
    public native Array<GeneratedFile> emitAllImpls(NgAnalyzedModules analyzeResult);
    /** 
      * Std Signature : S(emitAllStubs,7<582>,,P(d592))
      * TE Signature : S(emitAllStubs,P(d592))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2076
     */
    public native Array<GeneratedFile> emitAllStubs(NgAnalyzedModules analyzeResult);
    /** 
      * Std Signature : S(emitPartialStubs,7<582>,,P(d592))
      * TE Signature : S(emitPartialStubs,P(d592))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts@2145
     */
    public native Array<GeneratedFile> emitPartialStubs(NgAnalyzedModules analyzeResult);
}
