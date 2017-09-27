package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfPromiseOfStringAndString;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler_host".AotCompilerHost
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler_host.d.ts:332

  * The host of the AotCompiler disconnects the implementation from TypeScript / other language
  * services and from underlying file systems.
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="AotCompilerHost")
public class AotCompilerHost implements StaticSymbolResolverHost, AotSummaryResolverHost
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(fileNameToModuleName,1,,P(d1),P(d1))
      * TE Signature : S(fileNameToModuleName,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String fileNameToModuleName(String importedFilePath, String containingFilePath);
    /** 
      * Std Signature : S(getMetadataFor,7<C(----3----)>,,P(d1))
      * TE Signature : S(getMetadataFor,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Array<AnonymousType717> getMetadataFor(String modulePath);
    /** 
      * Std Signature : S(getOutputFileName,1,,P(d1))
      * TE Signature : S(getOutputFileName,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String getOutputFileName(String sourceFilePath);
    /** 
      * Std Signature : S(isSourceFile,27,,P(d1))
      * TE Signature : S(isSourceFile,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean isSourceFile(String sourceFilePath);
    /** 
      * Std Signature : S(loadResource,U(-88<1>,4),,P(d1))
      * TE Signature : S(loadResource,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler_host.d.ts@636
      * Loads a resource (e.g. html / css)
     */
    public native UnionOfPromiseOfStringAndString loadResource(String path);
    /** 
      * Std Signature : S(loadSummary,1,,P(d1))
      * TE Signature : S(loadSummary,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String loadSummary(String filePath);
    /** 
      * Std Signature : S(moduleNameToFileName,1,,P(d1))
      * TE Signature : S(moduleNameToFileName,P(d1))
      * 
     */
    public native String moduleNameToFileName(String moduleName);
    /** 
      * Std Signature : S(moduleNameToFileName,1,,P(d1),P(d1))
      * TE Signature : S(moduleNameToFileName,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String moduleNameToFileName(String moduleName, String containingFile /* optional */);
}
