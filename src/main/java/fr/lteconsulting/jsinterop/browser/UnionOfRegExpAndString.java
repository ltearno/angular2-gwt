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
public interface UnionOfRegExpAndString  {
    @JsOverlay
    default RegExp asRegExp() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRegExpAndString ofRegExp(RegExp value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRegExpAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
