package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamTrackEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:524412
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:524514
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamTrackEvent")
public class MediaStreamTrackEvent extends Event
{

    /*
        Constructors
    */
    public MediaStreamTrackEvent(String typeArg, MediaStreamTrackEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public MediaStreamTrack track;

    @JsProperty( name = "track")
    public native MediaStreamTrack getTrack();

    @JsProperty( name = "track")
    public native void setTrack( MediaStreamTrack value );
}
