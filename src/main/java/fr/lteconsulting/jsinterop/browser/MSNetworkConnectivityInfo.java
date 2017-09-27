package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSNetworkConnectivityInfo
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264414
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSNetworkConnectivityInfo")
public class MSNetworkConnectivityInfo
{

    /*
        Properties
    */

    public Number linkspeed;

    @JsProperty( name = "linkspeed")
    public native Number getLinkspeed();

    @JsProperty( name = "linkspeed")
    public native void setLinkspeed( Number value );

    public String networkConnectionDetails;

    @JsProperty( name = "networkConnectionDetails")
    public native String getNetworkConnectionDetails();

    @JsProperty( name = "networkConnectionDetails")
    public native void setNetworkConnectionDetails( String value );

    public Boolean vpn;

    @JsProperty( name = "vpn")
    public native Boolean getVpn();

    @JsProperty( name = "vpn")
    public native void setVpn( Boolean value );
}
