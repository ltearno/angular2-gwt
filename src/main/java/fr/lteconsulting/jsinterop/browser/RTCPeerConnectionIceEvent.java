package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCPeerConnectionIceEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:561990
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:562099
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCPeerConnectionIceEvent")
public class RTCPeerConnectionIceEvent extends Event
{

    /*
        Constructors
    */
    public RTCPeerConnectionIceEvent(String type, RTCPeerConnectionIceEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public RTCIceCandidate candidate;

    @JsProperty( name = "candidate")
    public native RTCIceCandidate getCandidate();

    @JsProperty( name = "candidate")
    public native void setCandidate( RTCIceCandidate value );
}
