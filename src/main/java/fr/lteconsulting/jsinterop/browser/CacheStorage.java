package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: CacheStorage
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:310885
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:311159
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CacheStorage")
public class CacheStorage
{

    /*
        Constructors
    */
    public CacheStorage(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(delete,88<27>,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310916
     */
    public native Promise<Boolean> delete(String cacheName);
    /** 
      * Std Signature : S(has,88<27>,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310965
     */
    public native Promise<Boolean> has(String cacheName);
    /** 
      * Std Signature : S(keys,3,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@311011
     */
    public native Object keys();
    /** 
      * Std Signature : S(match,88<3>,,P(d1))
      * TE Signature : S(match,P(d1))
      * 
     */
    public native Promise<Object> match(String request);
    /** 
      * Std Signature : S(match,88<3>,,P(d1),P(d147))
      * TE Signature : S(match,P(d1),P(d147))
      * 
     */
    public native Promise<Object> match(String request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(match,88<3>,,P(d146))
      * TE Signature : S(match,P(d146))
      * 
     */
    public native Promise<Object> match(Request request);
    /** 
      * Std Signature : S(match,88<3>,,P(d146),P(d147))
      * TE Signature : S(match,P(d146),P(d147))
      * 
     */
    public native Promise<Object> match(Request request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(match,88<3>,,P(dU(-146,1)))
      * TE Signature : S(match,P(dU(-146,1)))
      * 
     */
    public native Promise<Object> match(RequestInfo_UnionOfRequestAndString request);
    /** 
      * Std Signature : S(match,88<3>,,P(dU(-146,1)),P(d147))
      * TE Signature : S(match,P(dU(-146,1)),P(d147))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@311028
     */
    public native Promise<Object> match(RequestInfo_UnionOfRequestAndString request, CacheQueryOptions options /* optional */);
    /** 
      * Std Signature : S(open,88<471>,,P(d1))
      * TE Signature : S(open,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@311104
     */
    public native Promise<Cache> open(String cacheName);
}
