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
public interface UnionOfStringAndURLSearchParams  {
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndURLSearchParams ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default URLSearchParams asURLSearchParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndURLSearchParams ofURLSearchParams(URLSearchParams value) {
        return Js.cast( value );
    }
    
}
