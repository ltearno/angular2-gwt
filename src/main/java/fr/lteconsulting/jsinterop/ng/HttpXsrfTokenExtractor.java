package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xsrf".HttpXsrfTokenExtractor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xsrf.d.ts:390

  * Retrieves the current XSRF token to use with the next outgoing request.
 */
@JsType(isNative=true, namespace="ng", name="HttpXsrfTokenExtractor")
public class HttpXsrfTokenExtractor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(getToken,1,,)
      * TE Signature : S(getToken,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xsrf.d.ts@718
      * Get the XSRF token to use with an outgoing request.
      * 
      * Will be called for every request, so the token may change between requests.
     */
    public native String getToken();
}
