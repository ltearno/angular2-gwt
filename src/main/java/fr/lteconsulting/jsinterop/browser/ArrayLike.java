package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: ArrayLike
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:62529
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ArrayLike")
public class ArrayLike<T>
{

    @JsOverlay
    public final void setByIndex(int index, T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );
}
