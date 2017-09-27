package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaTrackCapabilities
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268936
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaTrackCapabilities")
public class MediaTrackCapabilities
{

    /*
        Properties
    */

    public UnionOfDoubleRangeAndNumber aspectRatio;

    @JsProperty( name = "aspectRatio")
    public native UnionOfDoubleRangeAndNumber getAspectRatio();

    @JsProperty( name = "aspectRatio")
    public native void setAspectRatio( UnionOfDoubleRangeAndNumber value );

    @JsOverlay
    public final void setAspectRatio( DoubleRange value ) { setAspectRatio(UnionOfDoubleRangeAndNumber.ofDoubleRange( value )); }

    @JsOverlay
    public final void setAspectRatio( Number value ) { setAspectRatio(UnionOfDoubleRangeAndNumber.ofNumber( value )); }

    public String deviceId;

    @JsProperty( name = "deviceId")
    public native String getDeviceId();

    @JsProperty( name = "deviceId")
    public native void setDeviceId( String value );

    public Array<Boolean> echoCancellation;

    @JsProperty( name = "echoCancellation")
    public native Array<Boolean> getEchoCancellation();

    @JsProperty( name = "echoCancellation")
    public native void setEchoCancellation( Array<Boolean> value );

    public String facingMode;

    @JsProperty( name = "facingMode")
    public native String getFacingMode();

    @JsProperty( name = "facingMode")
    public native void setFacingMode( String value );

    public UnionOfDoubleRangeAndNumber frameRate;

    @JsProperty( name = "frameRate")
    public native UnionOfDoubleRangeAndNumber getFrameRate();

    @JsProperty( name = "frameRate")
    public native void setFrameRate( UnionOfDoubleRangeAndNumber value );

    @JsOverlay
    public final void setFrameRate( DoubleRange value ) { setFrameRate(UnionOfDoubleRangeAndNumber.ofDoubleRange( value )); }

    @JsOverlay
    public final void setFrameRate( Number value ) { setFrameRate(UnionOfDoubleRangeAndNumber.ofNumber( value )); }

    public String groupId;

    @JsProperty( name = "groupId")
    public native String getGroupId();

    @JsProperty( name = "groupId")
    public native void setGroupId( String value );

    public UnionOfLongRangeAndNumber height;

    @JsProperty( name = "height")
    public native UnionOfLongRangeAndNumber getHeight();

    @JsProperty( name = "height")
    public native void setHeight( UnionOfLongRangeAndNumber value );

    @JsOverlay
    public final void setHeight( LongRange value ) { setHeight(UnionOfLongRangeAndNumber.ofLongRange( value )); }

    @JsOverlay
    public final void setHeight( Number value ) { setHeight(UnionOfLongRangeAndNumber.ofNumber( value )); }

    public UnionOfLongRangeAndNumber sampleRate;

    @JsProperty( name = "sampleRate")
    public native UnionOfLongRangeAndNumber getSampleRate();

    @JsProperty( name = "sampleRate")
    public native void setSampleRate( UnionOfLongRangeAndNumber value );

    @JsOverlay
    public final void setSampleRate( LongRange value ) { setSampleRate(UnionOfLongRangeAndNumber.ofLongRange( value )); }

    @JsOverlay
    public final void setSampleRate( Number value ) { setSampleRate(UnionOfLongRangeAndNumber.ofNumber( value )); }

    public UnionOfLongRangeAndNumber sampleSize;

    @JsProperty( name = "sampleSize")
    public native UnionOfLongRangeAndNumber getSampleSize();

    @JsProperty( name = "sampleSize")
    public native void setSampleSize( UnionOfLongRangeAndNumber value );

    @JsOverlay
    public final void setSampleSize( LongRange value ) { setSampleSize(UnionOfLongRangeAndNumber.ofLongRange( value )); }

    @JsOverlay
    public final void setSampleSize( Number value ) { setSampleSize(UnionOfLongRangeAndNumber.ofNumber( value )); }

    public UnionOfDoubleRangeAndNumber volume;

    @JsProperty( name = "volume")
    public native UnionOfDoubleRangeAndNumber getVolume();

    @JsProperty( name = "volume")
    public native void setVolume( UnionOfDoubleRangeAndNumber value );

    @JsOverlay
    public final void setVolume( DoubleRange value ) { setVolume(UnionOfDoubleRangeAndNumber.ofDoubleRange( value )); }

    @JsOverlay
    public final void setVolume( Number value ) { setVolume(UnionOfDoubleRangeAndNumber.ofNumber( value )); }

    public UnionOfLongRangeAndNumber width;

    @JsProperty( name = "width")
    public native UnionOfLongRangeAndNumber getWidth();

    @JsProperty( name = "width")
    public native void setWidth( UnionOfLongRangeAndNumber value );

    @JsOverlay
    public final void setWidth( LongRange value ) { setWidth(UnionOfLongRangeAndNumber.ofLongRange( value )); }

    @JsOverlay
    public final void setWidth( Number value ) { setWidth(UnionOfLongRangeAndNumber.ofNumber( value )); }
}
