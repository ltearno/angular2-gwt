package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpCapabilities
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:276890
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpCapabilities")
public class RTCRtpCapabilities
{

    /*
        Properties
    */

    public Array<RTCRtpCodecCapability> codecs;

    @JsProperty( name = "codecs")
    public native Array<RTCRtpCodecCapability> getCodecs();

    @JsProperty( name = "codecs")
    public native void setCodecs( Array<RTCRtpCodecCapability> value );

    public Array<String> fecMechanisms;

    @JsProperty( name = "fecMechanisms")
    public native Array<String> getFecMechanisms();

    @JsProperty( name = "fecMechanisms")
    public native void setFecMechanisms( Array<String> value );

    public Array<RTCRtpHeaderExtension> headerExtensions;

    @JsProperty( name = "headerExtensions")
    public native Array<RTCRtpHeaderExtension> getHeaderExtensions();

    @JsProperty( name = "headerExtensions")
    public native void setHeaderExtensions( Array<RTCRtpHeaderExtension> value );
}
