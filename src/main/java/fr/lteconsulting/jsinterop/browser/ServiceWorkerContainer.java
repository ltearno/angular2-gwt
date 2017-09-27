package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ServiceWorkerContainer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:642070
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:642898
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerContainer")
public class ServiceWorkerContainer implements EventTarget
{

    /*
        Constructors
    */
    public ServiceWorkerContainer(){
    }

    /*
        Properties
    */

    public ServiceWorker controller;

    @JsProperty( name = "controller")
    public native ServiceWorker getController();

    @JsProperty( name = "controller")
    public native void setController( ServiceWorker value );

    public Function1<Event, Object> oncontrollerchange;

    @JsProperty( name = "oncontrollerchange")
    public native Function1<Event, Object> getOncontrollerchange();

    @JsProperty( name = "oncontrollerchange")
    public native void setOncontrollerchange( Function1<Event, Object> value );

    public Function1<ServiceWorkerMessageEvent, Object> onmessage;

    @JsProperty( name = "onmessage")
    public native Function1<ServiceWorkerMessageEvent, Object> getOnmessage();

    @JsProperty( name = "onmessage")
    public native void setOnmessage( Function1<ServiceWorkerMessageEvent, Object> value );

    public Promise<ServiceWorkerRegistration> ready;

    @JsProperty( name = "ready")
    public native Promise<ServiceWorkerRegistration> getReady();

    @JsProperty( name = "ready")
    public native void setReady( Promise<ServiceWorkerRegistration> value );

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
      * Std Signature : S(getRegistration,88<3>,,)
      * TE Signature : S(getRegistration,)
      * 
     */
    public native Promise<Object> getRegistration();
    /** 
      * Std Signature : S(getRegistration,88<3>,,P(d1))
      * TE Signature : S(getRegistration,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@642393
     */
    public native Promise<Object> getRegistration(String clientURL /* optional */);
    /** 
      * Std Signature : S(getRegistrations,3,,)
      * TE Signature : S(getRegistrations,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@642451
     */
    public native Object getRegistrations();
    /** 
      * Std Signature : S(register,88<489>,,P(d1))
      * TE Signature : S(register,P(d1))
      * 
     */
    public native Promise<ServiceWorkerRegistration> register(String scriptURL);
    /** 
      * Std Signature : S(register,88<489>,,P(d1),P(d165))
      * TE Signature : S(register,P(d1),P(d165))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@642480
     */
    public native Promise<ServiceWorkerRegistration> register(String scriptURL, RegistrationOptions options /* optional */);
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
