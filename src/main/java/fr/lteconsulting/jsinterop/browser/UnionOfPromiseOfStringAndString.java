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
public interface UnionOfPromiseOfStringAndString  {
    @JsOverlay
    default Promise<String> asPromiseOfString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfPromiseOfStringAndString ofPromiseOfString(Promise<String> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfPromiseOfStringAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
