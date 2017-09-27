package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamTrackEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:523065
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamTrackEventMap")
public class MediaStreamTrackEventMap
{

    /*
        Properties
    */

    public MediaStreamErrorEvent ended;

    @JsProperty( name = "ended")
    public native MediaStreamErrorEvent getEnded();

    @JsProperty( name = "ended")
    public native void setEnded( MediaStreamErrorEvent value );

    public Event mute;

    @JsProperty( name = "mute")
    public native Event getMute();

    @JsProperty( name = "mute")
    public native void setMute( Event value );

    public MediaStreamErrorEvent overconstrained;

    @JsProperty( name = "overconstrained")
    public native MediaStreamErrorEvent getOverconstrained();

    @JsProperty( name = "overconstrained")
    public native void setOverconstrained( MediaStreamErrorEvent value );

    public Event unmute;

    @JsProperty( name = "unmute")
    public native Event getUnmute();

    @JsProperty( name = "unmute")
    public native void setUnmute( Event value );
}
