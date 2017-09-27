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
public interface UnionOfTAndT2<T, T2>  {
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2> UnionOfTAndT2<T, T2> ofT(T value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T2 asT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, T2> UnionOfTAndT2<T, T2> ofT2(T2 value) {
        return Js.cast( value );
    }
    
}
