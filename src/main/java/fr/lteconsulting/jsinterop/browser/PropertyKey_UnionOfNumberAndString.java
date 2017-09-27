package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/browser-api/tsd/lib.es6.d.ts:195159
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface PropertyKey_UnionOfNumberAndString  {
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PropertyKey_UnionOfNumberAndString ofNumber(Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PropertyKey_UnionOfNumberAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
