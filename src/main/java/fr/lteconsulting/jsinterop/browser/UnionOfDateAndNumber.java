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
public interface UnionOfDateAndNumber  {
    @JsOverlay
    default Date asDate() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDateAndNumber ofDate(Date value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDateAndNumber ofNumber(Number value) {
        return Js.cast( value );
    }
    
}
