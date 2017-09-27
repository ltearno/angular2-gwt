package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/ng_module".ModuleWithProviders
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/ng_module.d.ts:320

  * A wrapper around a module that also includes the providers.
 */
@JsType(isNative=true, namespace="ng.core", name="ModuleWithProviders")
public class ModuleWithProviders
{

    /*
        Properties
    */

    public Type<Object> ngModule;

    @JsProperty( name = "ngModule")
    public native Type<Object> getNgModule();

    @JsProperty( name = "ngModule")
    public native void setNgModule( Type<Object> value );

    public Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers;

    @JsProperty( name = "providers")
    public native Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> value );
}
