package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/error_handler".ErrorHandler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/error_handler.d.ts:0
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="ErrorHandler")
public class ErrorHandler
{

    /*
        Constructors
    */
    public ErrorHandler(Boolean deprecatedParameter){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(handleError,429,,P(d3))
      * TE Signature : S(handleError,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/error_handler.d.ts@838
     */
    public native void handleError(Object error);
}
