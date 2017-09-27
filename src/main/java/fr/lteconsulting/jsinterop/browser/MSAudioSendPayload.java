package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSAudioSendPayload
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:261877
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAudioSendPayload")
public class MSAudioSendPayload extends MSPayloadBase
{

    /*
        Properties
    */

    public Boolean audioFECUsed;

    @JsProperty( name = "audioFECUsed")
    public native Boolean getAudioFECUsed();

    @JsProperty( name = "audioFECUsed")
    public native void setAudioFECUsed( Boolean value );

    public Number samplingRate;

    @JsProperty( name = "samplingRate")
    public native Number getSamplingRate();

    @JsProperty( name = "samplingRate")
    public native void setSamplingRate( Number value );

    public Number sendMutePercent;

    @JsProperty( name = "sendMutePercent")
    public native Number getSendMutePercent();

    @JsProperty( name = "sendMutePercent")
    public native void setSendMutePercent( Number value );

    public MSAudioSendSignal signal;

    @JsProperty( name = "signal")
    public native MSAudioSendSignal getSignal();

    @JsProperty( name = "signal")
    public native void setSignal( MSAudioSendSignal value );
}
