package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver".SummaryResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts:394
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="SummaryResolver")
public class SummaryResolver<T>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(addSummary,429,,P(d569<T->))
      * TE Signature : S(addSummary,P(d569))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@726
     */
    public native void addSummary(Summary<T> summary);
    /** 
      * Std Signature : S(getImportAs,T-,,P(dT-))
      * TE Signature : S(getImportAs,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@683
     */
    public native T getImportAs(T reference);
    /** 
      * Std Signature : S(getLibraryFileName,1,,P(d1))
      * TE Signature : S(getLibraryFileName,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@505
     */
    public native String getLibraryFileName(String fileName);
    /** 
      * Std Signature : S(getSymbolsOf,7<T->,,P(d1))
      * TE Signature : S(getSymbolsOf,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@633
     */
    public native Array<T> getSymbolsOf(String filePath);
    /** 
      * Std Signature : S(isLibraryFile,27,,P(d1))
      * TE Signature : S(isLibraryFile,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@450
     */
    public native Boolean isLibraryFile(String fileName);
    /** 
      * Std Signature : S(resolveSummary,569<T->,,P(dT-))
      * TE Signature : S(resolveSummary,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@571
     */
    public native Summary<T> resolveSummary(T reference);
}
