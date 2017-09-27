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
public interface UnionOfRAndT<T, R>  {
    @JsOverlay
    default R asR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, R> UnionOfRAndT<T, R> ofR(R value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, R> UnionOfRAndT<T, R> ofT(T value) {
        return Js.cast( value );
    }
    
}
