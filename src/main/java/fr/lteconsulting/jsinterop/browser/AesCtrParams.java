package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AesCtrParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740989
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AesCtrParams")
public class AesCtrParams extends Algorithm
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView counter;

    @JsProperty( name = "counter")
    public native UnionOfArrayBufferAndArrayBufferView getCounter();

    @JsProperty( name = "counter")
    public native void setCounter( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setCounter( ArrayBuffer value ) { setCounter(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setCounter( ArrayBufferView value ) { setCounter(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );
}
