package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceTransportStateChangedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:558922
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:559025
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceTransportStateChangedEvent")
public class RTCIceTransportStateChangedEvent extends Event
{

    /*
        Constructors
    */
    public RTCIceTransportStateChangedEvent(){
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
