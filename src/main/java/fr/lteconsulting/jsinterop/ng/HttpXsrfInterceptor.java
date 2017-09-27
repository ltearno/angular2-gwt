package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xsrf".HttpXsrfInterceptor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xsrf.d.ts:1127
  * 1 constructors
  * `HttpInterceptor` which adds an XSRF token to eligible outgoing requests.
 */
@JsType(isNative=true, namespace="ng", name="HttpXsrfInterceptor")
public class HttpXsrfInterceptor extends HttpInterceptor
{

    /*
        Constructors
    */
    public HttpXsrfInterceptor(HttpXsrfTokenExtractor tokenService, String headerName){
    }

    /*
        Properties
    */

    public Object headerName;

    @JsProperty( name = "headerName")
    public native Object getHeaderName();

    @JsProperty( name = "headerName")
    public native void setHeaderName( Object value );

    public Object tokenService;

    @JsProperty( name = "tokenService")
    public native Object getTokenService();

    @JsProperty( name = "tokenService")
    public native void setTokenService( Object value );
}
