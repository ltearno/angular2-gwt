package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: GlobalFetch
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:730916
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface GlobalFetch
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(fetch,88<148>,,P(d1))
      * TE Signature : S(fetch,P(d1))
      * 
     */
    Promise<Response> fetch(String input);
    /** 
      * Std Signature : S(fetch,88<148>,,P(d1),P(d145))
      * TE Signature : S(fetch,P(d1),P(d145))
      * 
     */
    Promise<Response> fetch(String input, RequestInit init /* optional */);
    /** 
      * Std Signature : S(fetch,88<148>,,P(d146))
      * TE Signature : S(fetch,P(d146))
      * 
     */
    Promise<Response> fetch(Request input);
    /** 
      * Std Signature : S(fetch,88<148>,,P(d146),P(d145))
      * TE Signature : S(fetch,P(d146),P(d145))
      * 
     */
    Promise<Response> fetch(Request input, RequestInit init /* optional */);
    /** 
      * Std Signature : S(fetch,88<148>,,P(dU(-146,1)))
      * TE Signature : S(fetch,P(dU(-146,1)))
      * 
     */
    Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input);
    /** 
      * Std Signature : S(fetch,88<148>,,P(dU(-146,1)),P(d145))
      * TE Signature : S(fetch,P(dU(-146,1)),P(d145))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@730946
     */
    Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input, RequestInit init /* optional */);
}
