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
public interface UnionOfT1AndT2AndT3AndT4<T1, T2, T3, T4>  {
    @JsOverlay
    default T1 asT1() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4> UnionOfT1AndT2AndT3AndT4<T1, T2, T3, T4> ofT1(T1 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T2 asT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4> UnionOfT1AndT2AndT3AndT4<T1, T2, T3, T4> ofT2(T2 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T3 asT3() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4> UnionOfT1AndT2AndT3AndT4<T1, T2, T3, T4> ofT3(T3 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T4 asT4() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4> UnionOfT1AndT2AndT3AndT4<T1, T2, T3, T4> ofT4(T4 value) {
        return Js.cast( value );
    }
    
}
