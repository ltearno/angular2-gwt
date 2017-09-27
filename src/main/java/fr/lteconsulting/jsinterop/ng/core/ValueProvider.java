package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/provider".ValueProvider
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/provider.d.ts:879
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ValueProvider")
public class ValueProvider
{

    /*
        Properties
    */

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
      * The value to inject.
     */
    public Object useValue;

    @JsProperty( name = "useValue")
    public native Object getUseValue();

    @JsProperty( name = "useValue")
    public native void setUseValue( Object value );
}
