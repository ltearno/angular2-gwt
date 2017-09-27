package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceTransport
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:557637
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:558841
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceTransport")
public class RTCIceTransport extends RTCStatsProvider
{

    /*
        Constructors
    */
    public RTCIceTransport(){
    }

    /*
        Properties
    */

    public String component;

    @JsProperty( name = "component")
    public native String getComponent();

    @JsProperty( name = "component")
    public native void setComponent( String value );

    public RTCIceGatherer iceGatherer;

    @JsProperty( name = "iceGatherer")
    public native RTCIceGatherer getIceGatherer();

    @JsProperty( name = "iceGatherer")
    public native void setIceGatherer( RTCIceGatherer value );

    public Function1<RTCIceCandidatePairChangedEvent, Object> oncandidatepairchange;

    @JsProperty( name = "oncandidatepairchange")
    public native Function1<RTCIceCandidatePairChangedEvent, Object> getOncandidatepairchange();

    @JsProperty( name = "oncandidatepairchange")
    public native void setOncandidatepairchange( Function1<RTCIceCandidatePairChangedEvent, Object> value );

    public Function1<RTCIceTransportStateChangedEvent, Object> onicestatechange;

    @JsProperty( name = "onicestatechange")
    public native Function1<RTCIceTransportStateChangedEvent, Object> getOnicestatechange();

    @JsProperty( name = "onicestatechange")
    public native void setOnicestatechange( Function1<RTCIceTransportStateChangedEvent, Object> value );

    public String role;

    @JsProperty( name = "role")
    public native String getRole();

    @JsProperty( name = "role")
    public native void setRole( String value );

    public String state;

    @JsProperty( name = "state")
    public native String getState();

    @JsProperty( name = "state")
    public native void setState( String value );

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
      * Std Signature : S(addRemoteCandidate,289,,P(d254))
      * TE Signature : S(addRemoteCandidate,P(d254))
      * 
     */
    public native void addRemoteCandidate(RTCIceCandidateComplete remoteCandidate);
    /** 
      * Std Signature : S(addRemoteCandidate,289,,P(d255))
      * TE Signature : S(addRemoteCandidate,P(d255))
      * 
     */
    public native void addRemoteCandidate(RTCIceCandidateDictionary remoteCandidate);
    /** 
      * Std Signature : S(addRemoteCandidate,289,,P(dU(-254,255)))
      * TE Signature : S(addRemoteCandidate,P(dU(-254,255)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558038
     */
    public native void addRemoteCandidate(UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary remoteCandidate);
    /** 
      * Std Signature : S(createAssociatedTransport,258,,)
      * TE Signature : S(createAssociatedTransport,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558138
     */
    public native RTCIceTransport createAssociatedTransport();
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
      * Std Signature : S(getNominatedCandidatePair,408,,)
      * TE Signature : S(getNominatedCandidatePair,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558188
     */
    public native RTCIceCandidatePair getNominatedCandidatePair();
    /** 
      * Std Signature : S(getRemoteCandidates,7<255>,,)
      * TE Signature : S(getRemoteCandidates,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558249
     */
    public native Array<RTCIceCandidateDictionary> getRemoteCandidates();
    /** 
      * Std Signature : S(getRemoteParameters,257,,)
      * TE Signature : S(getRemoteParameters,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558305
     */
    public native RTCIceParameters getRemoteParameters();
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
      * Std Signature : S(setRemoteCandidates,289,,P(d7<255>))
      * TE Signature : S(setRemoteCandidates,P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558357
     */
    public native void setRemoteCandidates(Array<RTCIceCandidateDictionary> remoteCandidates);
    /** 
      * Std Signature : S(start,289,,P(d256),P(d257))
      * TE Signature : S(start,P(d256),P(d257))
      * 
     */
    public native void start(RTCIceGatherer gatherer, RTCIceParameters remoteParameters);
    /** 
      * Std Signature : S(start,289,,P(d256),P(d257),P(d1))
      * TE Signature : S(start,P(d256),P(d257),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558435
     */
    public native void start(RTCIceGatherer gatherer, RTCIceParameters remoteParameters, String role /* optional */);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@558529
     */
    public native void stop();
}
