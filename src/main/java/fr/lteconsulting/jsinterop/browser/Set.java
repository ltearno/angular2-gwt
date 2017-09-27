package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.prebuilt.Action3;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Set
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216123
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216498
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:220021
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247769
  * base type: Set
  * flags: 16384
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216123
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216498
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:220021
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247769
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Set")
public class Set<T>
{

    /*
        Constructors
    */
    public Set(){
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
      * Std Signature : S(add,39,,P(dT-))
      * TE Signature : S(add,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216148
     */
    public native Set<T> add(T value);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216173
     */
    public native void clear();
    /** 
      * Std Signature : S(delete,27,,P(dT-))
      * TE Signature : S(delete,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216192
     */
    public native Boolean delete(T value);
    /** 
      * Std Signature : S(entries,363<24<T-,5>>,,)
      * TE Signature : S(entries,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@220092
     */
    public native IterableIterator<Tuple<T, T>> entries();
    /** 
      * Std Signature : S(forEach,289,,P(dFP1-,P2-,P3--S(?,289,,P(d3),P(d4),P(d5))------)<T-,7,39>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216223
     */
    public native void forEach(Action3<T, T, Set<T>> callbackfn);
    /** 
      * Std Signature : S(has,27,,P(dT-))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216313
     */
    public native Boolean has(T value);
    /** 
      * Std Signature : S(keys,363<T->,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@220133
     */
    public native IterableIterator<T> keys();
    /** 
      * Std Signature : S(values,363<T->,,)
      * TE Signature : S(values,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@220166
     */
    public native IterableIterator<T> values();
}
