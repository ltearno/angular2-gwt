package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SpeechSynthesisEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:645343
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisEventMap")
public class SpeechSynthesisEventMap
{

    /*
        Properties
    */

    public Event voiceschanged;

    @JsProperty( name = "voiceschanged")
    public native Event getVoiceschanged();

    @JsProperty( name = "voiceschanged")
    public native void setVoiceschanged( Event value );
}
