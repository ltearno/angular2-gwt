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
public interface UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString  {
    @JsOverlay
    default ArrayBuffer asArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString ofArrayBuffer(ArrayBuffer value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Blob asBlob() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString ofBlob(Blob value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FormData asFormData() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString ofFormData(FormData value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Object asObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString ofObject(Object value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
