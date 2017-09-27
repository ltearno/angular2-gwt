package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpRtxParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278761
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpRtxParameters")
public class RTCRtpRtxParameters
{

    /*
        Properties
    */

    public Number ssrc;

    @JsProperty( name = "ssrc")
    public native Number getSsrc();

    @JsProperty( name = "ssrc")
    public native void setSsrc( Number value );
}
