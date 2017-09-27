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
public interface UnionOfArrayBufferAndArrayBufferView  {
    @JsOverlay
    default ArrayBuffer asArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferView ofArrayBuffer(ArrayBuffer value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ArrayBufferView asArrayBufferView() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferView ofArrayBufferView(ArrayBufferView value) {
        return Js.cast( value );
    }
    
}
