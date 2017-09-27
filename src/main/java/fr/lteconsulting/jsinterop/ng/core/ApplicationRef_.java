package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref".ApplicationRef_
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts:8648
  * 1 constructors
  * workaround https://github.com/angular/tsickle/issues/350
 */
@JsType(isNative=true, namespace="ng.core", name="ApplicationRef_")
public class ApplicationRef_ extends ApplicationRef
{

    /*
        Constructors
    */
    public ApplicationRef_(NgZone _zone, Console _console, Injector _injector, ErrorHandler _exceptionHandler, ComponentFactoryResolver _componentFactoryResolver, ApplicationInitStatus _initStatus){
    }

    /*
        Properties
    */

    public Object _bootstrapListeners;

    @JsProperty( name = "_bootstrapListeners")
    public native Object get_bootstrapListeners();

    @JsProperty( name = "_bootstrapListeners")
    public native void set_bootstrapListeners( Object value );

    public Object _componentFactoryResolver;

    @JsProperty( name = "_componentFactoryResolver")
    public native Object get_componentFactoryResolver();

    @JsProperty( name = "_componentFactoryResolver")
    public native void set_componentFactoryResolver( Object value );

    public Object _console;

    @JsProperty( name = "_console")
    public native Object get_console();

    @JsProperty( name = "_console")
    public native void set_console( Object value );

    public Object _enforceNoNewChanges;

    @JsProperty( name = "_enforceNoNewChanges")
    public native Object get_enforceNoNewChanges();

    @JsProperty( name = "_enforceNoNewChanges")
    public native void set_enforceNoNewChanges( Object value );

    public Object _exceptionHandler;

    @JsProperty( name = "_exceptionHandler")
    public native Object get_exceptionHandler();

    @JsProperty( name = "_exceptionHandler")
    public native void set_exceptionHandler( Object value );

    public Object _initStatus;

    @JsProperty( name = "_initStatus")
    public native Object get_initStatus();

    @JsProperty( name = "_initStatus")
    public native void set_initStatus( Object value );

    public Object _injector;

    @JsProperty( name = "_injector")
    public native Object get_injector();

    @JsProperty( name = "_injector")
    public native void set_injector( Object value );

    public Object _isStable;

    @JsProperty( name = "_isStable")
    public native Object get_isStable();

    @JsProperty( name = "_isStable")
    public native void set_isStable( Object value );

    public Object _rootComponentTypes;

    @JsProperty( name = "_rootComponentTypes")
    public native Object get_rootComponentTypes();

    @JsProperty( name = "_rootComponentTypes")
    public native void set_rootComponentTypes( Object value );

    public Object _rootComponents;

    @JsProperty( name = "_rootComponents")
    public native Object get_rootComponents();

    @JsProperty( name = "_rootComponents")
    public native void set_rootComponents( Object value );

    public Object _runningTick;

    @JsProperty( name = "_runningTick")
    public native Object get_runningTick();

    @JsProperty( name = "_runningTick")
    public native void set_runningTick( Object value );

    public Object _stable;

    @JsProperty( name = "_stable")
    public native Object get_stable();

    @JsProperty( name = "_stable")
    public native void set_stable( Object value );

    public Object _views;

    @JsProperty( name = "_views")
    public native Object get_views();

    @JsProperty( name = "_views")
    public native void set_views( Object value );

    public Object _zone;

    @JsProperty( name = "_zone")
    public native Object get_zone();

    @JsProperty( name = "_zone")
    public native void set_zone( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_loadComponent,3,,P(d3))
      * TE Signature : S(_loadComponent,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@9582
     */
    public native Object _loadComponent(Object componentRef);
    /** 
      * Std Signature : S(_unloadComponent,3,,P(d3))
      * TE Signature : S(_unloadComponent,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@9624
     */
    public native Object _unloadComponent(Object componentRef);
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@9686
     */
    public native void ngOnDestroy();
}
