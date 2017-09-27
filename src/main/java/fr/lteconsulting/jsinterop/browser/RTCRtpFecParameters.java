package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpFecParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278188
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpFecParameters")
public class RTCRtpFecParameters
{

    /*
        Properties
    */

    public String mechanism;

    @JsProperty( name = "mechanism")
    public native String getMechanism();

    @JsProperty( name = "mechanism")
    public native void setMechanism( String value );

    public Number ssrc;

    @JsProperty( name = "ssrc")
    public native Number getSsrc();

    @JsProperty( name = "ssrc")
    public native void setSsrc( Number value );
}
