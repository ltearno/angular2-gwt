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
public interface UnionOfArrayOfNumberAndNumber  {
    @JsOverlay
    default Array<Number> asArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndNumber ofArrayOfNumber(Array<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndNumber ofNumber(Number value) {
        return Js.cast( value );
    }
    
}
