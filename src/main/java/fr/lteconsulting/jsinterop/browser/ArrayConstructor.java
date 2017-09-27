package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ArrayConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:60235
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:197668
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:218476
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ArrayConstructor")
public class ArrayConstructor
{
    /** SKIPPED CALL SIGNATURE ! */
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Array<Object> prototype;

    @JsProperty( name = "prototype")
    public native Array<Object> getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Array<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(from,7<T->,T-,P(d5<T->))
      * TE Signature : S(from,P(d5))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@198224
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * VERSION 1
     */
    public native <T> Array<T> from(ArrayLike<T> arrayLike);
    /** 
      * Std Signature : S(from,7<U->,T-,U-,P(d5<T->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U->))
      * TE Signature : S(from,P(d5),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@197986
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
     */
    public native <T, U> Array<U> from(ArrayLike<T> arrayLike, Function2<T, Number, U> mapfn);
    /** 
      * Std Signature : S(from,7<T->,T-,P(d6<T->))
      * TE Signature : S(from,P(d6))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@219023
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * VERSION 3
     */
    public native <T> Array<T> from(Iterable<T> iterable);
    /** 
      * Std Signature : S(from,7<U->,T-,U-,P(d6<T->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U->))
      * TE Signature : S(from,P(d6),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@218789
      * Creates an array from an array-like object.
      * Creates an array from an array-like object.
      * Creates an array from an iterable object.
      * Creates an array from an iterable object.
      * VERSION 2
     */
    public native <T, U> Array<U> from(Iterable<T> iterable, Function2<T, Number, U> mapfn);
    /** 
      * Std Signature : S(isArray,27,,P(d3))
      * TE Signature : S(isArray,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@60480
     */
    public native Boolean isArray(Object arg);
    /** 
      * Std Signature : S(of,7<T->,T-,)
      * TE Signature : S(of,)
      * 
     */
    public native <T> Array<T> of();
    /** 
      * Std Signature : S(of,7<T->,T-,P(DT-))
      * TE Signature : S(of,P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@198417
      * Returns a new array from a set of elements.
     */
    public native <T> Array<T> of(T... items);
}
