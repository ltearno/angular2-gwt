package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AesCfbParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:741558
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AesCfbParams")
public class AesCfbParams extends Algorithm
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView iv;

    @JsProperty( name = "iv")
    public native UnionOfArrayBufferAndArrayBufferView getIv();

    @JsProperty( name = "iv")
    public native void setIv( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setIv( ArrayBuffer value ) { setIv(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setIv( ArrayBufferView value ) { setIv(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }
}
