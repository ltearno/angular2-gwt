package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpReceiver
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:562326
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:563171
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpReceiver")
public class RTCRtpReceiver extends RTCStatsProvider
{

    /*
        Constructors
    */
    public RTCRtpReceiver(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, String kind, RTCDtlsTransport rtcpTransport){
    }

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:563350
     */
    @JsMethod(namespace="RTCRtpReceiver", name = "getCapabilities")
    public static native RTCRtpCapabilities getCapabilities(String kind /* optional */);

    /*
        Properties
    */

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public RTCDtlsTransport rtcpTransport;

    @JsProperty( name = "rtcpTransport")
    public native RTCDtlsTransport getRtcpTransport();

    @JsProperty( name = "rtcpTransport")
    public native void setRtcpTransport( RTCDtlsTransport value );

    public MediaStreamTrack track;

    @JsProperty( name = "track")
    public native MediaStreamTrack getTrack();

    @JsProperty( name = "track")
    public native void setTrack( MediaStreamTrack value );

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
      * Std Signature : S(getContributingSources,7<568>,,)
      * TE Signature : S(getContributingSources,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@562604
     */
    public native Array<RTCRtpContributingSource> getContributingSources();
    /** 
      * Std Signature : S(receive,289,,P(d265))
      * TE Signature : S(receive,P(d265))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@562662
     */
    public native void receive(RTCRtpParameters parameters);
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
      * Std Signature : S(requestSendCSRC,289,,P(d2))
      * TE Signature : S(requestSendCSRC,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@562711
     */
    public native void requestSendCSRC(Number csrc);
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
      * apis/browser-api/tsd/lib.es6.d.ts@562752
     */
    public native void setTransport(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@562862
     */
    public native void stop();
}
