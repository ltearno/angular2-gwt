package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: VideoPlaybackQuality
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:661721
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:661966
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="VideoPlaybackQuality")
public class VideoPlaybackQuality
{

    /*
        Constructors
    */
    public VideoPlaybackQuality(){
    }

    /*
        Properties
    */

    public Number corruptedVideoFrames;

    @JsProperty( name = "corruptedVideoFrames")
    public native Number getCorruptedVideoFrames();

    @JsProperty( name = "corruptedVideoFrames")
    public native void setCorruptedVideoFrames( Number value );

    public Number creationTime;

    @JsProperty( name = "creationTime")
    public native Number getCreationTime();

    @JsProperty( name = "creationTime")
    public native void setCreationTime( Number value );

    public Number droppedVideoFrames;

    @JsProperty( name = "droppedVideoFrames")
    public native Number getDroppedVideoFrames();

    @JsProperty( name = "droppedVideoFrames")
    public native void setDroppedVideoFrames( Number value );

    public Number totalFrameDelay;

    @JsProperty( name = "totalFrameDelay")
    public native Number getTotalFrameDelay();

    @JsProperty( name = "totalFrameDelay")
    public native void setTotalFrameDelay( Number value );

    public Number totalVideoFrames;

    @JsProperty( name = "totalVideoFrames")
    public native Number getTotalVideoFrames();

    @JsProperty( name = "totalVideoFrames")
    public native void setTotalVideoFrames( Number value );
}
