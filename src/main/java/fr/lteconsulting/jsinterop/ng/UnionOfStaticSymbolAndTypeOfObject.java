package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
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
public interface UnionOfStaticSymbolAndTypeOfObject  {
    @JsOverlay
    default StaticSymbol asStaticSymbol() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStaticSymbolAndTypeOfObject ofStaticSymbol(StaticSymbol value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Type<Object> asTypeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStaticSymbolAndTypeOfObject ofTypeOfObject(Type<Object> value) {
        return Js.cast( value );
    }
    
}
