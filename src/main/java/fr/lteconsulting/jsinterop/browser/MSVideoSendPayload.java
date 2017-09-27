package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSVideoSendPayload
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:267717
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSVideoSendPayload")
public class MSVideoSendPayload extends MSVideoPayload
{

    /*
        Properties
    */

    public Number sendBitRateAverage;

    @JsProperty( name = "sendBitRateAverage")
    public native Number getSendBitRateAverage();

    @JsProperty( name = "sendBitRateAverage")
    public native void setSendBitRateAverage( Number value );

    public Number sendBitRateMaximum;

    @JsProperty( name = "sendBitRateMaximum")
    public native Number getSendBitRateMaximum();

    @JsProperty( name = "sendBitRateMaximum")
    public native void setSendBitRateMaximum( Number value );

    public Number sendFrameRateAverage;

    @JsProperty( name = "sendFrameRateAverage")
    public native Number getSendFrameRateAverage();

    @JsProperty( name = "sendFrameRateAverage")
    public native void setSendFrameRateAverage( Number value );

    public Number sendResolutionHeight;

    @JsProperty( name = "sendResolutionHeight")
    public native Number getSendResolutionHeight();

    @JsProperty( name = "sendResolutionHeight")
    public native void setSendResolutionHeight( Number value );

    public Number sendResolutionWidth;

    @JsProperty( name = "sendResolutionWidth")
    public native Number getSendResolutionWidth();

    @JsProperty( name = "sendResolutionWidth")
    public native void setSendResolutionWidth( Number value );

    public Number sendVideoStreamsMax;

    @JsProperty( name = "sendVideoStreamsMax")
    public native Number getSendVideoStreamsMax();

    @JsProperty( name = "sendVideoStreamsMax")
    public native void setSendVideoStreamsMax( Number value );
}
