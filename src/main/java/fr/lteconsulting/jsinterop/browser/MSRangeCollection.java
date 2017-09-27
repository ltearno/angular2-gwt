package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: MSRangeCollection
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513269
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513404
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSRangeCollection")
public class MSRangeCollection
{

    /*
        Constructors
    */
    public MSRangeCollection(){
    }

    @JsOverlay
    public final void setByIndex(int index, Range value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Range getByIndex(int index) {
        return (Range) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(item,106,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@513334
     */
    public native Range item(Number index);
}
