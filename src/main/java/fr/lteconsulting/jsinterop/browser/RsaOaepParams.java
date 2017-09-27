package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RsaOaepParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740560
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RsaOaepParams")
public class RsaOaepParams extends Algorithm
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView label;

    @JsProperty( name = "label")
    public native UnionOfArrayBufferAndArrayBufferView getLabel();

    @JsProperty( name = "label")
    public native void setLabel( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setLabel( ArrayBuffer value ) { setLabel(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setLabel( ArrayBufferView value ) { setLabel(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }
}
