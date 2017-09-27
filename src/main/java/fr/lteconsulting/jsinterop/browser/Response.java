package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Response
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:568560
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:568855
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Response")
public class Response extends Body
{

    /*
        Constructors
    */
    public Response(Object body, ResponseInit init){
    }

    /*
        Properties
    */

    public ReadableStream body;

    @JsProperty( name = "body")
    public native ReadableStream getBody();

    @JsProperty( name = "body")
    public native void setBody( ReadableStream value );

    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    public Boolean ok;

    @JsProperty( name = "ok")
    public native Boolean getOk();

    @JsProperty( name = "ok")
    public native void setOk( Boolean value );

    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    public String statusText;

    @JsProperty( name = "statusText")
    public native String getStatusText();

    @JsProperty( name = "statusText")
    public native void setStatusText( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(clone,148,,)
      * TE Signature : S(clone,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@568822
     */
    public native Response clone();
}
