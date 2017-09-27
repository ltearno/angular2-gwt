package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioBufferSourceNodeEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:286022
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioBufferSourceNodeEventMap")
public class AudioBufferSourceNodeEventMap
{

    /*
        Properties
    */

    public MediaStreamErrorEvent ended;

    @JsProperty( name = "ended")
    public native MediaStreamErrorEvent getEnded();

    @JsProperty( name = "ended")
    public native void setEnded( MediaStreamErrorEvent value );
}
