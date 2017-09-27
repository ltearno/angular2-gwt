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
public interface UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString  {
    @JsOverlay
    default AesCmacParams asAesCmacParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString ofAesCmacParams(AesCmacParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EcdsaParams asEcdsaParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString ofEcdsaParams(EcdsaParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RsaPssParams asRsaPssParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString ofRsaPssParams(RsaPssParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
