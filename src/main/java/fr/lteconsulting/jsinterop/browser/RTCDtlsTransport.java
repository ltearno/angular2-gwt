package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDtlsTransport
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:553848
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:554658
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtlsTransport")
public class RTCDtlsTransport extends RTCStatsProvider
{

    /*
        Constructors
    */
    public RTCDtlsTransport(RTCIceTransport transport){
    }

    /*
        Properties
    */

    public Function1<RTCDtlsTransportStateChangedEvent, Object> ondtlsstatechange;

    @JsProperty( name = "ondtlsstatechange")
    public native Function1<RTCDtlsTransportStateChangedEvent, Object> getOndtlsstatechange();

    @JsProperty( name = "ondtlsstatechange")
    public native void setOndtlsstatechange( Function1<RTCDtlsTransportStateChangedEvent, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public String state;

    @JsProperty( name = "state")
    public native String getState();

    @JsProperty( name = "state")
    public native void setState( String value );

    public RTCIceTransport transport;

    @JsProperty( name = "transport")
    public native RTCIceTransport getTransport();

    @JsProperty( name = "transport")
    public native void setTransport( RTCIceTransport value );

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
      * Std Signature : S(getLocalParameters,260,,)
      * TE Signature : S(getLocalParameters,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@554147
     */
    public native RTCDtlsParameters getLocalParameters();
    /** 
      * Std Signature : S(getRemoteCertificates,7<26>,,)
      * TE Signature : S(getRemoteCertificates,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@554192
     */
    public native Array<ArrayBuffer> getRemoteCertificates();
    /** 
      * Std Signature : S(getRemoteParameters,260,,)
      * TE Signature : S(getRemoteParameters,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@554236
     */
    public native RTCDtlsParameters getRemoteParameters();
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
      * Std Signature : S(start,289,,P(d260))
      * TE Signature : S(start,P(d260))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@554289
     */
    public native void start(RTCDtlsParameters remoteParameters);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@554343
     */
    public native void stop();
}
