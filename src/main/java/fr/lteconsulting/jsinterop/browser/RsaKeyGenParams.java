package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RsaKeyGenParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740037
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RsaKeyGenParams")
public class RsaKeyGenParams extends Algorithm
{

    /*
        Properties
    */

    public Number modulusLength;

    @JsProperty( name = "modulusLength")
    public native Number getModulusLength();

    @JsProperty( name = "modulusLength")
    public native void setModulusLength( Number value );

    public Uint8Array publicExponent;

    @JsProperty( name = "publicExponent")
    public native Uint8Array getPublicExponent();

    @JsProperty( name = "publicExponent")
    public native void setPublicExponent( Uint8Array value );
}
