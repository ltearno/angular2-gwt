package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ServiceWorkerRegistration
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:643499
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:644403
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerRegistration")
public class ServiceWorkerRegistration implements EventTarget
{

    /*
        Constructors
    */
    public ServiceWorkerRegistration(){
    }

    /*
        Properties
    */

    public ServiceWorker active;

    @JsProperty( name = "active")
    public native ServiceWorker getActive();

    @JsProperty( name = "active")
    public native void setActive( ServiceWorker value );

    public ServiceWorker installing;

    @JsProperty( name = "installing")
    public native ServiceWorker getInstalling();

    @JsProperty( name = "installing")
    public native void setInstalling( ServiceWorker value );

    public Function1<Event, Object> onupdatefound;

    @JsProperty( name = "onupdatefound")
    public native Function1<Event, Object> getOnupdatefound();

    @JsProperty( name = "onupdatefound")
    public native void setOnupdatefound( Function1<Event, Object> value );

    public PushManager pushManager;

    @JsProperty( name = "pushManager")
    public native PushManager getPushManager();

    @JsProperty( name = "pushManager")
    public native void setPushManager( PushManager value );

    public String scope;

    @JsProperty( name = "scope")
    public native String getScope();

    @JsProperty( name = "scope")
    public native void setScope( String value );

    public SyncManager sync;

    @JsProperty( name = "sync")
    public native SyncManager getSync();

    @JsProperty( name = "sync")
    public native void setSync( SyncManager value );

    public ServiceWorker waiting;

    @JsProperty( name = "waiting")
    public native ServiceWorker getWaiting();

    @JsProperty( name = "waiting")
    public native void setWaiting( ServiceWorker value );

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
      * Std Signature : S(getNotifications,3,,)
      * TE Signature : S(getNotifications,)
      * 
     */
    public native Object getNotifications();
    /** 
      * Std Signature : S(getNotifications,3,,P(d163))
      * TE Signature : S(getNotifications,P(d163))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@643871
     */
    public native Object getNotifications(GetNotificationOptions filter /* optional */);
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
      * Std Signature : S(showNotification,88<369>,,P(d1))
      * TE Signature : S(showNotification,P(d1))
      * 
     */
    public native Promise<Void> showNotification(String title);
    /** 
      * Std Signature : S(showNotification,88<369>,,P(d1),P(d164))
      * TE Signature : S(showNotification,P(d1),P(d164))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@643931
     */
    public native Promise<Void> showNotification(String title, NotificationOptions options /* optional */);
    /** 
      * Std Signature : S(unregister,88<27>,,)
      * TE Signature : S(unregister,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@644014
     */
    public native Promise<Boolean> unregister();
    /** 
      * Std Signature : S(update,88<369>,,)
      * TE Signature : S(update,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@644050
     */
    public native Promise<Void> update();
}
