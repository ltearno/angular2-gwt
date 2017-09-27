package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.browser.ArrayBuffer;
import fr.lteconsulting.jsinterop.browser.Blob;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayBufferAndBlobAndObjectAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_response_options".ResponseOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_response_options.d.ts:88
  * 1 constructors
  * Creates a response options object to be optionally provided when instantiating a
  * {@link Response}.
  * 
  * This class is based on the `ResponseInit` description in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#responseinit).
  * 
  * All values are null by default. Typical defaults can be found in the
  * {@link BaseResponseOptions} class, which sub-classes `ResponseOptions`.
  * 
  * This class may be used in tests to build {@link Response Responses} for
  * mock responses (see {@link MockBackend}).
  * 
  * ### Example ([live demo](http://plnkr.co/edit/P9Jkk8e8cz6NVzbcxEsD?p=preview))
  * 
  * ```typescript
  * import {ResponseOptions, Response} from '@angular/http';
  * 
  * var options = new ResponseOptions({
  *    body: '{"name":"Jeff"}'
  * });
  * var res = new Response(options);
  * 
  * console.log('res.json():', res.json()); // Object {name: "Jeff"}
  * ```
 */
@JsType(isNative=true, namespace="ng.http", name="ResponseOptions")
public class ResponseOptions
{

    /*
        Constructors
    */
    public ResponseOptions(ResponseOptionsArgs opts){
    }

    /*
        Properties
    */

    /** 
      * String, Object, ArrayBuffer or Blob representing the body of the {@link Response}.
     */
    public UnionOfArrayBufferAndBlobAndObjectAndString body;

    @JsProperty( name = "body")
    public native UnionOfArrayBufferAndBlobAndObjectAndString getBody();

    @JsProperty( name = "body")
    public native void setBody( UnionOfArrayBufferAndBlobAndObjectAndString value );

    @JsOverlay
    public final void setBody( ArrayBuffer value ) { setBody(UnionOfArrayBufferAndBlobAndObjectAndString.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setBody( Blob value ) { setBody(UnionOfArrayBufferAndBlobAndObjectAndString.ofBlob( value )); }

    @JsOverlay
    public final void setBody( Object value ) { setBody(UnionOfArrayBufferAndBlobAndObjectAndString.ofObject( value )); }

    @JsOverlay
    public final void setBody( String value ) { setBody(UnionOfArrayBufferAndBlobAndObjectAndString.ofString( value )); }

    /** 
      * Response {@link Headers headers}
     */
    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    /** 
      * Http {@link http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html status code}
      * associated with the response.
     */
    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(merge,653,,)
      * TE Signature : S(merge,)
      * 
     */
    public native ResponseOptions merge();
    /** 
      * Std Signature : S(merge,653,,P(d652))
      * TE Signature : S(merge,P(d652))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/base_response_options.d.ts@2474
      * Creates a copy of the `ResponseOptions` instance, using the optional input as values to
      * override
      * existing values. This method will not change the values of the instance on which it is being
      * called.
      * 
      * This may be useful when sharing a base `ResponseOptions` object inside tests,
      * where certain properties may change from test to test.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/1lXquqFfgduTFBWjNoRE?p=preview))
      * 
      * ```typescript
      * import {ResponseOptions, Response} from '@angular/http';
      * 
      * var options = new ResponseOptions({
      *    body: {name: 'Jeff'}
      * });
      * var res = new Response(options.merge({
      *    url: 'https://google.com'
      * }));
      * console.log('options.url:', options.url); // null
      * console.log('res.json():', res.json()); // Object {name: "Jeff"}
      * console.log('res.url:', res.url); // https://google.com
      * ```
     */
    public native ResponseOptions merge(ResponseOptionsArgs options /* optional */);
}
