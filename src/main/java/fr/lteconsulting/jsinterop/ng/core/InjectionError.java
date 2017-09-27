package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Error;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/core/src/di/reflective_errors".InjectionError
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/core/src/di/reflective_errors.d.ts:141
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="InjectionError")
public class InjectionError extends Error
{

    /*
        Constructors
    */
    public InjectionError(String message){
        super(null);
    }

    /*
        Properties
    */

    public Array<ReflectiveInjector> injectors;

    @JsProperty( name = "injectors")
    public native Array<ReflectiveInjector> getInjectors();

    @JsProperty( name = "injectors")
    public native void setInjectors( Array<ReflectiveInjector> value );

    public Array<ReflectiveKey> keys;

    @JsProperty( name = "keys")
    public native Array<ReflectiveKey> getKeys();

    @JsProperty( name = "keys")
    public native void setKeys( Array<ReflectiveKey> value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String stack;

    @JsProperty( name = "stack")
    public native String getStack();

    @JsProperty( name = "stack")
    public native void setStack( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addKey,429,,P(d624),P(d332))
      * TE Signature : S(addKey,P(d624),P(d332))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/core/src/di/reflective_errors.d.ts@324
     */
    public native void addKey(ReflectiveInjector injector, ReflectiveKey key);
    /** 
      * Std Signature : S(constructResolvingMessage,1,,P(d7<332>))
      * TE Signature : S(constructResolvingMessage,P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/core/src/di/reflective_errors.d.ts@285
     */
    public native String constructResolvingMessage(Array<ReflectiveKey> keys);
}
