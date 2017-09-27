package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Uint8ArrayConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:95529
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:222934
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Uint8ArrayConstructor")
public class Uint8ArrayConstructor
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

    public Uint8Array prototype;

    @JsProperty( name = "prototype")
    public native Uint8Array getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Uint8Array value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(from,29,,P(d5<2>))
      * TE Signature : S(from,P(d5))
      * 
     */
    public native Uint8Array from(ArrayLike<Number> arrayLike);
    /** 
      * Std Signature : S(from,29,,P(d5<2>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<2,6,6>))
      * TE Signature : S(from,P(d5),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@96379
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
     */
    public native Uint8Array from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    /** 
      * Std Signature : S(from,29,,P(d6<2>))
      * TE Signature : S(from,P(d6))
      * 
     */
    public native Uint8Array from(Iterable<Number> arrayLike);
    /** 
      * Std Signature : S(from,29,,P(d6<2>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<2,6,6>))
      * TE Signature : S(from,P(d6),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@223332
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * VERSION 1
     */
    public native Uint8Array from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    /** 
      * Std Signature : S(of,29,,)
      * TE Signature : S(of,)
      * 
     */
    public native Uint8Array of();
    /** 
      * Std Signature : S(of,29,,P(D2))
      * TE Signature : S(of,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@96031
      * Returns a new array from a set of elements.
     */
    public native Uint8Array of(Number... items);
}
