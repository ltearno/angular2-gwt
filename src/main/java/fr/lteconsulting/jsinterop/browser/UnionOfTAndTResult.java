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
public interface UnionOfTAndTResult<T, TResult>  {
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, TResult> UnionOfTAndTResult<T, TResult> ofT(T value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TResult asTResult() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, TResult> UnionOfTAndTResult<T, TResult> ofTResult(TResult value) {
        return Js.cast( value );
    }
    
}
