package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/system_js_ng_module_factory_loader".SystemJsNgModuleLoaderConfig
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/system_js_ng_module_factory_loader.d.ts:161

  * Configuration for SystemJsNgModuleLoader.
  * token.
 */
@JsType(isNative=true, namespace="ng.core", name="SystemJsNgModuleLoaderConfig")
public class SystemJsNgModuleLoaderConfig
{

    /*
        Properties
    */

    /** 
      * Prefix to add when computing the name of the factory module for a given module name.
     */
    public String factoryPathPrefix;

    @JsProperty( name = "factoryPathPrefix")
    public native String getFactoryPathPrefix();

    @JsProperty( name = "factoryPathPrefix")
    public native void setFactoryPathPrefix( String value );

    /** 
      * Suffix to add when computing the name of the factory module for a given module name.
     */
    public String factoryPathSuffix;

    @JsProperty( name = "factoryPathSuffix")
    public native String getFactoryPathSuffix();

    @JsProperty( name = "factoryPathSuffix")
    public native void setFactoryPathSuffix( String value );
}
