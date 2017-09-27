package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCPeerConnectionEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:559157
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCPeerConnectionEventMap")
public class RTCPeerConnectionEventMap
{

    /*
        Properties
    */

    public MediaStreamEvent addstream;

    @JsProperty( name = "addstream")
    public native MediaStreamEvent getAddstream();

    @JsProperty( name = "addstream")
    public native void setAddstream( MediaStreamEvent value );

    public RTCPeerConnectionIceEvent icecandidate;

    @JsProperty( name = "icecandidate")
    public native RTCPeerConnectionIceEvent getIcecandidate();

    @JsProperty( name = "icecandidate")
    public native void setIcecandidate( RTCPeerConnectionIceEvent value );

    public Event iceconnectionstatechange;

    @JsProperty( name = "iceconnectionstatechange")
    public native Event getIceconnectionstatechange();

    @JsProperty( name = "iceconnectionstatechange")
    public native void setIceconnectionstatechange( Event value );

    public Event icegatheringstatechange;

    @JsProperty( name = "icegatheringstatechange")
    public native Event getIcegatheringstatechange();

    @JsProperty( name = "icegatheringstatechange")
    public native void setIcegatheringstatechange( Event value );

    public Event negotiationneeded;

    @JsProperty( name = "negotiationneeded")
    public native Event getNegotiationneeded();

    @JsProperty( name = "negotiationneeded")
    public native void setNegotiationneeded( Event value );

    public MediaStreamEvent removestream;

    @JsProperty( name = "removestream")
    public native MediaStreamEvent getRemovestream();

    @JsProperty( name = "removestream")
    public native void setRemovestream( MediaStreamEvent value );

    public Event signalingstatechange;

    @JsProperty( name = "signalingstatechange")
    public native Event getSignalingstatechange();

    @JsProperty( name = "signalingstatechange")
    public native void setSignalingstatechange( Event value );
}
