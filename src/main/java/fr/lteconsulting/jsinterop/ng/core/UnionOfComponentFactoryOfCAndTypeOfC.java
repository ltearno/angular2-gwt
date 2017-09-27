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
public interface UnionOfComponentFactoryOfCAndTypeOfC<C>  {
    @JsOverlay
    default ComponentFactory<C> asComponentFactoryOfC() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <C> UnionOfComponentFactoryOfCAndTypeOfC<C> ofComponentFactoryOfC(ComponentFactory<C> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Type<C> asTypeOfC() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <C> UnionOfComponentFactoryOfCAndTypeOfC<C> ofTypeOfC(Type<C> value) {
        return Js.cast( value );
    }
    
}
