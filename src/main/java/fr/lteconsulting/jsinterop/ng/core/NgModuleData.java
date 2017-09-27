package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".NgModuleData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:8790
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="NgModuleData")
public class NgModuleData implements Injector, NgModuleRef<Object>
{

    /*
        Properties
    */

    public NgModuleDefinition _def;

    @JsProperty( name = "_def")
    public native NgModuleDefinition get_def();

    @JsProperty( name = "_def")
    public native void set_def( NgModuleDefinition value );

    public Injector _parent;

    @JsProperty( name = "_parent")
    public native Injector get_parent();

    @JsProperty( name = "_parent")
    public native void set_parent( Injector value );

    public Array<Object> _providers;

    @JsProperty( name = "_providers")
    public native Array<Object> get_providers();

    @JsProperty( name = "_providers")
    public native void set_providers( Array<Object> value );

    /** 
      * The ComponentFactoryResolver to get hold of the ComponentFactories
      * declared in the `entryComponents` property of the module.
     */
    public ComponentFactoryResolver componentFactoryResolver;

    @JsProperty( name = "componentFactoryResolver")
    public native ComponentFactoryResolver getComponentFactoryResolver();

    @JsProperty( name = "componentFactoryResolver")
    public native void setComponentFactoryResolver( ComponentFactoryResolver value );

    /** 
      * The injector that contains all of the providers of the NgModule.
     */
    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

    /** 
      * The NgModule instance.
     */
    public Object instance;

    @JsProperty( name = "instance")
    public native Object getInstance();

    @JsProperty( name = "instance")
    public native void setInstance( Object value );

    /** 
      * Allows to register a callback that will be called when the module is destroyed.
     */
    public Action1<Action> onDestroy;

    @JsProperty( name = "onDestroy")
    public native Action1<Action> getOnDestroy();

    @JsProperty( name = "onDestroy")
    public native void setOnDestroy( Action1<Action> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void destroy();
    /** 
      * Std Signature : S(get,3,,P(d3))
      * TE Signature : S(get,P(d3))
      * 
     */
    public native Object get(Object token);
    /** 
      * Std Signature : S(get,3,,P(d3),P(d3))
      * TE Signature : S(get,P(d3),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object get(Object token, Object notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(d329<T->))
      * TE Signature : S(get,P(d329))
      * 
     */
    public native <T> T get(Type<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(d329<T->),P(dT-))
      * TE Signature : S(get,P(d329),P(d3))
      * 
     */
    public native <T> T get(Type<T> token, T notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(d331<T->))
      * TE Signature : S(get,P(d331))
      * 
     */
    public native <T> T get(InjectionToken<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(d331<T->),P(dT-))
      * TE Signature : S(get,P(d331),P(d3))
      * 
     */
    public native <T> T get(InjectionToken<T> token, T notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(dU(T-331<T->,329<5>)))
      * TE Signature : S(get,P(dU(-331,329)))
      * 
     */
    public native <T> T get(UnionOfInjectionTokenOfTAndTypeOfT<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(dU(T-331<T->,329<5>)),P(dT-))
      * TE Signature : S(get,P(dU(-331,329)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T> T get(UnionOfInjectionTokenOfTAndTypeOfT<T> token, T notFoundValue /* optional */);
}
