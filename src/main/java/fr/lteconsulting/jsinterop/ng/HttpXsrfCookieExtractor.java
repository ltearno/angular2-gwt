package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xsrf".HttpXsrfCookieExtractor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xsrf.d.ts:755
  * 1 constructors
  * `HttpXsrfTokenExtractor` which retrieves the token from a cookie.
 */
@JsType(isNative=true, namespace="ng", name="HttpXsrfCookieExtractor")
public class HttpXsrfCookieExtractor extends HttpXsrfTokenExtractor
{

    /*
        Constructors
    */
    public HttpXsrfCookieExtractor(Object doc, String platform, String cookieName){
    }

    /*
        Properties
    */

    public Object cookieName;

    @JsProperty( name = "cookieName")
    public native Object getCookieName();

    @JsProperty( name = "cookieName")
    public native void setCookieName( Object value );

    public Object doc;

    @JsProperty( name = "doc")
    public native Object getDoc();

    @JsProperty( name = "doc")
    public native void setDoc( Object value );

    public Object lastCookieString;

    @JsProperty( name = "lastCookieString")
    public native Object getLastCookieString();

    @JsProperty( name = "lastCookieString")
    public native void setLastCookieString( Object value );

    public Object lastToken;

    @JsProperty( name = "lastToken")
    public native Object getLastToken();

    @JsProperty( name = "lastToken")
    public native void setLastToken( Object value );

    public Object platform;

    @JsProperty( name = "platform")
    public native Object getPlatform();

    @JsProperty( name = "platform")
    public native void setPlatform( Object value );
}
