package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces".XSRFStrategy
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces.d.ts:939

  * An XSRFStrategy configures XSRF protection (e.g. via headers) on an HTTP request.
 */
@JsType(isNative=true, namespace="ng.http", name="XSRFStrategy")
public class XSRFStrategy
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(configureRequest,429,,P(d651))
      * TE Signature : S(configureRequest,P(d651))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces.d.ts@1102
     */
    public native void configureRequest(Request req);
}
