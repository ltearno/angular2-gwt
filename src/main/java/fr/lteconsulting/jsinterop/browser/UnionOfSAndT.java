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
public interface UnionOfSAndT<T, S>  {
    @JsOverlay
    default S asS() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, S> UnionOfSAndT<T, S> ofS(S value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, S> UnionOfSAndT<T, S> ofT(T value) {
        return Js.cast( value );
    }
    
}
