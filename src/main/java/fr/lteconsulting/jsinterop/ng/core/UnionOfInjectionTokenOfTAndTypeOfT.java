package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfInjectionTokenOfTAndTypeOfT<T>  {
    @JsOverlay
    default InjectionToken<T> asInjectionTokenOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfInjectionTokenOfTAndTypeOfT<T> ofInjectionTokenOfT(InjectionToken<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Type<T> asTypeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfInjectionTokenOfTAndTypeOfT<T> ofTypeOfT(Type<T> value) {
        return Js.cast( value );
    }
    
}
