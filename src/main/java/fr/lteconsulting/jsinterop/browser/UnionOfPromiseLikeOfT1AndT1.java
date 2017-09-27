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
public interface UnionOfPromiseLikeOfT1AndT1<T1>  {
    @JsOverlay
    default PromiseLike<T1> asPromiseLikeOfT1() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1> UnionOfPromiseLikeOfT1AndT1<T1> ofPromiseLikeOfT1(PromiseLike<T1> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T1 asT1() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1> UnionOfPromiseLikeOfT1AndT1<T1> ofT1(T1 value) {
        return Js.cast( value );
    }
    
}
