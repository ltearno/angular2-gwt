package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpHeaderResponse
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:4236
  * 1 constructors
  * A partial HTTP response which only includes the status and header data,
  * but no response body.
  * 
  * `HttpHeaderResponse` is a `HttpEvent` available on the response
  * event stream, only when progress events are requested.
 */
@JsType(isNative=true, namespace="ng", name="HttpHeaderResponse")
public class HttpHeaderResponse implements HttpResponseBase
{

    /*
        Constructors
    */
    public HttpHeaderResponse(Object init){
    }

    /*
        Properties
    */

    /** 
      * All response headers.
     */
    public HttpHeaders headers;

    @JsProperty( name = "headers")
    public native HttpHeaders getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( HttpHeaders value );

    /** 
      * Whether the status code falls in the 2xx range.
     */
    public Boolean ok;

    @JsProperty( name = "ok")
    public native Boolean getOk();

    @JsProperty( name = "ok")
    public native void setOk( Boolean value );

    /** 
      * Response status code.
     */
    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    /** 
      * Textual description of response status code.
      * 
      * Do not depend on this.
     */
    public String statusText;

    @JsProperty( name = "statusText")
    public native String getStatusText();

    @JsProperty( name = "statusText")
    public native void setStatusText( String value );

    /** 
      * Type of the response, narrowed to either the full response or the header.
     */
    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );

    /** 
      * URL of the resource retrieved, or null if not available.
     */
    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(clone,843,,)
      * TE Signature : S(clone,)
      * 
     */
    public native HttpHeaderResponse clone();
    /** 
      * Std Signature : S(clone,843,,P(d3))
      * TE Signature : S(clone,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts@4954
      * Copy this `HttpHeaderResponse`, overriding its contents with the
      * given parameter hash.
     */
    public native HttpHeaderResponse clone(Object update /* optional */);
}
