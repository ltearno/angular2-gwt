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
public interface UnionOfArrayOfObjectAndT<T>  {
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayOfObjectAndT<T> ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayOfObjectAndT<T> ofT(T value) {
        return Js.cast( value );
    }
    
}
