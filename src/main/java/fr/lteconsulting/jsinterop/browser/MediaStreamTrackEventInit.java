package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamTrackEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268847
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamTrackEventInit")
public class MediaStreamTrackEventInit extends EventInit
{

    /*
        Properties
    */

    public MediaStreamTrack track;

    @JsProperty( name = "track")
    public native MediaStreamTrack getTrack();

    @JsProperty( name = "track")
    public native void setTrack( MediaStreamTrack value );
}
