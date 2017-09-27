package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSAudioRecvPayload
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:260953
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAudioRecvPayload")
public class MSAudioRecvPayload extends MSPayloadBase
{

    /*
        Properties
    */

    public Number burstLossLength1;

    @JsProperty( name = "burstLossLength1")
    public native Number getBurstLossLength1();

    @JsProperty( name = "burstLossLength1")
    public native void setBurstLossLength1( Number value );

    public Number burstLossLength2;

    @JsProperty( name = "burstLossLength2")
    public native Number getBurstLossLength2();

    @JsProperty( name = "burstLossLength2")
    public native void setBurstLossLength2( Number value );

    public Number burstLossLength3;

    @JsProperty( name = "burstLossLength3")
    public native Number getBurstLossLength3();

    @JsProperty( name = "burstLossLength3")
    public native void setBurstLossLength3( Number value );

    public Number burstLossLength4;

    @JsProperty( name = "burstLossLength4")
    public native Number getBurstLossLength4();

    @JsProperty( name = "burstLossLength4")
    public native void setBurstLossLength4( Number value );

    public Number burstLossLength5;

    @JsProperty( name = "burstLossLength5")
    public native Number getBurstLossLength5();

    @JsProperty( name = "burstLossLength5")
    public native void setBurstLossLength5( Number value );

    public Number burstLossLength6;

    @JsProperty( name = "burstLossLength6")
    public native Number getBurstLossLength6();

    @JsProperty( name = "burstLossLength6")
    public native void setBurstLossLength6( Number value );

    public Number burstLossLength7;

    @JsProperty( name = "burstLossLength7")
    public native Number getBurstLossLength7();

    @JsProperty( name = "burstLossLength7")
    public native void setBurstLossLength7( Number value );

    public Number burstLossLength8OrHigher;

    @JsProperty( name = "burstLossLength8OrHigher")
    public native Number getBurstLossLength8OrHigher();

    @JsProperty( name = "burstLossLength8OrHigher")
    public native void setBurstLossLength8OrHigher( Number value );

    public Number fecRecvDistance1;

    @JsProperty( name = "fecRecvDistance1")
    public native Number getFecRecvDistance1();

    @JsProperty( name = "fecRecvDistance1")
    public native void setFecRecvDistance1( Number value );

    public Number fecRecvDistance2;

    @JsProperty( name = "fecRecvDistance2")
    public native Number getFecRecvDistance2();

    @JsProperty( name = "fecRecvDistance2")
    public native void setFecRecvDistance2( Number value );

    public Number fecRecvDistance3;

    @JsProperty( name = "fecRecvDistance3")
    public native Number getFecRecvDistance3();

    @JsProperty( name = "fecRecvDistance3")
    public native void setFecRecvDistance3( Number value );

    public Number packetReorderDepthAvg;

    @JsProperty( name = "packetReorderDepthAvg")
    public native Number getPacketReorderDepthAvg();

    @JsProperty( name = "packetReorderDepthAvg")
    public native void setPacketReorderDepthAvg( Number value );

    public Number packetReorderDepthMax;

    @JsProperty( name = "packetReorderDepthMax")
    public native Number getPacketReorderDepthMax();

    @JsProperty( name = "packetReorderDepthMax")
    public native void setPacketReorderDepthMax( Number value );

    public Number packetReorderRatio;

    @JsProperty( name = "packetReorderRatio")
    public native Number getPacketReorderRatio();

    @JsProperty( name = "packetReorderRatio")
    public native void setPacketReorderRatio( Number value );

    public Number ratioCompressedSamplesAvg;

    @JsProperty( name = "ratioCompressedSamplesAvg")
    public native Number getRatioCompressedSamplesAvg();

    @JsProperty( name = "ratioCompressedSamplesAvg")
    public native void setRatioCompressedSamplesAvg( Number value );

    public Number ratioConcealedSamplesAvg;

    @JsProperty( name = "ratioConcealedSamplesAvg")
    public native Number getRatioConcealedSamplesAvg();

    @JsProperty( name = "ratioConcealedSamplesAvg")
    public native void setRatioConcealedSamplesAvg( Number value );

    public Number ratioStretchedSamplesAvg;

    @JsProperty( name = "ratioStretchedSamplesAvg")
    public native Number getRatioStretchedSamplesAvg();

    @JsProperty( name = "ratioStretchedSamplesAvg")
    public native void setRatioStretchedSamplesAvg( Number value );

    public Number samplingRate;

    @JsProperty( name = "samplingRate")
    public native Number getSamplingRate();

    @JsProperty( name = "samplingRate")
    public native void setSamplingRate( Number value );

    public MSAudioRecvSignal signal;

    @JsProperty( name = "signal")
    public native MSAudioRecvSignal getSignal();

    @JsProperty( name = "signal")
    public native void setSignal( MSAudioRecvSignal value );
}
