package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.ng.http.URLSearchParams;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAnonymousType717AndStringAndURLSearchParams  {
    @JsOverlay
    default AnonymousType717 asAnonymousType717() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndStringAndURLSearchParams ofAnonymousType717(AnonymousType717 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndStringAndURLSearchParams ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default URLSearchParams asURLSearchParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndStringAndURLSearchParams ofURLSearchParams(URLSearchParams value) {
        return Js.cast( value );
    }
    
}
