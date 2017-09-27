package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ResponseInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:280100
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ResponseInit")
public class ResponseInit
{

    /*
        Properties
    */

    public Object headers;

    @JsProperty( name = "headers")
    public native Object getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Object value );

    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    public String statusText;

    @JsProperty( name = "statusText")
    public native String getStatusText();

    @JsProperty( name = "statusText")
    public native void setStatusText( String value );
}
