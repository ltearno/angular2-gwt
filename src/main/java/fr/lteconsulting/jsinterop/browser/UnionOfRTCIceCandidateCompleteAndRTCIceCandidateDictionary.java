package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary  {
    @JsOverlay
    default RTCIceCandidateComplete asRTCIceCandidateComplete() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary ofRTCIceCandidateComplete(RTCIceCandidateComplete value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RTCIceCandidateDictionary asRTCIceCandidateDictionary() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary ofRTCIceCandidateDictionary(RTCIceCandidateDictionary value) {
        return Js.cast( value );
    }
    
}
