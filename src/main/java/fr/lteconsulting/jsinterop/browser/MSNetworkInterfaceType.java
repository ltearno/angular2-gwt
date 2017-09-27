package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSNetworkInterfaceType
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264537
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSNetworkInterfaceType")
public class MSNetworkInterfaceType
{

    /*
        Properties
    */

    public Boolean interfaceTypeEthernet;

    @JsProperty( name = "interfaceTypeEthernet")
    public native Boolean getInterfaceTypeEthernet();

    @JsProperty( name = "interfaceTypeEthernet")
    public native void setInterfaceTypeEthernet( Boolean value );

    public Boolean interfaceTypePPP;

    @JsProperty( name = "interfaceTypePPP")
    public native Boolean getInterfaceTypePPP();

    @JsProperty( name = "interfaceTypePPP")
    public native void setInterfaceTypePPP( Boolean value );

    public Boolean interfaceTypeTunnel;

    @JsProperty( name = "interfaceTypeTunnel")
    public native Boolean getInterfaceTypeTunnel();

    @JsProperty( name = "interfaceTypeTunnel")
    public native void setInterfaceTypeTunnel( Boolean value );

    public Boolean interfaceTypeWWAN;

    @JsProperty( name = "interfaceTypeWWAN")
    public native Boolean getInterfaceTypeWWAN();

    @JsProperty( name = "interfaceTypeWWAN")
    public native void setInterfaceTypeWWAN( Boolean value );

    public Boolean interfaceTypeWireless;

    @JsProperty( name = "interfaceTypeWireless")
    public native Boolean getInterfaceTypeWireless();

    @JsProperty( name = "interfaceTypeWireless")
    public native void setInterfaceTypeWireless( Boolean value );
}
