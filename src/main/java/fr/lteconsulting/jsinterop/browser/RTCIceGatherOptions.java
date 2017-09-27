package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceGatherOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:274997
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceGatherOptions")
public class RTCIceGatherOptions
{

    /*
        Properties
    */

    public String gatherPolicy;

    @JsProperty( name = "gatherPolicy")
    public native String getGatherPolicy();

    @JsProperty( name = "gatherPolicy")
    public native void setGatherPolicy( String value );

    public Array<RTCIceServer> iceservers;

    @JsProperty( name = "iceservers")
    public native Array<RTCIceServer> getIceservers();

    @JsProperty( name = "iceservers")
    public native void setIceservers( Array<RTCIceServer> value );

    public MSPortRange portRange;

    @JsProperty( name = "portRange")
    public native MSPortRange getPortRange();

    @JsProperty( name = "portRange")
    public native void setPortRange( MSPortRange value );
}
