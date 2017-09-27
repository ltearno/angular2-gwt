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
public interface UnionOfPromiseLikeOfTAndT<T>  {
    @JsOverlay
    default PromiseLike<T> asPromiseLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfPromiseLikeOfTAndT<T> ofPromiseLikeOfT(PromiseLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfPromiseLikeOfTAndT<T> ofT(T value) {
        return Js.cast( value );
    }
    
}
