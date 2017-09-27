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
public interface UnionOfArrayBufferAndArrayBufferViewAndBlobAndString  {
    @JsOverlay
    default ArrayBuffer asArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndBlobAndString ofArrayBuffer(ArrayBuffer value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ArrayBufferView asArrayBufferView() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndBlobAndString ofArrayBufferView(ArrayBufferView value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Blob asBlob() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndBlobAndString ofBlob(Blob value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndBlobAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
