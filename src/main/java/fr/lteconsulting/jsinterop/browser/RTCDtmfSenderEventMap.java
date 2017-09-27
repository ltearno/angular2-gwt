package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDtmfSenderEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:555007
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtmfSenderEventMap")
public class RTCDtmfSenderEventMap
{

    /*
        Properties
    */

    public RTCDTMFToneChangeEvent tonechange;

    @JsProperty( name = "tonechange")
    public native RTCDTMFToneChangeEvent getTonechange();

    @JsProperty( name = "tonechange")
    public native void setTonechange( RTCDTMFToneChangeEvent value );
}
