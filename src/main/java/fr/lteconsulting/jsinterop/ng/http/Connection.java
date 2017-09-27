package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces".Connection
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces.d.ts:738

  * Abstract class from which real connections are derived.
 */
@JsType(isNative=true, namespace="ng.http", name="Connection")
public class Connection
{

    /*
        Properties
    */

    public ReadyState readyState;

    @JsProperty( name = "readyState")
    public native ReadyState getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( ReadyState value );

    public Request request;

    @JsProperty( name = "request")
    public native Request getRequest();

    @JsProperty( name = "request")
    public native void setRequest( Request value );

    public Object response;

    @JsProperty( name = "response")
    public native Object getResponse();

    @JsProperty( name = "response")
    public native void setResponse( Object value );
}
