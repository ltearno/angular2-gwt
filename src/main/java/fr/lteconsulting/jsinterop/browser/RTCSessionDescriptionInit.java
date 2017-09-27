package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCSessionDescriptionInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278911
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSessionDescriptionInit")
public class RTCSessionDescriptionInit
{

    /*
        Properties
    */

    public String sdp;

    @JsProperty( name = "sdp")
    public native String getSdp();

    @JsProperty( name = "sdp")
    public native void setSdp( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
