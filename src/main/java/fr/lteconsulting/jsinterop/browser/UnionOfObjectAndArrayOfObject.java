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
public interface UnionOfObjectAndArrayOfObject  {
    @JsOverlay
    default Object asObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfObjectAndArrayOfObject ofObject(Object value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfObjectAndArrayOfObject ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
}
