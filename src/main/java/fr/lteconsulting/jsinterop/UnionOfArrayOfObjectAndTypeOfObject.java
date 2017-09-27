package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.Type;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfObjectAndTypeOfObject  {
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndTypeOfObject ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Type<Object> asTypeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndTypeOfObject ofTypeOfObject(Type<Object> value) {
        return Js.cast( value );
    }
    
}
