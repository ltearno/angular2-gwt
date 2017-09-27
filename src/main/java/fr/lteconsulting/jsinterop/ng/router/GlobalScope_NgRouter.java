package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.UnionOfObjectAndRouterInitializer;
import fr.lteconsulting.jsinterop.browser.*;
import fr.lteconsulting.jsinterop.browser.Error;
import fr.lteconsulting.jsinterop.ng.common.Location;
import fr.lteconsulting.jsinterop.ng.common.PlatformLocation;
import fr.lteconsulting.jsinterop.ng.common.UnionOfHashLocationStrategyAndPathLocationStrategy;
import fr.lteconsulting.jsinterop.ng.core.*;
import fr.lteconsulting.jsinterop.ng.core.Compiler;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Action2;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.router (java fr.lteconsulting.jsinterop.ng.router) package
 */
@JsType(isNative=true, namespace="ng", name="router")
public class GlobalScope_NgRouter
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.router", name="ROUTES")
    public static InjectionToken<Array<Array<Route>>> ROUTES;

    @JsProperty(namespace="ng.router", name="ROUTER_CONFIGURATION")
    public static InjectionToken<ExtraOptions> ROUTER_CONFIGURATION;

    @JsProperty(namespace="ng.router", name="ROUTER_FORROOT_GUARD")
    public static InjectionToken<Void> ROUTER_FORROOT_GUARD;

    @JsProperty(namespace="ng.router", name="ROUTER_PROVIDERS")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> ROUTER_PROVIDERS;

    @JsProperty(namespace="ng.router", name="ROUTER_INITIALIZER")
    public static InjectionToken<Action1<ComponentRef<Object>>> ROUTER_INITIALIZER;

    @JsProperty(namespace="ng.router", name="VERSION")
    public static Version VERSION;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.router", name = "convertToParamMap")
    public static native ParamMap convertToParamMap(AnonymousType717 params);
    @JsMethod(namespace="ng.router", name = "navigationCancelingError")
    public static native Error navigationCancelingError(String message);
    @JsMethod(namespace="ng.router", name = "isNavigationCancelingError")
    public static native Object isNavigationCancelingError(Error error);
    @JsMethod(namespace="ng.router", name = "defaultUrlMatcher")
    public static native Object defaultUrlMatcher(Array<UrlSegment> segments, UrlSegmentGroup segmentGroup, Route route);
    @JsMethod(namespace="ng.router", name = "createEmptyUrlTree")
    public static native UrlTree createEmptyUrlTree();
    @JsMethod(namespace="ng.router", name = "containsTree")
    public static native Boolean containsTree(UrlTree container, UrlTree containee, Boolean exact);
    @JsMethod(namespace="ng.router", name = "equalSegments")
    public static native Boolean equalSegments(Array<UrlSegment> as, Array<UrlSegment> bs);
    @JsMethod(namespace="ng.router", name = "equalPath")
    public static native Boolean equalPath(Array<UrlSegment> as, Array<UrlSegment> bs);
    @JsMethod(namespace="ng.router", name = "mapChildrenIntoArray")
    public static native <T> Array<T> mapChildrenIntoArray(UrlSegmentGroup segment, Function2<UrlSegmentGroup, String, Array<T>> fn);
    @JsMethod(namespace="ng.router", name = "serializePaths")
    public static native String serializePaths(UrlSegmentGroup segment);
    @JsMethod(namespace="ng.router", name = "encode")
    public static native String encode(String s);
    @JsMethod(namespace="ng.router", name = "decode")
    public static native String decode(String s);
    @JsMethod(namespace="ng.router", name = "serializePath")
    public static native String serializePath(UrlSegment path);
    @JsMethod(namespace="ng.router", name = "validateConfig")
    public static native void validateConfig(Array<Route> config, String parentPath /* optional */);
    @JsMethod(namespace="ng.router", name = "createEmptyState")
    public static native RouterState createEmptyState(UrlTree urlTree, Type<Object> rootComponent);
    @JsMethod(namespace="ng.router", name = "createEmptyStateSnapshot")
    public static native RouterStateSnapshot createEmptyStateSnapshot(UrlTree urlTree, Type<Object> rootComponent);
    @JsMethod(namespace="ng.router", name = "advanceActivatedRoute")
    public static native void advanceActivatedRoute(ActivatedRoute route);
    @JsMethod(namespace="ng.router", name = "equalParamsAndUrlSegments")
    public static native Boolean equalParamsAndUrlSegments(ActivatedRouteSnapshot a, ActivatedRouteSnapshot b);
    @JsMethod(namespace="ng.router", name = "routerNgProbeToken")
    public static native NgProbeToken routerNgProbeToken();
    @JsMethod(namespace="ng.router", name = "provideLocationStrategy")
    public static native UnionOfHashLocationStrategyAndPathLocationStrategy provideLocationStrategy(PlatformLocation platformLocationStrategy, String baseHref, ExtraOptions options /* optional */);
    @JsMethod(namespace="ng.router", name = "provideForRootGuard")
    public static native Object provideForRootGuard(Router router);
    @JsMethod(namespace="ng.router", name = "provideRoutes")
    public static native Object provideRoutes(Array<Route> routes);
    @JsMethod(namespace="ng.router", name = "setupRouter")
    public static native Router setupRouter(ApplicationRef ref, UrlSerializer urlSerializer, ChildrenOutletContexts contexts, Location location, Injector injector, NgModuleFactoryLoader loader, Compiler compiler, Array<Array<Route>> config, ExtraOptions opts /* optional */, UrlHandlingStrategy urlHandlingStrategy /* optional */, RouteReuseStrategy routeReuseStrategy /* optional */);
    @JsMethod(namespace="ng.router", name = "rootRoute")
    public static native ActivatedRoute rootRoute(Router router);
    @JsMethod(namespace="ng.router", name = "getAppInitializer")
    public static native Object getAppInitializer(RouterInitializer r);
    @JsMethod(namespace="ng.router", name = "getBootstrapListener")
    public static native Object getBootstrapListener(RouterInitializer r);
    @JsMethod(namespace="ng.router", name = "provideRouterInitializer")
    public static native Array<UnionOfObjectAndRouterInitializer> provideRouterInitializer();
    @JsMethod(namespace="ng.router", name = "shallowEqualArrays")
    public static native Boolean shallowEqualArrays(Array<Object> a, Array<Object> b);
    @JsMethod(namespace="ng.router", name = "shallowEqual")
    public static native Boolean shallowEqual(AnonymousType717 a, AnonymousType717 b);
    @JsMethod(namespace="ng.router", name = "flatten")
    public static native <T> Array<T> flatten(Array<Array<T>> arr);
    @JsMethod(namespace="ng.router", name = "last")
    public static native <T> T last(Array<T> a);
    @JsMethod(namespace="ng.router", name = "and")
    public static native Boolean and(Array<Boolean> bools);
    @JsMethod(namespace="ng.router", name = "forEach")
    public static native <K, V> void forEach(AnonymousType983<V> map, Action2<V, String> callback);
    @JsMethod(namespace="ng.router", name = "waitForMap")
    public static native <A, B> Observable<AnonymousType1463<B>> waitForMap(AnonymousType1464<A> obj, Function2<String, A, Observable<B>> fn);
    @JsMethod(namespace="ng.router", name = "andObservables")
    public static native Observable<Boolean> andObservables(Observable<Observable<Object>> observables);
    @JsMethod(namespace="ng.router", name = "wrapIntoObservable")
    //public static native <T> Observable<T> wrapIntoObservable(UnionOfNgModuleFactoryOfTAndObservableOfTAndPromiseOfTAndT<T> value);
    public static native <T> Observable<T> wrapIntoObservable(Object value);
    @JsMethod(namespace="ng.router", name = "applyRedirects")
    public static native Observable<UrlTree> applyRedirects(Injector moduleInjector, RouterConfigLoader configLoader, UrlSerializer urlSerializer, UrlTree urlTree, Array<Route> config);
    @JsMethod(namespace="ng.router", name = "createRouterState")
    public static native RouterState createRouterState(RouteReuseStrategy routeReuseStrategy, RouterStateSnapshot curr, RouterState prevState);
    @JsMethod(namespace="ng.router", name = "createUrlTree")
    public static native UrlTree createUrlTree(ActivatedRoute route, UrlTree urlTree, Array<Object> commands, AnonymousType717 queryParams, String fragment);
    @JsMethod(namespace="ng.router", name = "recognize")
    public static native Observable<RouterStateSnapshot> recognize(Type<Object> rootComponentType, Array<Route> config, UrlTree urlTree, String url);
}
