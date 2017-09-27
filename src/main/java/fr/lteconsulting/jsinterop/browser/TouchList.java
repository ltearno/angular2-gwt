package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: TouchList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:658883
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:659017
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TouchList")
public class TouchList
{

    /*
        Constructors
    */
    public TouchList(){
    }

    @JsOverlay
    public final void setByIndex(int index, Touch value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Touch getByIndex(int index) {
        return (Touch) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(item,133,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@658940
     */
    public native Touch item(Number index);
}
