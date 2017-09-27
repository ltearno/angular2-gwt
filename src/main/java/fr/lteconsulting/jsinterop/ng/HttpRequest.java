package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.UnionOfArrayBufferAndBlobAndFormDataAndString;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/request".HttpRequest
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/request.d.ts:282
  * 1 constructors
  * An outgoing HTTP request with an optional typed body.
  * 
  * `HttpRequest` represents an outgoing request, including URL, method,
  * headers, body, and other request configuration options. Instances should be
  * assumed to be immutable. To modify a `HttpRequest`, the `clone`
  * method should be used.
 */
@JsType(isNative=true, namespace="ng", name="HttpRequest")
public class HttpRequest<T>
{

    /*
        Constructors
    */
    public HttpRequest(String method, String url, Object init){
    }

    /*
        Properties
    */

    /** 
      * The request body, or `null` if one isn't set.
      * 
      * Bodies are not enforced to be immutable, as they can include a reference to any
      * user-defined data type. However, interceptors should take care to preserve
      * idempotence by treating them as such.
     */
    public T body;

    @JsProperty( name = "body")
    public native T getBody();

    @JsProperty( name = "body")
    public native void setBody( T value );

    /** 
      * Outgoing headers for this request.
     */
    public HttpHeaders headers;

    @JsProperty( name = "headers")
    public native HttpHeaders getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( HttpHeaders value );

    /** 
      * The outgoing HTTP request method.
     */
    public String method;

    @JsProperty( name = "method")
    public native String getMethod();

    @JsProperty( name = "method")
    public native void setMethod( String value );

    /** 
      * Outgoing URL parameters.
     */
    public HttpParams params;

    @JsProperty( name = "params")
    public native HttpParams getParams();

    @JsProperty( name = "params")
    public native void setParams( HttpParams value );

    /** 
      * Whether this request should be made in a way that exposes progress events.
      * 
      * Progress events are expensive (change detection runs on each event) and so
      * they should only be requested if the consumer intends to monitor them.
     */
    public Boolean reportProgress;

    @JsProperty( name = "reportProgress")
    public native Boolean getReportProgress();

    @JsProperty( name = "reportProgress")
    public native void setReportProgress( Boolean value );

    /** 
      * The expected response type of the server.
      * 
      * This is used to parse the response appropriately before returning it to
      * the requestee.
     */
    public String responseType;

    @JsProperty( name = "responseType")
    public native String getResponseType();

    @JsProperty( name = "responseType")
    public native void setResponseType( String value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /** 
      * The outgoing URL with all URL parameters set.
     */
    public String urlWithParams;

    @JsProperty( name = "urlWithParams")
    public native String getUrlWithParams();

    @JsProperty( name = "urlWithParams")
    public native void setUrlWithParams( String value );

    /** 
      * Whether this request should be sent with outgoing credentials (cookies).
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
      * Std Signature : S(clone,430,,)
      * TE Signature : S(clone,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/request.d.ts@3325
     */
    public native HttpRequest<T> clone();
    /** 
      * Std Signature : S(clone,430,,P(d3))
      * TE Signature : S(clone,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/request.d.ts@3354
      * VERSION 1
     */
    public native HttpRequest<T> clone(Object update);
    /** 
      * Std Signature : S(detectContentTypeHeader,1,,)
      * TE Signature : S(detectContentTypeHeader,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/request.d.ts@3279
      * Examine the body and attempt to infer an appropriate MIME type
      * for it.
      * 
      * If no such type can be inferred, this method will return `null`.
     */
    public native String detectContentTypeHeader();
    /** 
      * Std Signature : S(serializeBody,U(-26,235,842,1),,)
      * TE Signature : S(serializeBody,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/request.d.ts@3031
      * Transform the free-form body into a serialized format suitable for
      * transmission to the server.
     */
    public native UnionOfArrayBufferAndBlobAndFormDataAndString serializeBody();
}
