package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: Cache
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:310336
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:310834
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Cache")
public class Cache
{

    /*
        Constructors
    */
    public Cache(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(add,88<369>,,P(d1))
      * TE Signature : S(add,P(d1))
      * 
     */
    public native Promise<Void> add(String request);
    /** 
      * Std Signature : S(add,88<369>,,P(d146))
      * TE Signature : S(add,P(d146))
      * 
     */
    public native Promise<Void> add(Request request);
    /** 
      * Std Signature : S(add,88<369>,,P(dU(-146,1)))
      * TE Signature : S(add,P(dU(-146,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310360
     */
    public native Promise<Void> add(RequestInfo_UnionOfRequestAndString request);
    /** 
      * Std Signature : S(addAll,88<369>,,P(d7<U(-146,1)>))
      * TE Signature : S(addAll,P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310406
     */
    public native Promise<Void> addAll(Array<RequestInfo_UnionOfRequestAndString> requests);
    /** 
      * Std Signature : S(delete,88<27>,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    public native Promise<Boolean> delete(String request);
    /** 
      * Std Signature : S(delete,88<27>,,P(d1),P(d147))
      * TE Signature : S(delete,P(d1),P(d147))
      * 
     */
    public native Promise<Boolean> delete(String request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(delete,88<27>,,P(d146))
      * TE Signature : S(delete,P(d146))
      * 
     */
    public native Promise<Boolean> delete(Request request);
    /** 
      * Std Signature : S(delete,88<27>,,P(d146),P(d147))
      * TE Signature : S(delete,P(d146),P(d147))
      * 
     */
    public native Promise<Boolean> delete(Request request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(delete,88<27>,,P(dU(-146,1)))
      * TE Signature : S(delete,P(dU(-146,1)))
      * 
     */
    public native Promise<Boolean> delete(RequestInfo_UnionOfRequestAndString request);
    /** 
      * Std Signature : S(delete,88<27>,,P(dU(-146,1)),P(d147))
      * TE Signature : S(delete,P(dU(-146,1)),P(d147))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310458
     */
    public native Promise<Boolean> delete(RequestInfo_UnionOfRequestAndString request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(keys,3,,)
      * TE Signature : S(keys,)
      * 
     */
    public native Object keys();
    /** 
      * Std Signature : S(keys,3,,P(d1))
      * TE Signature : S(keys,P(d1))
      * 
     */
    public native Object keys(String request /* optional */);
    /** 
      * Std Signature : S(keys,3,,P(d1),P(d147))
      * TE Signature : S(keys,P(d1),P(d147))
      * 
     */
    public native Object keys(String request /* optional */, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(keys,3,,P(d146))
      * TE Signature : S(keys,P(d146))
      * 
     */
    public native Object keys(Request request /* optional */);
    /** 
      * Std Signature : S(keys,3,,P(d146),P(d147))
      * TE Signature : S(keys,P(d146),P(d147))
      * 
     */
    public native Object keys(Request request /* optional */, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(keys,3,,P(dU(-146,1)))
      * TE Signature : S(keys,P(dU(-146,1)))
      * 
     */
    public native Object keys(RequestInfo_UnionOfRequestAndString request /* optional */);
    /** 
      * Std Signature : S(keys,3,,P(dU(-146,1)),P(d147))
      * TE Signature : S(keys,P(dU(-146,1)),P(d147))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310539
     */
    public native Object keys(RequestInfo_UnionOfRequestAndString request /* optional */, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(match,88<148>,,P(d1))
      * TE Signature : S(match,P(d1))
      * 
     */
    public native Promise<Response> match(String request);
    /** 
      * Std Signature : S(match,88<148>,,P(d1),P(d147))
      * TE Signature : S(match,P(d1),P(d147))
      * 
     */
    public native Promise<Response> match(String request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(match,88<148>,,P(d146))
      * TE Signature : S(match,P(d146))
      * 
     */
    public native Promise<Response> match(Request request);
    /** 
      * Std Signature : S(match,88<148>,,P(d146),P(d147))
      * TE Signature : S(match,P(d146),P(d147))
      * 
     */
    public native Promise<Response> match(Request request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(match,88<148>,,P(dU(-146,1)))
      * TE Signature : S(match,P(dU(-146,1)))
      * 
     */
    public native Promise<Response> match(RequestInfo_UnionOfRequestAndString request);
    /** 
      * Std Signature : S(match,88<148>,,P(dU(-146,1)),P(d147))
      * TE Signature : S(match,P(dU(-146,1)),P(d147))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310606
     */
    public native Promise<Response> match(RequestInfo_UnionOfRequestAndString request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(matchAll,3,,)
      * TE Signature : S(matchAll,)
      * 
     */
    public native Object matchAll();
    /** 
      * Std Signature : S(matchAll,3,,P(d1))
      * TE Signature : S(matchAll,P(d1))
      * 
     */
    public native Object matchAll(String request /* optional */);
    /** 
      * Std Signature : S(matchAll,3,,P(d1),P(d147))
      * TE Signature : S(matchAll,P(d1),P(d147))
      * 
     */
    public native Object matchAll(String request /* optional */, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(matchAll,3,,P(d146))
      * TE Signature : S(matchAll,P(d146))
      * 
     */
    public native Object matchAll(Request request /* optional */);
    /** 
      * Std Signature : S(matchAll,3,,P(d146),P(d147))
      * TE Signature : S(matchAll,P(d146),P(d147))
      * 
     */
    public native Object matchAll(Request request /* optional */, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(matchAll,3,,P(dU(-146,1)))
      * TE Signature : S(matchAll,P(dU(-146,1)))
      * 
     */
    public native Object matchAll(RequestInfo_UnionOfRequestAndString request /* optional */);
    /** 
      * Std Signature : S(matchAll,3,,P(dU(-146,1)),P(d147))
      * TE Signature : S(matchAll,P(dU(-146,1)),P(d147))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310687
     */
    public native Object matchAll(RequestInfo_UnionOfRequestAndString request /* optional */, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(put,88<369>,,P(d1),P(d148))
      * TE Signature : S(put,P(d1),P(d148))
      * 
     */
    public native Promise<Void> put(String request, Response response);
    /** 
      * Std Signature : S(put,88<369>,,P(d146),P(d148))
      * TE Signature : S(put,P(d146),P(d148))
      * 
     */
    public native Promise<Void> put(Request request, Response response);
    /** 
      * Std Signature : S(put,88<369>,,P(dU(-146,1)),P(d148))
      * TE Signature : S(put,P(dU(-146,1)),P(d148))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310758
     */
    public native Promise<Void> put(RequestInfo_UnionOfRequestAndString request, Response response);
}
