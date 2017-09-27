package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Request
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:567981
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:568460
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Request")
public class Request extends Body
{

    /*
        Constructors
    */
    public Request(RequestInfo_UnionOfRequestAndString input, RequestInit init){
    }

    /*
        Properties
    */

    public String cache;

    @JsProperty( name = "cache")
    public native String getCache();

    @JsProperty( name = "cache")
    public native void setCache( String value );

    public String credentials;

    @JsProperty( name = "credentials")
    public native String getCredentials();

    @JsProperty( name = "credentials")
    public native void setCredentials( String value );

    public String destination;

    @JsProperty( name = "destination")
    public native String getDestination();

    @JsProperty( name = "destination")
    public native void setDestination( String value );

    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    public String integrity;

    @JsProperty( name = "integrity")
    public native String getIntegrity();

    @JsProperty( name = "integrity")
    public native void setIntegrity( String value );

    public Boolean keepalive;

    @JsProperty( name = "keepalive")
    public native Boolean getKeepalive();

    @JsProperty( name = "keepalive")
    public native void setKeepalive( Boolean value );

    public String method;

    @JsProperty( name = "method")
    public native String getMethod();

    @JsProperty( name = "method")
    public native void setMethod( String value );

    public String mode;

    @JsProperty( name = "mode")
    public native String getMode();

    @JsProperty( name = "mode")
    public native void setMode( String value );

    public String redirect;

    @JsProperty( name = "redirect")
    public native String getRedirect();

    @JsProperty( name = "redirect")
    public native void setRedirect( String value );

    public String referrer;

    @JsProperty( name = "referrer")
    public native String getReferrer();

    @JsProperty( name = "referrer")
    public native void setReferrer( String value );

    public String referrerPolicy;

    @JsProperty( name = "referrerPolicy")
    public native String getReferrerPolicy();

    @JsProperty( name = "referrerPolicy")
    public native void setReferrerPolicy( String value );

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
      * Std Signature : S(clone,146,,)
      * TE Signature : S(clone,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@568428
     */
    public native Request clone();
}
