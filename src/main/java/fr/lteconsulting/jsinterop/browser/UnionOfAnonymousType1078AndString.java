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
public interface UnionOfAnonymousType1078AndString  {
    @JsOverlay
    default AnonymousType1078 asAnonymousType1078() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType1078AndString ofAnonymousType1078(AnonymousType1078 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType1078AndString ofString(String value) {
        return Js.cast( value );
    }
    
}
