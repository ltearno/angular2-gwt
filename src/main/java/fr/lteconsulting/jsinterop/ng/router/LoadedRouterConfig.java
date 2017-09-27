package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.NgModuleRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/config".LoadedRouterConfig
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/config.d.ts:10486
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="LoadedRouterConfig")
public class LoadedRouterConfig
{

    /*
        Constructors
    */
    public LoadedRouterConfig(Array<Route> routes, NgModuleRef<Object> module){
    }

    /*
        Properties
    */

    public NgModuleRef<Object> module;

    @JsProperty( name = "module")
    public native NgModuleRef<Object> getModule();

    @JsProperty( name = "module")
    public native void setModule( NgModuleRef<Object> value );

    public Array<Route> routes;

    @JsProperty( name = "routes")
    public native Array<Route> getRoutes();

    @JsProperty( name = "routes")
    public native void setRoutes( Array<Route> value );
}
