package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend".XHRBackend
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend.d.ts:1842
  * 1 constructors
  * Creates {@link XHRConnection} instances.
  * 
  * This class would typically not be used by end users, but could be
  * overridden if a different backend implementation should be used,
  * such as in a node backend.
  * 
  * ### Example
  * 
  * ```
  * import {Http, MyNodeBackend, HTTP_PROVIDERS, BaseRequestOptions} from '@angular/http';
 */
@JsType(isNative=true, namespace="ng.http", name="XHRBackend")
public class XHRBackend extends ConnectionBackend
{

    /*
        Constructors
    */
    public XHRBackend(BrowserXhr _browserXHR, ResponseOptions _baseResponseOptions, XSRFStrategy _xsrfStrategy){
    }

    /*
        Properties
    */

    public Object _baseResponseOptions;

    @JsProperty( name = "_baseResponseOptions")
    public native Object get_baseResponseOptions();

    @JsProperty( name = "_baseResponseOptions")
    public native void set_baseResponseOptions( Object value );

    public Object _browserXHR;

    @JsProperty( name = "_browserXHR")
    public native Object get_browserXHR();

    @JsProperty( name = "_browserXHR")
    public native void set_browserXHR( Object value );

    public Object _xsrfStrategy;

    @JsProperty( name = "_xsrfStrategy")
    public native Object get_xsrfStrategy();

    @JsProperty( name = "_xsrfStrategy")
    public native void set_xsrfStrategy( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createConnection,1243,,P(d651))
      * TE Signature : S(createConnection,P(d651))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend.d.ts@2838
     */
    public native XHRConnection createConnection(Request request);
}
