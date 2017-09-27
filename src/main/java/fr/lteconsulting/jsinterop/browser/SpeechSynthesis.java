package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SpeechSynthesis
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:645410
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:646069
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesis")
public class SpeechSynthesis implements EventTarget
{

    /*
        Constructors
    */
    public SpeechSynthesis(){
    }

    /*
        Properties
    */

    public Function1<Event, Object> onvoiceschanged;

    @JsProperty( name = "onvoiceschanged")
    public native Function1<Event, Object> getOnvoiceschanged();

    @JsProperty( name = "onvoiceschanged")
    public native void setOnvoiceschanged( Function1<Event, Object> value );

    public Boolean paused;

    @JsProperty( name = "paused")
    public native Boolean getPaused();

    @JsProperty( name = "paused")
    public native void setPaused( Boolean value );

    public Boolean pending;

    @JsProperty( name = "pending")
    public native Boolean getPending();

    @JsProperty( name = "pending")
    public native void setPending( Boolean value );

    public Boolean speaking;

    @JsProperty( name = "speaking")
    public native Boolean getSpeaking();

    @JsProperty( name = "speaking")
    public native void setSpeaking( Boolean value );

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
      * Std Signature : S(cancel,289,,)
      * TE Signature : S(cancel,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@645621
     */
    public native void cancel();
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
      * Std Signature : S(getVoices,7<409>,,)
      * TE Signature : S(getVoices,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@645641
     */
    public native Array<SpeechSynthesisVoice> getVoices();
    /** 
      * Std Signature : S(pause,289,,)
      * TE Signature : S(pause,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@645682
     */
    public native void pause();
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
      * Std Signature : S(resume,289,,)
      * TE Signature : S(resume,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@645701
     */
    public native void resume();
    /** 
      * Std Signature : S(speak,289,,P(d204))
      * TE Signature : S(speak,P(d204))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@645721
     */
    public native void speak(SpeechSynthesisUtterance utterance);
}
