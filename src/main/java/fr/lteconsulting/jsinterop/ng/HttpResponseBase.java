package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpResponseBase
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:3013

  * Base class for both `HttpResponse` and `HttpHeaderResponse`.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface HttpResponseBase
{

    /*
        Properties
    */

    /** 
      * All response headers.
     */
    @JsProperty( name = "headers")
    HttpHeaders getHeaders();

    @JsProperty( name = "headers")
    void setHeaders( HttpHeaders value );

    /** 
      * Whether the status code falls in the 2xx range.
     */
    @JsProperty( name = "ok")
    Boolean getOk();

    @JsProperty( name = "ok")
    void setOk( Boolean value );

    /** 
      * Response status code.
     */
    @JsProperty( name = "status")
    Number getStatus();

    @JsProperty( name = "status")
    void setStatus( Number value );

    /** 
      * Textual description of response status code.
      * 
      * Do not depend on this.
     */
    @JsProperty( name = "statusText")
    String getStatusText();

    @JsProperty( name = "statusText")
    void setStatusText( String value );

    /** 
      * Type of the response, narrowed to either the full response or the header.
     */
    @JsProperty( name = "type")
    Number getType();

    @JsProperty( name = "type")
    void setType( Number value );

    /** 
      * URL of the resource retrieved, or null if not available.
     */
    @JsProperty( name = "url")
    String getUrl();

    @JsProperty( name = "url")
    void setUrl( String value );
}
