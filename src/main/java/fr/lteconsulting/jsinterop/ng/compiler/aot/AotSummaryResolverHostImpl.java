package fr.lteconsulting.jsinterop.ng.compiler.aot;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver".AotSummaryResolverHost
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts:333
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="AotSummaryResolverHost")
public class AotSummaryResolverHostImpl implements AotSummaryResolverHost
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(getOutputFileName,1,,P(d1))
      * TE Signature : S(getOutputFileName,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts@745
      * Returns the output file path of a source file.
      * E.g.
      * `some_file.ts` -> `some_file.d.ts`
     */
    public native String getOutputFileName(String sourceFilePath);
    /** 
      * Std Signature : S(isSourceFile,27,,P(d1))
      * TE Signature : S(isSourceFile,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts@570
      * Returns whether a file is a source file or not.
     */
    public native Boolean isSourceFile(String sourceFilePath);
    /** 
      * Std Signature : S(loadSummary,1,,P(d1))
      * TE Signature : S(loadSummary,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/summary_resolver.d.ts@449
      * Loads an NgModule/Directive/Pipe summary file
     */
    public native String loadSummary(String filePath);
}
