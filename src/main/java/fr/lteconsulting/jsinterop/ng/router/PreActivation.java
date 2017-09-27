package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router".PreActivation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts:10062
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="PreActivation")
public class PreActivation
{

    /*
        Constructors
    */
    public PreActivation(RouterStateSnapshot future, RouterStateSnapshot curr, Injector moduleInjector){
    }

    /*
        Properties
    */

    public Object canActivateChecks;

    @JsProperty( name = "canActivateChecks")
    public native Object getCanActivateChecks();

    @JsProperty( name = "canActivateChecks")
    public native void setCanActivateChecks( Object value );

    public Object canDeactivateChecks;

    @JsProperty( name = "canDeactivateChecks")
    public native Object getCanDeactivateChecks();

    @JsProperty( name = "canDeactivateChecks")
    public native void setCanDeactivateChecks( Object value );

    public Object curr;

    @JsProperty( name = "curr")
    public native Object getCurr();

    @JsProperty( name = "curr")
    public native void setCurr( Object value );

    public Object future;

    @JsProperty( name = "future")
    public native Object getFuture();

    @JsProperty( name = "future")
    public native void setFuture( Object value );

    public Object moduleInjector;

    @JsProperty( name = "moduleInjector")
    public native Object getModuleInjector();

    @JsProperty( name = "moduleInjector")
    public native void setModuleInjector( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(checkGuards,357<27>,,)
      * TE Signature : S(checkGuards,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10393
     */
    public native Observable<Boolean> checkGuards();
    /** 
      * Std Signature : S(deactivateRouteAndItsChildren,3,,P(d3),P(d3))
      * TE Signature : S(deactivateRouteAndItsChildren,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10745
     */
    public native Object deactivateRouteAndItsChildren(Object route, Object context);
    /** 
      * Std Signature : S(extractCanActivateChild,3,,P(d3))
      * TE Signature : S(extractCanActivateChild,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10953
     */
    public native Object extractCanActivateChild(Object p);
    /** 
      * Std Signature : S(getResolver,3,,P(d3),P(d3))
      * TE Signature : S(getResolver,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@11114
     */
    public native Object getResolver(Object injectionToken, Object future);
    /** 
      * Std Signature : S(getToken,3,,P(d3),P(d3))
      * TE Signature : S(getToken,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@11163
     */
    public native Object getToken(Object token, Object snapshot);
    /** 
      * Std Signature : S(isActivating,27,,)
      * TE Signature : S(isActivating,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10500
     */
    public native Boolean isActivating();
    /** 
      * Std Signature : S(isDeactivating,27,,)
      * TE Signature : S(isDeactivating,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10469
     */
    public native Boolean isDeactivating();
    /** 
      * Std Signature : S(resolveData,357<3>,,)
      * TE Signature : S(resolveData,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10433
     */
    public native Observable<Object> resolveData();
    /** 
      * Std Signature : S(resolveNode,3,,P(d3),P(d3))
      * TE Signature : S(resolveNode,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@11072
     */
    public native Object resolveNode(Object resolve, Object future);
    /** 
      * Std Signature : S(runCanActivate,3,,P(d3))
      * TE Signature : S(runCanActivate,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10878
     */
    public native Object runCanActivate(Object future);
    /** 
      * Std Signature : S(runCanActivateChecks,3,,)
      * TE Signature : S(runCanActivateChecks,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10842
     */
    public native Object runCanActivateChecks();
    /** 
      * Std Signature : S(runCanActivateChild,3,,P(d3))
      * TE Signature : S(runCanActivateChild,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10914
     */
    public native Object runCanActivateChild(Object path);
    /** 
      * Std Signature : S(runCanDeactivate,3,,P(d3),P(d3))
      * TE Signature : S(runCanDeactivate,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10993
     */
    public native Object runCanDeactivate(Object component, Object curr);
    /** 
      * Std Signature : S(runCanDeactivateChecks,3,,)
      * TE Signature : S(runCanDeactivateChecks,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10804
     */
    public native Object runCanDeactivateChecks();
    /** 
      * Std Signature : S(runResolve,3,,P(d3))
      * TE Signature : S(runResolve,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@11040
     */
    public native Object runResolve(Object future);
    /** 
      * Std Signature : S(shouldRunGuardsAndResolvers,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(shouldRunGuardsAndResolvers,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10684
     */
    public native Object shouldRunGuardsAndResolvers(Object curr, Object future, Object mode);
    /** 
      * Std Signature : S(traverse,429,,P(d685))
      * TE Signature : S(traverse,P(d685))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10333
     */
    public native void traverse(ChildrenOutletContexts parentContexts);
    /** 
      * Std Signature : S(traverseChildRoutes,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(traverseChildRoutes,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10529
     */
    public native Object traverseChildRoutes(Object futureNode, Object currNode, Object contexts, Object futurePath);
    /** 
      * Std Signature : S(traverseRoutes,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(traverseRoutes,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@10606
     */
    public native Object traverseRoutes(Object futureNode, Object currNode, Object parentContexts, Object futurePath);
}
