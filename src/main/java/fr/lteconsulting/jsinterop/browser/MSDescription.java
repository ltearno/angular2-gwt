package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSDescription
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262567
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSDescription")
public class MSDescription extends RTCStats
{

    /*
        Properties
    */

    public MSConnectivity connectivity;

    @JsProperty( name = "connectivity")
    public native MSConnectivity getConnectivity();

    @JsProperty( name = "connectivity")
    public native void setConnectivity( MSConnectivity value );

    public String deviceDevName;

    @JsProperty( name = "deviceDevName")
    public native String getDeviceDevName();

    @JsProperty( name = "deviceDevName")
    public native void setDeviceDevName( String value );

    public MSIPAddressInfo localAddr;

    @JsProperty( name = "localAddr")
    public native MSIPAddressInfo getLocalAddr();

    @JsProperty( name = "localAddr")
    public native void setLocalAddr( MSIPAddressInfo value );

    public MSNetworkConnectivityInfo networkconnectivity;

    @JsProperty( name = "networkconnectivity")
    public native MSNetworkConnectivityInfo getNetworkconnectivity();

    @JsProperty( name = "networkconnectivity")
    public native void setNetworkconnectivity( MSNetworkConnectivityInfo value );

    public MSIPAddressInfo reflexiveLocalIPAddr;

    @JsProperty( name = "reflexiveLocalIPAddr")
    public native MSIPAddressInfo getReflexiveLocalIPAddr();

    @JsProperty( name = "reflexiveLocalIPAddr")
    public native void setReflexiveLocalIPAddr( MSIPAddressInfo value );

    public MSIPAddressInfo remoteAddr;

    @JsProperty( name = "remoteAddr")
    public native MSIPAddressInfo getRemoteAddr();

    @JsProperty( name = "remoteAddr")
    public native void setRemoteAddr( MSIPAddressInfo value );

    public String transport;

    @JsProperty( name = "transport")
    public native String getTransport();

    @JsProperty( name = "transport")
    public native void setTransport( String value );
}
