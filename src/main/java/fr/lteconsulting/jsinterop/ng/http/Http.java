package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http".Http
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts:262
  * 1 constructors
  * Performs http requests using `XMLHttpRequest` as the default backend.
  * 
  * `Http` is available as an injectable class, with methods to perform http requests. Calling
  * `request` returns an `Observable` which will emit a single {@link Response} when a
  * response is received.
  * 
  * ### Example
  * 
  * ```typescript
  * import {Http, HTTP_PROVIDERS} from '@angular/http';
  * import 'rxjs/add/operator/map'
 */
@JsType(isNative=true, namespace="ng.http", name="Http")
public class Http
{

    /*
        Constructors
    */
    public Http(ConnectionBackend _backend, RequestOptions _defaultOptions){
    }

    /*
        Properties
    */

    public ConnectionBackend _backend;

    @JsProperty( name = "_backend")
    public native ConnectionBackend get_backend();

    @JsProperty( name = "_backend")
    public native void set_backend( ConnectionBackend value );

    public RequestOptions _defaultOptions;

    @JsProperty( name = "_defaultOptions")
    public native RequestOptions get_defaultOptions();

    @JsProperty( name = "_defaultOptions")
    public native void set_defaultOptions( RequestOptions value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(delete,357<1244>,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    public native Observable<Response> delete(String url);
    /** 
      * Std Signature : S(delete,357<1244>,,P(d1),P(d657))
      * TE Signature : S(delete,P(d1),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@3353
      * Performs a request with `delete` http method.
     */
    public native Observable<Response> delete(String url, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(get,357<1244>,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    public native Observable<Response> get(String url);
    /** 
      * Std Signature : S(get,357<1244>,,P(d1),P(d657))
      * TE Signature : S(get,P(d1),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@2906
      * Performs a request with `get` http method.
     */
    public native Observable<Response> get(String url, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(head,357<1244>,,P(d1))
      * TE Signature : S(head,P(d1))
      * 
     */
    public native Observable<Response> head(String url);
    /** 
      * Std Signature : S(head,357<1244>,,P(d1),P(d657))
      * TE Signature : S(head,P(d1),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@3652
      * Performs a request with `head` http method.
     */
    public native Observable<Response> head(String url, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(options,357<1244>,,P(d1))
      * TE Signature : S(options,P(d1))
      * 
     */
    public native Observable<Response> options(String url);
    /** 
      * Std Signature : S(options,357<1244>,,P(d1),P(d657))
      * TE Signature : S(options,P(d1),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@3797
      * Performs a request with `options` http method.
     */
    public native Observable<Response> options(String url, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(patch,357<1244>,,P(d1),P(d3))
      * TE Signature : S(patch,P(d1),P(d3))
      * 
     */
    public native Observable<Response> patch(String url, Object body);
    /** 
      * Std Signature : S(patch,357<1244>,,P(d1),P(d3),P(d657))
      * TE Signature : S(patch,P(d1),P(d3),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@3498
      * Performs a request with `patch` http method.
     */
    public native Observable<Response> patch(String url, Object body, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(post,357<1244>,,P(d1),P(d3))
      * TE Signature : S(post,P(d1),P(d3))
      * 
     */
    public native Observable<Response> post(String url, Object body);
    /** 
      * Std Signature : S(post,357<1244>,,P(d1),P(d3),P(d657))
      * TE Signature : S(post,P(d1),P(d3),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@3047
      * Performs a request with `post` http method.
     */
    public native Observable<Response> post(String url, Object body, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(put,357<1244>,,P(d1),P(d3))
      * TE Signature : S(put,P(d1),P(d3))
      * 
     */
    public native Observable<Response> put(String url, Object body);
    /** 
      * Std Signature : S(put,357<1244>,,P(d1),P(d3),P(d657))
      * TE Signature : S(put,P(d1),P(d3),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@3199
      * Performs a request with `put` http method.
     */
    public native Observable<Response> put(String url, Object body, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(request,357<1244>,,P(d1))
      * TE Signature : S(request,P(d1))
      * 
     */
    public native Observable<Response> request(String url);
    /** 
      * Std Signature : S(request,357<1244>,,P(d1),P(d657))
      * TE Signature : S(request,P(d1),P(d657))
      * 
     */
    public native Observable<Response> request(String url, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(request,357<1244>,,P(d651))
      * TE Signature : S(request,P(d651))
      * 
     */
    public native Observable<Response> request(Request url);
    /** 
      * Std Signature : S(request,357<1244>,,P(d651),P(d657))
      * TE Signature : S(request,P(d651),P(d657))
      * 
     */
    public native Observable<Response> request(Request url, RequestOptionsArgs options /* optional */);
    /** 
      * Std Signature : S(request,357<1244>,,P(dU(-651,1)))
      * TE Signature : S(request,P(dU(-651,1)))
      * 
     */
    public native Observable<Response> request(UnionOfRequestAndString url);
    /** 
      * Std Signature : S(request,357<1244>,,P(dU(-651,1)),P(d657))
      * TE Signature : S(request,P(dU(-651,1)),P(d657))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/http.d.ts@2752
      * Performs any type of http request. First argument is required, and can either be a url or
      * a {@link Request} instance. If the first argument is a url, an optional {@link RequestOptions}
      * object can be provided as the 2nd argument. The options object will be merged with the values
      * of {@link BaseRequestOptions} before performing the request.
     */
    public native Observable<Response> request(UnionOfRequestAndString url, RequestOptionsArgs options /* optional */);
}
