package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: OfflineAudioContextEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:538074
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OfflineAudioContextEventMap")
public class OfflineAudioContextEventMap extends AudioContextEventMap
{

    /*
        Properties
    */

    public OfflineAudioCompletionEvent complete;

    @JsProperty( name = "complete")
    public native OfflineAudioCompletionEvent getComplete();

    @JsProperty( name = "complete")
    public native void setComplete( OfflineAudioCompletionEvent value );
}
