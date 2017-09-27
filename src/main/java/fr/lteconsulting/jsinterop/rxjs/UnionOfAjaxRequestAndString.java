package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAjaxRequestAndString  {
    @JsOverlay
    default AjaxRequest asAjaxRequest() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAjaxRequestAndString ofAjaxRequest(AjaxRequest value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAjaxRequestAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
