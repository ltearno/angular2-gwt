package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/static_request".Request
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/static_request.d.ts:389
  * 1 constructors
  * Creates `Request` instances from provided values.
  * 
  * The Request's interface is inspired by the Request constructor defined in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#request-class),
  * but is considered a static value whose body can be accessed many times. There are other
  * differences in the implementation, but this is the most significant.
  * 
  * `Request` instances are typically created by higher-level classes, like {@link Http} and
  * {@link Jsonp}, but it may occasionally be useful to explicitly create `Request` instances.
  * One such example is when creating services that wrap higher-level services, like {@link Http},
  * where it may be useful to generate a `Request` with arbitrary headers and search params.
  * 
  * ```typescript
  * import {Injectable, Injector} from '@angular/core';
  * import {HTTP_PROVIDERS, Http, Request, RequestMethod} from '@angular/http';
 */
@JsType(isNative=true, namespace="ng.http", name="Request")
public class Request extends Body
{

    /*
        Constructors
    */
    public Request(RequestArgs requestOptions){
    }

    /*
        Properties
    */

    /** 
      * Type of the request body *
     */
    public Object contentType;

    @JsProperty( name = "contentType")
    public native Object getContentType();

    @JsProperty( name = "contentType")
    public native void setContentType( Object value );

    /** 
      * {@link Headers} instance
     */
    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    /** 
      * Http method with which to perform the request.
     */
    public RequestMethod method;

    @JsProperty( name = "method")
    public native RequestMethod getMethod();

    @JsProperty( name = "method")
    public native void setMethod( RequestMethod value );

    /** 
      * Buffer to store the response 
     */
    public ResponseContentType responseType;

    @JsProperty( name = "responseType")
    public native ResponseContentType getResponseType();

    @JsProperty( name = "responseType")
    public native void setResponseType( ResponseContentType value );

    /** 
      * Url of the remote resource 
     */
    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /** 
      * Enable use credentials 
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
      * Std Signature : S(detectContentType,1238,,)
      * TE Signature : S(detectContentType,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/static_request.d.ts@2486
      * Returns the content type enum based on header options.
     */
    public native ContentType detectContentType();
    /** 
      * Std Signature : S(detectContentTypeFromBody,1238,,)
      * TE Signature : S(detectContentTypeFromBody,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/static_request.d.ts@2609
      * Returns the content type of request's body based on its type.
     */
    public native ContentType detectContentTypeFromBody();
    /** 
      * Std Signature : S(getBody,3,,)
      * TE Signature : S(getBody,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/static_request.d.ts@2770
      * Returns the request's body according to its type. If body is undefined, return
      * null.
     */
    public native Object getBody();
}
