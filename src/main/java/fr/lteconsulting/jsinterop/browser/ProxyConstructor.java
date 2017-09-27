package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: ProxyConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:242075
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ProxyConstructor")
public class ProxyConstructor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(revocable,3,T-,P(dT-),P(d41<T->))
      * TE Signature : S(revocable,P(d3),P(d41))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@242110
     */
    public native <T> Object revocable(T target, ProxyHandler<T> handler);
}
