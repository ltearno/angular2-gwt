package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCOfferOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:275974
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCOfferOptions")
public class RTCOfferOptions
{

    /*
        Properties
    */

    public Boolean iceRestart;

    @JsProperty( name = "iceRestart")
    public native Boolean getIceRestart();

    @JsProperty( name = "iceRestart")
    public native void setIceRestart( Boolean value );

    public Number offerToReceiveAudio;

    @JsProperty( name = "offerToReceiveAudio")
    public native Number getOfferToReceiveAudio();

    @JsProperty( name = "offerToReceiveAudio")
    public native void setOfferToReceiveAudio( Number value );

    public Number offerToReceiveVideo;

    @JsProperty( name = "offerToReceiveVideo")
    public native Number getOfferToReceiveVideo();

    @JsProperty( name = "offerToReceiveVideo")
    public native void setOfferToReceiveVideo( Number value );

    public Boolean voiceActivityDetection;

    @JsProperty( name = "voiceActivityDetection")
    public native Boolean getVoiceActivityDetection();

    @JsProperty( name = "voiceActivityDetection")
    public native void setVoiceActivityDetection( Boolean value );
}
