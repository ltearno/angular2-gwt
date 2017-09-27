package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.ClassProvider;
import fr.lteconsulting.jsinterop.ng.core.ExistingProvider;
import fr.lteconsulting.jsinterop.ng.core.FactoryProvider;
import fr.lteconsulting.jsinterop.ng.core.TypeProvider;
import fr.lteconsulting.jsinterop.ng.core.ValueProvider;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/provider.d.ts:5635
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider  {
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ClassProvider asClassProvider() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider ofClassProvider(ClassProvider value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ExistingProvider asExistingProvider() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider ofExistingProvider(ExistingProvider value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FactoryProvider asFactoryProvider() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider ofFactoryProvider(FactoryProvider value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TypeProvider asTypeProvider() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider ofTypeProvider(TypeProvider value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ValueProvider asValueProvider() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider ofValueProvider(ValueProvider value) {
        return Js.cast( value );
    }
    
}
