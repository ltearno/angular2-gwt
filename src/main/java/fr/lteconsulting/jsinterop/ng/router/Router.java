package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.ng.common.Location;
import fr.lteconsulting.jsinterop.ng.core.Compiler;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.NgModuleFactoryLoader;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router".Router
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts:3886
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="Router")
public class Router
{

    /*
        Constructors
    */
    public Router(Type<Object> rootComponentType, UrlSerializer urlSerializer, ChildrenOutletContexts rootContexts, Location location, Injector injector, NgModuleFactoryLoader loader, Compiler compiler, Array<Route> config){
    }

    /*
        Properties
    */

    public Array<Route> config;

    @JsProperty( name = "config")
    public native Array<Route> getConfig();

    @JsProperty( name = "config")
    public native void setConfig( Array<Route> value );

    public Object configLoader;

    @JsProperty( name = "configLoader")
    public native Object getConfigLoader();

    @JsProperty( name = "configLoader")
    public native void setConfigLoader( Object value );

    public Object currentRouterState;

    @JsProperty( name = "currentRouterState")
    public native Object getCurrentRouterState();

    @JsProperty( name = "currentRouterState")
    public native void setCurrentRouterState( Object value );

    public Object currentUrlTree;

    @JsProperty( name = "currentUrlTree")
    public native Object getCurrentUrlTree();

    @JsProperty( name = "currentUrlTree")
    public native void setCurrentUrlTree( Object value );

    /** 
      * An observable of router events 
     */
    public Observable<Event_UnionOfSeveralGuards> events;

    @JsProperty( name = "events")
    public native Observable<Event_UnionOfSeveralGuards> getEvents();

    @JsProperty( name = "events")
    public native void setEvents( Observable<Event_UnionOfSeveralGuards> value );

    public Object location;

    @JsProperty( name = "location")
    public native Object getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Object value );

    public Object locationSubscription;

    @JsProperty( name = "locationSubscription")
    public native Object getLocationSubscription();

    @JsProperty( name = "locationSubscription")
    public native void setLocationSubscription( Object value );

    /** 
      * Indicates if at least one navigation happened.
     */
    public Boolean navigated;

    @JsProperty( name = "navigated")
    public native Boolean getNavigated();

    @JsProperty( name = "navigated")
    public native void setNavigated( Boolean value );

    public Object navigationId;

    @JsProperty( name = "navigationId")
    public native Object getNavigationId();

    @JsProperty( name = "navigationId")
    public native void setNavigationId( Object value );

    public Object navigations;

    @JsProperty( name = "navigations")
    public native Object getNavigations();

    @JsProperty( name = "navigations")
    public native void setNavigations( Object value );

    public Object ngModule;

    @JsProperty( name = "ngModule")
    public native Object getNgModule();

    @JsProperty( name = "ngModule")
    public native void setNgModule( Object value );

    public Object rawUrlTree;

    @JsProperty( name = "rawUrlTree")
    public native Object getRawUrlTree();

    @JsProperty( name = "rawUrlTree")
    public native void setRawUrlTree( Object value );

    public Object rootComponentType;

    @JsProperty( name = "rootComponentType")
    public native Object getRootComponentType();

    @JsProperty( name = "rootComponentType")
    public native void setRootComponentType( Object value );

    public Object rootContexts;

    @JsProperty( name = "rootContexts")
    public native Object getRootContexts();

    @JsProperty( name = "rootContexts")
    public native void setRootContexts( Object value );

    public RouteReuseStrategy routeReuseStrategy;

    @JsProperty( name = "routeReuseStrategy")
    public native RouteReuseStrategy getRouteReuseStrategy();

    @JsProperty( name = "routeReuseStrategy")
    public native void setRouteReuseStrategy( RouteReuseStrategy value );

    public Object routerEvents;

    @JsProperty( name = "routerEvents")
    public native Object getRouterEvents();

    @JsProperty( name = "routerEvents")
    public native void setRouterEvents( Object value );

    /** 
      * The current route state 
     */
    public RouterState routerState;

    @JsProperty( name = "routerState")
    public native RouterState getRouterState();

    @JsProperty( name = "routerState")
    public native void setRouterState( RouterState value );

    /** 
      * The current url 
     */
    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /** 
      * Extracts and merges URLs. Used for AngularJS to Angular migrations.
     */
    public UrlHandlingStrategy urlHandlingStrategy;

    @JsProperty( name = "urlHandlingStrategy")
    public native UrlHandlingStrategy getUrlHandlingStrategy();

    @JsProperty( name = "urlHandlingStrategy")
    public native void setUrlHandlingStrategy( UrlHandlingStrategy value );

    public Object urlSerializer;

    @JsProperty( name = "urlSerializer")
    public native Object getUrlSerializer();

    @JsProperty( name = "urlSerializer")
    public native void setUrlSerializer( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createUrlTree,678,,P(d7<3>))
      * TE Signature : S(createUrlTree,P(d7))
      * 
     */
    public native UrlTree createUrlTree(Array<Object> commands);
    /** 
      * Std Signature : S(createUrlTree,678,,P(d7<3>),P(d689))
      * TE Signature : S(createUrlTree,P(d7),P(d689))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@7792
      * Applies an array of commands to the current url tree and creates a new url tree.
      * 
      * When given an activate route, applies the given commands starting from the route.
      * When not given a route, applies the given command starting from the root.
      * 
      * ### Usage
      * 
      * ```
      * // create /team/33/user/11
      * router.createUrlTree(['/team', 33, 'user', 11]);
      * 
      * // create /team/33;expand=true/user/11
      * router.createUrlTree(['/team', 33, {expand: true}, 'user', 11]);
      * 
      * // you can collapse static segments like this (this works only with the first passed-in value):
      * router.createUrlTree(['/team/33/user', userId]);
      * 
      * // If the first segment can contain slashes, and you do not want the router to split it, you
      * // can do the following:
      * 
      * router.createUrlTree([{segmentPath: '/one/two'}]);
      * 
      * // create /team/33/(user/11//right:chat)
      * router.createUrlTree(['/team', 33, {outlets: {primary: 'user/11', right: 'chat'}}]);
      * 
      * // remove the right secondary node
      * router.createUrlTree(['/team', 33, {outlets: {primary: 'user/11', right: null}}]);
      * 
      * // assuming the current url is `/team/33/user/11` and the route points to `user/11`
      * 
      * // navigate to /team/33/user/11/details
      * router.createUrlTree(['details'], {relativeTo: route});
      * 
      * // navigate to /team/33/user/22
      * router.createUrlTree(['../22'], {relativeTo: route});
      * 
      * // navigate to /team/44/user/22
      * router.createUrlTree(['../../team/44/user/22'], {relativeTo: route});
      * ```
     */
    public native UrlTree createUrlTree(Array<Object> commands, NavigationExtras navigationExtras /* optional */);
    /** 
      * Std Signature : S(dispose,429,,)
      * TE Signature : S(dispose,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@6121
      * Disposes of the router 
     */
    public native void dispose();
    /** 
      * Std Signature : S(errorHandler,3,,P(d3))
      * TE Signature : S(errorHandler,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@3866
      * Error handler that is invoked when a navigation errors.
      * 
      * See {@link ErrorHandler} for more information.
     */
    public native Object errorHandler(Object error);
    /** 
      * Std Signature : S(executeScheduledNavigation,3,,P(d3))
      * TE Signature : S(executeScheduledNavigation,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9845
     */
    public native Object executeScheduledNavigation(Object __0);
    /** 
      * Std Signature : S(initialNavigation,429,,)
      * TE Signature : S(initialNavigation,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@5295
      * Sets up the location change listener and performs the initial navigation.
     */
    public native void initialNavigation();
    /** 
      * Std Signature : S(isActive,27,,P(d1),P(d27))
      * TE Signature : S(isActive,P(d1),P(d27))
      * 
     */
    public native Boolean isActive(String url, Boolean exact);
    /** 
      * Std Signature : S(isActive,27,,P(d678),P(d27))
      * TE Signature : S(isActive,P(d678),P(d27))
      * 
     */
    public native Boolean isActive(UrlTree url, Boolean exact);
    /** 
      * Std Signature : S(isActive,27,,P(dU(-1,678)),P(d27))
      * TE Signature : S(isActive,P(dU(-1,678)),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9655
      * Returns whether the url is activated 
     */
    public native Boolean isActive(UnionOfStringAndUrlTree url, Boolean exact);
    /** 
      * Std Signature : S(navigate,88<27>,,P(d7<3>))
      * TE Signature : S(navigate,P(d7))
      * 
     */
    public native Promise<Boolean> navigate(Array<Object> commands);
    /** 
      * Std Signature : S(navigate,88<27>,,P(d7<3>),P(d689))
      * TE Signature : S(navigate,P(d7),P(d689))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9351
      * Navigate based on the provided array of commands and a starting point.
      * If no starting route is provided, the navigation is absolute.
      * 
      * Returns a promise that:
      * - resolves to 'true' when navigation succeeds,
      * - resolves to 'false' when navigation fails,
      * - is rejected when an error happens.
      * 
      * ### Usage
      * 
      * ```
      * router.navigate(['team', 33, 'user', 11], {relativeTo: route});
      * 
      * // Navigate without updating the URL
      * router.navigate(['team', 33, 'user', 11], {relativeTo: route, skipLocationChange: true});
      * ```
      * 
      * In opposite to `navigateByUrl`, `navigate` always takes a delta that is applied to the current
      * URL.
     */
    public native Promise<Boolean> navigate(Array<Object> commands, NavigationExtras extras /* optional */);
    /** 
      * Std Signature : S(navigateByUrl,88<27>,,P(d1))
      * TE Signature : S(navigateByUrl,P(d1))
      * 
     */
    public native Promise<Boolean> navigateByUrl(String url);
    /** 
      * Std Signature : S(navigateByUrl,88<27>,,P(d1),P(d689))
      * TE Signature : S(navigateByUrl,P(d1),P(d689))
      * 
     */
    public native Promise<Boolean> navigateByUrl(String url, NavigationExtras extras /* optional */);
    /** 
      * Std Signature : S(navigateByUrl,88<27>,,P(d678))
      * TE Signature : S(navigateByUrl,P(d678))
      * 
     */
    public native Promise<Boolean> navigateByUrl(UrlTree url);
    /** 
      * Std Signature : S(navigateByUrl,88<27>,,P(d678),P(d689))
      * TE Signature : S(navigateByUrl,P(d678),P(d689))
      * 
     */
    public native Promise<Boolean> navigateByUrl(UrlTree url, NavigationExtras extras /* optional */);
    /** 
      * Std Signature : S(navigateByUrl,88<27>,,P(dU(-1,678)))
      * TE Signature : S(navigateByUrl,P(dU(-1,678)))
      * 
     */
    public native Promise<Boolean> navigateByUrl(UnionOfStringAndUrlTree url);
    /** 
      * Std Signature : S(navigateByUrl,88<27>,,P(dU(-1,678)),P(d689))
      * TE Signature : S(navigateByUrl,P(dU(-1,678)),P(d689))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@8520
      * Navigate based on the provided url. This navigation is always absolute.
      * 
      * Returns a promise that:
      * - resolves to 'true' when navigation succeeds,
      * - resolves to 'false' when navigation fails,
      * - is rejected when an error happens.
      * 
      * ### Usage
      * 
      * ```
      * router.navigateByUrl("/team/33/user/11");
      * 
      * // Navigate without updating the URL
      * router.navigateByUrl("/team/33/user/11", { skipLocationChange: true });
      * ```
      * 
      * In opposite to `navigate`, `navigateByUrl` takes a whole URL
      * and does not apply any delta to the current one.
     */
    public native Promise<Boolean> navigateByUrl(UnionOfStringAndUrlTree url, NavigationExtras extras /* optional */);
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@6062
     */
    public native void ngOnDestroy();
    /** 
      * Std Signature : S(parseUrl,678,,P(d1))
      * TE Signature : S(parseUrl,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9571
      * Parses a string into a {@link UrlTree} 
     */
    public native UrlTree parseUrl(String url);
    /** 
      * Std Signature : S(processNavigations,3,,)
      * TE Signature : S(processNavigations,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9755
     */
    public native Object processNavigations();
    /** 
      * Std Signature : S(removeEmptyProps,3,,P(d3))
      * TE Signature : S(removeEmptyProps,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9717
     */
    public native Object removeEmptyProps(Object params);
    /** 
      * Std Signature : S(resetConfig,429,,P(d7<677>))
      * TE Signature : S(resetConfig,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@5995
      * Resets the configuration used for navigation and generating links.
      * 
      * ### Usage
      * 
      * ```
      * router.resetConfig([
      *   { path: 'team/:id', component: TeamCmp, children: [
      *     { path: 'simple', component: SimpleCmp },
      *     { path: 'user/:name', component: UserCmp }
      *   ]}
      * ]);
      * ```
     */
    public native void resetConfig(Array<Route> config);
    /** 
      * Std Signature : S(resetUrlToCurrentUrlTree,3,,)
      * TE Signature : S(resetUrlToCurrentUrlTree,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10025
     */
    public native Object resetUrlToCurrentUrlTree();
    /** 
      * Std Signature : S(runNavigate,3,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(runNavigate,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9924
     */
    public native Object runNavigate(Object url, Object rawUrl, Object shouldPreventPushState, Object shouldReplaceUrl, Object id, Object precreatedState);
    /** 
      * Std Signature : S(scheduleNavigation,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(scheduleNavigation,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9789
     */
    public native Object scheduleNavigation(Object rawUrl, Object source, Object extras);
    /** 
      * Std Signature : S(serializeUrl,1,,P(d678))
      * TE Signature : S(serializeUrl,P(d678))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@9481
      * Serializes a {@link UrlTree} into a string 
     */
    public native String serializeUrl(UrlTree url);
    /** 
      * Std Signature : S(setUpLocationChangeListener,429,,)
      * TE Signature : S(setUpLocationChangeListener,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@5387
      * Sets up the location change listener.
     */
    public native void setUpLocationChangeListener();
}
