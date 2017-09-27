package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCTransportStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:279481
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCTransportStats")
public class RTCTransportStats extends RTCStats
{

    /*
        Properties
    */

    public Boolean activeConnection;

    @JsProperty( name = "activeConnection")
    public native Boolean getActiveConnection();

    @JsProperty( name = "activeConnection")
    public native void setActiveConnection( Boolean value );

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

    public String localCertificateId;

    @JsProperty( name = "localCertificateId")
    public native String getLocalCertificateId();

    @JsProperty( name = "localCertificateId")
    public native void setLocalCertificateId( String value );

    public String remoteCertificateId;

    @JsProperty( name = "remoteCertificateId")
    public native String getRemoteCertificateId();

    @JsProperty( name = "remoteCertificateId")
    public native void setRemoteCertificateId( String value );

    public String rtcpTransportStatsId;

    @JsProperty( name = "rtcpTransportStatsId")
    public native String getRtcpTransportStatsId();

    @JsProperty( name = "rtcpTransportStatsId")
    public native void setRtcpTransportStatsId( String value );

    public String selectedCandidatePairId;

    @JsProperty( name = "selectedCandidatePairId")
    public native String getSelectedCandidatePairId();

    @JsProperty( name = "selectedCandidatePairId")
    public native void setSelectedCandidatePairId( String value );
}
