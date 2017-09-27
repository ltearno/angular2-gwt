package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCPeerConnection
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:559462
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:561872
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCPeerConnection")
public class RTCPeerConnection implements EventTarget
{

    /*
        Constructors
    */
    public RTCPeerConnection(RTCConfiguration configuration){
    }

    /*
        Properties
    */

    public Boolean canTrickleIceCandidates;

    @JsProperty( name = "canTrickleIceCandidates")
    public native Boolean getCanTrickleIceCandidates();

    @JsProperty( name = "canTrickleIceCandidates")
    public native void setCanTrickleIceCandidates( Boolean value );

    public String iceConnectionState;

    @JsProperty( name = "iceConnectionState")
    public native String getIceConnectionState();

    @JsProperty( name = "iceConnectionState")
    public native void setIceConnectionState( String value );

    public String iceGatheringState;

    @JsProperty( name = "iceGatheringState")
    public native String getIceGatheringState();

    @JsProperty( name = "iceGatheringState")
    public native void setIceGatheringState( String value );

    public RTCSessionDescription localDescription;

    @JsProperty( name = "localDescription")
    public native RTCSessionDescription getLocalDescription__();

    @JsProperty( name = "localDescription")
    public native void setLocalDescription__( RTCSessionDescription value );

    public Function1<MediaStreamEvent, Object> onaddstream;

    @JsProperty( name = "onaddstream")
    public native Function1<MediaStreamEvent, Object> getOnaddstream();

    @JsProperty( name = "onaddstream")
    public native void setOnaddstream( Function1<MediaStreamEvent, Object> value );

    public Function1<RTCPeerConnectionIceEvent, Object> onicecandidate;

    @JsProperty( name = "onicecandidate")
    public native Function1<RTCPeerConnectionIceEvent, Object> getOnicecandidate();

    @JsProperty( name = "onicecandidate")
    public native void setOnicecandidate( Function1<RTCPeerConnectionIceEvent, Object> value );

    public Function1<Event, Object> oniceconnectionstatechange;

    @JsProperty( name = "oniceconnectionstatechange")
    public native Function1<Event, Object> getOniceconnectionstatechange();

    @JsProperty( name = "oniceconnectionstatechange")
    public native void setOniceconnectionstatechange( Function1<Event, Object> value );

    public Function1<Event, Object> onicegatheringstatechange;

    @JsProperty( name = "onicegatheringstatechange")
    public native Function1<Event, Object> getOnicegatheringstatechange();

    @JsProperty( name = "onicegatheringstatechange")
    public native void setOnicegatheringstatechange( Function1<Event, Object> value );

    public Function1<Event, Object> onnegotiationneeded;

    @JsProperty( name = "onnegotiationneeded")
    public native Function1<Event, Object> getOnnegotiationneeded();

    @JsProperty( name = "onnegotiationneeded")
    public native void setOnnegotiationneeded( Function1<Event, Object> value );

    public Function1<MediaStreamEvent, Object> onremovestream;

    @JsProperty( name = "onremovestream")
    public native Function1<MediaStreamEvent, Object> getOnremovestream();

    @JsProperty( name = "onremovestream")
    public native void setOnremovestream( Function1<MediaStreamEvent, Object> value );

    public Function1<Event, Object> onsignalingstatechange;

    @JsProperty( name = "onsignalingstatechange")
    public native Function1<Event, Object> getOnsignalingstatechange();

    @JsProperty( name = "onsignalingstatechange")
    public native void setOnsignalingstatechange( Function1<Event, Object> value );

    public RTCSessionDescription remoteDescription;

    @JsProperty( name = "remoteDescription")
    public native RTCSessionDescription getRemoteDescription__();

    @JsProperty( name = "remoteDescription")
    public native void setRemoteDescription__( RTCSessionDescription value );

    public String signalingState;

    @JsProperty( name = "signalingState")
    public native String getSignalingState();

    @JsProperty( name = "signalingState")
    public native void setSignalingState( String value );

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
      * Std Signature : S(addIceCandidate,88<369>,,P(d273))
      * TE Signature : S(addIceCandidate,P(d273))
      * 
     */
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate);
    /** 
      * Std Signature : S(addIceCandidate,88<369>,,P(d273),P(dF--S(?,289,,)------)))
      * TE Signature : S(addIceCandidate,P(d273),P(dF--S(?,)------)))
      * 
     */
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate, VoidFunction successCallback /* optional */);
    /** 
      * Std Signature : S(addIceCandidate,88<369>,,P(d273),P(dF--S(?,289,,)------)),P(dF--S(?,289,,P(d272))------)))
      * TE Signature : S(addIceCandidate,P(d273),P(dF--S(?,)------)),P(dF--S(?,P(d272))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560343
     */
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate, VoidFunction successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * Std Signature : S(addStream,289,,P(d79))
      * TE Signature : S(addStream,P(d79))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560489
     */
    public native void addStream(MediaStream stream);
    /** 
      * Std Signature : S(close,289,,)
      * TE Signature : S(close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560531
     */
    public native void close();
    /** 
      * Std Signature : S(createAnswer,88<274>,,)
      * TE Signature : S(createAnswer,)
      * 
     */
    public native Promise<RTCSessionDescription> createAnswer();
    /** 
      * Std Signature : S(createAnswer,88<274>,,P(dF--S(?,289,,P(d274))------)))
      * TE Signature : S(createAnswer,P(dF--S(?,P(d274))------)))
      * 
     */
    public native Promise<RTCSessionDescription> createAnswer(RTCSessionDescriptionCallback successCallback /* optional */);
    /** 
      * Std Signature : S(createAnswer,88<274>,,P(dF--S(?,289,,P(d274))------)),P(dF--S(?,289,,P(d272))------)))
      * TE Signature : S(createAnswer,P(dF--S(?,P(d274))------)),P(dF--S(?,P(d272))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560550
     */
    public native Promise<RTCSessionDescription> createAnswer(RTCSessionDescriptionCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * Std Signature : S(createOffer,88<274>,,)
      * TE Signature : S(createOffer,)
      * 
     */
    public native Promise<RTCSessionDescription> createOffer();
    /** 
      * Std Signature : S(createOffer,88<274>,,P(dF--S(?,289,,P(d274))------)))
      * TE Signature : S(createOffer,P(dF--S(?,P(d274))------)))
      * 
     */
    public native Promise<RTCSessionDescription> createOffer(RTCSessionDescriptionCallback successCallback /* optional */);
    /** 
      * Std Signature : S(createOffer,88<274>,,P(dF--S(?,289,,P(d274))------)),P(dF--S(?,289,,P(d272))------)))
      * TE Signature : S(createOffer,P(dF--S(?,P(d274))------)),P(dF--S(?,P(d272))------)))
      * 
     */
    public native Promise<RTCSessionDescription> createOffer(RTCSessionDescriptionCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * Std Signature : S(createOffer,88<274>,,P(dF--S(?,289,,P(d274))------)),P(dF--S(?,289,,P(d272))------)),P(d275))
      * TE Signature : S(createOffer,P(dF--S(?,P(d274))------)),P(dF--S(?,P(d272))------)),P(d275))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560699
     */
    public native Promise<RTCSessionDescription> createOffer(RTCSessionDescriptionCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */, RTCOfferOptions options /* optional */);
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
      * Std Signature : S(getConfiguration,268,,)
      * TE Signature : S(getConfiguration,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560874
     */
    public native RTCConfiguration getConfiguration();
    /** 
      * Std Signature : S(getLocalStreams,7<79>,,)
      * TE Signature : S(getLocalStreams,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560916
     */
    public native Array<MediaStream> getLocalStreams();
    /** 
      * Std Signature : S(getRemoteStreams,7<79>,,)
      * TE Signature : S(getRemoteStreams,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560954
     */
    public native Array<MediaStream> getRemoteStreams();
    /** 
      * Std Signature : S(getStats,88<276>,,P(d82))
      * TE Signature : S(getStats,P(d82))
      * 
     */
    public native Promise<RTCStatsReport> getStats(MediaStreamTrack selector);
    /** 
      * Std Signature : S(getStats,88<276>,,P(d82),P(dF--S(?,289,,P(d276))------)))
      * TE Signature : S(getStats,P(d82),P(dF--S(?,P(d276))------)))
      * 
     */
    public native Promise<RTCStatsReport> getStats(MediaStreamTrack selector, RTCStatsCallback successCallback /* optional */);
    /** 
      * Std Signature : S(getStats,88<276>,,P(d82),P(dF--S(?,289,,P(d276))------)),P(dF--S(?,289,,P(d272))------)))
      * TE Signature : S(getStats,P(d82),P(dF--S(?,P(d276))------)),P(dF--S(?,P(d272))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@560993
     */
    public native Promise<RTCStatsReport> getStats(MediaStreamTrack selector, RTCStatsCallback successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * Std Signature : S(getStreamById,79,,P(d1))
      * TE Signature : S(getStreamById,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@561153
     */
    public native MediaStream getStreamById(String streamId);
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
      * Std Signature : S(removeStream,289,,P(d79))
      * TE Signature : S(removeStream,P(d79))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@561210
     */
    public native void removeStream(MediaStream stream);
    /** 
      * Std Signature : S(setLocalDescription,88<369>,,P(d274))
      * TE Signature : S(setLocalDescription,P(d274))
      * 
     */
    public native Promise<Void> setLocalDescription(RTCSessionDescription description);
    /** 
      * Std Signature : S(setLocalDescription,88<369>,,P(d274),P(dF--S(?,289,,)------)))
      * TE Signature : S(setLocalDescription,P(d274),P(dF--S(?,)------)))
      * 
     */
    public native Promise<Void> setLocalDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */);
    /** 
      * Std Signature : S(setLocalDescription,88<369>,,P(d274),P(dF--S(?,289,,)------)),P(dF--S(?,289,,P(d272))------)))
      * TE Signature : S(setLocalDescription,P(d274),P(dF--S(?,)------)),P(dF--S(?,P(d272))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@561255
     */
    public native Promise<Void> setLocalDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
    /** 
      * Std Signature : S(setRemoteDescription,88<369>,,P(d274))
      * TE Signature : S(setRemoteDescription,P(d274))
      * 
     */
    public native Promise<Void> setRemoteDescription(RTCSessionDescription description);
    /** 
      * Std Signature : S(setRemoteDescription,88<369>,,P(d274),P(dF--S(?,289,,)------)))
      * TE Signature : S(setRemoteDescription,P(d274),P(dF--S(?,)------)))
      * 
     */
    public native Promise<Void> setRemoteDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */);
    /** 
      * Std Signature : S(setRemoteDescription,88<369>,,P(d274),P(dF--S(?,289,,)------)),P(dF--S(?,289,,P(d272))------)))
      * TE Signature : S(setRemoteDescription,P(d274),P(dF--S(?,)------)),P(dF--S(?,P(d272))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@561413
     */
    public native Promise<Void> setRemoteDescription(RTCSessionDescription description, VoidFunction successCallback /* optional */, RTCPeerConnectionErrorCallback failureCallback /* optional */);
}
