package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceCandidatePairStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:274577
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceCandidatePairStats")
public class RTCIceCandidatePairStats extends RTCStats
{

    /*
        Properties
    */

    public Number availableIncomingBitrate;

    @JsProperty( name = "availableIncomingBitrate")
    public native Number getAvailableIncomingBitrate();

    @JsProperty( name = "availableIncomingBitrate")
    public native void setAvailableIncomingBitrate( Number value );

    public Number availableOutgoingBitrate;

    @JsProperty( name = "availableOutgoingBitrate")
    public native Number getAvailableOutgoingBitrate();

    @JsProperty( name = "availableOutgoingBitrate")
    public native void setAvailableOutgoingBitrate( Number value );

    public Number bytesReceived;

    @JsProperty( name = "bytesReceived")
    public native Number getBytesReceived();

    @JsProperty( name = "bytesReceived")
    public native void setBytesReceived( Number value );

    public Number bytesSent;

    @JsProperty( name = "bytesSent")
    public native Number getBytesSent();

    @JsProperty( name = "bytesSent")
    public native void setBytesSent( Number value );

    public String localCandidateId;

    @JsProperty( name = "localCandidateId")
    public native String getLocalCandidateId();

    @JsProperty( name = "localCandidateId")
    public native void setLocalCandidateId( String value );

    public Boolean nominated;

    @JsProperty( name = "nominated")
    public native Boolean getNominated();

    @JsProperty( name = "nominated")
    public native void setNominated( Boolean value );

    public Number priority;

    @JsProperty( name = "priority")
    public native Number getPriority();

    @JsProperty( name = "priority")
    public native void setPriority( Number value );

    public Boolean readable;

    @JsProperty( name = "readable")
    public native Boolean getReadable();

    @JsProperty( name = "readable")
    public native void setReadable( Boolean value );

    public String remoteCandidateId;

    @JsProperty( name = "remoteCandidateId")
    public native String getRemoteCandidateId();

    @JsProperty( name = "remoteCandidateId")
    public native void setRemoteCandidateId( String value );

    public Number roundTripTime;

    @JsProperty( name = "roundTripTime")
    public native Number getRoundTripTime();

    @JsProperty( name = "roundTripTime")
    public native void setRoundTripTime( Number value );

    public String state;

    @JsProperty( name = "state")
    public native String getState();

    @JsProperty( name = "state")
    public native void setState( String value );

    public String transportId;

    @JsProperty( name = "transportId")
    public native String getTransportId();

    @JsProperty( name = "transportId")
    public native void setTransportId( String value );

    public Boolean writable;

    @JsProperty( name = "writable")
    public native Boolean getWritable();

    @JsProperty( name = "writable")
    public native void setWritable( Boolean value );
}
