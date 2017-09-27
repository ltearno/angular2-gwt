package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioProcessingEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:290900
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:291077
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioProcessingEvent")
public class AudioProcessingEvent extends Event
{

    /*
        Constructors
    */
    public AudioProcessingEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public AudioBuffer inputBuffer;

    @JsProperty( name = "inputBuffer")
    public native AudioBuffer getInputBuffer();

    @JsProperty( name = "inputBuffer")
    public native void setInputBuffer( AudioBuffer value );

    public AudioBuffer outputBuffer;

    @JsProperty( name = "outputBuffer")
    public native AudioBuffer getOutputBuffer();

    @JsProperty( name = "outputBuffer")
    public native void setOutputBuffer( AudioBuffer value );

    public Number playbackTime;

    @JsProperty( name = "playbackTime")
    public native Number getPlaybackTime();

    @JsProperty( name = "playbackTime")
    public native void setPlaybackTime( Number value );
}
