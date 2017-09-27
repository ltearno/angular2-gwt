package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Function;
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
public interface UnionOfFunctionAndTypeOfObject  {
    @JsOverlay
    default Function asFunction() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunctionAndTypeOfObject ofFunction(Function value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Type<Object> asTypeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunctionAndTypeOfObject ofTypeOfObject(Type<Object> value) {
        return Js.cast( value );
    }
    
}
