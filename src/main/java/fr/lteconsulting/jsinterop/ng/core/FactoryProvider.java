package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/provider".FactoryProvider
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/provider.d.ts:4123
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="FactoryProvider")
public class FactoryProvider
{

    /*
        Properties
    */

    /** 
      * A list of `token`s which need to be resolved by the injector. The list of values is then
      * used as arguments to the `useFactory` function.
     */
    public Array<Object> deps;

    @JsProperty( name = "deps")
    public native Array<Object> getDeps();

    @JsProperty( name = "deps")
    public native void setDeps( Array<Object> value );

    /** 
      * If true, then injector returns an array of instances. This is useful to allow multiple
      * providers spread across many files to provide configuration information to a common token.
      * 
      * ### Example
      * 
      * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
     */
    public Boolean multi;

    @JsProperty( name = "multi")
    public native Boolean getMulti();

    @JsProperty( name = "multi")
    public native void setMulti( Boolean value );

    /** 
      * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
     */
    public Object provide;

    @JsProperty( name = "provide")
    public native Object getProvide();

    @JsProperty( name = "provide")
    public native void setProvide( Object value );

    /** 
      * A function to invoke to create a value for this `token`. The function is invoked with
      * resolved values of `token`s in the `deps` field.
     */
    public Function useFactory;

    @JsProperty( name = "useFactory")
    public native Function getUseFactory();

    @JsProperty( name = "useFactory")
    public native void setUseFactory( Function value );
}
