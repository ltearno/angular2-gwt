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
public interface UnionOfPromiseLikeOfT7AndT7<T7>  {
    @JsOverlay
    default PromiseLike<T7> asPromiseLikeOfT7() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T7> UnionOfPromiseLikeOfT7AndT7<T7> ofPromiseLikeOfT7(PromiseLike<T7> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T7 asT7() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T7> UnionOfPromiseLikeOfT7AndT7<T7> ofT7(T7 value) {
        return Js.cast( value );
    }
    
}
