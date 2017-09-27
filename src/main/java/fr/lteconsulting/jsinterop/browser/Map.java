package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.prebuilt.Action3;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Map
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215072
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215509
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219600
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247613
  * base type: Map
  * flags: 16384
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215072
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215509
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219600
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247613
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Map")
public class Map<K, V>
{

    /*
        Constructors
    */
    public Map(){
    }

    /*
        Properties
    */

    // skipped property __@toStringTag
    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );

    /*
        Methods
    */
    // skipped method __@iterator
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215101
     */
    public native void clear();
    /** 
      * Std Signature : S(delete,27,,P(dK-))
      * TE Signature : S(delete,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215120
     */
    public native Boolean delete(K key);
    /** 
      * Std Signature : S(entries,363<24<K-,V->>,,)
      * TE Signature : S(entries,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@219678
     */
    public native IterableIterator<Tuple<K, V>> entries();
    /** 
      * Std Signature : S(forEach,289,,P(dFP1-,P2-,P3--S(?,289,,P(d3),P(d4),P(d5))------)<V-,K-,37>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215149
     */
    public native void forEach(Action3<V, K, Map<K, V>> callbackfn);
    /** 
      * Std Signature : S(get,V-,,P(dK-))
      * TE Signature : S(get,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215239
     */
    public native V get(K key);
    /** 
      * Std Signature : S(has,27,,P(dK-))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215271
     */
    public native Boolean has(K key);
    /** 
      * Std Signature : S(keys,363<K->,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@219719
     */
    public native IterableIterator<K> keys();
    /** 
      * Std Signature : S(set,37,,P(dK-),P(dV-))
      * TE Signature : S(set,P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215297
     */
    public native Map<K, V> set(K key, V value);
    /** 
      * Std Signature : S(values,363<V->,,)
      * TE Signature : S(values,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@219752
     */
    public native IterableIterator<V> values();
}
