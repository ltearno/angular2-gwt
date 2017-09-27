package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injection_token".InjectionToken
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injection_token.d.ts:1100
  * 1 constructors
  * Creates a token that can be used in a DI Provider.
  * 
  * Use an `InjectionToken` whenever the type you are injecting is not reified (does not have a
  * runtime representation) such as when injecting an interface, callable type, array or
  * parametrized type.
  * 
  * `InjectionToken` is parameterized on `T` which is the type of object which will be returned by
  * the `Injector`. This provides additional level of type safety.
  * 
  * ```
  * interface MyInterface {...}
  * var myInterface = injector.get(new InjectionToken<MyInterface>('SomeToken'));
  * // myInterface is inferred to be MyInterface.
  * ```
  * 
  * ### Example
  * 
  * {@example core/di/ts/injector_spec.ts region='InjectionToken'}
 */
@JsType(isNative=true, namespace="ng.core", name="InjectionToken")
public class InjectionToken<T> extends OpaqueToken
{

    /*
        Constructors
    */
    public InjectionToken(String desc){
        super(null);
    }

    /*
        Properties
    */

    public Object _differentiate_from_OpaqueToken_structurally;

    @JsProperty( name = "_differentiate_from_OpaqueToken_structurally")
    public native Object get_differentiate_from_OpaqueToken_structurally();

    @JsProperty( name = "_differentiate_from_OpaqueToken_structurally")
    public native void set_differentiate_from_OpaqueToken_structurally( Object value );
}
