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
public interface UnionOfAnonymousType717AndMapOfObjectAndObject  {
    @JsOverlay
    default AnonymousType717 asAnonymousType717() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndMapOfObjectAndObject ofAnonymousType717(AnonymousType717 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Map<Object, Object> asMapOfObjectAndObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndMapOfObjectAndObject ofMapOfObjectAndObject(Map<Object, Object> value) {
        return Js.cast( value );
    }
    
}
