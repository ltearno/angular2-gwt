package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebGLContextEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:281772
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLContextEventInit")
public class WebGLContextEventInit extends EventInit
{

    /*
        Properties
    */

    public String statusMessage;

    @JsProperty( name = "statusMessage")
    public native String getStatusMessage();

    @JsProperty( name = "statusMessage")
    public native void setStatusMessage( String value );
}
