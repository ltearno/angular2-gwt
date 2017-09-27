package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaTrackSupportedConstraints
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:270349
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaTrackSupportedConstraints")
public class MediaTrackSupportedConstraints
{

    /*
        Properties
    */

    public Boolean aspectRatio;

    @JsProperty( name = "aspectRatio")
    public native Boolean getAspectRatio();

    @JsProperty( name = "aspectRatio")
    public native void setAspectRatio( Boolean value );

    public Boolean deviceId;

    @JsProperty( name = "deviceId")
    public native Boolean getDeviceId();

    @JsProperty( name = "deviceId")
    public native void setDeviceId( Boolean value );

    public Boolean echoCancellation;

    @JsProperty( name = "echoCancellation")
    public native Boolean getEchoCancellation();

    @JsProperty( name = "echoCancellation")
    public native void setEchoCancellation( Boolean value );

    public Boolean facingMode;

    @JsProperty( name = "facingMode")
    public native Boolean getFacingMode();

    @JsProperty( name = "facingMode")
    public native void setFacingMode( Boolean value );

    public Boolean frameRate;

    @JsProperty( name = "frameRate")
    public native Boolean getFrameRate();

    @JsProperty( name = "frameRate")
    public native void setFrameRate( Boolean value );

    public Boolean groupId;

    @JsProperty( name = "groupId")
    public native Boolean getGroupId();

    @JsProperty( name = "groupId")
    public native void setGroupId( Boolean value );

    public Boolean height;

    @JsProperty( name = "height")
    public native Boolean getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Boolean value );

    public Boolean sampleRate;

    @JsProperty( name = "sampleRate")
    public native Boolean getSampleRate();

    @JsProperty( name = "sampleRate")
    public native void setSampleRate( Boolean value );

    public Boolean sampleSize;

    @JsProperty( name = "sampleSize")
    public native Boolean getSampleSize();

    @JsProperty( name = "sampleSize")
    public native void setSampleSize( Boolean value );

    public Boolean volume;

    @JsProperty( name = "volume")
    public native Boolean getVolume();

    @JsProperty( name = "volume")
    public native void setVolume( Boolean value );

    public Boolean width;

    @JsProperty( name = "width")
    public native Boolean getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Boolean value );
}
