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
public interface UnionOfPromiseLikeOfTResult2AndTResult2<TResult2>  {
    @JsOverlay
    default PromiseLike<TResult2> asPromiseLikeOfTResult2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult2> UnionOfPromiseLikeOfTResult2AndTResult2<TResult2> ofPromiseLikeOfTResult2(PromiseLike<TResult2> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TResult2 asTResult2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult2> UnionOfPromiseLikeOfTResult2AndTResult2<TResult2> ofTResult2(TResult2 value) {
        return Js.cast( value );
    }
    
}
