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
public interface UnionOfArrayOfTAndT<T>  {
    @JsOverlay
    default Array<T> asArrayOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayOfTAndT<T> ofArrayOfT(Array<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayOfTAndT<T> ofT(T value) {
        return Js.cast( value );
    }
    
}
