package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfRequestAndString  {
    @JsOverlay
    default Request asRequest() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRequestAndString ofRequest(Request value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRequestAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
