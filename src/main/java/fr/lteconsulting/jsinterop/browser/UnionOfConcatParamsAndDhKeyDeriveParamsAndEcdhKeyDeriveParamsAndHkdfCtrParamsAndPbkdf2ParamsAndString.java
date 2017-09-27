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
public interface UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString  {
    @JsOverlay
    default ConcatParams asConcatParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString ofConcatParams(ConcatParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default DhKeyDeriveParams asDhKeyDeriveParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString ofDhKeyDeriveParams(DhKeyDeriveParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EcdhKeyDeriveParams asEcdhKeyDeriveParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString ofEcdhKeyDeriveParams(EcdhKeyDeriveParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HkdfCtrParams asHkdfCtrParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString ofHkdfCtrParams(HkdfCtrParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Pbkdf2Params asPbkdf2Params() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString ofPbkdf2Params(Pbkdf2Params value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
