package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: IArguments
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:10666
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219506
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IArguments")
public class IArguments
{

    @JsOverlay
    public final void setByIndex(int index, Object value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Object getByIndex(int index) {
        return (Object) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Function callee;

    @JsProperty( name = "callee")
    public native Function getCallee();

    @JsProperty( name = "callee")
    public native void setCallee( Function value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    // skipped method __@iterator
}
