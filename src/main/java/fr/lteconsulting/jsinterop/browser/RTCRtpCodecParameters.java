package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpCodecParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:277422
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpCodecParameters")
public class RTCRtpCodecParameters
{

    /*
        Properties
    */

    public Number clockRate;

    @JsProperty( name = "clockRate")
    public native Number getClockRate();

    @JsProperty( name = "clockRate")
    public native void setClockRate( Number value );

    public Number maxptime;

    @JsProperty( name = "maxptime")
    public native Number getMaxptime();

    @JsProperty( name = "maxptime")
    public native void setMaxptime( Number value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Number numChannels;

    @JsProperty( name = "numChannels")
    public native Number getNumChannels();

    @JsProperty( name = "numChannels")
    public native void setNumChannels( Number value );

    public Object parameters;

    @JsProperty( name = "parameters")
    public native Object getParameters();

    @JsProperty( name = "parameters")
    public native void setParameters( Object value );

    public Object payloadType;

    @JsProperty( name = "payloadType")
    public native Object getPayloadType();

    @JsProperty( name = "payloadType")
    public native void setPayloadType( Object value );

    public Number ptime;

    @JsProperty( name = "ptime")
    public native Number getPtime();

    @JsProperty( name = "ptime")
    public native void setPtime( Number value );

    public Array<RTCRtcpFeedback> rtcpFeedback;

    @JsProperty( name = "rtcpFeedback")
    public native Array<RTCRtcpFeedback> getRtcpFeedback();

    @JsProperty( name = "rtcpFeedback")
    public native void setRtcpFeedback( Array<RTCRtcpFeedback> value );
}
