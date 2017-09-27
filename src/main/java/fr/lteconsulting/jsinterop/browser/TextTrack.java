package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextTrack
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:654885
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:655911
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrack")
public class TextTrack implements EventTarget
{

    /*
        Constructors
    */
    public TextTrack(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="TextTrack", name="DISABLED")
    public static Number DISABLED;

    @JsProperty(namespace="TextTrack", name="ERROR")
    public static Number ERROR;

    @JsProperty(namespace="TextTrack", name="HIDDEN")
    public static Number HIDDEN;

    @JsProperty(namespace="TextTrack", name="LOADED")
    public static Number LOADED;

    @JsProperty(namespace="TextTrack", name="LOADING")
    public static Number LOADING;

    @JsProperty(namespace="TextTrack", name="NONE")
    public static Number NONE;

    @JsProperty(namespace="TextTrack", name="SHOWING")
    public static Number SHOWING;

    /*
        Properties
    */

    public TextTrackCueList activeCues;

    @JsProperty( name = "activeCues")
    public native TextTrackCueList getActiveCues();

    @JsProperty( name = "activeCues")
    public native void setActiveCues( TextTrackCueList value );

    public TextTrackCueList cues;

    @JsProperty( name = "cues")
    public native TextTrackCueList getCues();

    @JsProperty( name = "cues")
    public native void setCues( TextTrackCueList value );

    public String inBandMetadataTrackDispatchType;

    @JsProperty( name = "inBandMetadataTrackDispatchType")
    public native String getInBandMetadataTrackDispatchType();

    @JsProperty( name = "inBandMetadataTrackDispatchType")
    public native void setInBandMetadataTrackDispatchType( String value );

    public String kind;

    @JsProperty( name = "kind")
    public native String getKind();

    @JsProperty( name = "kind")
    public native void setKind( String value );

    public String label;

    @JsProperty( name = "label")
    public native String getLabel();

    @JsProperty( name = "label")
    public native void setLabel( String value );

    public String language;

    @JsProperty( name = "language")
    public native String getLanguage();

    @JsProperty( name = "language")
    public native void setLanguage( String value );

    public Object mode;

    @JsProperty( name = "mode")
    public native Object getMode();

    @JsProperty( name = "mode")
    public native void setMode( Object value );

    public Function1<Event, Object> oncuechange;

    @JsProperty( name = "oncuechange")
    public native Function1<Event, Object> getOncuechange();

    @JsProperty( name = "oncuechange")
    public native void setOncuechange( Function1<Event, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Function1<Event, Object> onload;

    @JsProperty( name = "onload")
    public native Function1<Event, Object> getOnload();

    @JsProperty( name = "onload")
    public native void setOnload( Function1<Event, Object> value );

    public Number readyState;

    @JsProperty( name = "readyState")
    public native Number getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addCue,289,,P(d102))
      * TE Signature : S(addCue,P(d102))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@655354
     */
    public native void addCue(TextTrackCue cue);
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
      * Std Signature : S(removeCue,289,,P(d102))
      * TE Signature : S(removeCue,P(d102))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@655391
     */
    public native void removeCue(TextTrackCue cue);
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
