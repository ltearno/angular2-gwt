package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpReceiverEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:562268
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpReceiverEventMap")
public class RTCRtpReceiverEventMap
{

    /*
        Properties
    */

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );
}
