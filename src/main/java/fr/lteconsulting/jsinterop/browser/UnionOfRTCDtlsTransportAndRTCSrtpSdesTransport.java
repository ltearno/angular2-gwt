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
public interface UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport extends EventTarget  {
    @JsOverlay
    default RTCDtlsTransport asRTCDtlsTransport() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport ofRTCDtlsTransport(RTCDtlsTransport value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RTCSrtpSdesTransport asRTCSrtpSdesTransport() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport ofRTCSrtpSdesTransport(RTCSrtpSdesTransport value) {
        return Js.cast( value );
    }
    
}
