package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.ModuleWithProviders;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module".RouterModule
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module.d.ts:1198
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterModule")
public class RouterModule
{

    /*
        Constructors
    */
    public RouterModule(Object guard, Router router){
    }

    /*
        Static methods
    */
    /** 
      * Creates a module with all the router providers and directives. It also optionally sets up an
      * application listener to perform an initial navigation.
      * 
      * Options:
      * * `enableTracing` makes the router log all its internal events to the console.
      * * `useHash` enables the location strategy that uses the URL fragment instead of the history
      * API.
      * * `initialNavigation` disables the initial navigation.
      * * `errorHandler` provides a custom error handler.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module.d.ts:3544
     */
    @JsMethod(namespace="ng.router.RouterModule", name = "forRoot")
    public static native ModuleWithProviders forRoot(Array<Route> routes, ExtraOptions config /* optional */);
    /** 
      * Creates a module with all the router directives and a provider registering routes.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module.d.ts:3730
     */
    @JsMethod(namespace="ng.router.RouterModule", name = "forChild")
    public static native ModuleWithProviders forChild(Array<Route> routes);
}
