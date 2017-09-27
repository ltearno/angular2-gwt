package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.ArrayBuffer;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client".HttpClient
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts:352
  * 1 constructors
  * Perform HTTP requests.
  * 
  * `HttpClient` is available as an injectable class, with methods to perform HTTP requests.
  * Each request method has multiple signatures, and the return type varies according to which
  * signature is called (mainly the values of `observe` and `responseType`).
 */
@JsType(isNative=true, namespace="ng", name="HttpClient")
public class HttpClient
{

    /*
        Constructors
    */
    public HttpClient(HttpHandler handler){
    }

    /*
        Properties
    */

    public Object handler;

    @JsProperty( name = "handler")
    public native Object getHandler();

    @JsProperty( name = "handler")
    public native void setHandler( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(delete,357<26>,,P(d1),P(d3))
      * TE Signature : S(delete,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@9173
      * Construct a DELETE request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a DELETE request which interprets the body as a `Blob` and returns it.
      * Construct a DELETE request which interprets the body as text and returns it.
      * Construct a DELETE request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a DELETE request which interprets the body as a `Blob` and returns the full event stream.
      * Construct a DELETE request which interprets the body as text and returns the full event stream.
      * Construct a DELETE request which interprets the body as JSON and returns the full event stream.
      * Construct a DELETE request which interprets the body as JSON and returns the full event stream.
      * Construct a DELETE request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a DELETE request which interprets the body as a `Blob` and returns the full response.
      * Construct a DELETE request which interprets the body as text and returns the full response.
      * Construct a DELETE request which interprets the body as JSON and returns the full response.
      * Construct a DELETE request which interprets the body as JSON and returns the full response.
      * Construct a DELETE request which interprets the body as JSON and returns it.
      * Construct a DELETE request which interprets the body as JSON and returns it.
     */
    public native Observable<ArrayBuffer> delete(String url, Object options);
    /** 
      * Std Signature : S(get,357<26>,,P(d1),P(d3))
      * TE Signature : S(get,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@16169
      * Construct a GET request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a GET request which interprets the body as a `Blob` and returns it.
      * Construct a GET request which interprets the body as text and returns it.
      * Construct a GET request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a GET request which interprets the body as a `Blob` and returns the full event stream.
      * Construct a GET request which interprets the body as text and returns the full event stream.
      * Construct a GET request which interprets the body as JSON and returns the full event stream.
      * Construct a GET request which interprets the body as JSON and returns the full event stream.
      * Construct a GET request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a GET request which interprets the body as a `Blob` and returns the full response.
      * Construct a GET request which interprets the body as text and returns the full response.
      * Construct a GET request which interprets the body as JSON and returns the full response.
      * Construct a GET request which interprets the body as JSON and returns the full response.
      * Construct a GET request which interprets the body as JSON and returns it.
      * Construct a GET request which interprets the body as JSON and returns it.
     */
    public native Observable<ArrayBuffer> get(String url, Object options);
    /** 
      * Std Signature : S(head,357<26>,,P(d1),P(d3))
      * TE Signature : S(head,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@23079
      * Construct a HEAD request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a HEAD request which interprets the body as text and returns it.
      * Construct a GET request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a HEAD request which interprets the body as a `Blob` and returns the full event stream.
      * Construct a HEAD request which interprets the body as text and returns the full event stream.
      * Construct a HEAD request which interprets the body as JSON and returns the full event stream.
      * Construct a HEAD request which interprets the body as JSON and returns the full event stream.
      * Construct a HEAD request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a HEAD request which interprets the body as a `Blob` and returns the full response.
      * Construct a HEAD request which interprets the body as text and returns the full response.
      * Construct a HEAD request which interprets the body as JSON and returns the full response.
      * Construct a HEAD request which interprets the body as JSON and returns the full response.
      * Construct a HEAD request which interprets the body as JSON and returns it.
      * Construct a HEAD request which interprets the body as JSON and returns it.
     */
    public native Observable<ArrayBuffer> head(String url, Object options);
    /** 
      * Std Signature : S(jsonp,357<3>,,P(d1),P(d1))
      * TE Signature : S(jsonp,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@29850
      * Construct a JSONP request for the given URL and name of the callback parameter.
      * Construct a JSONP request for the given URL and name of the callback parameter.
     */
    public native Observable<Object> jsonp(String url, String callbackParam);
    /** 
      * Std Signature : S(options,357<26>,,P(d1),P(d3))
      * TE Signature : S(options,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@30339
      * Make an OPTIONS request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct an OPTIONS request which interprets the body as a `Blob` and returns it.
      * Construct a OPTIONS request which interprets the body as text and returns it.
      * Construct an OPTIONS request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct an OPTIONS request which interprets the body as a `Blob` and returns the full event stream.
      * Construct an OPTIONS request which interprets the body as text and returns the full event stream.
      * Construct an OPTIONS request which interprets the body as JSON and returns the full event stream.
      * Construct an OPTIONS request which interprets the body as JSON and returns the full event stream.
      * Construct an OPTIONS request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct an OPTIONS request which interprets the body as a `Blob` and returns the full response.
      * Construct an OPTIONS request which interprets the body as text and returns the full response.
      * Construct an OPTIONS request which interprets the body as JSON and returns the full response.
      * Construct an OPTIONS request which interprets the body as JSON and returns the full response.
      * Construct an OPTIONS request which interprets the body as JSON and returns it.
      * Construct an OPTIONS request which interprets the body as JSON and returns it.
     */
    public native Observable<ArrayBuffer> options(String url, Object options);
    /** 
      * Std Signature : S(patch,357<26>,,P(d1),P(d3),P(d3))
      * TE Signature : S(patch,P(d1),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@37379
      * Construct a PATCH request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a PATCH request which interprets the body as a `Blob` and returns it.
      * Construct a PATCH request which interprets the body as text and returns it.
      * Construct a PATCH request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a PATCH request which interprets the body as a `Blob` and returns the full event stream.
      * Construct a PATCH request which interprets the body as text and returns the full event stream.
      * Construct a PATCH request which interprets the body as JSON and returns the full event stream.
      * Construct a PATCH request which interprets the body as JSON and returns the full event stream.
      * Construct a PATCH request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a PATCH request which interprets the body as a `Blob` and returns the full response.
      * Construct a PATCH request which interprets the body as text and returns the full response.
      * Construct a PATCH request which interprets the body as JSON and returns the full response.
      * Construct a PATCH request which interprets the body as JSON and returns the full response.
      * Construct a PATCH request which interprets the body as JSON and returns it.
      * Construct a PATCH request which interprets the body as JSON and returns it.
     */
    public native Observable<ArrayBuffer> patch(String url, Object body, Object options);
    /** 
      * Std Signature : S(post,357<26>,,P(d1),P(d3),P(d3))
      * TE Signature : S(post,P(d1),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@44617
      * Construct a POST request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a POST request which interprets the body as a `Blob` and returns it.
      * Construct a POST request which interprets the body as text and returns it.
      * Construct a PATCH request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a POST request which interprets the body as a `Blob` and returns the full event stream.
      * Construct a POST request which interprets the body as text and returns the full event stream.
      * Construct a POST request which interprets the body as JSON and returns the full event stream.
      * Construct a POST request which interprets the body as JSON and returns the full event stream.
      * Construct a POST request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a POST request which interprets the body as a `Blob` and returns the full response.
      * Construct a POST request which interprets the body as text and returns the full response.
      * Construct a POST request which interprets the body as JSON and returns the full response.
      * Construct a POST request which interprets the body as JSON and returns the full response.
      * Construct a POST request which interprets the body as JSON and returns it.
      * Construct a POST request which interprets the body as JSON and returns it.
     */
    public native Observable<ArrayBuffer> post(String url, Object body, Object options);
    /** 
      * Std Signature : S(put,357<26>,,P(d1),P(d3),P(d3))
      * TE Signature : S(put,P(d1),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@51826
      * Construct a PUT request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a PUT request which interprets the body as a `Blob` and returns it.
      * Construct a PUT request which interprets the body as text and returns it.
      * Construct a PUT request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a PUT request which interprets the body as a `Blob` and returns the full event stream.
      * Construct a PUT request which interprets the body as text and returns the full event stream.
      * Construct a PUT request which interprets the body as JSON and returns the full event stream.
      * Construct a PUT request which interprets the body as JSON and returns the full event stream.
      * Construct a PUT request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a PUT request which interprets the body as a `Blob` and returns the full response.
      * Construct a PUT request which interprets the body as text and returns the full response.
      * Construct a PUT request which interprets the body as JSON and returns the full response.
      * Construct a PUT request which interprets the body as JSON and returns the full response.
      * Construct a PUT request which interprets the body as JSON and returns it.
      * Construct a PUT request which interprets the body as JSON and returns it.
     */
    public native Observable<ArrayBuffer> put(String url, Object body, Object options);
    /** 
      * Std Signature : S(request,357<26>,,P(d1),P(d1),P(d3))
      * TE Signature : S(request,P(d1),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@1100
      * Send the given `HttpRequest` and return a stream of `HttpEvents`.
      * Construct a request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a request which interprets the body as a `Blob` and returns it.
      * Construct a request which interprets the body as text and returns it.
      * Construct a request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a request which interprets the body as an `Blob` and returns the full event stream.
      * Construct a request which interprets the body as text and returns the full event stream.
      * Construct a request which interprets the body as JSON and returns the full event stream.
      * Construct a request which interprets the body as JSON and returns the full event stream.
      * Construct a request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a request which interprets the body as a `Blob` and returns the full response.
      * Construct a request which interprets the body as text and returns the full response.
      * Construct a request which interprets the body as JSON and returns the full response.
      * Construct a request which interprets the body as JSON and returns the full response.
      * Construct a request which interprets the body as JSON and returns it.
      * Construct a request which interprets the body as JSON and returns it.
      * Construct a request in a manner where response type and requested `Observable` are not known
      * statically.
      * VERSION 1
     */
    public native Observable<ArrayBuffer> request(String method, String url, Object options);
    /** 
      * Std Signature : S(request,357<U(R-843,844,845<R->,846,847<9>)>,R-,P(d430<3>))
      * TE Signature : S(request,P(d430))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/client.d.ts@859
      * Send the given `HttpRequest` and return a stream of `HttpEvents`.
      * Construct a request which interprets the body as an `ArrayBuffer` and returns it.
      * Construct a request which interprets the body as a `Blob` and returns it.
      * Construct a request which interprets the body as text and returns it.
      * Construct a request which interprets the body as an `ArrayBuffer` and returns the full event stream.
      * Construct a request which interprets the body as an `Blob` and returns the full event stream.
      * Construct a request which interprets the body as text and returns the full event stream.
      * Construct a request which interprets the body as JSON and returns the full event stream.
      * Construct a request which interprets the body as JSON and returns the full event stream.
      * Construct a request which interprets the body as an `ArrayBuffer` and returns the full response.
      * Construct a request which interprets the body as a `Blob` and returns the full response.
      * Construct a request which interprets the body as text and returns the full response.
      * Construct a request which interprets the body as JSON and returns the full response.
      * Construct a request which interprets the body as JSON and returns the full response.
      * Construct a request which interprets the body as JSON and returns it.
      * Construct a request which interprets the body as JSON and returns it.
      * Construct a request in a manner where response type and requested `Observable` are not known
      * statically.
     */
    public native <R> Observable<HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfRAndHttpSentEventAndHttpUserEventOfR<R>> request(HttpRequest<Object> req);
}
