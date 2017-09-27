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
public interface UnionOfPromiseLikeOfT8AndT8<T8>  {
    @JsOverlay
    default PromiseLike<T8> asPromiseLikeOfT8() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T8> UnionOfPromiseLikeOfT8AndT8<T8> ofPromiseLikeOfT8(PromiseLike<T8> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T8 asT8() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T8> UnionOfPromiseLikeOfT8AndT8<T8> ofT8(T8 value) {
        return Js.cast( value );
    }
    
}
