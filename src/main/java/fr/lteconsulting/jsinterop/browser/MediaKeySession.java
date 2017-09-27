package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeySession
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:518540
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:518969
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeySession")
public class MediaKeySession implements EventTarget
{

    /*
        Constructors
    */
    public MediaKeySession(){
    }

    /*
        Properties
    */

    public Promise<Void> closed;

    @JsProperty( name = "closed")
    public native Promise<Void> getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Promise<Void> value );

    public Number expiration;

    @JsProperty( name = "expiration")
    public native Number getExpiration();

    @JsProperty( name = "expiration")
    public native void setExpiration( Number value );

    public MediaKeyStatusMap keyStatuses;

    @JsProperty( name = "keyStatuses")
    public native MediaKeyStatusMap getKeyStatuses();

    @JsProperty( name = "keyStatuses")
    public native void setKeyStatuses( MediaKeyStatusMap value );

    public String sessionId;

    @JsProperty( name = "sessionId")
    public native String getSessionId();

    @JsProperty( name = "sessionId")
    public native void setSessionId( String value );

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
      * Std Signature : S(close,88<369>,,)
      * TE Signature : S(close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@518740
     */
    public native Promise<Void> close();
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
      * Std Signature : S(generateRequest,88<369>,,P(d1),P(d3))
      * TE Signature : S(generateRequest,P(d1),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@518768
     */
    public native Promise<Void> generateRequest(String initDataType, Object initData);
    /** 
      * Std Signature : S(load,88<27>,,P(d1))
      * TE Signature : S(load,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@518841
     */
    public native Promise<Boolean> load(String sessionId);
    /** 
      * Std Signature : S(remove,88<369>,,)
      * TE Signature : S(remove,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@518888
     */
    public native Promise<Void> remove();
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
      * Std Signature : S(update,88<369>,,P(d3))
      * TE Signature : S(update,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@518917
     */
    public native Promise<Void> update(Object response);
}
