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
public interface UnionOfAudioTrackAndTextTrackAndVideoTrack  {
    @JsOverlay
    default AudioTrack asAudioTrack() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAudioTrackAndTextTrackAndVideoTrack ofAudioTrack(AudioTrack value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TextTrack asTextTrack() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAudioTrackAndTextTrackAndVideoTrack ofTextTrack(TextTrack value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default VideoTrack asVideoTrack() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAudioTrackAndTextTrackAndVideoTrack ofVideoTrack(VideoTrack value) {
        return Js.cast( value );
    }
    
}
