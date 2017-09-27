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
public interface UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString  {
    @JsOverlay
    default AnonymousType717 asAnonymousType717() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString ofAnonymousType717(AnonymousType717 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Array<String> asArrayOfString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString ofArrayOfString(Array<String> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Set<String> asSetOfString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString ofSetOfString(Set<String> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndArrayOfStringAndSetOfStringAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
