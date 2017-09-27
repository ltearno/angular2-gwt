package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref".PlatformRef_
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts:5339
  * 1 constructors
  * workaround https://github.com/angular/tsickle/issues/350
 */
@JsType(isNative=true, namespace="ng.core", name="PlatformRef_")
public class PlatformRef_ extends PlatformRef
{

    /*
        Constructors
    */
    public PlatformRef_(Injector _injector){
    }

    /*
        Properties
    */

    public Object _destroyListeners;

    @JsProperty( name = "_destroyListeners")
    public native Object get_destroyListeners();

    @JsProperty( name = "_destroyListeners")
    public native void set_destroyListeners( Object value );

    public Object _destroyed;

    @JsProperty( name = "_destroyed")
    public native Object get_destroyed();

    @JsProperty( name = "_destroyed")
    public native void set_destroyed( Object value );

    public Object _injector;

    @JsProperty( name = "_injector")
    public native Object get_injector();

    @JsProperty( name = "_injector")
    public native void set_injector( Object value );

    public Object _modules;

    @JsProperty( name = "_modules")
    public native Object get_modules();

    @JsProperty( name = "_modules")
    public native void set_modules( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_bootstrapModuleFactoryWithZone,3,M-,P(d3))
      * TE Signature : S(_bootstrapModuleFactoryWithZone,P(d3))
      * 
     */
    public native <M> Object _bootstrapModuleFactoryWithZone(Object moduleFactory);
    /** 
      * Std Signature : S(_bootstrapModuleFactoryWithZone,3,M-,P(d3),P(d3))
      * TE Signature : S(_bootstrapModuleFactoryWithZone,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@5853
     */
    public native <M> Object _bootstrapModuleFactoryWithZone(Object moduleFactory, Object ngZone /* optional */);
    /** 
      * Std Signature : S(_bootstrapModuleWithZone,3,M-,P(d3))
      * TE Signature : S(_bootstrapModuleWithZone,P(d3))
      * 
     */
    public native <M> Object _bootstrapModuleWithZone(Object moduleType);
    /** 
      * Std Signature : S(_bootstrapModuleWithZone,3,M-,P(d3),P(d3))
      * TE Signature : S(_bootstrapModuleWithZone,P(d3),P(d3))
      * 
     */
    public native <M> Object _bootstrapModuleWithZone(Object moduleType, Object compilerOptions /* optional */);
    /** 
      * Std Signature : S(_bootstrapModuleWithZone,3,M-,P(d3),P(d3),P(d3))
      * TE Signature : S(_bootstrapModuleWithZone,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@6050
     */
    public native <M> Object _bootstrapModuleWithZone(Object moduleType, Object compilerOptions /* optional */, Object ngZone /* optional */);
    /** 
      * Std Signature : S(_moduleDoBootstrap,3,,P(d3))
      * TE Signature : S(_moduleDoBootstrap,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@6130
     */
    public native Object _moduleDoBootstrap(Object moduleRef);
}
