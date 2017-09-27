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
public interface UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString  {
    @JsOverlay
    default AesCbcParams asAesCbcParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString ofAesCbcParams(AesCbcParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesCfbParams asAesCfbParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString ofAesCfbParams(AesCfbParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesCmacParams asAesCmacParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString ofAesCmacParams(AesCmacParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesCtrParams asAesCtrParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString ofAesCtrParams(AesCtrParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesGcmParams asAesGcmParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString ofAesGcmParams(AesGcmParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RsaOaepParams asRsaOaepParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString ofRsaOaepParams(RsaOaepParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
