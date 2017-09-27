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
public interface UnionOfPromiseLikeOfT4AndT4<T4>  {
    @JsOverlay
    default PromiseLike<T4> asPromiseLikeOfT4() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T4> UnionOfPromiseLikeOfT4AndT4<T4> ofPromiseLikeOfT4(PromiseLike<T4> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T4 asT4() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T4> UnionOfPromiseLikeOfT4AndT4<T4> ofT4(T4 value) {
        return Js.cast( value );
    }
    
}
