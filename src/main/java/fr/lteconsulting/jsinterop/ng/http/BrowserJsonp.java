package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp".BrowserJsonp
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts:49
  * 
 */
@JsType(isNative=true, namespace="ng.http", name="BrowserJsonp")
public class BrowserJsonp
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(build,3,,P(d1))
      * TE Signature : S(build,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts@90
     */
    public native Object build(String url);
    /** 
      * Std Signature : S(cleanup,429,,P(d3))
      * TE Signature : S(cleanup,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts@313
     */
    public native void cleanup(Object node);
    /** 
      * Std Signature : S(exposeConnection,429,,P(d1),P(d3))
      * TE Signature : S(exposeConnection,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts@189
     */
    public native void exposeConnection(String id, Object connection);
    /** 
      * Std Signature : S(nextRequestID,1,,)
      * TE Signature : S(nextRequestID,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts@119
     */
    public native String nextRequestID();
    /** 
      * Std Signature : S(removeConnection,429,,P(d1))
      * TE Signature : S(removeConnection,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts@246
     */
    public native void removeConnection(String id);
    /** 
      * Std Signature : S(requestCallback,1,,P(d1))
      * TE Signature : S(requestCallback,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts@148
     */
    public native String requestCallback(String id);
    /** 
      * Std Signature : S(send,429,,P(d3))
      * TE Signature : S(send,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/browser_jsonp.d.ts@286
     */
    public native void send(Object node);
}
