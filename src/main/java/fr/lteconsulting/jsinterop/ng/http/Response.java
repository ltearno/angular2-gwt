package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/static_response".Response
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/static_response.d.ts:369
  * 1 constructors
  * Creates `Response` instances from provided values.
  * 
  * Though this object isn't
  * usually instantiated by end-users, it is the primary object interacted with when it comes time to
  * add data to a view.
  * 
  * ### Example
  * 
  * ```
  * http.request('my-friends.txt').subscribe(response => this.friends = response.text());
  * ```
  * 
  * The Response's interface is inspired by the Response constructor defined in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#response-class), but is considered a static value whose body
  * can be accessed many times. There are other differences in the implementation, but this is the
  * most significant.
 */
@JsType(isNative=true, namespace="ng.http", name="Response")
public class Response extends Body
{

    /*
        Constructors
    */
    public Response(ResponseOptions responseOptions){
    }

    /*
        Properties
    */

    /** 
      * Non-standard property
      * 
      * Denotes how many of the response body's bytes have been loaded, for example if the response is
      * the result of a progress event.
     */
    public Number bytesLoaded;

    @JsProperty( name = "bytesLoaded")
    public native Number getBytesLoaded();

    @JsProperty( name = "bytesLoaded")
    public native void setBytesLoaded( Number value );

    /** 
      * Headers object based on the `Headers` class in the [Fetch
      * Spec](https://fetch.spec.whatwg.org/#headers-class).
     */
    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    /** 
      * True if the response's status is within 200-299
     */
    public Boolean ok;

    @JsProperty( name = "ok")
    public native Boolean getOk();

    @JsProperty( name = "ok")
    public native void setOk( Boolean value );

    /** 
      * Status code returned by server.
      * 
      * Defaults to 200.
     */
    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    /** 
      * Text representing the corresponding reason phrase to the `status`, as defined in [ietf rfc 2616
      * section 6.1.1](https://tools.ietf.org/html/rfc2616#section-6.1.1)
      * 
      * Defaults to "OK"
     */
    public String statusText;

    @JsProperty( name = "statusText")
    public native String getStatusText();

    @JsProperty( name = "statusText")
    public native void setStatusText( String value );

    /** 
      * Non-standard property
      * 
      * Denotes how many bytes are expected in the final response body.
     */
    public Number totalBytes;

    @JsProperty( name = "totalBytes")
    public native Number getTotalBytes();

    @JsProperty( name = "totalBytes")
    public native void setTotalBytes( Number value );

    /** 
      * One of "basic", "cors", "default", "error", or "opaque".
      * 
      * Defaults to "default".
     */
    public ResponseType type;

    @JsProperty( name = "type")
    public native ResponseType getType();

    @JsProperty( name = "type")
    public native void setType( ResponseType value );

    /** 
      * URL of response.
      * 
      * Defaults to empty string.
     */
    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}
