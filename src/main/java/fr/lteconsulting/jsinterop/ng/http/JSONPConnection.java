package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend".JSONPConnection
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend.d.ts:347

  * Abstract base class for an in-flight JSONP request.
 */
@JsType(isNative=true, namespace="ng.http", name="JSONPConnection")
public class JSONPConnection extends Connection
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(finished,429,,)
      * TE Signature : S(finished,)
      * 
     */
    public native void finished();
    /** 
      * Std Signature : S(finished,429,,P(d3))
      * TE Signature : S(finished,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend.d.ts@928
      * Callback called when the JSONP request completes, to notify the application
      * of the new data.
     */
    public native void finished(Object data /* optional */);
}
