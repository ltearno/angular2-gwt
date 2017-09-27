package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:275121
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceParameters")
public class RTCIceParameters
{

    /*
        Properties
    */

    public Boolean iceLite;

    @JsProperty( name = "iceLite")
    public native Boolean getIceLite();

    @JsProperty( name = "iceLite")
    public native void setIceLite( Boolean value );

    public String password;

    @JsProperty( name = "password")
    public native String getPassword();

    @JsProperty( name = "password")
    public native void setPassword( String value );

    public String usernameFragment;

    @JsProperty( name = "usernameFragment")
    public native String getUsernameFragment();

    @JsProperty( name = "usernameFragment")
    public native void setUsernameFragment( String value );
}
