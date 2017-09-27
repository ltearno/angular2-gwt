package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpSender
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:563501
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:564356
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpSender")
public class RTCRtpSender extends RTCStatsProvider
{

    /*
        Constructors
    */
    public RTCRtpSender(MediaStreamTrack track, UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport){
    }

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:564540
     */
    @JsMethod(namespace="RTCRtpSender", name = "getCapabilities")
    public static native RTCRtpCapabilities getCapabilities(String kind /* optional */);

    /*
        Properties
    */

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Function1<RTCSsrcConflictEvent, Object> onssrcconflict;

    @JsProperty( name = "onssrcconflict")
    public native Function1<RTCSsrcConflictEvent, Object> getOnssrcconflict();

    @JsProperty( name = "onssrcconflict")
    public native void setOnssrcconflict( Function1<RTCSsrcConflictEvent, Object> value );

    public RTCDtlsTransport rtcpTransport;

    @JsProperty( name = "rtcpTransport")
    public native RTCDtlsTransport getRtcpTransport();

    @JsProperty( name = "rtcpTransport")
    public native void setRtcpTransport( RTCDtlsTransport value );

    public MediaStreamTrack track;

    @JsProperty( name = "track")
    public native MediaStreamTrack getTrack__();

    @JsProperty( name = "track")
    public native void setTrack__( MediaStreamTrack value );

    public UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport;

    @JsProperty( name = "transport")
    public native UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport getTransport__();

    @JsProperty( name = "transport")
    public native void setTransport__( UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport value );

    @JsOverlay
    public final void setTransport__( RTCDtlsTransport value ) { setTransport__(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport.ofRTCDtlsTransport( value )); }

    @JsOverlay
    public final void setTransport__( RTCSrtpSdesTransport value ) { setTransport__(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport.ofRTCSrtpSdesTransport( value )); }

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
      * Std Signature : S(send,289,,P(d265))
      * TE Signature : S(send,P(d265))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@563852
     */
    public native void send(RTCRtpParameters parameters);
    /** 
      * Std Signature : S(setTrack,289,,P(d82))
      * TE Signature : S(setTrack,P(d82))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@563898
     */
    public native void setTrack(MediaStreamTrack track);
    /** 
      * Std Signature : S(setTransport,289,,P(d262))
      * TE Signature : S(setTransport,P(d262))
      * 
     */
    public native void setTransport(RTCDtlsTransport transport);
    /** 
      * Std Signature : S(setTransport,289,,P(d262),P(d262))
      * TE Signature : S(setTransport,P(d262),P(d262))
      * 
     */
    public native void setTransport(RTCDtlsTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    /** 
      * Std Signature : S(setTransport,289,,P(d263))
      * TE Signature : S(setTransport,P(d263))
      * 
     */
    public native void setTransport(RTCSrtpSdesTransport transport);
    /** 
      * Std Signature : S(setTransport,289,,P(d263),P(d262))
      * TE Signature : S(setTransport,P(d263),P(d262))
      * 
     */
    public native void setTransport(RTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    /** 
      * Std Signature : S(setTransport,289,,P(dU(-262,263)))
      * TE Signature : S(setTransport,P(dU(-262,263)))
      * 
     */
    public native void setTransport(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport);
    /** 
      * Std Signature : S(setTransport,289,,P(dU(-262,263)),P(d262))
      * TE Signature : S(setTransport,P(dU(-262,263)),P(d262))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@563943
     */
    public native void setTransport(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@564053
     */
    public native void stop();
}
