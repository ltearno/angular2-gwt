package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SourceBuffer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:644514
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:645019
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SourceBuffer")
public class SourceBuffer implements EventTarget
{

    /*
        Constructors
    */
    public SourceBuffer(){
    }

    /*
        Properties
    */

    public Number appendWindowEnd;

    @JsProperty( name = "appendWindowEnd")
    public native Number getAppendWindowEnd();

    @JsProperty( name = "appendWindowEnd")
    public native void setAppendWindowEnd( Number value );

    public Number appendWindowStart;

    @JsProperty( name = "appendWindowStart")
    public native Number getAppendWindowStart();

    @JsProperty( name = "appendWindowStart")
    public native void setAppendWindowStart( Number value );

    public AudioTrackList audioTracks;

    @JsProperty( name = "audioTracks")
    public native AudioTrackList getAudioTracks();

    @JsProperty( name = "audioTracks")
    public native void setAudioTracks( AudioTrackList value );

    public TimeRanges buffered;

    @JsProperty( name = "buffered")
    public native TimeRanges getBuffered();

    @JsProperty( name = "buffered")
    public native void setBuffered( TimeRanges value );

    public String mode;

    @JsProperty( name = "mode")
    public native String getMode();

    @JsProperty( name = "mode")
    public native void setMode( String value );

    public Number timestampOffset;

    @JsProperty( name = "timestampOffset")
    public native Number getTimestampOffset();

    @JsProperty( name = "timestampOffset")
    public native void setTimestampOffset( Number value );

    public Boolean updating;

    @JsProperty( name = "updating")
    public native Boolean getUpdating();

    @JsProperty( name = "updating")
    public native void setUpdating( Boolean value );

    public VideoTrackList videoTracks;

    @JsProperty( name = "videoTracks")
    public native VideoTrackList getVideoTracks();

    @JsProperty( name = "videoTracks")
    public native void setVideoTracks( VideoTrackList value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(abort,289,,)
      * TE Signature : S(abort,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@644823
     */
    public native void abort();
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
      * Std Signature : S(appendBuffer,289,,P(d100))
      * TE Signature : S(appendBuffer,P(d100))
      * 
     */
    public native void appendBuffer(ArrayBufferView data);
    /** 
      * Std Signature : S(appendBuffer,289,,P(d26))
      * TE Signature : S(appendBuffer,P(d26))
      * 
     */
    public native void appendBuffer(ArrayBuffer data);
    /** 
      * Std Signature : S(appendBuffer,289,,P(dU(-26,100)))
      * TE Signature : S(appendBuffer,P(dU(-26,100)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@644842
     */
    public native void appendBuffer(UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * Std Signature : S(appendStream,289,,P(d101))
      * TE Signature : S(appendStream,P(d101))
      * 
     */
    public native void appendStream(MSStream stream);
    /** 
      * Std Signature : S(appendStream,289,,P(d101),P(d2))
      * TE Signature : S(appendStream,P(d101),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@644903
     */
    public native void appendStream(MSStream stream, Number maxSize /* optional */);
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
      * Std Signature : S(remove,289,,P(d2),P(d2))
      * TE Signature : S(remove,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@644963
     */
    public native void remove(Number start, Number end);
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
}
