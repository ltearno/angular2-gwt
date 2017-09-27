package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaTrackConstraintSet
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:269330
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaTrackConstraintSet")
public class MediaTrackConstraintSet
{

    /*
        Properties
    */

    public UnionOfConstrainDoubleRangeAndNumber aspectRatio;

    @JsProperty( name = "aspectRatio")
    public native UnionOfConstrainDoubleRangeAndNumber getAspectRatio();

    @JsProperty( name = "aspectRatio")
    public native void setAspectRatio( UnionOfConstrainDoubleRangeAndNumber value );

    @JsOverlay
    public final void setAspectRatio( ConstrainDoubleRange value ) { setAspectRatio(UnionOfConstrainDoubleRangeAndNumber.ofConstrainDoubleRange( value )); }

    @JsOverlay
    public final void setAspectRatio( Number value ) { setAspectRatio(UnionOfConstrainDoubleRangeAndNumber.ofNumber( value )); }

    public UnionOfArrayOfStringAndConstrainDOMStringParametersAndString deviceId;

    @JsProperty( name = "deviceId")
    public native UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getDeviceId();

    @JsProperty( name = "deviceId")
    public native void setDeviceId( UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value );

    @JsOverlay
    public final void setDeviceId( Array<String> value ) { setDeviceId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setDeviceId( ConstrainDOMStringParameters value ) { setDeviceId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofConstrainDOMStringParameters( value )); }

    @JsOverlay
    public final void setDeviceId( String value ) { setDeviceId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofString( value )); }

    public UnionOfBooleanAndConstrainBooleanParameters echoCancelation;

    @JsProperty( name = "echoCancelation")
    public native UnionOfBooleanAndConstrainBooleanParameters getEchoCancelation();

    @JsProperty( name = "echoCancelation")
    public native void setEchoCancelation( UnionOfBooleanAndConstrainBooleanParameters value );

    @JsOverlay
    public final void setEchoCancelation( Boolean value ) { setEchoCancelation(UnionOfBooleanAndConstrainBooleanParameters.ofBoolean( value )); }

    @JsOverlay
    public final void setEchoCancelation( ConstrainBooleanParameters value ) { setEchoCancelation(UnionOfBooleanAndConstrainBooleanParameters.ofConstrainBooleanParameters( value )); }

    public UnionOfArrayOfStringAndConstrainDOMStringParametersAndString facingMode;

    @JsProperty( name = "facingMode")
    public native UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getFacingMode();

    @JsProperty( name = "facingMode")
    public native void setFacingMode( UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value );

    @JsOverlay
    public final void setFacingMode( Array<String> value ) { setFacingMode(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setFacingMode( ConstrainDOMStringParameters value ) { setFacingMode(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofConstrainDOMStringParameters( value )); }

    @JsOverlay
    public final void setFacingMode( String value ) { setFacingMode(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofString( value )); }

    public UnionOfConstrainDoubleRangeAndNumber frameRate;

    @JsProperty( name = "frameRate")
    public native UnionOfConstrainDoubleRangeAndNumber getFrameRate();

    @JsProperty( name = "frameRate")
    public native void setFrameRate( UnionOfConstrainDoubleRangeAndNumber value );

    @JsOverlay
    public final void setFrameRate( ConstrainDoubleRange value ) { setFrameRate(UnionOfConstrainDoubleRangeAndNumber.ofConstrainDoubleRange( value )); }

    @JsOverlay
    public final void setFrameRate( Number value ) { setFrameRate(UnionOfConstrainDoubleRangeAndNumber.ofNumber( value )); }

    public UnionOfArrayOfStringAndConstrainDOMStringParametersAndString groupId;

    @JsProperty( name = "groupId")
    public native UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getGroupId();

    @JsProperty( name = "groupId")
    public native void setGroupId( UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value );

    @JsOverlay
    public final void setGroupId( Array<String> value ) { setGroupId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setGroupId( ConstrainDOMStringParameters value ) { setGroupId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofConstrainDOMStringParameters( value )); }

    @JsOverlay
    public final void setGroupId( String value ) { setGroupId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString.ofString( value )); }

    public UnionOfConstrainLongRangeAndNumber height;

    @JsProperty( name = "height")
    public native UnionOfConstrainLongRangeAndNumber getHeight();

    @JsProperty( name = "height")
    public native void setHeight( UnionOfConstrainLongRangeAndNumber value );

    @JsOverlay
    public final void setHeight( ConstrainLongRange value ) { setHeight(UnionOfConstrainLongRangeAndNumber.ofConstrainLongRange( value )); }

    @JsOverlay
    public final void setHeight( Number value ) { setHeight(UnionOfConstrainLongRangeAndNumber.ofNumber( value )); }

    public UnionOfConstrainLongRangeAndNumber sampleRate;

    @JsProperty( name = "sampleRate")
    public native UnionOfConstrainLongRangeAndNumber getSampleRate();

    @JsProperty( name = "sampleRate")
    public native void setSampleRate( UnionOfConstrainLongRangeAndNumber value );

    @JsOverlay
    public final void setSampleRate( ConstrainLongRange value ) { setSampleRate(UnionOfConstrainLongRangeAndNumber.ofConstrainLongRange( value )); }

    @JsOverlay
    public final void setSampleRate( Number value ) { setSampleRate(UnionOfConstrainLongRangeAndNumber.ofNumber( value )); }

    public UnionOfConstrainLongRangeAndNumber sampleSize;

    @JsProperty( name = "sampleSize")
    public native UnionOfConstrainLongRangeAndNumber getSampleSize();

    @JsProperty( name = "sampleSize")
    public native void setSampleSize( UnionOfConstrainLongRangeAndNumber value );

    @JsOverlay
    public final void setSampleSize( ConstrainLongRange value ) { setSampleSize(UnionOfConstrainLongRangeAndNumber.ofConstrainLongRange( value )); }

    @JsOverlay
    public final void setSampleSize( Number value ) { setSampleSize(UnionOfConstrainLongRangeAndNumber.ofNumber( value )); }

    public UnionOfConstrainDoubleRangeAndNumber volume;

    @JsProperty( name = "volume")
    public native UnionOfConstrainDoubleRangeAndNumber getVolume();

    @JsProperty( name = "volume")
    public native void setVolume( UnionOfConstrainDoubleRangeAndNumber value );

    @JsOverlay
    public final void setVolume( ConstrainDoubleRange value ) { setVolume(UnionOfConstrainDoubleRangeAndNumber.ofConstrainDoubleRange( value )); }

    @JsOverlay
    public final void setVolume( Number value ) { setVolume(UnionOfConstrainDoubleRangeAndNumber.ofNumber( value )); }

    public UnionOfConstrainLongRangeAndNumber width;

    @JsProperty( name = "width")
    public native UnionOfConstrainLongRangeAndNumber getWidth();

    @JsProperty( name = "width")
    public native void setWidth( UnionOfConstrainLongRangeAndNumber value );

    @JsOverlay
    public final void setWidth( ConstrainLongRange value ) { setWidth(UnionOfConstrainLongRangeAndNumber.ofConstrainLongRange( value )); }

    @JsOverlay
    public final void setWidth( Number value ) { setWidth(UnionOfConstrainLongRangeAndNumber.ofNumber( value )); }
}
