package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpUnhandled
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278815
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpUnhandled")
public class RTCRtpUnhandled
{

    /*
        Properties
    */

    public String muxId;

    @JsProperty( name = "muxId")
    public native String getMuxId();

    @JsProperty( name = "muxId")
    public native void setMuxId( String value );

    public Number payloadType;

    @JsProperty( name = "payloadType")
    public native Number getPayloadType();

    @JsProperty( name = "payloadType")
    public native void setPayloadType( Number value );

    public Number ssrc;

    @JsProperty( name = "ssrc")
    public native Number getSsrc();

    @JsProperty( name = "ssrc")
    public native void setSsrc( Number value );
}
