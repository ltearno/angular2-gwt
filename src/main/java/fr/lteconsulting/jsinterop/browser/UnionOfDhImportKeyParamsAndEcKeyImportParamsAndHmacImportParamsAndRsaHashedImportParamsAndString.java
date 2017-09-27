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
public interface UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString  {
    @JsOverlay
    default DhImportKeyParams asDhImportKeyParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString ofDhImportKeyParams(DhImportKeyParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EcKeyImportParams asEcKeyImportParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString ofEcKeyImportParams(EcKeyImportParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HmacImportParams asHmacImportParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString ofHmacImportParams(HmacImportParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RsaHashedImportParams asRsaHashedImportParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString ofRsaHashedImportParams(RsaHashedImportParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
