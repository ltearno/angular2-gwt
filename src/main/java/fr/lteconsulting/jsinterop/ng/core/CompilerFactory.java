package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler".CompilerFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts:3231

  * A factory for creating a Compiler
 */
@JsType(isNative=true, namespace="ng.core", name="CompilerFactory")
public class CompilerFactory
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(createCompiler,388,,)
      * TE Signature : S(createCompiler,)
      * 
     */
    public native Compiler createCompiler();
    /** 
      * Std Signature : S(createCompiler,388,,P(d7<3>))
      * TE Signature : S(createCompiler,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@3349
     */
    public native Compiler createCompiler(Array<Object> options /* optional */);
}
