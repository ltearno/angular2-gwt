package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaTrackSettings
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:270051
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaTrackSettings")
public class MediaTrackSettings
{

    /*
        Properties
    */

    public Number aspectRatio;

    @JsProperty( name = "aspectRatio")
    public native Number getAspectRatio();

    @JsProperty( name = "aspectRatio")
    public native void setAspectRatio( Number value );

    public String deviceId;

    @JsProperty( name = "deviceId")
    public native String getDeviceId();

    @JsProperty( name = "deviceId")
    public native void setDeviceId( String value );

    public Boolean echoCancellation;

    @JsProperty( name = "echoCancellation")
    public native Boolean getEchoCancellation();

    @JsProperty( name = "echoCancellation")
    public native void setEchoCancellation( Boolean value );

    public String facingMode;

    @JsProperty( name = "facingMode")
    public native String getFacingMode();

    @JsProperty( name = "facingMode")
    public native void setFacingMode( String value );

    public Number frameRate;

    @JsProperty( name = "frameRate")
    public native Number getFrameRate();

    @JsProperty( name = "frameRate")
    public native void setFrameRate( Number value );

    public String groupId;

    @JsProperty( name = "groupId")
    public native String getGroupId();

    @JsProperty( name = "groupId")
    public native void setGroupId( String value );

    public Number height;

    @JsProperty( name = "height")
    public native Number getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Number value );

    public Number sampleRate;

    @JsProperty( name = "sampleRate")
    public native Number getSampleRate();

    @JsProperty( name = "sampleRate")
    public native void setSampleRate( Number value );

    public Number sampleSize;

    @JsProperty( name = "sampleSize")
    public native Number getSampleSize();

    @JsProperty( name = "sampleSize")
    public native void setSampleSize( Number value );

    public Number volume;

    @JsProperty( name = "volume")
    public native Number getVolume();

    @JsProperty( name = "volume")
    public native void setVolume( Number value );

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );
}
