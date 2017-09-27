package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpEncodingParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:277762
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpEncodingParameters")
public class RTCRtpEncodingParameters
{

    /*
        Properties
    */

    public Boolean active;

    @JsProperty( name = "active")
    public native Boolean getActive();

    @JsProperty( name = "active")
    public native void setActive( Boolean value );

    public Number codecPayloadType;

    @JsProperty( name = "codecPayloadType")
    public native Number getCodecPayloadType();

    @JsProperty( name = "codecPayloadType")
    public native void setCodecPayloadType( Number value );

    public Array<String> dependencyEncodingIds;

    @JsProperty( name = "dependencyEncodingIds")
    public native Array<String> getDependencyEncodingIds();

    @JsProperty( name = "dependencyEncodingIds")
    public native void setDependencyEncodingIds( Array<String> value );

    public String encodingId;

    @JsProperty( name = "encodingId")
    public native String getEncodingId();

    @JsProperty( name = "encodingId")
    public native void setEncodingId( String value );

    public RTCRtpFecParameters fec;

    @JsProperty( name = "fec")
    public native RTCRtpFecParameters getFec();

    @JsProperty( name = "fec")
    public native void setFec( RTCRtpFecParameters value );

    public Number framerateScale;

    @JsProperty( name = "framerateScale")
    public native Number getFramerateScale();

    @JsProperty( name = "framerateScale")
    public native void setFramerateScale( Number value );

    public Number maxBitrate;

    @JsProperty( name = "maxBitrate")
    public native Number getMaxBitrate();

    @JsProperty( name = "maxBitrate")
    public native void setMaxBitrate( Number value );

    public Number maxFramerate;

    @JsProperty( name = "maxFramerate")
    public native Number getMaxFramerate();

    @JsProperty( name = "maxFramerate")
    public native void setMaxFramerate( Number value );

    public Number minQuality;

    @JsProperty( name = "minQuality")
    public native Number getMinQuality();

    @JsProperty( name = "minQuality")
    public native void setMinQuality( Number value );

    public Number priority;

    @JsProperty( name = "priority")
    public native Number getPriority();

    @JsProperty( name = "priority")
    public native void setPriority( Number value );

    public Number resolutionScale;

    @JsProperty( name = "resolutionScale")
    public native Number getResolutionScale();

    @JsProperty( name = "resolutionScale")
    public native void setResolutionScale( Number value );

    public RTCRtpRtxParameters rtx;

    @JsProperty( name = "rtx")
    public native RTCRtpRtxParameters getRtx();

    @JsProperty( name = "rtx")
    public native void setRtx( RTCRtpRtxParameters value );

    public Number ssrc;

    @JsProperty( name = "ssrc")
    public native Number getSsrc();

    @JsProperty( name = "ssrc")
    public native void setSsrc( Number value );

    public RTCSsrcRange ssrcRange;

    @JsProperty( name = "ssrcRange")
    public native RTCSsrcRange getSsrcRange();

    @JsProperty( name = "ssrcRange")
    public native void setSsrcRange( RTCSsrcRange value );
}
