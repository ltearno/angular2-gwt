package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceServer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:275230
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceServer")
public class RTCIceServer
{

    /*
        Properties
    */

    public String credential;

    @JsProperty( name = "credential")
    public native String getCredential();

    @JsProperty( name = "credential")
    public native void setCredential( String value );

    public Object urls;

    @JsProperty( name = "urls")
    public native Object getUrls();

    @JsProperty( name = "urls")
    public native void setUrls( Object value );

    public String username;

    @JsProperty( name = "username")
    public native String getUsername();

    @JsProperty( name = "username")
    public native void setUsername( String value );
}
