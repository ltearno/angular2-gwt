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
public interface UnionOfTResult1AndTResult2<TResult1, TResult2>  {
    @JsOverlay
    default TResult1 asTResult1() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult1, TResult2> UnionOfTResult1AndTResult2<TResult1, TResult2> ofTResult1(TResult1 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TResult2 asTResult2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TResult1, TResult2> UnionOfTResult1AndTResult2<TResult1, TResult2> ofTResult2(TResult2 value) {
        return Js.cast( value );
    }
    
}
