package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/interceptor".HttpInterceptorHandler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/interceptor.d.ts:1752
  * 1 constructors
  * `HttpHandler` which applies an `HttpInterceptor` to an `HttpRequest`.
 */
@JsType(isNative=true, namespace="ng", name="HttpInterceptorHandler")
public class HttpInterceptorHandler extends HttpHandler
{

    /*
        Constructors
    */
    public HttpInterceptorHandler(HttpHandler next, HttpInterceptor interceptor){
    }

    /*
        Properties
    */

    public Object interceptor;

    @JsProperty( name = "interceptor")
    public native Object getInterceptor();

    @JsProperty( name = "interceptor")
    public native void setInterceptor( Object value );

    public Object next;

    @JsProperty( name = "next")
    public native Object getNext();

    @JsProperty( name = "next")
    public native void setNext( Object value );
}
