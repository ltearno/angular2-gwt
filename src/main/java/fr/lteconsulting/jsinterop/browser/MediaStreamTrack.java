package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamTrack
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:523227
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:524328
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamTrack")
public class MediaStreamTrack implements EventTarget
{

    /*
        Constructors
    */
    public MediaStreamTrack(){
    }

    /*
        Properties
    */

    public Boolean enabled;

    @JsProperty( name = "enabled")
    public native Boolean getEnabled();

    @JsProperty( name = "enabled")
    public native void setEnabled( Boolean value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

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

    public Boolean muted;

    @JsProperty( name = "muted")
    public native Boolean getMuted();

    @JsProperty( name = "muted")
    public native void setMuted( Boolean value );

    public Function1<MediaStreamErrorEvent, Object> onended;

    @JsProperty( name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();

    @JsProperty( name = "onended")
    public native void setOnended( Function1<MediaStreamErrorEvent, Object> value );

    public Function1<Event, Object> onmute;

    @JsProperty( name = "onmute")
    public native Function1<Event, Object> getOnmute();

    @JsProperty( name = "onmute")
    public native void setOnmute( Function1<Event, Object> value );

    public Function1<MediaStreamErrorEvent, Object> onoverconstrained;

    @JsProperty( name = "onoverconstrained")
    public native Function1<MediaStreamErrorEvent, Object> getOnoverconstrained();

    @JsProperty( name = "onoverconstrained")
    public native void setOnoverconstrained( Function1<MediaStreamErrorEvent, Object> value );

    public Function1<Event, Object> onunmute;

    @JsProperty( name = "onunmute")
    public native Function1<Event, Object> getOnunmute();

    @JsProperty( name = "onunmute")
    public native void setOnunmute( Function1<Event, Object> value );

    public Boolean readonly;

    @JsProperty( name = "readonly")
    public native Boolean getReadonly();

    @JsProperty( name = "readonly")
    public native void setReadonly( Boolean value );

    public String readyState;

    @JsProperty( name = "readyState")
    public native String getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( String value );

    public Boolean remote;

    @JsProperty( name = "remote")
    public native Boolean getRemote();

    @JsProperty( name = "remote")
    public native void setRemote( Boolean value );

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
      * Std Signature : S(applyConstraints,88<369>,,P(d78))
      * TE Signature : S(applyConstraints,P(d78))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@523778
     */
    public native Promise<Void> applyConstraints(MediaTrackConstraints constraints);
    /** 
      * Std Signature : S(clone,82,,)
      * TE Signature : S(clone,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@523851
     */
    public native MediaStreamTrack clone();
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
      * Std Signature : S(getCapabilities,403,,)
      * TE Signature : S(getCapabilities,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@523882
     */
    public native MediaTrackCapabilities getCapabilities();
    /** 
      * Std Signature : S(getConstraints,78,,)
      * TE Signature : S(getConstraints,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@523929
     */
    public native MediaTrackConstraints getConstraints();
    /** 
      * Std Signature : S(getSettings,404,,)
      * TE Signature : S(getSettings,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@523974
     */
    public native MediaTrackSettings getSettings();
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
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@524013
     */
    public native void stop();
}
