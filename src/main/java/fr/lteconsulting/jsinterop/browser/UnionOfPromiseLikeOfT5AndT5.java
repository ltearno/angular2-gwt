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
public interface UnionOfPromiseLikeOfT5AndT5<T5>  {
    @JsOverlay
    default PromiseLike<T5> asPromiseLikeOfT5() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T5> UnionOfPromiseLikeOfT5AndT5<T5> ofPromiseLikeOfT5(PromiseLike<T5> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T5 asT5() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T5> UnionOfPromiseLikeOfT5AndT5<T5> ofT5(T5 value) {
        return Js.cast( value );
    }
    
}
