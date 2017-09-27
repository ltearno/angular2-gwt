package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RequestInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:279810
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RequestInit")
public class RequestInit
{

    /*
        Properties
    */

    public Object body;

    @JsProperty( name = "body")
    public native Object getBody();

    @JsProperty( name = "body")
    public native void setBody( Object value );

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

    public Object headers;

    @JsProperty( name = "headers")
    public native Object getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Object value );

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

    public Object window;

    @JsProperty( name = "window")
    public native Object getWindow();

    @JsProperty( name = "window")
    public native void setWindow( Object value );
}
