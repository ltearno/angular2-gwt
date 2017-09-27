package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString  {
    @JsOverlay
    default Function2<String, String, Boolean> asFunction2OfStringAndStringAndBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString ofFunction2OfStringAndStringAndBoolean(Function2<String, String, Boolean> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default StaticSymbol asStaticSymbol() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString ofStaticSymbol(StaticSymbol value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
