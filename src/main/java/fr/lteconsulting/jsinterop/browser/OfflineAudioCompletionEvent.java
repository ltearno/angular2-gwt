package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: OfflineAudioCompletionEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:537845
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:537957
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OfflineAudioCompletionEvent")
public class OfflineAudioCompletionEvent extends Event
{

    /*
        Constructors
    */
    public OfflineAudioCompletionEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public AudioBuffer renderedBuffer;

    @JsProperty( name = "renderedBuffer")
    public native AudioBuffer getRenderedBuffer();

    @JsProperty( name = "renderedBuffer")
    public native void setRenderedBuffer( AudioBuffer value );
}
