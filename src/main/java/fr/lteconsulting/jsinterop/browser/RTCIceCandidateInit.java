package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceCandidateInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:274355
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceCandidateInit")
public class RTCIceCandidateInit
{

    /*
        Properties
    */

    public String candidate;

    @JsProperty( name = "candidate")
    public native String getCandidate();

    @JsProperty( name = "candidate")
    public native void setCandidate( String value );

    public Number sdpMLineIndex;

    @JsProperty( name = "sdpMLineIndex")
    public native Number getSdpMLineIndex();

    @JsProperty( name = "sdpMLineIndex")
    public native void setSdpMLineIndex( Number value );

    public String sdpMid;

    @JsProperty( name = "sdpMid")
    public native String getSdpMid();

    @JsProperty( name = "sdpMid")
    public native void setSdpMid( String value );
}
