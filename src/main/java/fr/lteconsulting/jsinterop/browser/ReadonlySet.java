package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Action3;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ReadonlySet
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216519
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReadonlySet")
public class ReadonlySet<T>
{

    /*
        Properties
    */

    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(forEach,289,,P(dFP1-,P2-,P3--S(?,289,,P(d3),P(d4),P(d5))------)<T-,7,40>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216552
     */
    public native void forEach(Action3<T, T, ReadonlySet<T>> callbackfn);
    /** 
      * Std Signature : S(has,27,,P(dT-))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@216650
     */
    public native Boolean has(T value);
}
