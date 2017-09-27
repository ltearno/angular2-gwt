package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSAudioLocalClientEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:260198
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAudioLocalClientEvent")
public class MSAudioLocalClientEvent extends MSLocalClientEventBase
{

    /*
        Properties
    */

    public Number cpuInsufficientEventRatio;

    @JsProperty( name = "cpuInsufficientEventRatio")
    public native Number getCpuInsufficientEventRatio();

    @JsProperty( name = "cpuInsufficientEventRatio")
    public native void setCpuInsufficientEventRatio( Number value );

    public Number deviceCaptureNotFunctioningEventRatio;

    @JsProperty( name = "deviceCaptureNotFunctioningEventRatio")
    public native Number getDeviceCaptureNotFunctioningEventRatio();

    @JsProperty( name = "deviceCaptureNotFunctioningEventRatio")
    public native void setDeviceCaptureNotFunctioningEventRatio( Number value );

    public Number deviceClippingEventRatio;

    @JsProperty( name = "deviceClippingEventRatio")
    public native Number getDeviceClippingEventRatio();

    @JsProperty( name = "deviceClippingEventRatio")
    public native void setDeviceClippingEventRatio( Number value );

    public Number deviceEchoEventRatio;

    @JsProperty( name = "deviceEchoEventRatio")
    public native Number getDeviceEchoEventRatio();

    @JsProperty( name = "deviceEchoEventRatio")
    public native void setDeviceEchoEventRatio( Number value );

    public Number deviceGlitchesEventRatio;

    @JsProperty( name = "deviceGlitchesEventRatio")
    public native Number getDeviceGlitchesEventRatio();

    @JsProperty( name = "deviceGlitchesEventRatio")
    public native void setDeviceGlitchesEventRatio( Number value );

    public Number deviceHalfDuplexAECEventRatio;

    @JsProperty( name = "deviceHalfDuplexAECEventRatio")
    public native Number getDeviceHalfDuplexAECEventRatio();

    @JsProperty( name = "deviceHalfDuplexAECEventRatio")
    public native void setDeviceHalfDuplexAECEventRatio( Number value );

    public Number deviceHowlingEventCount;

    @JsProperty( name = "deviceHowlingEventCount")
    public native Number getDeviceHowlingEventCount();

    @JsProperty( name = "deviceHowlingEventCount")
    public native void setDeviceHowlingEventCount( Number value );

    public Number deviceLowSNREventRatio;

    @JsProperty( name = "deviceLowSNREventRatio")
    public native Number getDeviceLowSNREventRatio();

    @JsProperty( name = "deviceLowSNREventRatio")
    public native void setDeviceLowSNREventRatio( Number value );

    public Number deviceLowSpeechLevelEventRatio;

    @JsProperty( name = "deviceLowSpeechLevelEventRatio")
    public native Number getDeviceLowSpeechLevelEventRatio();

    @JsProperty( name = "deviceLowSpeechLevelEventRatio")
    public native void setDeviceLowSpeechLevelEventRatio( Number value );

    public Number deviceMultipleEndpointsEventCount;

    @JsProperty( name = "deviceMultipleEndpointsEventCount")
    public native Number getDeviceMultipleEndpointsEventCount();

    @JsProperty( name = "deviceMultipleEndpointsEventCount")
    public native void setDeviceMultipleEndpointsEventCount( Number value );

    public Number deviceNearEndToEchoRatioEventRatio;

    @JsProperty( name = "deviceNearEndToEchoRatioEventRatio")
    public native Number getDeviceNearEndToEchoRatioEventRatio();

    @JsProperty( name = "deviceNearEndToEchoRatioEventRatio")
    public native void setDeviceNearEndToEchoRatioEventRatio( Number value );

    public Number deviceRenderMuteEventRatio;

    @JsProperty( name = "deviceRenderMuteEventRatio")
    public native Number getDeviceRenderMuteEventRatio();

    @JsProperty( name = "deviceRenderMuteEventRatio")
    public native void setDeviceRenderMuteEventRatio( Number value );

    public Number deviceRenderNotFunctioningEventRatio;

    @JsProperty( name = "deviceRenderNotFunctioningEventRatio")
    public native Number getDeviceRenderNotFunctioningEventRatio();

    @JsProperty( name = "deviceRenderNotFunctioningEventRatio")
    public native void setDeviceRenderNotFunctioningEventRatio( Number value );

    public Number deviceRenderZeroVolumeEventRatio;

    @JsProperty( name = "deviceRenderZeroVolumeEventRatio")
    public native Number getDeviceRenderZeroVolumeEventRatio();

    @JsProperty( name = "deviceRenderZeroVolumeEventRatio")
    public native void setDeviceRenderZeroVolumeEventRatio( Number value );

    public Number networkDelayEventRatio;

    @JsProperty( name = "networkDelayEventRatio")
    public native Number getNetworkDelayEventRatio();

    @JsProperty( name = "networkDelayEventRatio")
    public native void setNetworkDelayEventRatio( Number value );

    public Number networkSendQualityEventRatio;

    @JsProperty( name = "networkSendQualityEventRatio")
    public native Number getNetworkSendQualityEventRatio();

    @JsProperty( name = "networkSendQualityEventRatio")
    public native void setNetworkSendQualityEventRatio( Number value );
}
