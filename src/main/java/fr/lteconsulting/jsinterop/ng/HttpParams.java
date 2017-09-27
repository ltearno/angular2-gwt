package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params".HttpParams
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts:892
  * 1 constructors
  * An HTTP request/response body that represents serialized parameters,
  * per the MIME type `application/x-www-form-urlencoded`.
  * 
  * This class is immuatable - all mutation operations return a new instance.
 */
@JsType(isNative=true, namespace="ng", name="HttpParams")
public class HttpParams
{

    /*
        Constructors
    */
    public HttpParams(Object options){
    }

    /*
        Properties
    */

    public Object cloneFrom;

    @JsProperty( name = "cloneFrom")
    public native Object getCloneFrom();

    @JsProperty( name = "cloneFrom")
    public native void setCloneFrom( Object value );

    public Object encoder;

    @JsProperty( name = "encoder")
    public native Object getEncoder();

    @JsProperty( name = "encoder")
    public native void setEncoder( Object value );

    public Object map;

    @JsProperty( name = "map")
    public native Object getMap();

    @JsProperty( name = "map")
    public native void setMap( Object value );

    public Object updates;

    @JsProperty( name = "updates")
    public native Object getUpdates();

    @JsProperty( name = "updates")
    public native void setUpdates( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,1216,,P(d1),P(d1))
      * TE Signature : S(append,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@1957
      * Construct a new body with an appended value for the given parameter name.
     */
    public native HttpParams append(String param, String value);
    /** 
      * Std Signature : S(clone,3,,P(d3))
      * TE Signature : S(clone,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@2561
     */
    public native Object clone(Object update);
    /** 
      * Std Signature : S(delete,1216,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    public native HttpParams delete(String param);
    /** 
      * Std Signature : S(delete,1216,,P(d1),P(d1))
      * TE Signature : S(delete,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@2347
      * Construct a new body with either the given value for the given parameter
      * removed, if a value is given, or all values for the given parameter removed
      * if not.
     */
    public native HttpParams delete(String param, String value /* optional */);
    /** 
      * Std Signature : S(get,1,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@1590
      * Get the first value for the given parameter name, or `null` if it's not present.
     */
    public native String get(String param);
    /** 
      * Std Signature : S(getAll,7<1>,,P(d1))
      * TE Signature : S(getAll,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@1728
      * Get all values for the given parameter name, or `null` if it's not present.
     */
    public native Array<String> getAll(String param);
    /** 
      * Std Signature : S(has,27,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@1453
      * Check whether the body has one or more values for the given parameter name.
     */
    public native Boolean has(String param);
    /** 
      * Std Signature : S(init,3,,)
      * TE Signature : S(init,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@2588
     */
    public native Object init();
    /** 
      * Std Signature : S(keys,7<1>,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@1838
      * Get all the parameter names for this body.
     */
    public native Array<String> keys();
    /** 
      * Std Signature : S(set,1216,,P(d1),P(d1))
      * TE Signature : S(set,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@2102
      * Construct a new body with a new value for the given parameter name.
     */
    public native HttpParams set(String param, String value);
}
