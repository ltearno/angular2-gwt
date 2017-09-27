package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfObjectAndString;
import fr.lteconsulting.jsinterop.ng.common.LocationStrategy;
import fr.lteconsulting.jsinterop.ng.core.OnChanges;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.SimpleChanges;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link".RouterLinkWithHref
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link.d.ts:3894
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterLinkWithHref")
public class RouterLinkWithHref implements OnChanges, OnDestroy
{

    /*
        Constructors
    */
    public RouterLinkWithHref(Router router, ActivatedRoute route, LocationStrategy locationStrategy){
    }

    /*
        Properties
    */

    public Object commands;

    @JsProperty( name = "commands")
    public native Object getCommands();

    @JsProperty( name = "commands")
    public native void setCommands( Object value );

    public String fragment;

    @JsProperty( name = "fragment")
    public native String getFragment();

    @JsProperty( name = "fragment")
    public native void setFragment( String value );

    public String href;

    @JsProperty( name = "href")
    public native String getHref();

    @JsProperty( name = "href")
    public native void setHref( String value );

    public Object locationStrategy;

    @JsProperty( name = "locationStrategy")
    public native Object getLocationStrategy();

    @JsProperty( name = "locationStrategy")
    public native void setLocationStrategy( Object value );

    public Function4<Number, Boolean, Boolean, Boolean, Boolean> onClick;

    @JsProperty( name = "onClick")
    public native Function4<Number, Boolean, Boolean, Boolean, Boolean> getOnClick();

    @JsProperty( name = "onClick")
    public native void setOnClick( Function4<Number, Boolean, Boolean, Boolean, Boolean> value );

    public Object preserve;

    @JsProperty( name = "preserve")
    public native Object getPreserve();

    @JsProperty( name = "preserve")
    public native void setPreserve( Object value );

    public Boolean preserveFragment;

    @JsProperty( name = "preserveFragment")
    public native Boolean getPreserveFragment();

    @JsProperty( name = "preserveFragment")
    public native void setPreserveFragment( Boolean value );

    public Boolean preserveQueryParams;

    @JsProperty( name = "preserveQueryParams")
    public native Boolean getPreserveQueryParams();

    @JsProperty( name = "preserveQueryParams")
    public native void setPreserveQueryParams( Boolean value );

    public AnonymousType717 queryParams;

    @JsProperty( name = "queryParams")
    public native AnonymousType717 getQueryParams();

    @JsProperty( name = "queryParams")
    public native void setQueryParams( AnonymousType717 value );

    public String queryParamsHandling;

    @JsProperty( name = "queryParamsHandling")
    public native String getQueryParamsHandling();

    @JsProperty( name = "queryParamsHandling")
    public native void setQueryParamsHandling( String value );

    public Boolean replaceUrl;

    @JsProperty( name = "replaceUrl")
    public native Boolean getReplaceUrl();

    @JsProperty( name = "replaceUrl")
    public native void setReplaceUrl( Boolean value );

    public Object route;

    @JsProperty( name = "route")
    public native Object getRoute();

    @JsProperty( name = "route")
    public native void setRoute( Object value );

    public Object router;

    @JsProperty( name = "router")
    public native Object getRouter();

    @JsProperty( name = "router")
    public native void setRouter( Object value );

    public UnionOfArrayOfObjectAndString routerLink;

    @JsProperty( name = "routerLink")
    public native UnionOfArrayOfObjectAndString getRouterLink();

    @JsProperty( name = "routerLink")
    public native void setRouterLink( UnionOfArrayOfObjectAndString value );

    @JsOverlay
    public final void setRouterLink( Array<Object> value ) { setRouterLink(UnionOfArrayOfObjectAndString.ofArrayOfObject( value )); }

    @JsOverlay
    public final void setRouterLink( String value ) { setRouterLink(UnionOfArrayOfObjectAndString.ofString( value )); }

    public Boolean skipLocationChange;

    @JsProperty( name = "skipLocationChange")
    public native Boolean getSkipLocationChange();

    @JsProperty( name = "skipLocationChange")
    public native void setSkipLocationChange( Boolean value );

    public Object subscription;

    @JsProperty( name = "subscription")
    public native Object getSubscription();

    @JsProperty( name = "subscription")
    public native void setSubscription( Object value );

    public String target;

    @JsProperty( name = "target")
    public native String getTarget();

    @JsProperty( name = "target")
    public native void setTarget( String value );

    public UrlTree urlTree;

    @JsProperty( name = "urlTree")
    public native UrlTree getUrlTree();

    @JsProperty( name = "urlTree")
    public native void setUrlTree( UrlTree value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(ngOnChanges,3,,P(d3))
      * TE Signature : S(ngOnChanges,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link.d.ts@4679
     */
    public native Object ngOnChanges(Object changes);
    /** 
      * Std Signature : S(ngOnChanges,429,,P(d346))
      * TE Signature : S(ngOnChanges,P(d346))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnChanges(SimpleChanges changes);
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
      * Std Signature : S(updateTargetUrlAndHref,3,,)
      * TE Signature : S(updateTargetUrlAndHref,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link.d.ts@4831
     */
    public native Object updateTargetUrlAndHref();
}
