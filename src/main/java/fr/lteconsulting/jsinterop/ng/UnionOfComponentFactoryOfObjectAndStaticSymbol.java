package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
import fr.lteconsulting.jsinterop.ng.core.ComponentFactory;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfComponentFactoryOfObjectAndStaticSymbol  {
    @JsOverlay
    default ComponentFactory<Object> asComponentFactoryOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfComponentFactoryOfObjectAndStaticSymbol ofComponentFactoryOfObject(ComponentFactory<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default StaticSymbol asStaticSymbol() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfComponentFactoryOfObjectAndStaticSymbol ofStaticSymbol(StaticSymbol value) {
        return Js.cast( value );
    }
    
}
