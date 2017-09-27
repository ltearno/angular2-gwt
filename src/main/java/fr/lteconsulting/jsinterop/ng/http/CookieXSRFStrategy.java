package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend".CookieXSRFStrategy
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend.d.ts:1165
  * 1 constructors
  * `XSRFConfiguration` sets up Cross Site Request Forgery (XSRF) protection for the application
  * using a cookie. See https://www.owasp.org/index.php/Cross-Site_Request_Forgery_(CSRF)
  * for more information on XSRF.
  * 
  * Applications can configure custom cookie and header names by binding an instance of this class
  * with different `cookieName` and `headerName` values. See the main HTTP documentation for more
  * details.
 */
@JsType(isNative=true, namespace="ng.http", name="CookieXSRFStrategy")
public class CookieXSRFStrategy extends XSRFStrategy
{

    /*
        Constructors
    */
    public CookieXSRFStrategy(String _cookieName, String _headerName){
    }

    /*
        Properties
    */

    public Object _cookieName;

    @JsProperty( name = "_cookieName")
    public native Object get_cookieName();

    @JsProperty( name = "_cookieName")
    public native void set_cookieName( Object value );

    public Object _headerName;

    @JsProperty( name = "_headerName")
    public native Object get_headerName();

    @JsProperty( name = "_headerName")
    public native void set_headerName( Object value );
}
