package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: GlobalEventHandlers
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:729935
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface GlobalEventHandlers
{

    /*
        Properties
    */

    @JsProperty( name = "onpointercancel")
    Function1<PointerEvent, Object> getOnpointercancel();

    @JsProperty( name = "onpointercancel")
    void setOnpointercancel( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onpointerdown")
    Function1<PointerEvent, Object> getOnpointerdown();

    @JsProperty( name = "onpointerdown")
    void setOnpointerdown( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onpointerenter")
    Function1<PointerEvent, Object> getOnpointerenter();

    @JsProperty( name = "onpointerenter")
    void setOnpointerenter( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onpointerleave")
    Function1<PointerEvent, Object> getOnpointerleave();

    @JsProperty( name = "onpointerleave")
    void setOnpointerleave( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onpointermove")
    Function1<PointerEvent, Object> getOnpointermove();

    @JsProperty( name = "onpointermove")
    void setOnpointermove( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onpointerout")
    Function1<PointerEvent, Object> getOnpointerout();

    @JsProperty( name = "onpointerout")
    void setOnpointerout( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onpointerover")
    Function1<PointerEvent, Object> getOnpointerover();

    @JsProperty( name = "onpointerover")
    void setOnpointerover( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onpointerup")
    Function1<PointerEvent, Object> getOnpointerup();

    @JsProperty( name = "onpointerup")
    void setOnpointerup( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onwheel")
    Function1<WheelEvent, Object> getOnwheel();

    @JsProperty( name = "onwheel")
    void setOnwheel( Function1<WheelEvent, Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    void addEventListener(String type, EventListenerObject listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    void addEventListener(String type, EventListenerObject listener, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    void addEventListener(String type, EventListener listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    void addEventListener(String type, EventListener listener, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@730809
     */
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
}
