package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.ng.http.Headers;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAnonymousType717AndHeaders  {
    @JsOverlay
    default AnonymousType717 asAnonymousType717() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndHeaders ofAnonymousType717(AnonymousType717 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Headers asHeaders() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType717AndHeaders ofHeaders(Headers value) {
        return Js.cast( value );
    }
    
}
