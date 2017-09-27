package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSInputMethodContext
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:507828
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:508709
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSInputMethodContext")
public class MSInputMethodContext implements EventTarget
{

    /*
        Constructors
    */
    public MSInputMethodContext(){
    }

    /*
        Properties
    */

    public Number compositionEndOffset;

    @JsProperty( name = "compositionEndOffset")
    public native Number getCompositionEndOffset();

    @JsProperty( name = "compositionEndOffset")
    public native void setCompositionEndOffset( Number value );

    public Number compositionStartOffset;

    @JsProperty( name = "compositionStartOffset")
    public native Number getCompositionStartOffset();

    @JsProperty( name = "compositionStartOffset")
    public native void setCompositionStartOffset( Number value );

    public Function1<Event, Object> oncandidatewindowhide;

    @JsProperty( name = "oncandidatewindowhide")
    public native Function1<Event, Object> getOncandidatewindowhide();

    @JsProperty( name = "oncandidatewindowhide")
    public native void setOncandidatewindowhide( Function1<Event, Object> value );

    public Function1<Event, Object> oncandidatewindowshow;

    @JsProperty( name = "oncandidatewindowshow")
    public native Function1<Event, Object> getOncandidatewindowshow();

    @JsProperty( name = "oncandidatewindowshow")
    public native void setOncandidatewindowshow( Function1<Event, Object> value );

    public Function1<Event, Object> oncandidatewindowupdate;

    @JsProperty( name = "oncandidatewindowupdate")
    public native Function1<Event, Object> getOncandidatewindowupdate();

    @JsProperty( name = "oncandidatewindowupdate")
    public native void setOncandidatewindowupdate( Function1<Event, Object> value );

    public HTMLElement target;

    @JsProperty( name = "target")
    public native HTMLElement getTarget();

    @JsProperty( name = "target")
    public native void setTarget( HTMLElement value );

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
      * Std Signature : S(getCandidateWindowClientRect,375,,)
      * TE Signature : S(getCandidateWindowClientRect,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@508236
     */
    public native ClientRect getCandidateWindowClientRect();
    /** 
      * Std Signature : S(getCompositionAlternatives,7<1>,,)
      * TE Signature : S(getCompositionAlternatives,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@508284
     */
    public native Array<String> getCompositionAlternatives();
    /** 
      * Std Signature : S(hasComposition,27,,)
      * TE Signature : S(hasComposition,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@508328
     */
    public native Boolean hasComposition();
    /** 
      * Std Signature : S(isCandidateWindowVisible,27,,)
      * TE Signature : S(isCandidateWindowVisible,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@508359
     */
    public native Boolean isCandidateWindowVisible();
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
