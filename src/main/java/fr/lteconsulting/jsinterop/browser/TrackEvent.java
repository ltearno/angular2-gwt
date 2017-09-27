package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TrackEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:659080
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:659197
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TrackEvent")
public class TrackEvent extends Event
{

    /*
        Constructors
    */
    public TrackEvent(String typeArg, TrackEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public UnionOfAudioTrackAndTextTrackAndVideoTrack track;

    @JsProperty( name = "track")
    public native UnionOfAudioTrackAndTextTrackAndVideoTrack getTrack();

    @JsProperty( name = "track")
    public native void setTrack( UnionOfAudioTrackAndTextTrackAndVideoTrack value );

    @JsOverlay
    public final void setTrack( AudioTrack value ) { setTrack(UnionOfAudioTrackAndTextTrackAndVideoTrack.ofAudioTrack( value )); }

    @JsOverlay
    public final void setTrack( TextTrack value ) { setTrack(UnionOfAudioTrackAndTextTrackAndVideoTrack.ofTextTrack( value )); }

    @JsOverlay
    public final void setTrack( VideoTrack value ) { setTrack(UnionOfAudioTrackAndTextTrackAndVideoTrack.ofVideoTrack( value )); }
}
