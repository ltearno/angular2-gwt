package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WeakMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215744
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216094
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219869
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247680
  * base type: WeakMap
  * flags: 16384
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215744
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216094
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219869
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247680
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WeakMap")
public class WeakMap<K extends Object, V>
{

    /*
        Constructors
    */
    public WeakMap(){
    }

    /*
        Properties
    */

    // skipped property __@toStringTag
    /*
        Methods
    */
    /** 
      * Std Signature : S(delete,27,,P(dK-))
      * TE Signature : S(delete,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215791
     */
    public native Boolean delete(K key);
    /** 
      * Std Signature : S(get,V-,,P(dK-))
      * TE Signature : S(get,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215820
     */
    public native V get(K key);
    /** 
      * Std Signature : S(has,27,,P(dK-))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215852
     */
    public native Boolean has(K key);
    /** 
      * Std Signature : S(set,366,,P(dK-),P(dV-))
      * TE Signature : S(set,P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215878
     */
    public native WeakMap<K, V> set(K key, V value);
}
