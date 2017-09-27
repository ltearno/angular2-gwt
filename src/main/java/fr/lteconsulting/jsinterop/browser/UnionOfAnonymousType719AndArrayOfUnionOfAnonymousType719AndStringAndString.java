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
public interface UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString  {
    @JsOverlay
    default AnonymousType719 asAnonymousType719() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString ofAnonymousType719(AnonymousType719 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Array<UnionOfAnonymousType719AndString> asArrayOfUnionOfAnonymousType719AndString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString ofArrayOfUnionOfAnonymousType719AndString(Array<UnionOfAnonymousType719AndString> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
