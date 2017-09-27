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
public interface UnionOfArrayOfPropertyKey_UnionOfNumberAndStringAndString  {
    @JsOverlay
    default Array<PropertyKey_UnionOfNumberAndString> asArrayOfPropertyKey_UnionOfNumberAndString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfPropertyKey_UnionOfNumberAndStringAndString ofArrayOfPropertyKey_UnionOfNumberAndString(Array<PropertyKey_UnionOfNumberAndString> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfPropertyKey_UnionOfNumberAndStringAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
