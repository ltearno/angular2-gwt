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
public interface UnionOfPromiseLikeOfTResult1AndTResult1<TResult1>  {
    @JsOverlay
    default PromiseLike<TResult1> asPromiseLikeOfTResult1() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult1> UnionOfPromiseLikeOfTResult1AndTResult1<TResult1> ofPromiseLikeOfTResult1(PromiseLike<TResult1> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TResult1 asTResult1() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult1> UnionOfPromiseLikeOfTResult1AndTResult1<TResult1> ofTResult1(TResult1 value) {
        return Js.cast( value );
    }
    
}
