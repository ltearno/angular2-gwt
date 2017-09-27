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
public interface UnionOfPromiseLikeOfTResultAndTResult<TResult>  {
    @JsOverlay
    default PromiseLike<TResult> asPromiseLikeOfTResult() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult> UnionOfPromiseLikeOfTResultAndTResult<TResult> ofPromiseLikeOfTResult(PromiseLike<TResult> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TResult asTResult() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult> UnionOfPromiseLikeOfTResultAndTResult<TResult> ofTResult(TResult value) {
        return Js.cast( value );
    }
    
}
