package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.browser.UnionOfObjectAndArrayOfObject;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref".PlatformRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts:3076

  * The Angular platform is the entry point for Angular on a web page. Each page
  * has exactly one platform, and services (such as reflection) which are common
  * to every Angular application running on the page are bound in its scope.
  * 
  * A page's platform is initialized implicitly when a platform is created via a platform factory
  * (e.g. {@link platformBrowser}), or explicitly by calling the {@link createPlatform} function.
 */
@JsType(isNative=true, namespace="ng.core", name="PlatformRef")
public class PlatformRef
{

    /*
        Properties
    */

    public Boolean destroyed;

    @JsProperty( name = "destroyed")
    public native Boolean getDestroyed();

    @JsProperty( name = "destroyed")
    public native void setDestroyed( Boolean value );

    /** 
      * Retrieve the platform {@link Injector}, which is the parent injector for
      * every Angular application on the page and provides singleton providers.
     */
    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

    /** 
      * Register a listener to be called when the platform is disposed.
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
      * Std Signature : S(bootstrapModule,88<371<M->>,M-,P(d329<M->))
      * TE Signature : S(bootstrapModule,P(d329))
      * 
     */

    public native <M> Promise<NgModuleRef<M>> bootstrapModule(Type<M> moduleType);
    /** 
      * Std Signature : S(bootstrapModule,88<371<M->>,M-,P(d329<M->),P(d3))
      * TE Signature : S(bootstrapModule,P(d329),P(d3))
      * 
     */
    public native <M> Promise<NgModuleRef<M>> bootstrapModule(Type<M> moduleType, Object compilerOptions /* optional */);
    /** 
      * Std Signature : S(bootstrapModule,88<371<M->>,M-,P(d329<M->),P(d7<3>))
      * TE Signature : S(bootstrapModule,P(d329),P(d7))
      * 
     */
    public native <M> Promise<NgModuleRef<M>> bootstrapModule(Type<M> moduleType, Array<Object> compilerOptions /* optional */);
    /** 
      * Std Signature : S(bootstrapModule,88<371<M->>,M-,P(d329<M->),P(dU(-3,7<2>)))
      * TE Signature : S(bootstrapModule,P(d329),P(dU(-3,7)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@4686
      * Creates an instance of an `@NgModule` for a given platform using the given runtime compiler.
      * 
      * ## Simple Example
      * 
      * ```typescript
     */
    public native <M> Promise<NgModuleRef<M>> bootstrapModule(Type<M> moduleType, UnionOfObjectAndArrayOfObject compilerOptions /* optional */);
    /** 
      * Std Signature : S(bootstrapModuleFactory,88<371<M->>,M-,P(d376<M->))
      * TE Signature : S(bootstrapModuleFactory,P(d376))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@4221
      * Creates an instance of an `@NgModule` for the given platform
      * for offline compilation.
      * 
      * ## Simple Example
      * 
      * ```typescript
      * my_module.ts:
     */
    public native <M> Promise<NgModuleRef<M>> bootstrapModuleFactory(NgModuleFactory<M> moduleFactory);
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@5270
      * Destroy the Angular platform and all Angular applications on the page.
     */
    public native void destroy();
}
