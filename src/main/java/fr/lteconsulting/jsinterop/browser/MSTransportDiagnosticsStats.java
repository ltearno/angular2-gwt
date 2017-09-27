package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSTransportDiagnosticsStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:265193
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSTransportDiagnosticsStats")
public class MSTransportDiagnosticsStats extends RTCStats
{

    /*
        Properties
    */

    public Number allocationTimeInMs;

    @JsProperty( name = "allocationTimeInMs")
    public native Number getAllocationTimeInMs();

    @JsProperty( name = "allocationTimeInMs")
    public native void setAllocationTimeInMs( Number value );

    public String baseAddress;

    @JsProperty( name = "baseAddress")
    public native String getBaseAddress();

    @JsProperty( name = "baseAddress")
    public native void setBaseAddress( String value );

    public MSNetworkInterfaceType baseInterface;

    @JsProperty( name = "baseInterface")
    public native MSNetworkInterfaceType getBaseInterface();

    @JsProperty( name = "baseInterface")
    public native void setBaseInterface( MSNetworkInterfaceType value );

    public String iceRole;

    @JsProperty( name = "iceRole")
    public native String getIceRole();

    @JsProperty( name = "iceRole")
    public native void setIceRole( String value );

    public MSIceWarningFlags iceWarningFlags;

    @JsProperty( name = "iceWarningFlags")
    public native MSIceWarningFlags getIceWarningFlags();

    @JsProperty( name = "iceWarningFlags")
    public native void setIceWarningFlags( MSIceWarningFlags value );

    public MSNetworkInterfaceType interfaces;

    @JsProperty( name = "interfaces")
    public native MSNetworkInterfaceType getInterfaces();

    @JsProperty( name = "interfaces")
    public native void setInterfaces( MSNetworkInterfaceType value );

    public String localAddrType;

    @JsProperty( name = "localAddrType")
    public native String getLocalAddrType();

    @JsProperty( name = "localAddrType")
    public native void setLocalAddrType( String value );

    public String localAddress;

    @JsProperty( name = "localAddress")
    public native String getLocalAddress();

    @JsProperty( name = "localAddress")
    public native void setLocalAddress( String value );

    public MSNetworkInterfaceType localInterface;

    @JsProperty( name = "localInterface")
    public native MSNetworkInterfaceType getLocalInterface();

    @JsProperty( name = "localInterface")
    public native void setLocalInterface( MSNetworkInterfaceType value );

    public String localMR;

    @JsProperty( name = "localMR")
    public native String getLocalMR();

    @JsProperty( name = "localMR")
    public native void setLocalMR( String value );

    public Number localMRTCPPort;

    @JsProperty( name = "localMRTCPPort")
    public native Number getLocalMRTCPPort();

    @JsProperty( name = "localMRTCPPort")
    public native void setLocalMRTCPPort( Number value );

    public String localSite;

    @JsProperty( name = "localSite")
    public native String getLocalSite();

    @JsProperty( name = "localSite")
    public native void setLocalSite( String value );

    public String msRtcEngineVersion;

    @JsProperty( name = "msRtcEngineVersion")
    public native String getMsRtcEngineVersion();

    @JsProperty( name = "msRtcEngineVersion")
    public native void setMsRtcEngineVersion( String value );

    public String networkName;

    @JsProperty( name = "networkName")
    public native String getNetworkName();

    @JsProperty( name = "networkName")
    public native void setNetworkName( String value );

    public Number numConsentReqReceived;

    @JsProperty( name = "numConsentReqReceived")
    public native Number getNumConsentReqReceived();

    @JsProperty( name = "numConsentReqReceived")
    public native void setNumConsentReqReceived( Number value );

    public Number numConsentReqSent;

    @JsProperty( name = "numConsentReqSent")
    public native Number getNumConsentReqSent();

    @JsProperty( name = "numConsentReqSent")
    public native void setNumConsentReqSent( Number value );

    public Number numConsentRespReceived;

    @JsProperty( name = "numConsentRespReceived")
    public native Number getNumConsentRespReceived();

    @JsProperty( name = "numConsentRespReceived")
    public native void setNumConsentRespReceived( Number value );

    public Number numConsentRespSent;

    @JsProperty( name = "numConsentRespSent")
    public native Number getNumConsentRespSent();

    @JsProperty( name = "numConsentRespSent")
    public native void setNumConsentRespSent( Number value );

    public Number portRangeMax;

    @JsProperty( name = "portRangeMax")
    public native Number getPortRangeMax();

    @JsProperty( name = "portRangeMax")
    public native void setPortRangeMax( Number value );

    public Number portRangeMin;

    @JsProperty( name = "portRangeMin")
    public native Number getPortRangeMin();

    @JsProperty( name = "portRangeMin")
    public native void setPortRangeMin( Number value );

    public String protocol;

    @JsProperty( name = "protocol")
    public native String getProtocol();

    @JsProperty( name = "protocol")
    public native void setProtocol( String value );

    public String remoteAddrType;

    @JsProperty( name = "remoteAddrType")
    public native String getRemoteAddrType();

    @JsProperty( name = "remoteAddrType")
    public native void setRemoteAddrType( String value );

    public String remoteAddress;

    @JsProperty( name = "remoteAddress")
    public native String getRemoteAddress();

    @JsProperty( name = "remoteAddress")
    public native void setRemoteAddress( String value );

    public String remoteMR;

    @JsProperty( name = "remoteMR")
    public native String getRemoteMR();

    @JsProperty( name = "remoteMR")
    public native void setRemoteMR( String value );

    public Number remoteMRTCPPort;

    @JsProperty( name = "remoteMRTCPPort")
    public native Number getRemoteMRTCPPort();

    @JsProperty( name = "remoteMRTCPPort")
    public native void setRemoteMRTCPPort( Number value );

    public String remoteSite;

    @JsProperty( name = "remoteSite")
    public native String getRemoteSite();

    @JsProperty( name = "remoteSite")
    public native void setRemoteSite( String value );

    public Boolean rtpRtcpMux;

    @JsProperty( name = "rtpRtcpMux")
    public native Boolean getRtpRtcpMux();

    @JsProperty( name = "rtpRtcpMux")
    public native void setRtpRtcpMux( Boolean value );

    public Number stunVer;

    @JsProperty( name = "stunVer")
    public native Number getStunVer();

    @JsProperty( name = "stunVer")
    public native void setStunVer( Number value );
}
