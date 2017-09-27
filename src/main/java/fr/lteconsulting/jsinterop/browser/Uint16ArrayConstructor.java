package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Uint16ArrayConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:134906
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:226308
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Uint16ArrayConstructor")
public class Uint16ArrayConstructor
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

    public Uint16Array prototype;

    @JsProperty( name = "prototype")
    public native Uint16Array getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Uint16Array value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(from,32,,P(d5<2>))
      * TE Signature : S(from,P(d5))
      * 
     */
    public native Uint16Array from(ArrayLike<Number> arrayLike);
    /** 
      * Std Signature : S(from,32,,P(d5<2>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<2,6,6>))
      * TE Signature : S(from,P(d5),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@135762
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
     */
    public native Uint16Array from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    /** 
      * Std Signature : S(from,32,,P(d6<2>))
      * TE Signature : S(from,P(d6))
      * 
     */
    public native Uint16Array from(Iterable<Number> arrayLike);
    /** 
      * Std Signature : S(from,32,,P(d6<2>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<2,6,6>))
      * TE Signature : S(from,P(d6),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@226708
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * VERSION 1
     */
    public native Uint16Array from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    /** 
      * Std Signature : S(of,32,,)
      * TE Signature : S(of,)
      * 
     */
    public native Uint16Array of();
    /** 
      * Std Signature : S(of,32,,P(D2))
      * TE Signature : S(of,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@135413
      * Returns a new array from a set of elements.
     */
    public native Uint16Array of(Number... items);
}
