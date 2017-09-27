package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options".RequestOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options.d.ts:204
  * 1 constructors
  * Creates a request options object to be optionally provided when instantiating a
  * {@link Request}.
  * 
  * This class is based on the `RequestInit` description in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#requestinit).
  * 
  * All values are null by default. Typical defaults can be found in the {@link BaseRequestOptions}
  * class, which sub-classes `RequestOptions`.
  * 
  * ```typescript
  * import {RequestOptions, Request, RequestMethod} from '@angular/http';
  * 
  * const options = new RequestOptions({
  *    method: RequestMethod.Post,
  *    url: 'https://google.com'
  * });
  * const req = new Request(options);
  * console.log('req.method:', RequestMethod[req.method]); // Post
  * console.log('options.url:', options.url); // https://google.com
  * ```
 */
@JsType(isNative=true, namespace="ng.http", name="RequestOptions")
public class RequestOptions
{

    /*
        Constructors
    */
    public RequestOptions(RequestOptionsArgs opts){
    }

    /*
        Properties
    */

    /** 
      * Body to be used when creating a {@link Request}.
     */
    public Object body;

    @JsProperty( name = "body")
    public native Object getBody();

    @JsProperty( name = "body")
    public native void setBody( Object value );

    /** 
      * {@link Headers} to be attached to a {@link Request}.
     */
    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    /** 
      * Http method with which to execute a {@link Request}.
      * Acceptable methods are defined in the {@link RequestMethod} enum.
     */
    public PropertyKey_UnionOfNumberAndString method;

    @JsProperty( name = "method")
    public native PropertyKey_UnionOfNumberAndString getMethod();

    @JsProperty( name = "method")
    public native void setMethod( PropertyKey_UnionOfNumberAndString value );

    @JsOverlay
    public final void setMethod( Number value ) { setMethod(PropertyKey_UnionOfNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setMethod( String value ) { setMethod(PropertyKey_UnionOfNumberAndString.ofString( value )); }

    /** 
      * Search parameters to be included in a {@link Request}.
     */
    public URLSearchParams params;

    @JsProperty( name = "params")
    public native URLSearchParams getParams();

    @JsProperty( name = "params")
    public native void setParams( URLSearchParams value );

    public ResponseContentType responseType;

    @JsProperty( name = "responseType")
    public native ResponseContentType getResponseType();

    @JsProperty( name = "responseType")
    public native void setResponseType( ResponseContentType value );

    public URLSearchParams search;

    @JsProperty( name = "search")
    public native URLSearchParams getSearch();

    @JsProperty( name = "search")
    public native void setSearch( URLSearchParams value );

    /** 
      * Url with which to perform a {@link Request}.
     */
    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /** 
      * Enable use credentials for a {@link Request}.
     */
    public Boolean withCredentials;

    @JsProperty( name = "withCredentials")
    public native Boolean getWithCredentials();

    @JsProperty( name = "withCredentials")
    public native void setWithCredentials( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_appendParam,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_appendParam,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options.d.ts@3096
     */
    public native Object _appendParam(Object key, Object value, Object params);
    /** 
      * Std Signature : S(_mergeSearchParams,3,,)
      * TE Signature : S(_mergeSearchParams,)
      * 
     */
    public native Object _mergeSearchParams();
    /** 
      * Std Signature : S(_mergeSearchParams,3,,P(d3))
      * TE Signature : S(_mergeSearchParams,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options.d.ts@3017
     */
    public native Object _mergeSearchParams(Object params /* optional */);
    /** 
      * Std Signature : S(_parseParams,3,,)
      * TE Signature : S(_parseParams,)
      * 
     */
    public native Object _parseParams();
    /** 
      * Std Signature : S(_parseParams,3,,P(d3))
      * TE Signature : S(_parseParams,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options.d.ts@3058
     */
    public native Object _parseParams(Object objParams /* optional */);
    /** 
      * Std Signature : S(merge,659,,)
      * TE Signature : S(merge,)
      * 
     */
    public native RequestOptions merge();
    /** 
      * Std Signature : S(merge,659,,P(d657))
      * TE Signature : S(merge,P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_request_options.d.ts@2960
      * Creates a copy of the `RequestOptions` instance, using the optional input as values to override
      * existing values. This method will not change the values of the instance on which it is being
      * called.
      * 
      * Note that `headers` and `search` will override existing values completely if present in
      * the `options` object. If these values should be merged, it should be done prior to calling
      * `merge` on the `RequestOptions` instance.
      * 
      * ```typescript
      * import {RequestOptions, Request, RequestMethod} from '@angular/http';
      * 
      * const options = new RequestOptions({
      *    method: RequestMethod.Post
      * });
      * const req = new Request(options.merge({
      *    url: 'https://google.com'
      * }));
      * console.log('req.method:', RequestMethod[req.method]); // Post
      * console.log('options.url:', options.url); // null
      * console.log('req.url:', req.url); // https://google.com
      * ```
     */
    public native RequestOptions merge(RequestOptionsArgs options /* optional */);
}
