package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/route_reuse_strategy".RouteReuseStrategy
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/route_reuse_strategy.d.ts:300
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="RouteReuseStrategy")
public class RouteReuseStrategy
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(retrieve,3,,P(d682))
      * TE Signature : S(retrieve,P(d682))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/route_reuse_strategy.d.ts@1033
      * Retrieves the previously stored route 
     */
    public native Object retrieve(ActivatedRouteSnapshot route);
    /** 
      * Std Signature : S(shouldAttach,27,,P(d682))
      * TE Signature : S(shouldAttach,P(d682))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/route_reuse_strategy.d.ts@917
      * Determines if this route (and its subtree) should be reattached 
     */
    public native Boolean shouldAttach(ActivatedRouteSnapshot route);
    /** 
      * Std Signature : S(shouldDetach,27,,P(d682))
      * TE Signature : S(shouldDetach,P(d682))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/route_reuse_strategy.d.ts@553
      * Determines if this route (and its subtree) should be detached to be reused later 
     */
    public native Boolean shouldDetach(ActivatedRouteSnapshot route);
    /** 
      * Std Signature : S(shouldReuseRoute,27,,P(d682),P(d682))
      * TE Signature : S(shouldReuseRoute,P(d682),P(d682))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/route_reuse_strategy.d.ts@1165
      * Determines if a route should be reused 
     */
    public native Boolean shouldReuseRoute(ActivatedRouteSnapshot future, ActivatedRouteSnapshot curr);
    /** 
      * Std Signature : S(store,429,,P(d682),P(d3))
      * TE Signature : S(store,P(d682),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/route_reuse_strategy.d.ts@749
      * Stores the detached route.
      * 
      * Storing a `null` value should erase the previously stored value.
     */
    public native void store(ActivatedRouteSnapshot route, Object handle);
}
