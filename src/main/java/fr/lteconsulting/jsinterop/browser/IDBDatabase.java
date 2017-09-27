package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBDatabase
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:490845
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:491792
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBDatabase")
public class IDBDatabase implements EventTarget
{

    /*
        Constructors
    */
    public IDBDatabase(){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public DOMStringList objectStoreNames;

    @JsProperty( name = "objectStoreNames")
    public native DOMStringList getObjectStoreNames();

    @JsProperty( name = "objectStoreNames")
    public native void setObjectStoreNames( DOMStringList value );

    public Function1<Event, Object> onabort;

    @JsProperty( name = "onabort")
    public native Function1<Event, Object> getOnabort();

    @JsProperty( name = "onabort")
    public native void setOnabort( Function1<Event, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Function1<IDBVersionChangeEvent, Object> onversionchange;

    @JsProperty( name = "onversionchange")
    public native Function1<IDBVersionChangeEvent, Object> getOnversionchange();

    @JsProperty( name = "onversionchange")
    public native void setOnversionchange( Function1<IDBVersionChangeEvent, Object> value );

    public Number version;

    @JsProperty( name = "version")
    public native Number getVersion();

    @JsProperty( name = "version")
    public native void setVersion( Number value );

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
      * Std Signature : S(addEventListener,289,,P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<139,3>))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    public native void addEventListener(String type, Function1<IDBVersionChangeEvent, Object> listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<139,3>),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d3))------)),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491391
     */
    public native void addEventListener(String type, Function1<IDBVersionChangeEvent, Object> listener, Boolean useCapture /* optional */);
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
      * Std Signature : S(close,289,,)
      * TE Signature : S(close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491150
     */
    public native void close();
    /** 
      * Std Signature : S(createObjectStore,355,,P(d1))
      * TE Signature : S(createObjectStore,P(d1))
      * 
     */
    public native IDBObjectStore createObjectStore(String name);
    /** 
      * Std Signature : S(createObjectStore,355,,P(d1),P(d140))
      * TE Signature : S(createObjectStore,P(d1),P(d140))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491169
     */
    public native IDBObjectStore createObjectStore(String name, IDBObjectStoreParameters optionalParameters /* optional */);
    /** 
      * Std Signature : S(deleteObjectStore,289,,P(d1))
      * TE Signature : S(deleteObjectStore,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491269
     */
    public native void deleteObjectStore(String name);
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
      * Std Signature : S(transaction,464,,P(d1))
      * TE Signature : S(transaction,P(d1))
      * 
     */
    public native IDBTransaction transaction(String storeNames);
    /** 
      * Std Signature : S(transaction,464,,P(d1),P(d1))
      * TE Signature : S(transaction,P(d1),P(d1))
      * 
     */
    public native IDBTransaction transaction(String storeNames, String mode /* optional */);
    /** 
      * Std Signature : S(transaction,464,,P(d7<1>))
      * TE Signature : S(transaction,P(d7))
      * 
     */
    public native IDBTransaction transaction(Array<String> storeNames);
    /** 
      * Std Signature : S(transaction,464,,P(d7<1>),P(d1))
      * TE Signature : S(transaction,P(d7),P(d1))
      * 
     */
    public native IDBTransaction transaction(Array<String> storeNames, String mode /* optional */);
    /** 
      * Std Signature : S(transaction,464,,P(dU(-7<1>,4)))
      * TE Signature : S(transaction,P(dU(-7,1)))
      * 
     */
    public native IDBTransaction transaction(UnionOfArrayOfStringAndString storeNames);
    /** 
      * Std Signature : S(transaction,464,,P(dU(-7<1>,4)),P(d1))
      * TE Signature : S(transaction,P(dU(-7,1)),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491312
     */
    public native IDBTransaction transaction(UnionOfArrayOfStringAndString storeNames, String mode /* optional */);
}
