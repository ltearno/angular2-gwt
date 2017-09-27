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
public interface UnionOfPromiseLikeOfT10AndT10<T10>  {
    @JsOverlay
    default PromiseLike<T10> asPromiseLikeOfT10() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T10> UnionOfPromiseLikeOfT10AndT10<T10> ofPromiseLikeOfT10(PromiseLike<T10> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T10 asT10() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T10> UnionOfPromiseLikeOfT10AndT10<T10> ofT10(T10 value) {
        return Js.cast( value );
    }
    
}
