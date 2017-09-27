package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278503
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpParameters")
public class RTCRtpParameters
{

    /*
        Properties
    */

    public Array<RTCRtpCodecParameters> codecs;

    @JsProperty( name = "codecs")
    public native Array<RTCRtpCodecParameters> getCodecs();

    @JsProperty( name = "codecs")
    public native void setCodecs( Array<RTCRtpCodecParameters> value );

    public String degradationPreference;

    @JsProperty( name = "degradationPreference")
    public native String getDegradationPreference();

    @JsProperty( name = "degradationPreference")
    public native void setDegradationPreference( String value );

    public Array<RTCRtpEncodingParameters> encodings;

    @JsProperty( name = "encodings")
    public native Array<RTCRtpEncodingParameters> getEncodings();

    @JsProperty( name = "encodings")
    public native void setEncodings( Array<RTCRtpEncodingParameters> value );

    public Array<RTCRtpHeaderExtensionParameters> headerExtensions;

    @JsProperty( name = "headerExtensions")
    public native Array<RTCRtpHeaderExtensionParameters> getHeaderExtensions();

    @JsProperty( name = "headerExtensions")
    public native void setHeaderExtensions( Array<RTCRtpHeaderExtensionParameters> value );

    public String muxId;

    @JsProperty( name = "muxId")
    public native String getMuxId();

    @JsProperty( name = "muxId")
    public native void setMuxId( String value );

    public RTCRtcpParameters rtcp;

    @JsProperty( name = "rtcp")
    public native RTCRtcpParameters getRtcp();

    @JsProperty( name = "rtcp")
    public native void setRtcp( RTCRtcpParameters value );
}
