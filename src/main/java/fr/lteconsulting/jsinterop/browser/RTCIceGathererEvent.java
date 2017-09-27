package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceGathererEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:557250
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:557389
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceGathererEvent")
public class RTCIceGathererEvent extends Event
{

    /*
        Constructors
    */
    public RTCIceGathererEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary candidate;

    @JsProperty( name = "candidate")
    public native UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary getCandidate();

    @JsProperty( name = "candidate")
    public native void setCandidate( UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary value );

    @JsOverlay
    public final void setCandidate( RTCIceCandidateComplete value ) { setCandidate(UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary.ofRTCIceCandidateComplete( value )); }

    @JsOverlay
    public final void setCandidate( RTCIceCandidateDictionary value ) { setCandidate(UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary.ofRTCIceCandidateDictionary( value )); }
}
