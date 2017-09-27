package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCOutboundRTPStreamStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:276137
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCOutboundRTPStreamStats")
public class RTCOutboundRTPStreamStats extends RTCRTPStreamStats
{

    /*
        Properties
    */

    public Number bytesSent;

    @JsProperty( name = "bytesSent")
    public native Number getBytesSent();

    @JsProperty( name = "bytesSent")
    public native void setBytesSent( Number value );

    public Number packetsSent;

    @JsProperty( name = "packetsSent")
    public native Number getPacketsSent();

    @JsProperty( name = "packetsSent")
    public native void setPacketsSent( Number value );

    public Number roundTripTime;

    @JsProperty( name = "roundTripTime")
    public native Number getRoundTripTime();

    @JsProperty( name = "roundTripTime")
    public native void setRoundTripTime( Number value );

    public Number targetBitrate;

    @JsProperty( name = "targetBitrate")
    public native Number getTargetBitrate();

    @JsProperty( name = "targetBitrate")
    public native void setTargetBitrate( Number value );
}
