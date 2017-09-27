package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSVideoRecvPayload
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:266561
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSVideoRecvPayload")
public class MSVideoRecvPayload extends MSVideoPayload
{

    /*
        Properties
    */

    public Number lowBitRateCallPercent;

    @JsProperty( name = "lowBitRateCallPercent")
    public native Number getLowBitRateCallPercent();

    @JsProperty( name = "lowBitRateCallPercent")
    public native void setLowBitRateCallPercent( Number value );

    public Number lowFrameRateCallPercent;

    @JsProperty( name = "lowFrameRateCallPercent")
    public native Number getLowFrameRateCallPercent();

    @JsProperty( name = "lowFrameRateCallPercent")
    public native void setLowFrameRateCallPercent( Number value );

    public Number recvBitRateAverage;

    @JsProperty( name = "recvBitRateAverage")
    public native Number getRecvBitRateAverage();

    @JsProperty( name = "recvBitRateAverage")
    public native void setRecvBitRateAverage( Number value );

    public Number recvBitRateMaximum;

    @JsProperty( name = "recvBitRateMaximum")
    public native Number getRecvBitRateMaximum();

    @JsProperty( name = "recvBitRateMaximum")
    public native void setRecvBitRateMaximum( Number value );

    public String recvCodecType;

    @JsProperty( name = "recvCodecType")
    public native String getRecvCodecType();

    @JsProperty( name = "recvCodecType")
    public native void setRecvCodecType( String value );

    public Number recvFpsHarmonicAverage;

    @JsProperty( name = "recvFpsHarmonicAverage")
    public native Number getRecvFpsHarmonicAverage();

    @JsProperty( name = "recvFpsHarmonicAverage")
    public native void setRecvFpsHarmonicAverage( Number value );

    public Number recvFrameRateAverage;

    @JsProperty( name = "recvFrameRateAverage")
    public native Number getRecvFrameRateAverage();

    @JsProperty( name = "recvFrameRateAverage")
    public native void setRecvFrameRateAverage( Number value );

    public Number recvNumResSwitches;

    @JsProperty( name = "recvNumResSwitches")
    public native Number getRecvNumResSwitches();

    @JsProperty( name = "recvNumResSwitches")
    public native void setRecvNumResSwitches( Number value );

    public Number recvReorderBufferMaxSuccessfullyOrderedExtent;

    @JsProperty( name = "recvReorderBufferMaxSuccessfullyOrderedExtent")
    public native Number getRecvReorderBufferMaxSuccessfullyOrderedExtent();

    @JsProperty( name = "recvReorderBufferMaxSuccessfullyOrderedExtent")
    public native void setRecvReorderBufferMaxSuccessfullyOrderedExtent( Number value );

    public Number recvReorderBufferMaxSuccessfullyOrderedLateTime;

    @JsProperty( name = "recvReorderBufferMaxSuccessfullyOrderedLateTime")
    public native Number getRecvReorderBufferMaxSuccessfullyOrderedLateTime();

    @JsProperty( name = "recvReorderBufferMaxSuccessfullyOrderedLateTime")
    public native void setRecvReorderBufferMaxSuccessfullyOrderedLateTime( Number value );

    public Number recvReorderBufferPacketsDroppedDueToBufferExhaustion;

    @JsProperty( name = "recvReorderBufferPacketsDroppedDueToBufferExhaustion")
    public native Number getRecvReorderBufferPacketsDroppedDueToBufferExhaustion();

    @JsProperty( name = "recvReorderBufferPacketsDroppedDueToBufferExhaustion")
    public native void setRecvReorderBufferPacketsDroppedDueToBufferExhaustion( Number value );

    public Number recvReorderBufferPacketsDroppedDueToTimeout;

    @JsProperty( name = "recvReorderBufferPacketsDroppedDueToTimeout")
    public native Number getRecvReorderBufferPacketsDroppedDueToTimeout();

    @JsProperty( name = "recvReorderBufferPacketsDroppedDueToTimeout")
    public native void setRecvReorderBufferPacketsDroppedDueToTimeout( Number value );

    public Number recvReorderBufferReorderedPackets;

    @JsProperty( name = "recvReorderBufferReorderedPackets")
    public native Number getRecvReorderBufferReorderedPackets();

    @JsProperty( name = "recvReorderBufferReorderedPackets")
    public native void setRecvReorderBufferReorderedPackets( Number value );

    public Number recvResolutionHeight;

    @JsProperty( name = "recvResolutionHeight")
    public native Number getRecvResolutionHeight();

    @JsProperty( name = "recvResolutionHeight")
    public native void setRecvResolutionHeight( Number value );

    public Number recvResolutionWidth;

    @JsProperty( name = "recvResolutionWidth")
    public native Number getRecvResolutionWidth();

    @JsProperty( name = "recvResolutionWidth")
    public native void setRecvResolutionWidth( Number value );

    public Number recvVideoStreamsMax;

    @JsProperty( name = "recvVideoStreamsMax")
    public native Number getRecvVideoStreamsMax();

    @JsProperty( name = "recvVideoStreamsMax")
    public native void setRecvVideoStreamsMax( Number value );

    public Number recvVideoStreamsMin;

    @JsProperty( name = "recvVideoStreamsMin")
    public native Number getRecvVideoStreamsMin();

    @JsProperty( name = "recvVideoStreamsMin")
    public native void setRecvVideoStreamsMin( Number value );

    public Number recvVideoStreamsMode;

    @JsProperty( name = "recvVideoStreamsMode")
    public native Number getRecvVideoStreamsMode();

    @JsProperty( name = "recvVideoStreamsMode")
    public native void setRecvVideoStreamsMode( Number value );

    public Number reorderBufferTotalPackets;

    @JsProperty( name = "reorderBufferTotalPackets")
    public native Number getReorderBufferTotalPackets();

    @JsProperty( name = "reorderBufferTotalPackets")
    public native void setReorderBufferTotalPackets( Number value );

    public Number videoFrameLossRate;

    @JsProperty( name = "videoFrameLossRate")
    public native Number getVideoFrameLossRate();

    @JsProperty( name = "videoFrameLossRate")
    public native void setVideoFrameLossRate( Number value );

    public Number videoPostFECPLR;

    @JsProperty( name = "videoPostFECPLR")
    public native Number getVideoPostFECPLR();

    @JsProperty( name = "videoPostFECPLR")
    public native void setVideoPostFECPLR( Number value );

    public MSVideoResolutionDistribution videoResolutions;

    @JsProperty( name = "videoResolutions")
    public native MSVideoResolutionDistribution getVideoResolutions();

    @JsProperty( name = "videoResolutions")
    public native void setVideoResolutions( MSVideoResolutionDistribution value );
}
