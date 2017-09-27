package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceCandidateDictionary
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:274080
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceCandidateDictionary")
public class RTCIceCandidateDictionary
{

    /*
        Properties
    */

    public String foundation;

    @JsProperty( name = "foundation")
    public native String getFoundation();

    @JsProperty( name = "foundation")
    public native void setFoundation( String value );

    public String ip;

    @JsProperty( name = "ip")
    public native String getIp();

    @JsProperty( name = "ip")
    public native void setIp( String value );

    public String msMTurnSessionId;

    @JsProperty( name = "msMTurnSessionId")
    public native String getMsMTurnSessionId();

    @JsProperty( name = "msMTurnSessionId")
    public native void setMsMTurnSessionId( String value );

    public Number port;

    @JsProperty( name = "port")
    public native Number getPort();

    @JsProperty( name = "port")
    public native void setPort( Number value );

    public Number priority;

    @JsProperty( name = "priority")
    public native Number getPriority();

    @JsProperty( name = "priority")
    public native void setPriority( Number value );

    public String protocol;

    @JsProperty( name = "protocol")
    public native String getProtocol();

    @JsProperty( name = "protocol")
    public native void setProtocol( String value );

    public String relatedAddress;

    @JsProperty( name = "relatedAddress")
    public native String getRelatedAddress();

    @JsProperty( name = "relatedAddress")
    public native void setRelatedAddress( String value );

    public Number relatedPort;

    @JsProperty( name = "relatedPort")
    public native Number getRelatedPort();

    @JsProperty( name = "relatedPort")
    public native void setRelatedPort( Number value );

    public String tcpType;

    @JsProperty( name = "tcpType")
    public native String getTcpType();

    @JsProperty( name = "tcpType")
    public native void setTcpType( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
