package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Error;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpErrorResponse
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:6120
  * 1 constructors
  * A response that represents an error or failure, either from a
  * non-successful HTTP status, an error while executing the request,
  * or some other failure which occurred during the parsing of the response.
  * 
  * Any error returned on the `Observable` response stream will be
  * wrapped in an `HttpErrorResponse` to provide additional context about
  * the state of the HTTP layer when the error occurred. The error property
  * will contain either a wrapped Error object or the error response returned
  * from the server.
 */
@JsType(isNative=true, namespace="ng", name="HttpErrorResponse")
public class HttpErrorResponse extends Error implements HttpResponseBase
{

    /*
        Constructors
    */
    public HttpErrorResponse(Object init){
        super(null);
    }

    /*
        Properties
    */

    public Object error;

    @JsProperty( name = "error")
    public native Object getError();

    @JsProperty( name = "error")
    public native void setError( Object value );

    /** 
      * All response headers.
     */
    public HttpHeaders headers;

    @JsProperty( name = "headers")
    public native HttpHeaders getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( HttpHeaders value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    /** 
      * Whether the status code falls in the 2xx range.
     */
    public Boolean ok;

    @JsProperty( name = "ok")
    public native Boolean getOk();

    @JsProperty( name = "ok")
    public native void setOk( Boolean value );

    public String stack;

    @JsProperty( name = "stack")
    public native String getStack();

    @JsProperty( name = "stack")
    public native void setStack( String value );

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
}
