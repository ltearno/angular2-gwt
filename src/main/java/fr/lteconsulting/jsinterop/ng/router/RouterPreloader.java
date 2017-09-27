package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.ng.core.Compiler;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.NgModuleFactoryLoader;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader".RouterPreloader
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader.d.ts:1284
  * 1 constructors
  * The preloader optimistically loads all router configurations to
  * make navigations into lazily-loaded sections of the application faster.
  * 
  * The preloader runs in the background. When the router bootstraps, the preloader
  * starts listening to all navigation events. After every such event, the preloader
  * will check if any configurations can be loaded lazily.
  * 
  * If a route is protected by `canLoad` guards, the preloaded will not load it.
 */
@JsType(isNative=true, namespace="ng.router", name="RouterPreloader")
public class RouterPreloader implements OnDestroy
{

    /*
        Constructors
    */
    public RouterPreloader(Router router, NgModuleFactoryLoader moduleLoader, Compiler compiler, Injector injector, PreloadingStrategy preloadingStrategy){
    }

    /*
        Properties
    */

    public Object injector;

    @JsProperty( name = "injector")
    public native Object getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Object value );

    public Object loader;

    @JsProperty( name = "loader")
    public native Object getLoader();

    @JsProperty( name = "loader")
    public native void setLoader( Object value );

    public Object preloadingStrategy;

    @JsProperty( name = "preloadingStrategy")
    public native Object getPreloadingStrategy();

    @JsProperty( name = "preloadingStrategy")
    public native void setPreloadingStrategy( Object value );

    public Object router;

    @JsProperty( name = "router")
    public native Object getRouter();

    @JsProperty( name = "router")
    public native void setRouter( Object value );

    public Object subscription;

    @JsProperty( name = "subscription")
    public native Object getSubscription();

    @JsProperty( name = "subscription")
    public native void setSubscription( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnDestroy();
    /** 
      * Std Signature : S(preload,357<3>,,)
      * TE Signature : S(preload,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader.d.ts@2123
     */
    public native Observable<Object> preload();
    /** 
      * Std Signature : S(preloadConfig,3,,P(d3),P(d3))
      * TE Signature : S(preloadConfig,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader.d.ts@2225
     */
    public native Object preloadConfig(Object ngModule, Object route);
    /** 
      * Std Signature : S(processRoutes,3,,P(d3),P(d3))
      * TE Signature : S(processRoutes,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader.d.ts@2180
     */
    public native Object processRoutes(Object ngModule, Object routes);
    /** 
      * Std Signature : S(setUpPreloading,429,,)
      * TE Signature : S(setUpPreloading,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader.d.ts@2094
     */
    public native void setUpPreloading();
}
