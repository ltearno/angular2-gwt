package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params".URLSearchParams
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts:133
  * 1 constructors
  * Map-like representation of url search parameters, based on
  * [URLSearchParams](https://url.spec.whatwg.org/#urlsearchparams) in the url living standard,
  * with several extensions for merging URLSearchParams objects:
  *    - setAll()
  *    - appendAll()
  *    - replaceAll()
  * 
  * This class accepts an optional second parameter of ${@link QueryEncoder},
  * which is used to serialize parameters before making a request. By default,
  * `QueryEncoder` encodes keys and values of parameters using `encodeURIComponent`,
  * and then un-encodes certain characters that are allowed to be part of the query
  * according to IETF RFC 3986: https://tools.ietf.org/html/rfc3986.
  * 
  * These are the characters that are not encoded: `! $ \' ( ) * + , ; A 9 - . _ ~ ? /`
  * 
  * If the set of allowed query characters is not acceptable for a particular backend,
  * `QueryEncoder` can be subclassed and provided as the 2nd argument to URLSearchParams.
  * 
  * ```
  * import {URLSearchParams, QueryEncoder} from '@angular/http';
  * class MyQueryEncoder extends QueryEncoder {
  *    encodeKey(k: string): string {
  *      return myEncodingFunction(k);
  *    }
  * 
  *    encodeValue(v: string): string {
  *      return myEncodingFunction(v);
  *    }
  * }
  * 
  * let params = new URLSearchParams('', new MyQueryEncoder());
  * ```
 */
@JsType(isNative=true, namespace="ng.http", name="URLSearchParams")
public class URLSearchParams
{

    /*
        Constructors
    */
    public URLSearchParams(String rawParams, QueryEncoder queryEncoder){
    }

    /*
        Properties
    */

    public Map<String, Array<String>> paramsMap;

    @JsProperty( name = "paramsMap")
    public native Map<String, Array<String>> getParamsMap();

    @JsProperty( name = "paramsMap")
    public native void setParamsMap( Map<String, Array<String>> value );

    public Object queryEncoder;

    @JsProperty( name = "queryEncoder")
    public native Object getQueryEncoder();

    @JsProperty( name = "queryEncoder")
    public native void setQueryEncoder( Object value );

    public String rawParams;

    @JsProperty( name = "rawParams")
    public native String getRawParams();

    @JsProperty( name = "rawParams")
    public native void setRawParams( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,429,,P(d1),P(d1))
      * TE Signature : S(append,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1887
     */
    public native void append(String param, String val);
    /** 
      * Std Signature : S(appendAll,429,,P(d649))
      * TE Signature : S(appendAll,P(d649))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1933
     */
    public native void appendAll(URLSearchParams searchParams);
    /** 
      * Std Signature : S(clone,649,,)
      * TE Signature : S(clone,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1656
     */
    public native URLSearchParams clone();
    /** 
      * Std Signature : S(delete,429,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@2062
     */
    public native void delete(String param);
    /** 
      * Std Signature : S(get,1,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1719
     */
    public native String get(String param);
    /** 
      * Std Signature : S(getAll,7<1>,,P(d1))
      * TE Signature : S(getAll,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1758
     */
    public native Array<String> getAll(String param);
    /** 
      * Std Signature : S(has,27,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1686
     */
    public native Boolean has(String param);
    /** 
      * Std Signature : S(replaceAll,429,,P(d649))
      * TE Signature : S(replaceAll,P(d649))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1985
     */
    public native void replaceAll(URLSearchParams searchParams);
    /** 
      * Std Signature : S(set,429,,P(d1),P(d1))
      * TE Signature : S(set,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1795
     */
    public native void set(String param, String val);
    /** 
      * Std Signature : S(setAll,429,,P(d649))
      * TE Signature : S(setAll,P(d649))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@1838
     */
    public native void setAll(URLSearchParams searchParams);
}
