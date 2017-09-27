package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioBufferSourceNode
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:286103
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:286817
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioBufferSourceNode")
public class AudioBufferSourceNode extends AudioNode
{

    /*
        Constructors
    */
    public AudioBufferSourceNode(){
    }

    /*
        Properties
    */

    public AudioBuffer buffer;

    @JsProperty( name = "buffer")
    public native AudioBuffer getBuffer();

    @JsProperty( name = "buffer")
    public native void setBuffer( AudioBuffer value );

    public AudioParam detune;

    @JsProperty( name = "detune")
    public native AudioParam getDetune();

    @JsProperty( name = "detune")
    public native void setDetune( AudioParam value );

    public Boolean loop;

    @JsProperty( name = "loop")
    public native Boolean getLoop();

    @JsProperty( name = "loop")
    public native void setLoop( Boolean value );

    public Number loopEnd;

    @JsProperty( name = "loopEnd")
    public native Number getLoopEnd();

    @JsProperty( name = "loopEnd")
    public native void setLoopEnd( Number value );

    public Number loopStart;

    @JsProperty( name = "loopStart")
    public native Number getLoopStart();

    @JsProperty( name = "loopStart")
    public native void setLoopStart( Number value );

    public Function1<MediaStreamErrorEvent, Object> onended;

    @JsProperty( name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();

    @JsProperty( name = "onended")
    public native void setOnended( Function1<MediaStreamErrorEvent, Object> value );

    public AudioParam playbackRate;

    @JsProperty( name = "playbackRate")
    public native AudioParam getPlaybackRate();

    @JsProperty( name = "playbackRate")
    public native void setPlaybackRate( AudioParam value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1))
      * TE Signature : S(addEventListener,P(d1))
      * 
     */
    public native void addEventListener(String type);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1))
      * TE Signature : S(removeEventListener,P(d1))
      * 
     */
    public native void removeEventListener(String type);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138))
      * TE Signature : S(removeEventListener,P(d1),P(d138))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(start,289,,)
      * TE Signature : S(start,)
      * 
     */
    public native void start();
    /** 
      * Std Signature : S(start,289,,P(d2))
      * TE Signature : S(start,P(d2))
      * 
     */
    public native void start(Number when /* optional */);
    /** 
      * Std Signature : S(start,289,,P(d2),P(d2))
      * TE Signature : S(start,P(d2),P(d2))
      * 
     */
    public native void start(Number when /* optional */, Number offset /* optional */);
    /** 
      * Std Signature : S(start,289,,P(d2),P(d2),P(d2))
      * TE Signature : S(start,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@286406
     */
    public native void start(Number when /* optional */, Number offset /* optional */, Number duration /* optional */);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    public native void stop();
    /** 
      * Std Signature : S(stop,289,,P(d2))
      * TE Signature : S(stop,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@286474
     */
    public native void stop(Number when /* optional */);
}
