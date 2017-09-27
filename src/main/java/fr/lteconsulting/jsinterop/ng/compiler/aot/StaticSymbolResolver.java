package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.SummaryResolver;
import fr.lteconsulting.prebuilt.Action2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver".StaticSymbolResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts:1844
  * 1 constructors
  * This class is responsible for loading metadata per symbol,
  * and normalizing references between symbols.
  * 
  * Internally, it only uses symbols without members,
  * and deduces the values for symbols with members based
  * on these symbols.
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="StaticSymbolResolver")
public class StaticSymbolResolver
{

    /*
        Constructors
    */
    public StaticSymbolResolver(StaticSymbolResolverHost host, StaticSymbolCache staticSymbolCache, SummaryResolver<StaticSymbol> summaryResolver, Action2<Object, String> errorRecorder){
    }

    /*
        Properties
    */

    public Object errorRecorder;

    @JsProperty( name = "errorRecorder")
    public native Object getErrorRecorder();

    @JsProperty( name = "errorRecorder")
    public native void setErrorRecorder( Object value );

    public Object host;

    @JsProperty( name = "host")
    public native Object getHost();

    @JsProperty( name = "host")
    public native void setHost( Object value );

    public Object importAs;

    @JsProperty( name = "importAs")
    public native Object getImportAs();

    @JsProperty( name = "importAs")
    public native void setImportAs( Object value );

    public Object knownFileNameToModuleNames;

    @JsProperty( name = "knownFileNameToModuleNames")
    public native Object getKnownFileNameToModuleNames();

    @JsProperty( name = "knownFileNameToModuleNames")
    public native void setKnownFileNameToModuleNames( Object value );

    public Object metadataCache;

    @JsProperty( name = "metadataCache")
    public native Object getMetadataCache();

    @JsProperty( name = "metadataCache")
    public native void setMetadataCache( Object value );

    public Object resolvedFilePaths;

    @JsProperty( name = "resolvedFilePaths")
    public native Object getResolvedFilePaths();

    @JsProperty( name = "resolvedFilePaths")
    public native void setResolvedFilePaths( Object value );

    public Object resolvedSymbols;

    @JsProperty( name = "resolvedSymbols")
    public native Object getResolvedSymbols();

    @JsProperty( name = "resolvedSymbols")
    public native void setResolvedSymbols( Object value );

    public Object staticSymbolCache;

    @JsProperty( name = "staticSymbolCache")
    public native Object getStaticSymbolCache();

    @JsProperty( name = "staticSymbolCache")
    public native void setStaticSymbolCache( Object value );

    public Object summaryResolver;

    @JsProperty( name = "summaryResolver")
    public native Object getSummaryResolver();

    @JsProperty( name = "summaryResolver")
    public native void setSummaryResolver( Object value );

    public Object symbolFromFile;

    @JsProperty( name = "symbolFromFile")
    public native Object getSymbolFromFile();

    @JsProperty( name = "symbolFromFile")
    public native void setSymbolFromFile( Object value );

    public Object symbolResourcePaths;

    @JsProperty( name = "symbolResourcePaths")
    public native Object getSymbolResourcePaths();

    @JsProperty( name = "symbolResourcePaths")
    public native void setSymbolResourcePaths( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_createSymbolsOf,3,,P(d3))
      * TE Signature : S(_createSymbolsOf,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@4875
     */
    public native Object _createSymbolsOf(Object filePath);
    /** 
      * Std Signature : S(_resolveSymbolFromSummary,3,,P(d3))
      * TE Signature : S(_resolveSymbolFromSummary,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@4257
     */
    public native Object _resolveSymbolFromSummary(Object staticSymbol);
    /** 
      * Std Signature : S(_resolveSymbolMembers,3,,P(d3))
      * TE Signature : S(_resolveSymbolMembers,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@4208
     */
    public native Object _resolveSymbolMembers(Object staticSymbol);
    /** 
      * Std Signature : S(createExport,3,,P(d3),P(d3))
      * TE Signature : S(createExport,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@5008
     */
    public native Object createExport(Object sourceSymbol, Object targetSymbol);
    /** 
      * Std Signature : S(createResolvedSymbol,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(createResolvedSymbol,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@4915
     */
    public native Object createResolvedSymbol(Object sourceSymbol, Object topLevelPath, Object topLevelSymbolNames, Object metadata);
    /** 
      * Std Signature : S(fileNameToModuleName,1,,P(d1),P(d1))
      * TE Signature : S(fileNameToModuleName,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@3855
      * Converts a file path to a module name that can be used as an `import`.
     */
    public native String fileNameToModuleName(String importedFilePath, String containingFilePath);
    /** 
      * Std Signature : S(getImportAs,492,,P(d492))
      * TE Signature : S(getImportAs,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@3202
      * getImportAs produces a symbol that can be used to import the given symbol.
      * The import might be different than the symbol if the symbol is exported from
      * a library with a summary; in which case we want to import the symbol from the
      * ngfactory re-export instead of directly to avoid introducing a direct dependency
      * on an otherwise indirect dependency.
     */
    public native StaticSymbol getImportAs(StaticSymbol staticSymbol);
    /** 
      * Std Signature : S(getModuleMetadata,3,,P(d3))
      * TE Signature : S(getModuleMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@5183
     */
    public native Object getModuleMetadata(Object module);
    /** 
      * Std Signature : S(getResourcePath,1,,P(d492))
      * TE Signature : S(getResourcePath,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@3484
      * getResourcePath produces the path to the original location of the symbol and should
      * be used to determine the relative location of resource references recorded in
      * symbol metadata.
     */
    public native String getResourcePath(StaticSymbol staticSymbol);
    /** 
      * Std Signature : S(getStaticSymbol,492,,P(d1),P(d1))
      * TE Signature : S(getStaticSymbol,P(d1),P(d1))
      * 
     */
    public native StaticSymbol getStaticSymbol(String declarationFile, String name);
    /** 
      * Std Signature : S(getStaticSymbol,492,,P(d1),P(d1),P(d7<1>))
      * TE Signature : S(getStaticSymbol,P(d1),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@4729
      * getStaticSymbol produces a Type whose metadata is known but whose implementation is not loaded.
      * All types passed to the StaticResolver should be pseudo-types returned by this method.
     */
    public native StaticSymbol getStaticSymbol(String declarationFile, String name, Array<String> members /* optional */);
    /** 
      * Std Signature : S(getSymbolByModule,492,,P(d1),P(d1))
      * TE Signature : S(getSymbolByModule,P(d1),P(d1))
      * 
     */
    public native StaticSymbol getSymbolByModule(String module, String symbolName);
    /** 
      * Std Signature : S(getSymbolByModule,492,,P(d1),P(d1),P(d1))
      * TE Signature : S(getSymbolByModule,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@5222
     */
    public native StaticSymbol getSymbolByModule(String module, String symbolName, String containingFile /* optional */);
    /** 
      * Std Signature : S(getSymbolsOf,7<492>,,P(d1))
      * TE Signature : S(getSymbolsOf,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@4823
     */
    public native Array<StaticSymbol> getSymbolsOf(String filePath);
    /** 
      * Std Signature : S(getTypeArity,2,,P(d492))
      * TE Signature : S(getTypeArity,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@3700
      * getTypeArity returns the number of generic type parameters the given symbol
      * has. If the symbol is not a type the result is null.
     */
    public native Number getTypeArity(StaticSymbol staticSymbol);
    /** 
      * Std Signature : S(invalidateFile,429,,P(d1))
      * TE Signature : S(invalidateFile,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@4164
      * Invalidate all information derived from the given file.
     */
    public native void invalidateFile(String fileName);
    /** 
      * Std Signature : S(recordImportAs,429,,P(d492),P(d492))
      * TE Signature : S(recordImportAs,P(d492),P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@3950
     */
    public native void recordImportAs(StaticSymbol sourceSymbol, StaticSymbol targetSymbol);
    /** 
      * Std Signature : S(reportError,3,,P(d3))
      * TE Signature : S(reportError,P(d3))
      * 
     */
    public native Object reportError(Object error);
    /** 
      * Std Signature : S(reportError,3,,P(d3),P(d3))
      * TE Signature : S(reportError,P(d3),P(d3))
      * 
     */
    public native Object reportError(Object error, Object context /* optional */);
    /** 
      * Std Signature : S(reportError,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(reportError,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@5062
     */
    public native Object reportError(Object error, Object context /* optional */, Object path /* optional */);
    /** 
      * Std Signature : S(resolveModule,3,,P(d3))
      * TE Signature : S(resolveModule,P(d3))
      * 
     */
    public native Object resolveModule(Object module);
    /** 
      * Std Signature : S(resolveModule,3,,P(d3),P(d3))
      * TE Signature : S(resolveModule,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@5320
     */
    public native Object resolveModule(Object module, Object containingFile /* optional */);
    /** 
      * Std Signature : S(resolveSymbol,861,,P(d492))
      * TE Signature : S(resolveSymbol,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts@2651
     */
    public native ResolvedStaticSymbol resolveSymbol(StaticSymbol staticSymbol);
}
