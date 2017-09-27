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
public interface UnionOfPromiseLikeOfT3AndT3<T3>  {
    @JsOverlay
    default PromiseLike<T3> asPromiseLikeOfT3() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T3> UnionOfPromiseLikeOfT3AndT3<T3> ofPromiseLikeOfT3(PromiseLike<T3> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T3 asT3() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T3> UnionOfPromiseLikeOfT3AndT3<T3> ofT3(T3 value) {
        return Js.cast( value );
    }
    
}
