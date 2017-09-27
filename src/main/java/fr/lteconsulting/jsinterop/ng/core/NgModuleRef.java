package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsPackage;
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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NgModuleRef<T>
{

    /*
        Properties
    */

    /** 
      * The ComponentFactoryResolver to get hold of the ComponentFactories
      * declared in the `entryComponents` property of the module.
     */
    @JsProperty( name = "componentFactoryResolver")
    ComponentFactoryResolver getComponentFactoryResolver();

    @JsProperty( name = "componentFactoryResolver")
    void setComponentFactoryResolver( ComponentFactoryResolver value );

    /** 
      * The injector that contains all of the providers of the NgModule.
     */
    @JsProperty( name = "injector")
    Injector getInjector();

    @JsProperty( name = "injector")
    void setInjector( Injector value );

    /** 
      * The NgModule instance.
     */
    @JsProperty( name = "instance")
    T getInstance();

    @JsProperty( name = "instance")
    void setInstance( T value );

    /** 
      * Allows to register a callback that will be called when the module is destroyed.
     */
    @JsProperty( name = "onDestroy")
    Action1<Action> getOnDestroy();

    @JsProperty( name = "onDestroy")
    void setOnDestroy( Action1<Action> value );

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
    void destroy();
}
