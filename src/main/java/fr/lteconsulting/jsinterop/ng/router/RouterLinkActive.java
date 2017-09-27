package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfStringAndString;
import fr.lteconsulting.jsinterop.ng.core.AfterContentInit;
import fr.lteconsulting.jsinterop.ng.core.ChangeDetectorRef;
import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.OnChanges;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.QueryList;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import fr.lteconsulting.jsinterop.ng.core.SimpleChanges;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link_active".RouterLinkActive
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link_active.d.ts:442
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterLinkActive")
public class RouterLinkActive extends AfterContentInit implements OnChanges, OnDestroy
{

    /*
        Constructors
    */
    public RouterLinkActive(Router router, ElementRef element, Renderer2 renderer, ChangeDetectorRef cdr){
    }

    /*
        Properties
    */

    public Object active;

    @JsProperty( name = "active")
    public native Object getActive();

    @JsProperty( name = "active")
    public native void setActive( Object value );

    public Object cdr;

    @JsProperty( name = "cdr")
    public native Object getCdr();

    @JsProperty( name = "cdr")
    public native void setCdr( Object value );

    public Object classes;

    @JsProperty( name = "classes")
    public native Object getClasses();

    @JsProperty( name = "classes")
    public native void setClasses( Object value );

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public Boolean isActive;

    @JsProperty( name = "isActive")
    public native Boolean getIsActive();

    @JsProperty( name = "isActive")
    public native void setIsActive( Boolean value );

    public QueryList<RouterLink> links;

    @JsProperty( name = "links")
    public native QueryList<RouterLink> getLinks();

    @JsProperty( name = "links")
    public native void setLinks( QueryList<RouterLink> value );

    public QueryList<RouterLinkWithHref> linksWithHrefs;

    @JsProperty( name = "linksWithHrefs")
    public native QueryList<RouterLinkWithHref> getLinksWithHrefs();

    @JsProperty( name = "linksWithHrefs")
    public native void setLinksWithHrefs( QueryList<RouterLinkWithHref> value );

    public Object renderer;

    @JsProperty( name = "renderer")
    public native Object getRenderer();

    @JsProperty( name = "renderer")
    public native void setRenderer( Object value );

    public Object router;

    @JsProperty( name = "router")
    public native Object getRouter();

    @JsProperty( name = "router")
    public native void setRouter( Object value );

    public UnionOfArrayOfStringAndString routerLinkActive;

    @JsProperty( name = "routerLinkActive")
    public native UnionOfArrayOfStringAndString getRouterLinkActive();

    @JsProperty( name = "routerLinkActive")
    public native void setRouterLinkActive( UnionOfArrayOfStringAndString value );

    @JsOverlay
    public final void setRouterLinkActive( Array<String> value ) { setRouterLinkActive(UnionOfArrayOfStringAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setRouterLinkActive( String value ) { setRouterLinkActive(UnionOfArrayOfStringAndString.ofString( value )); }

    public Object routerLinkActiveOptions;

    @JsProperty( name = "routerLinkActiveOptions")
    public native Object getRouterLinkActiveOptions();

    @JsProperty( name = "routerLinkActiveOptions")
    public native void setRouterLinkActiveOptions( Object value );

    public Object subscription;

    @JsProperty( name = "subscription")
    public native Object getSubscription();

    @JsProperty( name = "subscription")
    public native void setSubscription( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(hasActiveLinks,3,,)
      * TE Signature : S(hasActiveLinks,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link_active.d.ts@2959
     */
    public native Object hasActiveLinks();
    /** 
      * Std Signature : S(isLinkActive,3,,P(d3))
      * TE Signature : S(isLinkActive,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link_active.d.ts@2925
     */
    public native Object isLinkActive(Object router);
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
      * Std Signature : S(update,3,,)
      * TE Signature : S(update,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_link_active.d.ts@2903
     */
    public native Object update();
}
