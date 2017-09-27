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
public interface UnionOfPromiseLikeOfT9AndT9<T9>  {
    @JsOverlay
    default PromiseLike<T9> asPromiseLikeOfT9() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T9> UnionOfPromiseLikeOfT9AndT9<T9> ofPromiseLikeOfT9(PromiseLike<T9> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T9 asT9() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T9> UnionOfPromiseLikeOfT9AndT9<T9> ofT9(T9 value) {
        return Js.cast( value );
    }
    
}
