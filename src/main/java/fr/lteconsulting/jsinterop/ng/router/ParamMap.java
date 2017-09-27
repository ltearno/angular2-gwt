package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/shared".ParamMap
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/shared.d.ts:535

  * Matrix and Query parameters.
  * 
  * `ParamMap` makes it easier to work with parameters as they could have either a single value or
  * multiple value. Because this should be known by the user, calling `get` or `getAll` returns the
  * correct type (either `string` or `string[]`).
  * 
  * The API is inspired by the URLSearchParams interface.
  * see https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams
 */
@JsType(isNative=true, namespace="ng.router", name="ParamMap")
public class ParamMap
{

    /*
        Properties
    */

    /** 
      * Name of the parameters 
     */
    public Array<String> keys;

    @JsProperty( name = "keys")
    public native Array<String> getKeys();

    @JsProperty( name = "keys")
    public native void setKeys( Array<String> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(get,1,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/shared.d.ts@1280
      * Return a single value for the given parameter name:
      * - the value when the parameter has a single value,
      * - the first value if the parameter has multiple values,
      * - `null` when there is no such parameter.
     */
    public native String get(String name);
    /** 
      * Std Signature : S(getAll,7<1>,,P(d1))
      * TE Signature : S(getAll,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/shared.d.ts@1470
      * Return an array of values for the given parameter name.
      * 
      * If there is no such parameter, an empty array is returned.
     */
    public native Array<String> getAll(String name);
    /** 
      * Std Signature : S(has,27,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/shared.d.ts@1003
     */
    public native Boolean has(String name);
}
