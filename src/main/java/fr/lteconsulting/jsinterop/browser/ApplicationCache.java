package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ApplicationCache
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:283896
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:285016
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ApplicationCache")
public class ApplicationCache implements EventTarget
{

    /*
        Constructors
    */
    public ApplicationCache(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="ApplicationCache", name="CHECKING")
    public static Number CHECKING;

    @JsProperty(namespace="ApplicationCache", name="DOWNLOADING")
    public static Number DOWNLOADING;

    @JsProperty(namespace="ApplicationCache", name="IDLE")
    public static Number IDLE;

    @JsProperty(namespace="ApplicationCache", name="OBSOLETE")
    public static Number OBSOLETE;

    @JsProperty(namespace="ApplicationCache", name="UNCACHED")
    public static Number UNCACHED;

    @JsProperty(namespace="ApplicationCache", name="UPDATEREADY")
    public static Number UPDATEREADY;

    /*
        Properties
    */

    public Function1<Event, Object> oncached;

    @JsProperty( name = "oncached")
    public native Function1<Event, Object> getOncached();

    @JsProperty( name = "oncached")
    public native void setOncached( Function1<Event, Object> value );

    public Function1<Event, Object> onchecking;

    @JsProperty( name = "onchecking")
    public native Function1<Event, Object> getOnchecking();

    @JsProperty( name = "onchecking")
    public native void setOnchecking( Function1<Event, Object> value );

    public Function1<Event, Object> ondownloading;

    @JsProperty( name = "ondownloading")
    public native Function1<Event, Object> getOndownloading();

    @JsProperty( name = "ondownloading")
    public native void setOndownloading( Function1<Event, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Function1<Event, Object> onnoupdate;

    @JsProperty( name = "onnoupdate")
    public native Function1<Event, Object> getOnnoupdate();

    @JsProperty( name = "onnoupdate")
    public native void setOnnoupdate( Function1<Event, Object> value );

    public Function1<Event, Object> onobsolete;

    @JsProperty( name = "onobsolete")
    public native Function1<Event, Object> getOnobsolete();

    @JsProperty( name = "onobsolete")
    public native void setOnobsolete( Function1<Event, Object> value );

    public Function1<ProgressEvent, Object> onprogress;

    @JsProperty( name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();

    @JsProperty( name = "onprogress")
    public native void setOnprogress( Function1<ProgressEvent, Object> value );

    public Function1<Event, Object> onupdateready;

    @JsProperty( name = "onupdateready")
    public native Function1<Event, Object> getOnupdateready();

    @JsProperty( name = "onupdateready")
    public native void setOnupdateready( Function1<Event, Object> value );

    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(abort,289,,)
      * TE Signature : S(abort,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@284469
     */
    public native void abort();
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
    /** 
      * Std Signature : S(swapCache,289,,)
      * TE Signature : S(swapCache,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@284488
     */
    public native void swapCache();
    /** 
      * Std Signature : S(update,289,,)
      * TE Signature : S(update,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@284511
     */
    public native void update();
}
