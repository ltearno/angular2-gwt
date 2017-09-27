package fr.lteconsulting.jsinterop.ng.compiler.jit;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.CompileMetadataResolver;
import fr.lteconsulting.jsinterop.ng.compiler.CompilerConfig;
import fr.lteconsulting.jsinterop.ng.compiler.NgModuleCompiler;
import fr.lteconsulting.jsinterop.ng.compiler.StyleCompiler;
import fr.lteconsulting.jsinterop.ng.compiler.SummaryResolver;
import fr.lteconsulting.jsinterop.ng.compiler.TemplateParser;
import fr.lteconsulting.jsinterop.ng.compiler.ViewCompiler;
import fr.lteconsulting.jsinterop.ng.core.Compiler;
import fr.lteconsulting.jsinterop.ng.core.ComponentFactory;
import fr.lteconsulting.jsinterop.ng.core.Console;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler".JitCompiler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts:750
  * 1 constructors
  * An internal module of the Angular compiler that begins with component types,
  * extracts templates, and eventually produces a compiled version of the component
  * ready for linking into an application.
 */
@JsType(isNative=true, namespace="ng.compiler.jit", name="JitCompiler")
public class JitCompiler extends Compiler
{

    /*
        Constructors
    */
    public JitCompiler(Injector _injector, CompileMetadataResolver _metadataResolver, TemplateParser _templateParser, StyleCompiler _styleCompiler, ViewCompiler _viewCompiler, NgModuleCompiler _ngModuleCompiler, SummaryResolver<Type<Object>> _summaryResolver, CompilerConfig _compilerConfig, Console _console){
    }

    /*
        Properties
    */

    public Object _compiledDirectiveWrapperCache;

    @JsProperty( name = "_compiledDirectiveWrapperCache")
    public native Object get_compiledDirectiveWrapperCache();

    @JsProperty( name = "_compiledDirectiveWrapperCache")
    public native void set_compiledDirectiveWrapperCache( Object value );

    public Object _compiledHostTemplateCache;

    @JsProperty( name = "_compiledHostTemplateCache")
    public native Object get_compiledHostTemplateCache();

    @JsProperty( name = "_compiledHostTemplateCache")
    public native void set_compiledHostTemplateCache( Object value );

    public Object _compiledNgModuleCache;

    @JsProperty( name = "_compiledNgModuleCache")
    public native Object get_compiledNgModuleCache();

    @JsProperty( name = "_compiledNgModuleCache")
    public native void set_compiledNgModuleCache( Object value );

    public Object _compiledTemplateCache;

    @JsProperty( name = "_compiledTemplateCache")
    public native Object get_compiledTemplateCache();

    @JsProperty( name = "_compiledTemplateCache")
    public native void set_compiledTemplateCache( Object value );

    public Object _compilerConfig;

    @JsProperty( name = "_compilerConfig")
    public native Object get_compilerConfig();

    @JsProperty( name = "_compilerConfig")
    public native void set_compilerConfig( Object value );

    public Object _console;

    @JsProperty( name = "_console")
    public native Object get_console();

    @JsProperty( name = "_console")
    public native void set_console( Object value );

    public Object _injector;

    @JsProperty( name = "_injector")
    public native Object get_injector();

    @JsProperty( name = "_injector")
    public native void set_injector( Object value );

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

    public Object _sharedStylesheetCount;

    @JsProperty( name = "_sharedStylesheetCount")
    public native Object get_sharedStylesheetCount();

    @JsProperty( name = "_sharedStylesheetCount")
    public native void set_sharedStylesheetCount( Object value );

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

    public Object _templateParser;

    @JsProperty( name = "_templateParser")
    public native Object get_templateParser();

    @JsProperty( name = "_templateParser")
    public native void set_templateParser( Object value );

    public Object _viewCompiler;

    @JsProperty( name = "_viewCompiler")
    public native Object get_viewCompiler();

    @JsProperty( name = "_viewCompiler")
    public native void set_viewCompiler( Object value );

    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_compileModule,3,T-,P(d3))
      * TE Signature : S(_compileModule,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2888
     */
    public native <T> Object _compileModule(Object moduleType);
    /** 
      * Std Signature : S(_compileModuleAndAllComponents,3,T-,P(d3),P(d3))
      * TE Signature : S(_compileModuleAndAllComponents,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2775
     */
    public native <T> Object _compileModuleAndAllComponents(Object moduleType, Object isSync);
    /** 
      * Std Signature : S(_compileModuleAndComponents,3,T-,P(d3),P(d3))
      * TE Signature : S(_compileModuleAndComponents,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2711
     */
    public native <T> Object _compileModuleAndComponents(Object moduleType, Object isSync);
    /** 
      * Std Signature : S(_compileTemplate,3,,P(d3))
      * TE Signature : S(_compileTemplate,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@3115
     */
    public native Object _compileTemplate(Object template);
    /** 
      * Std Signature : S(_createCompiledHostTemplate,3,,P(d3),P(d3))
      * TE Signature : S(_createCompiledHostTemplate,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2997
     */
    public native Object _createCompiledHostTemplate(Object compType, Object ngModule);
    /** 
      * Std Signature : S(_createCompiledTemplate,3,,P(d3),P(d3))
      * TE Signature : S(_createCompiledTemplate,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@3058
     */
    public native Object _createCompiledTemplate(Object compMeta, Object ngModule);
    /** 
      * Std Signature : S(_filterJitIdentifiers,3,,P(d3))
      * TE Signature : S(_filterJitIdentifiers,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2671
     */
    public native Object _filterJitIdentifiers(Object ids);
    /** 
      * Std Signature : S(_loadModules,3,,P(d3),P(d3))
      * TE Signature : S(_loadModules,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2842
     */
    public native Object _loadModules(Object mainModule, Object isSync);
    /** 
      * Std Signature : S(_resolveAndEvalStylesCompileResult,3,,P(d3),P(d3))
      * TE Signature : S(_resolveAndEvalStylesCompileResult,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@3236
     */
    public native Object _resolveAndEvalStylesCompileResult(Object result, Object externalStylesheetsByModuleUrl);
    /** 
      * Std Signature : S(_resolveStylesCompileResult,3,,P(d3),P(d3))
      * TE Signature : S(_resolveStylesCompileResult,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@3155
     */
    public native Object _resolveStylesCompileResult(Object result, Object externalStylesheetsByModuleUrl);
    /** 
      * Std Signature : S(getComponentFactory,373<T->,T-,P(d329<T->))
      * TE Signature : S(getComponentFactory,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2506
     */
    public native <T> ComponentFactory<T> getComponentFactory(Type<T> component);
    /** 
      * Std Signature : S(hasAotSummary,27,,P(d329<3>))
      * TE Signature : S(hasAotSummary,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2627
     */
    public native Boolean hasAotSummary(Type<Object> ref);
    /** 
      * Std Signature : S(loadAotSummaries,429,,P(dFR--S(?,3,,)------)<7<3>>))
      * TE Signature : S(loadAotSummaries,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler.d.ts@2575
     */
    public native void loadAotSummaries(Function<Array<Object>> summaries);
}
