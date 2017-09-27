package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/console".Console
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/console.d.ts:0
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="Console")
public class Console
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(log,429,,P(d1))
      * TE Signature : S(log,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/console.d.ts@35
     */
    public native void log(String message);
    /** 
      * Std Signature : S(warn,429,,P(d1))
      * TE Signature : S(warn,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/console.d.ts@67
     */
    public native void warn(String message);
}
