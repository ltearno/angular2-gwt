package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType1036;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".NgModuleDefinition
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:1364
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="NgModuleDefinition")
public class NgModuleDefinition extends Definition<NgModuleDefinitionFactory>
{

    /*
        Properties
    */

    public Array<NgModuleProviderDef> providers;

    @JsProperty( name = "providers")
    public native Array<NgModuleProviderDef> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<NgModuleProviderDef> value );

    public AnonymousType1036 providersByKey;

    @JsProperty( name = "providersByKey")
    public native AnonymousType1036 getProvidersByKey();

    @JsProperty( name = "providersByKey")
    public native void setProvidersByKey( AnonymousType1036 value );
}
