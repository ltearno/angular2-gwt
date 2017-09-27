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
public interface UnionOfArrayBufferAndBlobAndObjectAndString  {
    @JsOverlay
    default ArrayBuffer asArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndObjectAndString ofArrayBuffer(ArrayBuffer value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Blob asBlob() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndObjectAndString ofBlob(Blob value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Object asObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndObjectAndString ofObject(Object value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndObjectAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
