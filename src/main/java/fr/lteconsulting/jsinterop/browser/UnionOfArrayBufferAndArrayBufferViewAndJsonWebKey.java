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
public interface UnionOfArrayBufferAndArrayBufferViewAndJsonWebKey  {
    @JsOverlay
    default ArrayBuffer asArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndJsonWebKey ofArrayBuffer(ArrayBuffer value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ArrayBufferView asArrayBufferView() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndJsonWebKey ofArrayBufferView(ArrayBufferView value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default JsonWebKey asJsonWebKey() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndJsonWebKey ofJsonWebKey(JsonWebKey value) {
        return Js.cast( value );
    }
    
}
