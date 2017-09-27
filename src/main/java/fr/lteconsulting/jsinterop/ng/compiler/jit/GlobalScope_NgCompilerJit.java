package fr.lteconsulting.jsinterop.ng.compiler.jit;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.PlatformRef;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.compiler.jit (java fr.lteconsulting.jsinterop.ng.compiler.jit) package
 */
@JsType(isNative=true, namespace="ng", name="compiler.jit")
public class GlobalScope_NgCompilerJit
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.compiler.jit", name="COMPILER_PROVIDERS")
    public static Array<Object> COMPILER_PROVIDERS;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.compiler.jit", name = "platformCoreDynamic")
    public static native PlatformRef platformCoreDynamic(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> extraProviders /* optional */);
}
