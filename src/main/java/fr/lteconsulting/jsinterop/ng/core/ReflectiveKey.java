package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_key".ReflectiveKey
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_key.d.ts:0
  * 1 constructors
  * A unique object used for retrieving items from the {@link ReflectiveInjector}.
  * 
  * Keys have:
  * - a system-wide unique `id`.
  * - a `token`.
  * 
  * `Key` is used internally by {@link ReflectiveInjector} because its system-wide unique `id` allows
  * the
  * injector to store created objects in a more efficient way.
  * 
  * `Key` should not be created directly. {@link ReflectiveInjector} creates keys automatically when
  * resolving
  * providers.
 */
@JsType(isNative=true, namespace="ng.core", name="ReflectiveKey")
public class ReflectiveKey
{

    /*
        Constructors
    */
    public ReflectiveKey(Object token, Number id){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="ng.core.ReflectiveKey", name="numberOfKeys")
    public static Number numberOfKeys;

    /*
        Static methods
    */
    /** 
      * Retrieves a `Key` for a token.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_key.d.ts:766
     */
    @JsMethod(namespace="ng.core.ReflectiveKey", name = "get")
    public static native ReflectiveKey get(Object token);

    /*
        Properties
    */

    /** 
      * Returns a stringified token.
     */
    public String displayName;

    @JsProperty( name = "displayName")
    public native String getDisplayName();

    @JsProperty( name = "displayName")
    public native void setDisplayName( String value );

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );

    public Object token;

    @JsProperty( name = "token")
    public native Object getToken();

    @JsProperty( name = "token")
    public native void setToken( Object value );
}
