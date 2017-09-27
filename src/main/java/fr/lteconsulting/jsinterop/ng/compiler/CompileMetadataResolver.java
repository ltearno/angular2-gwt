package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.ng.UnionOfProxyClassAndStaticSymbol;
import fr.lteconsulting.jsinterop.ng.UnionOfStaticSymbolAndTypeOfObject;
import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbolCache;
import fr.lteconsulting.jsinterop.ng.compiler.schema.ElementSchemaRegistry;
import fr.lteconsulting.jsinterop.ng.core.Console;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.prebuilt.Action2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver".CompileMetadataResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts:1025
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileMetadataResolver")
public class CompileMetadataResolver
{

    /*
        Constructors
    */
    public CompileMetadataResolver(CompilerConfig _config, NgModuleResolver _ngModuleResolver, DirectiveResolver _directiveResolver, PipeResolver _pipeResolver, SummaryResolver<Object> _summaryResolver, ElementSchemaRegistry _schemaRegistry, DirectiveNormalizer _directiveNormalizer, Console _console, StaticSymbolCache _staticSymbolCache, CompileReflector _reflector, Action2<Object, Object> _errorCollector){
    }

    /*
        Properties
    */

    public Object _config;

    @JsProperty( name = "_config")
    public native Object get_config();

    @JsProperty( name = "_config")
    public native void set_config( Object value );

    public Object _console;

    @JsProperty( name = "_console")
    public native Object get_console();

    @JsProperty( name = "_console")
    public native void set_console( Object value );

    public Object _directiveCache;

    @JsProperty( name = "_directiveCache")
    public native Object get_directiveCache();

    @JsProperty( name = "_directiveCache")
    public native void set_directiveCache( Object value );

    public Object _directiveNormalizer;

    @JsProperty( name = "_directiveNormalizer")
    public native Object get_directiveNormalizer();

    @JsProperty( name = "_directiveNormalizer")
    public native void set_directiveNormalizer( Object value );

    public Object _directiveResolver;

    @JsProperty( name = "_directiveResolver")
    public native Object get_directiveResolver();

    @JsProperty( name = "_directiveResolver")
    public native void set_directiveResolver( Object value );

    public Object _errorCollector;

    @JsProperty( name = "_errorCollector")
    public native Object get_errorCollector();

    @JsProperty( name = "_errorCollector")
    public native void set_errorCollector( Object value );

    public Object _ngModuleCache;

    @JsProperty( name = "_ngModuleCache")
    public native Object get_ngModuleCache();

    @JsProperty( name = "_ngModuleCache")
    public native void set_ngModuleCache( Object value );

    public Object _ngModuleOfTypes;

    @JsProperty( name = "_ngModuleOfTypes")
    public native Object get_ngModuleOfTypes();

    @JsProperty( name = "_ngModuleOfTypes")
    public native void set_ngModuleOfTypes( Object value );

    public Object _ngModuleResolver;

    @JsProperty( name = "_ngModuleResolver")
    public native Object get_ngModuleResolver();

    @JsProperty( name = "_ngModuleResolver")
    public native void set_ngModuleResolver( Object value );

    public Object _nonNormalizedDirectiveCache;

    @JsProperty( name = "_nonNormalizedDirectiveCache")
    public native Object get_nonNormalizedDirectiveCache();

    @JsProperty( name = "_nonNormalizedDirectiveCache")
    public native void set_nonNormalizedDirectiveCache( Object value );

    public Object _pipeCache;

    @JsProperty( name = "_pipeCache")
    public native Object get_pipeCache();

    @JsProperty( name = "_pipeCache")
    public native void set_pipeCache( Object value );

    public Object _pipeResolver;

    @JsProperty( name = "_pipeResolver")
    public native Object get_pipeResolver();

    @JsProperty( name = "_pipeResolver")
    public native void set_pipeResolver( Object value );

    public Object _reflector;

    @JsProperty( name = "_reflector")
    public native Object get_reflector();

    @JsProperty( name = "_reflector")
    public native void set_reflector( Object value );

    public Object _schemaRegistry;

    @JsProperty( name = "_schemaRegistry")
    public native Object get_schemaRegistry();

    @JsProperty( name = "_schemaRegistry")
    public native void set_schemaRegistry( Object value );

    public Object _staticSymbolCache;

    @JsProperty( name = "_staticSymbolCache")
    public native Object get_staticSymbolCache();

    @JsProperty( name = "_staticSymbolCache")
    public native void set_staticSymbolCache( Object value );

    public Object _summaryCache;

    @JsProperty( name = "_summaryCache")
    public native Object get_summaryCache();

    @JsProperty( name = "_summaryCache")
    public native void set_summaryCache( Object value );

    public Object _summaryResolver;

    @JsProperty( name = "_summaryResolver")
    public native Object get_summaryResolver();

    @JsProperty( name = "_summaryResolver")
    public native void set_summaryResolver( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addTypeToModule,3,,P(d3),P(d3))
      * TE Signature : S(_addTypeToModule,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3679
     */
    public native Object _addTypeToModule(Object type, Object moduleType);
    /** 
      * Std Signature : S(_checkSelfImport,3,,P(d3),P(d3))
      * TE Signature : S(_checkSelfImport,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3579
     */
    public native Object _checkSelfImport(Object moduleType, Object importedModuleType);
    /** 
      * Std Signature : S(_createProxyClass,3,,P(d3),P(d3))
      * TE Signature : S(_createProxyClass,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2064
     */
    public native Object _createProxyClass(Object baseType, Object name);
    /** 
      * Std Signature : S(_getDependenciesMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_getDependenciesMetadata,P(d3),P(d3))
      * 
     */
    public native Object _getDependenciesMetadata(Object typeOrFunc, Object dependencies);
    /** 
      * Std Signature : S(_getDependenciesMetadata,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getDependenciesMetadata,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4510
     */
    public native Object _getDependenciesMetadata(Object typeOrFunc, Object dependencies, Object throwOnUnknownDeps /* optional */);
    /** 
      * Std Signature : S(_getEntryComponentMetadata,3,,P(d3))
      * TE Signature : S(_getEntryComponentMetadata,P(d3))
      * 
     */
    public native Object _getEntryComponentMetadata(Object dirType);
    /** 
      * Std Signature : S(_getEntryComponentMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_getEntryComponentMetadata,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4843
     */
    public native Object _getEntryComponentMetadata(Object dirType, Object throwIfNotFound /* optional */);
    /** 
      * Std Signature : S(_getEntryComponentsFromProvider,3,,P(d3))
      * TE Signature : S(_getEntryComponentsFromProvider,P(d3))
      * 
     */
    public native Object _getEntryComponentsFromProvider(Object provider);
    /** 
      * Std Signature : S(_getEntryComponentsFromProvider,3,,P(d3),P(d3))
      * TE Signature : S(_getEntryComponentsFromProvider,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4781
     */
    public native Object _getEntryComponentsFromProvider(Object provider, Object type /* optional */);
    /** 
      * Std Signature : S(_getFactoryMetadata,3,,P(d3))
      * TE Signature : S(_getFactoryMetadata,P(d3))
      * 
     */
    public native Object _getFactoryMetadata(Object factory);
    /** 
      * Std Signature : S(_getFactoryMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_getFactoryMetadata,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4075
     */
    public native Object _getFactoryMetadata(Object factory, Object dependencies /* optional */);
    /** 
      * Std Signature : S(_getIdentifierMetadata,3,,P(d3))
      * TE Signature : S(_getIdentifierMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3805
     */
    public native Object _getIdentifierMetadata(Object type);
    /** 
      * Std Signature : S(_getInjectableMetadata,3,,P(d3))
      * TE Signature : S(_getInjectableMetadata,P(d3))
      * 
     */
    public native Object _getInjectableMetadata(Object type);
    /** 
      * Std Signature : S(_getInjectableMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_getInjectableMetadata,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3946
     */
    public native Object _getInjectableMetadata(Object type, Object dependencies /* optional */);
    /** 
      * Std Signature : S(_getProvidersMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_getProvidersMetadata,P(d3),P(d3))
      * 
     */
    public native Object _getProvidersMetadata(Object providers, Object targetEntryComponents);
    /** 
      * Std Signature : S(_getProvidersMetadata,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getProvidersMetadata,P(d3),P(d3),P(d3))
      * 
     */
    public native Object _getProvidersMetadata(Object providers, Object targetEntryComponents, Object debugInfo /* optional */);
    /** 
      * Std Signature : S(_getProvidersMetadata,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_getProvidersMetadata,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Object _getProvidersMetadata(Object providers, Object targetEntryComponents, Object debugInfo /* optional */, Object compileProviders /* optional */);
    /** 
      * Std Signature : S(_getProvidersMetadata,3,,P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_getProvidersMetadata,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4633
     */
    public native Object _getProvidersMetadata(Object providers, Object targetEntryComponents, Object debugInfo /* optional */, Object compileProviders /* optional */, Object type /* optional */);
    /** 
      * Std Signature : S(_getQueriesMetadata,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getQueriesMetadata,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4992
     */
    public native Object _getQueriesMetadata(Object queries, Object isViewQuery, Object directiveType);
    /** 
      * Std Signature : S(_getQueryMetadata,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getQueryMetadata,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@5103
     */
    public native Object _getQueryMetadata(Object q, Object propertyName, Object typeOrFunc);
    /** 
      * Std Signature : S(_getTokenMetadata,3,,P(d3))
      * TE Signature : S(_getTokenMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4595
     */
    public native Object _getTokenMetadata(Object token);
    /** 
      * Std Signature : S(_getTransitiveNgModuleMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_getTransitiveNgModuleMetadata,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3727
     */
    public native Object _getTransitiveNgModuleMetadata(Object importedModules, Object exportedModules);
    /** 
      * Std Signature : S(_getTypeDescriptor,3,,P(d3))
      * TE Signature : S(_getTypeDescriptor,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3641
     */
    public native Object _getTypeDescriptor(Object type);
    /** 
      * Std Signature : S(_getTypeMetadata,3,,P(d3))
      * TE Signature : S(_getTypeMetadata,P(d3))
      * 
     */
    public native Object _getTypeMetadata(Object type);
    /** 
      * Std Signature : S(_getTypeMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_getTypeMetadata,P(d3),P(d3))
      * 
     */
    public native Object _getTypeMetadata(Object type, Object dependencies /* optional */);
    /** 
      * Std Signature : S(_getTypeMetadata,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getTypeMetadata,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4003
     */
    public native Object _getTypeMetadata(Object type, Object dependencies /* optional */, Object throwOnUnknownDeps /* optional */);
    /** 
      * Std Signature : S(_loadPipeMetadata,3,,P(d3))
      * TE Signature : S(_loadPipeMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4469
     */
    public native Object _loadPipeMetadata(Object pipeType);
    /** 
      * Std Signature : S(_loadSummary,3,,P(d3),P(d3))
      * TE Signature : S(_loadSummary,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2513
     */
    public native Object _loadSummary(Object type, Object kind);
    /** 
      * Std Signature : S(_queryVarBindings,3,,P(d3))
      * TE Signature : S(_queryVarBindings,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@5062
     */
    public native Object _queryVarBindings(Object selector);
    /** 
      * Std Signature : S(_reportError,3,,P(d3))
      * TE Signature : S(_reportError,P(d3))
      * 
     */
    public native Object _reportError(Object error);
    /** 
      * Std Signature : S(_reportError,3,,P(d3),P(d3))
      * TE Signature : S(_reportError,P(d3),P(d3))
      * 
     */
    public native Object _reportError(Object error, Object type /* optional */);
    /** 
      * Std Signature : S(_reportError,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_reportError,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@5163
     */
    public native Object _reportError(Object error, Object type /* optional */, Object otherType /* optional */);
    /** 
      * Std Signature : S(_validateProvider,3,,P(d3))
      * TE Signature : S(_validateProvider,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4740
     */
    public native Object _validateProvider(Object provider);
    /** 
      * Std Signature : S(clearCache,429,,)
      * TE Signature : S(clearCache,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2040
     */
    public native void clearCache();
    /** 
      * Std Signature : S(clearCacheFor,429,,P(d329<3>))
      * TE Signature : S(clearCacheFor,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@1998
     */
    public native void clearCacheFor(Type<Object> type);
    /** 
      * Std Signature : S(getComponentFactory,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(getComponentFactory,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2381
     */
    public native Object getComponentFactory(Object selector, Object dirType, Object inputs, Object outputs);
    /** 
      * Std Signature : S(getComponentViewClass,3,,P(d3))
      * TE Signature : S(getComponentViewClass,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2157
     */
    public native Object getComponentViewClass(Object dirType);
    /** 
      * Std Signature : S(getDirectiveMetadata,496,,P(d3))
      * TE Signature : S(getDirectiveMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2953
      * Gets the metadata for the given directive.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
     */
    public native CompileDirectiveMetadata getDirectiveMetadata(Object directiveType);
    /** 
      * Std Signature : S(getDirectiveSummary,531,,P(d3))
      * TE Signature : S(getDirectiveSummary,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3029
     */
    public native CompileDirectiveSummary getDirectiveSummary(Object dirType);
    /** 
      * Std Signature : S(getGeneratedClass,3,,P(d3),P(d3))
      * TE Signature : S(getGeneratedClass,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2111
     */
    public native Object getGeneratedClass(Object dirType, Object name);
    /** 
      * Std Signature : S(getHostComponentType,U(-492,329<3>),,P(d3))
      * TE Signature : S(getHostComponentType,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2277
     */
    public native UnionOfStaticSymbolAndTypeOfObject getHostComponentType(Object dirType);
    /** 
      * Std Signature : S(getHostComponentViewClass,U(-497,492),,P(d3))
      * TE Signature : S(getHostComponentViewClass,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2201
     */
    public native UnionOfProxyClassAndStaticSymbol getHostComponentViewClass(Object dirType);
    /** 
      * Std Signature : S(getInjectableSummary,1228,,P(d3))
      * TE Signature : S(getInjectableSummary,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3885
     */
    public native CompileTypeSummary getInjectableSummary(Object type);
    /** 
      * Std Signature : S(getNgModuleMetadata,502,,P(d3))
      * TE Signature : S(getNgModuleMetadata,P(d3))
      * 
     */
    public native CompileNgModuleMetadata getNgModuleMetadata(Object moduleType);
    /** 
      * Std Signature : S(getNgModuleMetadata,502,,P(d3),P(d27))
      * TE Signature : S(getNgModuleMetadata,P(d3),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3474
     */
    public native CompileNgModuleMetadata getNgModuleMetadata(Object moduleType, Boolean throwIfNotFound /* optional */);
    /** 
      * Std Signature : S(getNgModuleSummary,1223,,P(d3))
      * TE Signature : S(getNgModuleSummary,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3202
     */
    public native CompileNgModuleSummary getNgModuleSummary(Object moduleType);
    /** 
      * Std Signature : S(getNonNormalizedDirectiveMetadata,3,,P(d3))
      * TE Signature : S(getNonNormalizedDirectiveMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2651
     */
    public native Object getNonNormalizedDirectiveMetadata(Object directiveType);
    /** 
      * Std Signature : S(getOrLoadPipeMetadata,1229,,P(d3))
      * TE Signature : S(getOrLoadPipeMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4402
     */
    public native CompilePipeMetadata getOrLoadPipeMetadata(Object pipeType);
    /** 
      * Std Signature : S(getPipeMetadata,1229,,P(d3))
      * TE Signature : S(getPipeMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4275
      * Gets the metadata for the given pipe.
      * This assumes `loadNgModuleDirectiveAndPipeMetadata` has been called first.
     */
    public native CompilePipeMetadata getPipeMetadata(Object pipeType);
    /** 
      * Std Signature : S(getPipeSummary,1221,,P(d3))
      * TE Signature : S(getPipeSummary,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4343
     */
    public native CompilePipeSummary getPipeSummary(Object pipeType);
    /** 
      * Std Signature : S(getProviderMetadata,498,,P(d576))
      * TE Signature : S(getProviderMetadata,P(d576))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@4910
     */
    public native CompileProviderMetadata getProviderMetadata(ProviderMeta provider);
    /** 
      * Std Signature : S(getReflector,489,,)
      * TE Signature : S(getReflector,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@1960
     */
    public native CompileReflector getReflector();
    /** 
      * Std Signature : S(getRendererType,3,,P(d3))
      * TE Signature : S(getRendererType,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2343
     */
    public native Object getRendererType(Object dirType);
    /** 
      * Std Signature : S(initComponentFactory,3,,P(d3),P(d3))
      * TE Signature : S(initComponentFactory,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2450
     */
    public native Object initComponentFactory(Object factory, Object ngContentSelectors);
    /** 
      * Std Signature : S(isDirective,27,,P(d3))
      * TE Signature : S(isDirective,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3097
     */
    public native Boolean isDirective(Object type);
    /** 
      * Std Signature : S(isInjectable,27,,P(d3))
      * TE Signature : S(isInjectable,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3847
     */
    public native Boolean isInjectable(Object type);
    /** 
      * Std Signature : S(isNgModule,27,,P(d3))
      * TE Signature : S(isNgModule,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3166
     */
    public native Boolean isNgModule(Object type);
    /** 
      * Std Signature : S(isPipe,27,,P(d3))
      * TE Signature : S(isPipe,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3134
     */
    public native Boolean isPipe(Object type);
    /** 
      * Std Signature : S(loadDirectiveMetadata,88<349>,,P(d3),P(d3),P(d27))
      * TE Signature : S(loadDirectiveMetadata,P(d3),P(d3),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@2551
     */
    public native Promise<Void> loadDirectiveMetadata(Object ngModuleType, Object directiveType, Boolean isSync);
    /** 
      * Std Signature : S(loadNgModuleDirectiveAndPipeMetadata,88<3>,,P(d3),P(d27))
      * TE Signature : S(loadNgModuleDirectiveAndPipeMetadata,P(d3),P(d27))
      * 
     */
    public native Promise<Object> loadNgModuleDirectiveAndPipeMetadata(Object moduleType, Boolean isSync);
    /** 
      * Std Signature : S(loadNgModuleDirectiveAndPipeMetadata,88<3>,,P(d3),P(d27),P(d27))
      * TE Signature : S(loadNgModuleDirectiveAndPipeMetadata,P(d3),P(d27),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/metadata_resolver.d.ts@3357
      * Loads the declared directives and pipes of an NgModule.
     */
    public native Promise<Object> loadNgModuleDirectiveAndPipeMetadata(Object moduleType, Boolean isSync, Boolean throwIfNotFound /* optional */);
}
