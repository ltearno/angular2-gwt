package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebGLContextEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:665654
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:665750
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLContextEvent")
public class WebGLContextEvent extends Event
{

    /*
        Constructors
    */
    public WebGLContextEvent(String typeArg, WebGLContextEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public String statusMessage;

    @JsProperty( name = "statusMessage")
    public native String getStatusMessage();

    @JsProperty( name = "statusMessage")
    public native void setStatusMessage( String value );
}
