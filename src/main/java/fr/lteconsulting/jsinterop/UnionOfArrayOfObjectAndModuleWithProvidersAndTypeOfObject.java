package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.ModuleWithProviders;
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
public interface UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject  {
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ModuleWithProviders asModuleWithProviders() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject ofModuleWithProviders(ModuleWithProviders value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Type<Object> asTypeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject ofTypeOfObject(Type<Object> value) {
        return Js.cast( value );
    }
    
}
