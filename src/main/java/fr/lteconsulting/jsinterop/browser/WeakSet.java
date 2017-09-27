package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WeakSet
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216702
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216961
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:220272
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247833
  * base type: WeakSet
  * flags: 16384
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216702
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216961
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:220272
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247833
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WeakSet")
public class WeakSet<T>
{

    /*
        Constructors
    */
    public WeakSet(){
    }

    /*
        Properties
    */

    // skipped property __@toStringTag
    /*
        Methods
    */
    /** 
      * Std Signature : S(add,367,,P(dT-))
      * TE Signature : S(add,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216731
     */
    public native WeakSet<T> add(T value);
    /** 
      * Std Signature : S(delete,27,,P(dT-))
      * TE Signature : S(delete,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216756
     */
    public native Boolean delete(T value);
    /** 
      * Std Signature : S(has,27,,P(dT-))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216787
     */
    public native Boolean has(T value);
}
