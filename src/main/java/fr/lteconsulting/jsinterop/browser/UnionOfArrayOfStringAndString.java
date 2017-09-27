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
public interface UnionOfArrayOfStringAndString  {
    @JsOverlay
    default Array<String> asArrayOfString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfStringAndString ofArrayOfString(Array<String> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfStringAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
