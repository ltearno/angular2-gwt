package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.ng.core.ChangeDetectorRef;
import fr.lteconsulting.jsinterop.ng.core.ComponentFactoryResolver;
import fr.lteconsulting.jsinterop.ng.core.ComponentRef;
import fr.lteconsulting.jsinterop.ng.core.EventEmitter;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.OnInit;
import fr.lteconsulting.jsinterop.ng.core.ViewContainerRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_outlet".RouterOutlet
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_outlet.d.ts:471
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterOutlet")
public class RouterOutlet implements OnDestroy, OnInit
{

    /*
        Constructors
    */
    public RouterOutlet(ChildrenOutletContexts parentContexts, ViewContainerRef location, ComponentFactoryResolver resolver, String name, ChangeDetectorRef changeDetector){
    }

    /*
        Properties
    */

    public Object _activatedRoute;

    @JsProperty( name = "_activatedRoute")
    public native Object get_activatedRoute();

    @JsProperty( name = "_activatedRoute")
    public native void set_activatedRoute( Object value );

    public EventEmitter<Object> activateEvents;

    @JsProperty( name = "activateEvents")
    public native EventEmitter<Object> getActivateEvents();

    @JsProperty( name = "activateEvents")
    public native void setActivateEvents( EventEmitter<Object> value );

    public Object activated;

    @JsProperty( name = "activated")
    public native Object getActivated();

    @JsProperty( name = "activated")
    public native void setActivated( Object value );

    public ActivatedRoute activatedRoute;

    @JsProperty( name = "activatedRoute")
    public native ActivatedRoute getActivatedRoute();

    @JsProperty( name = "activatedRoute")
    public native void setActivatedRoute( ActivatedRoute value );

    public AnonymousType717 activatedRouteData;

    @JsProperty( name = "activatedRouteData")
    public native AnonymousType717 getActivatedRouteData();

    @JsProperty( name = "activatedRouteData")
    public native void setActivatedRouteData( AnonymousType717 value );

    public Object changeDetector;

    @JsProperty( name = "changeDetector")
    public native Object getChangeDetector();

    @JsProperty( name = "changeDetector")
    public native void setChangeDetector( Object value );

    public Object component;

    @JsProperty( name = "component")
    public native Object getComponent();

    @JsProperty( name = "component")
    public native void setComponent( Object value );

    public EventEmitter<Object> deactivateEvents;

    @JsProperty( name = "deactivateEvents")
    public native EventEmitter<Object> getDeactivateEvents();

    @JsProperty( name = "deactivateEvents")
    public native void setDeactivateEvents( EventEmitter<Object> value );

    public Boolean isActivated;

    @JsProperty( name = "isActivated")
    public native Boolean getIsActivated();

    @JsProperty( name = "isActivated")
    public native void setIsActivated( Boolean value );

    public Object location;

    @JsProperty( name = "location")
    public native Object getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Object value );

    public ComponentFactoryResolver locationFactoryResolver;

    @JsProperty( name = "locationFactoryResolver")
    public native ComponentFactoryResolver getLocationFactoryResolver();

    @JsProperty( name = "locationFactoryResolver")
    public native void setLocationFactoryResolver( ComponentFactoryResolver value );

    public Injector locationInjector;

    @JsProperty( name = "locationInjector")
    public native Injector getLocationInjector();

    @JsProperty( name = "locationInjector")
    public native void setLocationInjector( Injector value );

    public Object name;

    @JsProperty( name = "name")
    public native Object getName();

    @JsProperty( name = "name")
    public native void setName( Object value );

    public Object parentContexts;

    @JsProperty( name = "parentContexts")
    public native Object getParentContexts();

    @JsProperty( name = "parentContexts")
    public native void setParentContexts( Object value );

    public Object resolver;

    @JsProperty( name = "resolver")
    public native Object getResolver();

    @JsProperty( name = "resolver")
    public native void setResolver( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(activateWith,429,,P(d681),P(d372))
      * TE Signature : S(activateWith,P(d681),P(d372))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_outlet.d.ts@2297
     */
    public native void activateWith(ActivatedRoute activatedRoute, ComponentFactoryResolver resolver);
    /** 
      * Std Signature : S(attach,429,,P(d382<3>),P(d681))
      * TE Signature : S(attach,P(d382),P(d681))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_outlet.d.ts@2199
      * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
     */
    public native void attach(ComponentRef<Object> ref, ActivatedRoute activatedRoute);
    /** 
      * Std Signature : S(deactivate,429,,)
      * TE Signature : S(deactivate,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_outlet.d.ts@2273
     */
    public native void deactivate();
    /** 
      * Std Signature : S(detach,382<3>,,)
      * TE Signature : S(detach,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/directives/router_outlet.d.ts@2053
      * Called when the `RouteReuseStrategy` instructs to detach the subtree
     */
    public native ComponentRef<Object> detach();
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
      * Std Signature : S(ngOnInit,429,,)
      * TE Signature : S(ngOnInit,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnInit();
}
