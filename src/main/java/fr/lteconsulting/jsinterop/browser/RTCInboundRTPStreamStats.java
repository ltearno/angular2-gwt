package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCInboundRTPStreamStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:275322
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCInboundRTPStreamStats")
public class RTCInboundRTPStreamStats extends RTCRTPStreamStats
{

    /*
        Properties
    */

    public Number bytesReceived;

    @JsProperty( name = "bytesReceived")
    public native Number getBytesReceived();

    @JsProperty( name = "bytesReceived")
    public native void setBytesReceived( Number value );

    public Number fractionLost;

    @JsProperty( name = "fractionLost")
    public native Number getFractionLost();

    @JsProperty( name = "fractionLost")
    public native void setFractionLost( Number value );

    public Number jitter;

    @JsProperty( name = "jitter")
    public native Number getJitter();

    @JsProperty( name = "jitter")
    public native void setJitter( Number value );

    public Number packetsLost;

    @JsProperty( name = "packetsLost")
    public native Number getPacketsLost();

    @JsProperty( name = "packetsLost")
    public native void setPacketsLost( Number value );

    public Number packetsReceived;

    @JsProperty( name = "packetsReceived")
    public native Number getPacketsReceived();

    @JsProperty( name = "packetsReceived")
    public native void setPacketsReceived( Number value );
}
