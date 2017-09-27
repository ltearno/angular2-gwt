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
public interface UnionOfArrayOfNumberAndFloat32Array  {
    @JsOverlay
    default Array<Number> asArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndFloat32Array ofArrayOfNumber(Array<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Float32Array asFloat32Array() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndFloat32Array ofFloat32Array(Float32Array value) {
        return Js.cast( value );
    }
    
}
