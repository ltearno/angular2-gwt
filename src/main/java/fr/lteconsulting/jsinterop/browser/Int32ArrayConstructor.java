package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Int32ArrayConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:147972
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:227420
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Int32ArrayConstructor")
public class Int32ArrayConstructor
{

    /*
        Properties
    */

    /** 
      * The size in bytes of each element in the array.
     */
    public Number BYTES_PER_ELEMENT;

    @JsProperty( name = "BYTES_PER_ELEMENT")
    public native Number getBYTES_PER_ELEMENT();

    @JsProperty( name = "BYTES_PER_ELEMENT")
    public native void setBYTES_PER_ELEMENT( Number value );

    public Int32Array prototype;

    @JsProperty( name = "prototype")
    public native Int32Array getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Int32Array value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(from,33,,P(d5<2>))
      * TE Signature : S(from,P(d5))
      * 
     */
    public native Int32Array from(ArrayLike<Number> arrayLike);
    /** 
      * Std Signature : S(from,33,,P(d5<2>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<2,6,6>))
      * TE Signature : S(from,P(d5),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@148822
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
     */
    public native Int32Array from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    /** 
      * Std Signature : S(from,33,,P(d6<2>))
      * TE Signature : S(from,P(d6))
      * 
     */
    public native Int32Array from(Iterable<Number> arrayLike);
    /** 
      * Std Signature : S(from,33,,P(d6<2>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<2,6,6>))
      * TE Signature : S(from,P(d6),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@227818
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * VERSION 1
     */
    public native Int32Array from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    /** 
      * Std Signature : S(of,33,,)
      * TE Signature : S(of,)
      * 
     */
    public native Int32Array of();
    /** 
      * Std Signature : S(of,33,,P(D2))
      * TE Signature : S(of,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@148474
      * Returns a new array from a set of elements.
     */
    public native Int32Array of(Number... items);
}
