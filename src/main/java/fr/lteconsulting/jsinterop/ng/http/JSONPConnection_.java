package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend".JSONPConnection_
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/jsonp_backend.d.ts:966
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.http", name="JSONPConnection_")
public class JSONPConnection_ extends JSONPConnection
{

    /*
        Constructors
    */
    public JSONPConnection_(Request req, BrowserJsonp _dom, ResponseOptions baseResponseOptions){
    }

    /*
        Properties
    */

    public Object _dom;

    @JsProperty( name = "_dom")
    public native Object get_dom();

    @JsProperty( name = "_dom")
    public native void set_dom( Object value );

    public Object _finished;

    @JsProperty( name = "_finished")
    public native Object get_finished();

    @JsProperty( name = "_finished")
    public native void set_finished( Object value );

    public Object _id;

    @JsProperty( name = "_id")
    public native Object get_id();

    @JsProperty( name = "_id")
    public native void set_id( Object value );

    public Object _responseData;

    @JsProperty( name = "_responseData")
    public native Object get_responseData();

    @JsProperty( name = "_responseData")
    public native void set_responseData( Object value );

    public Object _script;

    @JsProperty( name = "_script")
    public native Object get_script();

    @JsProperty( name = "_script")
    public native void set_script( Object value );

    public Object baseResponseOptions;

    @JsProperty( name = "baseResponseOptions")
    public native Object getBaseResponseOptions();

    @JsProperty( name = "baseResponseOptions")
    public native void setBaseResponseOptions( Object value );
}
