package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCPeerConnectionIceEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:276310
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCPeerConnectionIceEventInit")
public class RTCPeerConnectionIceEventInit extends EventInit
{

    /*
        Properties
    */

    public RTCIceCandidate candidate;

    @JsProperty( name = "candidate")
    public native RTCIceCandidate getCandidate();

    @JsProperty( name = "candidate")
    public native void setCandidate( RTCIceCandidate value );
}
