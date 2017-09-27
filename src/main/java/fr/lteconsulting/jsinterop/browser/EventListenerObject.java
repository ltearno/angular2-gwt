package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: EventListenerObject
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739415
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EventListenerObject")
public class EventListenerObject
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(handleEvent,289,,P(d77))
      * TE Signature : S(handleEvent,P(d77))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@739453
     */
    public native void handleEvent(Event evt);
}
