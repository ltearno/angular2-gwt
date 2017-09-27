package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStream
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:521066
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:522024
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStream")
public class MediaStream implements EventTarget
{

    /*
        Constructors
    */
    public MediaStream(UnionOfArrayOfMediaStreamTrackAndMediaStream streamOrTracks){
    }

    /*
        Properties
    */

    public Boolean active;

    @JsProperty( name = "active")
    public native Boolean getActive();

    @JsProperty( name = "active")
    public native void setActive( Boolean value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public Function1<Event, Object> onactive;

    @JsProperty( name = "onactive")
    public native Function1<Event, Object> getOnactive();

    @JsProperty( name = "onactive")
    public native void setOnactive( Function1<Event, Object> value );

    public Function1<MediaStreamTrackEvent, Object> onaddtrack;

    @JsProperty( name = "onaddtrack")
    public native Function1<MediaStreamTrackEvent, Object> getOnaddtrack();

    @JsProperty( name = "onaddtrack")
    public native void setOnaddtrack( Function1<MediaStreamTrackEvent, Object> value );

    public Function1<Event, Object> oninactive;

    @JsProperty( name = "oninactive")
    public native Function1<Event, Object> getOninactive();

    @JsProperty( name = "oninactive")
    public native void setOninactive( Function1<Event, Object> value );

    public Function1<MediaStreamTrackEvent, Object> onremovetrack;

    @JsProperty( name = "onremovetrack")
    public native Function1<MediaStreamTrackEvent, Object> getOnremovetrack();

    @JsProperty( name = "onremovetrack")
    public native void setOnremovetrack( Function1<MediaStreamTrackEvent, Object> value );

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
      * Std Signature : S(addTrack,289,,P(d82))
      * TE Signature : S(addTrack,P(d82))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521424
     */
    public native void addTrack(MediaStreamTrack track);
    /** 
      * Std Signature : S(clone,79,,)
      * TE Signature : S(clone,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521469
     */
    public native MediaStream clone();
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
      * Std Signature : S(getAudioTracks,7<82>,,)
      * TE Signature : S(getAudioTracks,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521495
     */
    public native Array<MediaStreamTrack> getAudioTracks();
    /** 
      * Std Signature : S(getTrackById,82,,P(d1))
      * TE Signature : S(getTrackById,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521537
     */
    public native MediaStreamTrack getTrackById(String trackId);
    /** 
      * Std Signature : S(getTracks,7<82>,,)
      * TE Signature : S(getTracks,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521597
     */
    public native Array<MediaStreamTrack> getTracks();
    /** 
      * Std Signature : S(getVideoTracks,7<82>,,)
      * TE Signature : S(getVideoTracks,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521634
     */
    public native Array<MediaStreamTrack> getVideoTracks();
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
      * Std Signature : S(removeTrack,289,,P(d82))
      * TE Signature : S(removeTrack,P(d82))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521676
     */
    public native void removeTrack(MediaStreamTrack track);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@521724
     */
    public native void stop();
}
