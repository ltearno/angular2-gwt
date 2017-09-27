package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfObjectAndString;
import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link".RouterLink
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link.d.ts:505
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterLink")
public class RouterLink
{

    /*
        Constructors
    */
    public RouterLink(Router router, ActivatedRoute route, String tabIndex, Renderer2 renderer, ElementRef el){
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

    public Function<Boolean> onClick;

    @JsProperty( name = "onClick")
    public native Function<Boolean> getOnClick();

    @JsProperty( name = "onClick")
    public native void setOnClick( Function<Boolean> value );

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

    public UrlTree urlTree;

    @JsProperty( name = "urlTree")
    public native UrlTree getUrlTree();

    @JsProperty( name = "urlTree")
    public native void setUrlTree( UrlTree value );
}
