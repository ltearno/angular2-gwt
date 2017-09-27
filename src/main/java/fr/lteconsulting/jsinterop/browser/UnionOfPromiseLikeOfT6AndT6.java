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
public interface UnionOfPromiseLikeOfT6AndT6<T6>  {
    @JsOverlay
    default PromiseLike<T6> asPromiseLikeOfT6() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T6> UnionOfPromiseLikeOfT6AndT6<T6> ofPromiseLikeOfT6(PromiseLike<T6> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T6 asT6() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T6> UnionOfPromiseLikeOfT6AndT6<T6> ofT6(T6 value) {
        return Js.cast( value );
    }
    
}
