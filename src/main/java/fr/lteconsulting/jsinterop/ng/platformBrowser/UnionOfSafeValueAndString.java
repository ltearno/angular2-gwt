package fr.lteconsulting.jsinterop.ng.platformBrowser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfSafeValueAndString  {
    @JsOverlay
    default SafeValue asSafeValue() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfSafeValueAndString ofSafeValue(SafeValue value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfSafeValueAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
