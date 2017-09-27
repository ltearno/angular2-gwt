package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceCandidatePair
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:274463
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceCandidatePair")
public class RTCIceCandidatePair
{

    /*
        Properties
    */

    public RTCIceCandidateDictionary local;

    @JsProperty( name = "local")
    public native RTCIceCandidateDictionary getLocal();

    @JsProperty( name = "local")
    public native void setLocal( RTCIceCandidateDictionary value );

    public RTCIceCandidateDictionary remote;

    @JsProperty( name = "remote")
    public native RTCIceCandidateDictionary getRemote();

    @JsProperty( name = "remote")
    public native void setRemote( RTCIceCandidateDictionary value );
}
