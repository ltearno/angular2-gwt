package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDTMFToneChangeEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:553478
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:553570
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDTMFToneChangeEvent")
public class RTCDTMFToneChangeEvent extends Event
{

    /*
        Constructors
    */
    public RTCDTMFToneChangeEvent(String typeArg, RTCDTMFToneChangeEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public String tone;

    @JsProperty( name = "tone")
    public native String getTone();

    @JsProperty( name = "tone")
    public native void setTone( String value );
}
