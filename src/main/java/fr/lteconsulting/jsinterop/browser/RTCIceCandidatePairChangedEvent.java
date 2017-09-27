package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCIceCandidatePairChangedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:556121
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:556235
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceCandidatePairChangedEvent")
public class RTCIceCandidatePairChangedEvent extends Event
{

    /*
        Constructors
    */
    public RTCIceCandidatePairChangedEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public RTCIceCandidatePair pair;

    @JsProperty( name = "pair")
    public native RTCIceCandidatePair getPair();

    @JsProperty( name = "pair")
    public native void setPair( RTCIceCandidatePair value );
}
