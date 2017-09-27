package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.ng.compiler.Summary;
import fr.lteconsulting.jsinterop.ng.compiler.SummaryResolver;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver".AotSummaryResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts:797
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="AotSummaryResolver")
public class AotSummaryResolver extends SummaryResolver<StaticSymbol>
{

    /*
        Constructors
    */
    public AotSummaryResolver(AotSummaryResolverHost host, StaticSymbolCache staticSymbolCache){
    }

    /*
        Properties
    */

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

    public Object loadedFilePaths;

    @JsProperty( name = "loadedFilePaths")
    public native Object getLoadedFilePaths();

    @JsProperty( name = "loadedFilePaths")
    public native void setLoadedFilePaths( Object value );

    public Object staticSymbolCache;

    @JsProperty( name = "staticSymbolCache")
    public native Object getStaticSymbolCache();

    @JsProperty( name = "staticSymbolCache")
    public native void setStaticSymbolCache( Object value );

    public Object summaryCache;

    @JsProperty( name = "summaryCache")
    public native Object getSummaryCache();

    @JsProperty( name = "summaryCache")
    public native void setSummaryCache( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_loadSummaryFile,3,,P(d3))
      * TE Signature : S(_loadSummaryFile,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts@1428
     */
    public native Object _loadSummaryFile(Object filePath);
    /** 
      * Std Signature : S(getImportAs,492,,P(d492))
      * TE Signature : S(getImportAs,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts@1315
     */
    public native StaticSymbol getImportAs(StaticSymbol staticSymbol);
    /** 
      * Std Signature : S(resolveSummary,569<492>,,P(d492))
      * TE Signature : S(resolveSummary,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts@1192
     */
    public native Summary<StaticSymbol> resolveSummary(StaticSymbol staticSymbol);
}
