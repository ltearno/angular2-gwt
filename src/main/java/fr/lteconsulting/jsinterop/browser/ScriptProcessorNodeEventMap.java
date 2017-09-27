package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScriptProcessorNodeEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:639494
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScriptProcessorNodeEventMap")
public class ScriptProcessorNodeEventMap
{

    /*
        Properties
    */

    public AudioProcessingEvent audioprocess;

    @JsProperty( name = "audioprocess")
    public native AudioProcessingEvent getAudioprocess();

    @JsProperty( name = "audioprocess")
    public native void setAudioprocess( AudioProcessingEvent value );
}
