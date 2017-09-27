package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpCodecCapability
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:277040
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpCodecCapability")
public class RTCRtpCodecCapability
{

    /*
        Properties
    */

    public Number clockRate;

    @JsProperty( name = "clockRate")
    public native Number getClockRate();

    @JsProperty( name = "clockRate")
    public native void setClockRate( Number value );

    public String kind;

    @JsProperty( name = "kind")
    public native String getKind();

    @JsProperty( name = "kind")
    public native void setKind( String value );

    public Number maxSpatialLayers;

    @JsProperty( name = "maxSpatialLayers")
    public native Number getMaxSpatialLayers();

    @JsProperty( name = "maxSpatialLayers")
    public native void setMaxSpatialLayers( Number value );

    public Number maxTemporalLayers;

    @JsProperty( name = "maxTemporalLayers")
    public native Number getMaxTemporalLayers();

    @JsProperty( name = "maxTemporalLayers")
    public native void setMaxTemporalLayers( Number value );

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

    public Object options;

    @JsProperty( name = "options")
    public native Object getOptions();

    @JsProperty( name = "options")
    public native void setOptions( Object value );

    public Object parameters;

    @JsProperty( name = "parameters")
    public native Object getParameters();

    @JsProperty( name = "parameters")
    public native void setParameters( Object value );

    public Number preferredPayloadType;

    @JsProperty( name = "preferredPayloadType")
    public native Number getPreferredPayloadType();

    @JsProperty( name = "preferredPayloadType")
    public native void setPreferredPayloadType( Number value );

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

    public Boolean svcMultiStreamSupport;

    @JsProperty( name = "svcMultiStreamSupport")
    public native Boolean getSvcMultiStreamSupport();

    @JsProperty( name = "svcMultiStreamSupport")
    public native void setSvcMultiStreamSupport( Boolean value );
}
