package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: ProxyHandler
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:241245
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ProxyHandler")
public class ProxyHandler<T>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(apply,3,,P(dT-))
      * TE Signature : S(apply,P(d3))
      * 
     */
    public native Object apply(T target);
    /** 
      * Std Signature : S(apply,3,,P(dT-),P(d3))
      * TE Signature : S(apply,P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241952
     */
    public native Object apply(T target, Object argArray /* optional */);
    /** 
      * Std Signature : S(construct,3,,P(dT-),P(d3))
      * TE Signature : S(construct,P(d3),P(d3))
      * 
     */
    public native Object construct(T target, Object argArray);
    /** 
      * Std Signature : S(construct,3,,P(dT-),P(d3),P(d3))
      * TE Signature : S(construct,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@242011
     */
    public native Object construct(T target, Object argArray, Object newTarget /* optional */);
    /** 
      * Std Signature : S(defineProperty,27,,P(dT-),P(d1),P(d9))
      * TE Signature : S(defineProperty,P(d3),P(d1),P(d9))
      * 
     */
    public native Boolean defineProperty(T target, String p, PropertyDescriptor attributes);
    /** 
      * Std Signature : S(defineProperty,27,,P(dT-),P(d2),P(d9))
      * TE Signature : S(defineProperty,P(d3),P(d2),P(d9))
      * 
     */
    public native Boolean defineProperty(T target, Number p, PropertyDescriptor attributes);
    /** 
      * Std Signature : S(defineProperty,27,,P(dT-),P(dU(-2,1)),P(d9))
      * TE Signature : S(defineProperty,P(d3),P(dU(-2,1)),P(d9))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241778
     */
    public native Boolean defineProperty(T target, PropertyKey_UnionOfNumberAndString p, PropertyDescriptor attributes);
    /** 
      * Std Signature : S(deleteProperty,27,,P(dT-),P(d1))
      * TE Signature : S(deleteProperty,P(d3),P(d1))
      * 
     */
    public native Boolean deleteProperty(T target, String p);
    /** 
      * Std Signature : S(deleteProperty,27,,P(dT-),P(d2))
      * TE Signature : S(deleteProperty,P(d3),P(d2))
      * 
     */
    public native Boolean deleteProperty(T target, Number p);
    /** 
      * Std Signature : S(deleteProperty,27,,P(dT-),P(dU(-2,1)))
      * TE Signature : S(deleteProperty,P(d3),P(dU(-2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241720
     */
    public native Boolean deleteProperty(T target, PropertyKey_UnionOfNumberAndString p);
    /** 
      * Std Signature : S(enumerate,7<U(-2,1)>,,P(dT-))
      * TE Signature : S(enumerate,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241868
     */
    public native Array<PropertyKey_UnionOfNumberAndString> enumerate(T target);
    /** 
      * Std Signature : S(get,3,,P(dT-),P(d1),P(d3))
      * TE Signature : S(get,P(d3),P(d1),P(d3))
      * 
     */
    public native Object get(T target, String p, Object receiver);
    /** 
      * Std Signature : S(get,3,,P(dT-),P(d2),P(d3))
      * TE Signature : S(get,P(d3),P(d2),P(d3))
      * 
     */
    public native Object get(T target, Number p, Object receiver);
    /** 
      * Std Signature : S(get,3,,P(dT-),P(dU(-2,1)),P(d3))
      * TE Signature : S(get,P(d3),P(dU(-2,1)),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241588
     */
    public native Object get(T target, PropertyKey_UnionOfNumberAndString p, Object receiver);
    /** 
      * Std Signature : S(getOwnPropertyDescriptor,9,,P(dT-),P(d1))
      * TE Signature : S(getOwnPropertyDescriptor,P(d3),P(d1))
      * 
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(T target, String p);
    /** 
      * Std Signature : S(getOwnPropertyDescriptor,9,,P(dT-),P(d2))
      * TE Signature : S(getOwnPropertyDescriptor,P(d3),P(d2))
      * 
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(T target, Number p);
    /** 
      * Std Signature : S(getOwnPropertyDescriptor,9,,P(dT-),P(dU(-2,1)))
      * TE Signature : S(getOwnPropertyDescriptor,P(d3),P(dU(-2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241462
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(T target, PropertyKey_UnionOfNumberAndString p);
    /** 
      * Std Signature : S(getPrototypeOf,3,,P(dT-))
      * TE Signature : S(getPrototypeOf,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241279
     */
    public native Object getPrototypeOf(T target);
    /** 
      * Std Signature : S(has,27,,P(dT-),P(d1))
      * TE Signature : S(has,P(d3),P(d1))
      * 
     */
    public native Boolean has(T target, String p);
    /** 
      * Std Signature : S(has,27,,P(dT-),P(d2))
      * TE Signature : S(has,P(d3),P(d2))
      * 
     */
    public native Boolean has(T target, Number p);
    /** 
      * Std Signature : S(has,27,,P(dT-),P(dU(-2,1)))
      * TE Signature : S(has,P(d3),P(dU(-2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241541
     */
    public native Boolean has(T target, PropertyKey_UnionOfNumberAndString p);
    /** 
      * Std Signature : S(isExtensible,27,,P(dT-))
      * TE Signature : S(isExtensible,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241377
     */
    public native Boolean isExtensible(T target);
    /** 
      * Std Signature : S(ownKeys,7<U(-2,1)>,,P(dT-))
      * TE Signature : S(ownKeys,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241911
     */
    public native Array<PropertyKey_UnionOfNumberAndString> ownKeys(T target);
    /** 
      * Std Signature : S(preventExtensions,27,,P(dT-))
      * TE Signature : S(preventExtensions,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241417
     */
    public native Boolean preventExtensions(T target);
    /** 
      * Std Signature : S(set,27,,P(dT-),P(d1),P(d3),P(d3))
      * TE Signature : S(set,P(d3),P(d1),P(d3),P(d3))
      * 
     */
    public native Boolean set(T target, String p, Object value, Object receiver);
    /** 
      * Std Signature : S(set,27,,P(dT-),P(d2),P(d3),P(d3))
      * TE Signature : S(set,P(d3),P(d2),P(d3),P(d3))
      * 
     */
    public native Boolean set(T target, Number p, Object value, Object receiver);
    /** 
      * Std Signature : S(set,27,,P(dT-),P(dU(-2,1)),P(d3),P(d3))
      * TE Signature : S(set,P(d3),P(dU(-2,1)),P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241646
     */
    public native Boolean set(T target, PropertyKey_UnionOfNumberAndString p, Object value, Object receiver);
    /** 
      * Std Signature : S(setPrototypeOf,27,,P(dT-),P(d3))
      * TE Signature : S(setPrototypeOf,P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@241327
     */
    public native Boolean setPrototypeOf(T target, Object v);
}
