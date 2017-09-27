package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpSenderEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:563403
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpSenderEventMap")
public class RTCRtpSenderEventMap
{

    /*
        Properties
    */

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public RTCSsrcConflictEvent ssrcconflict;

    @JsProperty( name = "ssrcconflict")
    public native RTCSsrcConflictEvent getSsrcconflict();

    @JsProperty( name = "ssrcconflict")
    public native void setSsrcconflict( RTCSsrcConflictEvent value );
}
