package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDtlsTransportStateChangedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:554768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:554872
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtlsTransportStateChangedEvent")
public class RTCDtlsTransportStateChangedEvent extends Event
{

    /*
        Constructors
    */
    public RTCDtlsTransportStateChangedEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public String state;

    @JsProperty( name = "state")
    public native String getState();

    @JsProperty( name = "state")
    public native void setState( String value );
}
