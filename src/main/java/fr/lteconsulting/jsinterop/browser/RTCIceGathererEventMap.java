package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceGathererEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:556364
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceGathererEventMap")
public class RTCIceGathererEventMap
{

    /*
        Properties
    */

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public RTCIceGathererEvent localcandidate;

    @JsProperty( name = "localcandidate")
    public native RTCIceGathererEvent getLocalcandidate();

    @JsProperty( name = "localcandidate")
    public native void setLocalcandidate( RTCIceGathererEvent value );
}
