package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AesGcmParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:741431
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AesGcmParams")
public class AesGcmParams extends Algorithm
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView additionalData;

    @JsProperty( name = "additionalData")
    public native UnionOfArrayBufferAndArrayBufferView getAdditionalData();

    @JsProperty( name = "additionalData")
    public native void setAdditionalData( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setAdditionalData( ArrayBuffer value ) { setAdditionalData(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setAdditionalData( ArrayBufferView value ) { setAdditionalData(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }

    public UnionOfArrayBufferAndArrayBufferView iv;

    @JsProperty( name = "iv")
    public native UnionOfArrayBufferAndArrayBufferView getIv();

    @JsProperty( name = "iv")
    public native void setIv( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setIv( ArrayBuffer value ) { setIv(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setIv( ArrayBufferView value ) { setIv(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }

    public Number tagLength;

    @JsProperty( name = "tagLength")
    public native Number getTagLength();

    @JsProperty( name = "tagLength")
    public native void setTagLength( Number value );
}
