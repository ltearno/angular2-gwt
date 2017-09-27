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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GlobalEventHandlers")
public class GlobalEventHandlersImpl implements GlobalEventHandlers
{

    /*
        Properties
    */

    public Function1<PointerEvent, Object> onpointercancel;

    @JsProperty( name = "onpointercancel")
    public native Function1<PointerEvent, Object> getOnpointercancel();

    @JsProperty( name = "onpointercancel")
    public native void setOnpointercancel( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerdown;

    @JsProperty( name = "onpointerdown")
    public native Function1<PointerEvent, Object> getOnpointerdown();

    @JsProperty( name = "onpointerdown")
    public native void setOnpointerdown( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerenter;

    @JsProperty( name = "onpointerenter")
    public native Function1<PointerEvent, Object> getOnpointerenter();

    @JsProperty( name = "onpointerenter")
    public native void setOnpointerenter( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerleave;

    @JsProperty( name = "onpointerleave")
    public native Function1<PointerEvent, Object> getOnpointerleave();

    @JsProperty( name = "onpointerleave")
    public native void setOnpointerleave( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointermove;

    @JsProperty( name = "onpointermove")
    public native Function1<PointerEvent, Object> getOnpointermove();

    @JsProperty( name = "onpointermove")
    public native void setOnpointermove( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerout;

    @JsProperty( name = "onpointerout")
    public native Function1<PointerEvent, Object> getOnpointerout();

    @JsProperty( name = "onpointerout")
    public native void setOnpointerout( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerover;

    @JsProperty( name = "onpointerover")
    public native Function1<PointerEvent, Object> getOnpointerover();

    @JsProperty( name = "onpointerover")
    public native void setOnpointerover( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerup;

    @JsProperty( name = "onpointerup")
    public native Function1<PointerEvent, Object> getOnpointerup();

    @JsProperty( name = "onpointerup")
    public native void setOnpointerup( Function1<PointerEvent, Object> value );

    public Function1<WheelEvent, Object> onwheel;

    @JsProperty( name = "onwheel")
    public native Function1<WheelEvent, Object> getOnwheel();

    @JsProperty( name = "onwheel")
    public native void setOnwheel( Function1<WheelEvent, Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@730809
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
}
