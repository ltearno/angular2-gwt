package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SpeechSynthesisUtterance
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:646702
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:647668
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisUtterance")
public class SpeechSynthesisUtterance implements EventTarget
{

    /*
        Constructors
    */
    public SpeechSynthesisUtterance(String text){
    }

    /*
        Properties
    */

    public String lang;

    @JsProperty( name = "lang")
    public native String getLang();

    @JsProperty( name = "lang")
    public native void setLang( String value );

    public Function1<Event, Object> onboundary;

    @JsProperty( name = "onboundary")
    public native Function1<Event, Object> getOnboundary();

    @JsProperty( name = "onboundary")
    public native void setOnboundary( Function1<Event, Object> value );

    public Function1<Event, Object> onend;

    @JsProperty( name = "onend")
    public native Function1<Event, Object> getOnend();

    @JsProperty( name = "onend")
    public native void setOnend( Function1<Event, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Function1<Event, Object> onmark;

    @JsProperty( name = "onmark")
    public native Function1<Event, Object> getOnmark();

    @JsProperty( name = "onmark")
    public native void setOnmark( Function1<Event, Object> value );

    public Function1<Event, Object> onpause;

    @JsProperty( name = "onpause")
    public native Function1<Event, Object> getOnpause();

    @JsProperty( name = "onpause")
    public native void setOnpause( Function1<Event, Object> value );

    public Function1<Event, Object> onresume;

    @JsProperty( name = "onresume")
    public native Function1<Event, Object> getOnresume();

    @JsProperty( name = "onresume")
    public native void setOnresume( Function1<Event, Object> value );

    public Function1<Event, Object> onstart;

    @JsProperty( name = "onstart")
    public native Function1<Event, Object> getOnstart();

    @JsProperty( name = "onstart")
    public native void setOnstart( Function1<Event, Object> value );

    public Number pitch;

    @JsProperty( name = "pitch")
    public native Number getPitch();

    @JsProperty( name = "pitch")
    public native void setPitch( Number value );

    public Number rate;

    @JsProperty( name = "rate")
    public native Number getRate();

    @JsProperty( name = "rate")
    public native void setRate( Number value );

    public String text;

    @JsProperty( name = "text")
    public native String getText();

    @JsProperty( name = "text")
    public native void setText( String value );

    public SpeechSynthesisVoice voice;

    @JsProperty( name = "voice")
    public native SpeechSynthesisVoice getVoice();

    @JsProperty( name = "voice")
    public native void setVoice( SpeechSynthesisVoice value );

    public Number volume;

    @JsProperty( name = "volume")
    public native Number getVolume();

    @JsProperty( name = "volume")
    public native void setVolume( Number value );

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
}
