package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamConstraints
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268550
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamConstraints")
public class MediaStreamConstraints
{

    /*
        Properties
    */

    public UnionOfBooleanAndMediaTrackConstraints audio;

    @JsProperty( name = "audio")
    public native UnionOfBooleanAndMediaTrackConstraints getAudio();

    @JsProperty( name = "audio")
    public native void setAudio( UnionOfBooleanAndMediaTrackConstraints value );

    @JsOverlay
    public final void setAudio( Boolean value ) { setAudio(UnionOfBooleanAndMediaTrackConstraints.ofBoolean( value )); }

    @JsOverlay
    public final void setAudio( MediaTrackConstraints value ) { setAudio(UnionOfBooleanAndMediaTrackConstraints.ofMediaTrackConstraints( value )); }

    public UnionOfBooleanAndMediaTrackConstraints video;

    @JsProperty( name = "video")
    public native UnionOfBooleanAndMediaTrackConstraints getVideo();

    @JsProperty( name = "video")
    public native void setVideo( UnionOfBooleanAndMediaTrackConstraints value );

    @JsOverlay
    public final void setVideo( Boolean value ) { setVideo(UnionOfBooleanAndMediaTrackConstraints.ofBoolean( value )); }

    @JsOverlay
    public final void setVideo( MediaTrackConstraints value ) { setVideo(UnionOfBooleanAndMediaTrackConstraints.ofMediaTrackConstraints( value )); }
}
