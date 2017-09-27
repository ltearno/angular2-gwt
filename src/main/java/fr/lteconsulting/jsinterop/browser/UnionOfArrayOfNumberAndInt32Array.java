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
public interface UnionOfArrayOfNumberAndInt32Array  {
    @JsOverlay
    default Array<Number> asArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndInt32Array ofArrayOfNumber(Array<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Int32Array asInt32Array() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndInt32Array ofInt32Array(Int32Array value) {
        return Js.cast( value );
    }
    
}
