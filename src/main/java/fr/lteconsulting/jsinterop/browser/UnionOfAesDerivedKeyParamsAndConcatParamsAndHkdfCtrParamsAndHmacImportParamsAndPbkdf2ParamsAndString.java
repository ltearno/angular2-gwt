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
public interface UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString  {
    @JsOverlay
    default AesDerivedKeyParams asAesDerivedKeyParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString ofAesDerivedKeyParams(AesDerivedKeyParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ConcatParams asConcatParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString ofConcatParams(ConcatParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HkdfCtrParams asHkdfCtrParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString ofHkdfCtrParams(HkdfCtrParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HmacImportParams asHmacImportParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString ofHmacImportParams(HmacImportParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Pbkdf2Params asPbkdf2Params() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString ofPbkdf2Params(Pbkdf2Params value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
