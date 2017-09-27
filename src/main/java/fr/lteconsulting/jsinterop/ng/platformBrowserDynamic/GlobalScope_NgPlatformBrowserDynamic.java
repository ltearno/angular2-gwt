package fr.lteconsulting.jsinterop.ng.platformBrowserDynamic;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.PlatformRef;
import fr.lteconsulting.jsinterop.ng.core.Version;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.platformBrowserDynamic (java fr.lteconsulting.jsinterop.ng.platformBrowserDynamic) package
 */
@JsType(isNative=true, namespace="ng", name="platformBrowserDynamic")
public class GlobalScope_NgPlatformBrowserDynamic
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.platformBrowserDynamic", name="INTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> INTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS;

    @JsProperty(namespace="ng.platformBrowserDynamic", name="VERSION")
    public static Version VERSION;

    @JsProperty(namespace="ng.platformBrowserDynamic", name="RESOURCE_CACHE_PROVIDER")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> RESOURCE_CACHE_PROVIDER;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.platformBrowserDynamic", name = "platformBrowserDynamic")
    public static native PlatformRef platformBrowserDynamic(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> extraProviders /* optional */);

    @JsMethod(namespace="ng.platformBrowserDynamic", name = "platformBrowserDynamic")
    public static native PlatformRef platformBrowserDynamic();
}
