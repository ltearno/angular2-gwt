package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSIPAddressInfo
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:263004
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSIPAddressInfo")
public class MSIPAddressInfo
{

    /*
        Properties
    */

    public String ipAddr;

    @JsProperty( name = "ipAddr")
    public native String getIpAddr();

    @JsProperty( name = "ipAddr")
    public native void setIpAddr( String value );

    public String manufacturerMacAddrMask;

    @JsProperty( name = "manufacturerMacAddrMask")
    public native String getManufacturerMacAddrMask();

    @JsProperty( name = "manufacturerMacAddrMask")
    public native void setManufacturerMacAddrMask( String value );

    public Number port;

    @JsProperty( name = "port")
    public native Number getPort();

    @JsProperty( name = "port")
    public native void setPort( Number value );
}
