package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: VideoTrackListEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:662324
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="VideoTrackListEventMap")
public class VideoTrackListEventMap
{

    /*
        Properties
    */

    public TrackEvent addtrack;

    @JsProperty( name = "addtrack")
    public native TrackEvent getAddtrack();

    @JsProperty( name = "addtrack")
    public native void setAddtrack( TrackEvent value );

    public Event change;

    @JsProperty( name = "change")
    public native Event getChange();

    @JsProperty( name = "change")
    public native void setChange( Event value );

    public TrackEvent removetrack;

    @JsProperty( name = "removetrack")
    public native TrackEvent getRemovetrack();

    @JsProperty( name = "removetrack")
    public native void setRemovetrack( TrackEvent value );
}
