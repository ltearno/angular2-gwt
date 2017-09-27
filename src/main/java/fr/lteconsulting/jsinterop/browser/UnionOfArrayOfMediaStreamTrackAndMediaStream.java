package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfMediaStreamTrackAndMediaStream  {
    @JsOverlay
    default Array<MediaStreamTrack> asArrayOfMediaStreamTrack() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfMediaStreamTrackAndMediaStream ofArrayOfMediaStreamTrack(Array<MediaStreamTrack> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MediaStream asMediaStream() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfMediaStreamTrackAndMediaStream ofMediaStream(MediaStream value) {
        return Js.cast( value );
    }
    
}
