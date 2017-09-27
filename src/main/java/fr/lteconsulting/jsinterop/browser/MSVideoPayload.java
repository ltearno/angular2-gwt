package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSVideoPayload
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:266328
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSVideoPayload")
public class MSVideoPayload extends MSPayloadBase
{

    /*
        Properties
    */

    public Number durationSeconds;

    @JsProperty( name = "durationSeconds")
    public native Number getDurationSeconds();

    @JsProperty( name = "durationSeconds")
    public native void setDurationSeconds( Number value );

    public String resolution;

    @JsProperty( name = "resolution")
    public native String getResolution();

    @JsProperty( name = "resolution")
    public native void setResolution( String value );

    public Number videoBitRateAvg;

    @JsProperty( name = "videoBitRateAvg")
    public native Number getVideoBitRateAvg();

    @JsProperty( name = "videoBitRateAvg")
    public native void setVideoBitRateAvg( Number value );

    public Number videoBitRateMax;

    @JsProperty( name = "videoBitRateMax")
    public native Number getVideoBitRateMax();

    @JsProperty( name = "videoBitRateMax")
    public native void setVideoBitRateMax( Number value );

    public Number videoFrameRateAvg;

    @JsProperty( name = "videoFrameRateAvg")
    public native Number getVideoFrameRateAvg();

    @JsProperty( name = "videoFrameRateAvg")
    public native void setVideoFrameRateAvg( Number value );

    public Number videoPacketLossRate;

    @JsProperty( name = "videoPacketLossRate")
    public native Number getVideoPacketLossRate();

    @JsProperty( name = "videoPacketLossRate")
    public native void setVideoPacketLossRate( Number value );
}
