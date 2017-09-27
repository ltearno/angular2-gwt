package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBTransaction
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:495596
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:496363
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBTransaction")
public class IDBTransaction implements EventTarget
{

    /*
        Constructors
    */
    public IDBTransaction(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="IDBTransaction", name="READ_ONLY")
    public static String READ_ONLY;

    @JsProperty(namespace="IDBTransaction", name="READ_WRITE")
    public static String READ_WRITE;

    @JsProperty(namespace="IDBTransaction", name="VERSION_CHANGE")
    public static String VERSION_CHANGE;

    /*
        Properties
    */

    public IDBDatabase db;

    @JsProperty( name = "db")
    public native IDBDatabase getDb();

    @JsProperty( name = "db")
    public native void setDb( IDBDatabase value );

    public DOMError error;

    @JsProperty( name = "error")
    public native DOMError getError();

    @JsProperty( name = "error")
    public native void setError( DOMError value );

    public String mode;

    @JsProperty( name = "mode")
    public native String getMode();

    @JsProperty( name = "mode")
    public native void setMode( String value );

    public Function1<Event, Object> onabort;

    @JsProperty( name = "onabort")
    public native Function1<Event, Object> getOnabort();

    @JsProperty( name = "onabort")
    public native void setOnabort( Function1<Event, Object> value );

    public Function1<Event, Object> oncomplete;

    @JsProperty( name = "oncomplete")
    public native Function1<Event, Object> getOncomplete();

    @JsProperty( name = "oncomplete")
    public native void setOncomplete( Function1<Event, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(abort,289,,)
      * TE Signature : S(abort,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@495904
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
      * Std Signature : S(objectStore,355,,P(d1))
      * TE Signature : S(objectStore,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@495923
     */
    public native IDBObjectStore objectStore(String name);
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
