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
public interface UnionOfPromiseLikeOfT2AndT2<T2>  {
    @JsOverlay
    default PromiseLike<T2> asPromiseLikeOfT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T2> UnionOfPromiseLikeOfT2AndT2<T2> ofPromiseLikeOfT2(PromiseLike<T2> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T2 asT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T2> UnionOfPromiseLikeOfT2AndT2<T2> ofT2(T2 value) {
        return Js.cast( value );
    }
    
}
