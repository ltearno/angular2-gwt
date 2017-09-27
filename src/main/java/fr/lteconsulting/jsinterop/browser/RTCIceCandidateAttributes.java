package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceCandidateAttributes
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273828
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceCandidateAttributes")
public class RTCIceCandidateAttributes extends RTCStats
{

    /*
        Properties
    */

    public String addressSourceUrl;

    @JsProperty( name = "addressSourceUrl")
    public native String getAddressSourceUrl();

    @JsProperty( name = "addressSourceUrl")
    public native void setAddressSourceUrl( String value );

    public String candidateType;

    @JsProperty( name = "candidateType")
    public native String getCandidateType();

    @JsProperty( name = "candidateType")
    public native void setCandidateType( String value );

    public String ipAddress;

    @JsProperty( name = "ipAddress")
    public native String getIpAddress();

    @JsProperty( name = "ipAddress")
    public native void setIpAddress( String value );

    public Number portNumber;

    @JsProperty( name = "portNumber")
    public native Number getPortNumber();

    @JsProperty( name = "portNumber")
    public native void setPortNumber( Number value );

    public Number priority;

    @JsProperty( name = "priority")
    public native Number getPriority();

    @JsProperty( name = "priority")
    public native void setPriority( Number value );

    public String transport;

    @JsProperty( name = "transport")
    public native String getTransport();

    @JsProperty( name = "transport")
    public native void setTransport( String value );
}
