package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDTMFToneChangeEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273578
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDTMFToneChangeEventInit")
public class RTCDTMFToneChangeEventInit extends EventInit
{

    /*
        Properties
    */

    public String tone;

    @JsProperty( name = "tone")
    public native String getTone();

    @JsProperty( name = "tone")
    public native void setTone( String value );
}
