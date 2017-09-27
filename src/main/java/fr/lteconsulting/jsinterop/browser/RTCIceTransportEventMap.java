package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceTransportEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:557482
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceTransportEventMap")
public class RTCIceTransportEventMap
{

    /*
        Properties
    */

    public RTCIceCandidatePairChangedEvent candidatepairchange;

    @JsProperty( name = "candidatepairchange")
    public native RTCIceCandidatePairChangedEvent getCandidatepairchange();

    @JsProperty( name = "candidatepairchange")
    public native void setCandidatepairchange( RTCIceCandidatePairChangedEvent value );

    public RTCIceTransportStateChangedEvent icestatechange;

    @JsProperty( name = "icestatechange")
    public native RTCIceTransportStateChangedEvent getIcestatechange();

    @JsProperty( name = "icestatechange")
    public native void setIcestatechange( RTCIceTransportStateChangedEvent value );
}
