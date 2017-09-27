package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCConfiguration
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273426
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCConfiguration")
public class RTCConfiguration
{

    /*
        Properties
    */

    public String bundlePolicy;

    @JsProperty( name = "bundlePolicy")
    public native String getBundlePolicy();

    @JsProperty( name = "bundlePolicy")
    public native void setBundlePolicy( String value );

    public Array<RTCIceServer> iceServers;

    @JsProperty( name = "iceServers")
    public native Array<RTCIceServer> getIceServers();

    @JsProperty( name = "iceServers")
    public native void setIceServers( Array<RTCIceServer> value );

    public String iceTransportPolicy;

    @JsProperty( name = "iceTransportPolicy")
    public native String getIceTransportPolicy();

    @JsProperty( name = "iceTransportPolicy")
    public native void setIceTransportPolicy( String value );

    public String peerIdentity;

    @JsProperty( name = "peerIdentity")
    public native String getPeerIdentity();

    @JsProperty( name = "peerIdentity")
    public native void setPeerIdentity( String value );
}
