package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDtlsTransportEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:553730
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtlsTransportEventMap")
public class RTCDtlsTransportEventMap
{

    /*
        Properties
    */

    public RTCDtlsTransportStateChangedEvent dtlsstatechange;

    @JsProperty( name = "dtlsstatechange")
    public native RTCDtlsTransportStateChangedEvent getDtlsstatechange();

    @JsProperty( name = "dtlsstatechange")
    public native void setDtlsstatechange( RTCDtlsTransportStateChangedEvent value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );
}
