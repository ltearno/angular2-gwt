package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend".JSONPBackend_
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend.d.ts:1474
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.http", name="JSONPBackend_")
public class JSONPBackend_ extends JSONPBackend
{

    /*
        Constructors
    */
    public JSONPBackend_(BrowserJsonp _browserJSONP, ResponseOptions _baseResponseOptions){
    }

    /*
        Properties
    */

    public Object _baseResponseOptions;

    @JsProperty( name = "_baseResponseOptions")
    public native Object get_baseResponseOptions();

    @JsProperty( name = "_baseResponseOptions")
    public native void set_baseResponseOptions( Object value );

    public Object _browserJSONP;

    @JsProperty( name = "_browserJSONP")
    public native Object get_browserJSONP();

    @JsProperty( name = "_browserJSONP")
    public native void set_browserJSONP( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createConnection,1242,,P(d651))
      * TE Signature : S(createConnection,P(d651))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend.d.ts@1683
     */
    public native JSONPConnection createConnection(Request request);
}
