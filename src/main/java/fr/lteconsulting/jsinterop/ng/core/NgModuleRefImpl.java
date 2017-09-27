package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory".NgModuleRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory.d.ts:350

  * Represents an instance of an NgModule created via a {@link NgModuleFactory}.
  * 
  * `NgModuleRef` provides access to the NgModule Instance as well other objects related to this
  * NgModule Instance.
 */
@JsType(isNative=true, namespace="ng.core", name="NgModuleRef")
public class NgModuleRefImpl<T> implements NgModuleRef<T>
{

    /*
        Properties
    */

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
    public T instance;

    @JsProperty( name = "instance")
    public native T getInstance();

    @JsProperty( name = "instance")
    public native void setInstance( T value );

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
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory.d.ts@1168
      * Destroys the module instance and all of the data structures associated with it.
     */
    public native void destroy();
}
