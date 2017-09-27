package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCMediaStreamTrackStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:275520
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCMediaStreamTrackStats")
public class RTCMediaStreamTrackStats extends RTCStats
{

    /*
        Properties
    */

    public Number audioLevel;

    @JsProperty( name = "audioLevel")
    public native Number getAudioLevel();

    @JsProperty( name = "audioLevel")
    public native void setAudioLevel( Number value );

    public Number echoReturnLoss;

    @JsProperty( name = "echoReturnLoss")
    public native Number getEchoReturnLoss();

    @JsProperty( name = "echoReturnLoss")
    public native void setEchoReturnLoss( Number value );

    public Number echoReturnLossEnhancement;

    @JsProperty( name = "echoReturnLossEnhancement")
    public native Number getEchoReturnLossEnhancement();

    @JsProperty( name = "echoReturnLossEnhancement")
    public native void setEchoReturnLossEnhancement( Number value );

    public Number frameHeight;

    @JsProperty( name = "frameHeight")
    public native Number getFrameHeight();

    @JsProperty( name = "frameHeight")
    public native void setFrameHeight( Number value );

    public Number frameWidth;

    @JsProperty( name = "frameWidth")
    public native Number getFrameWidth();

    @JsProperty( name = "frameWidth")
    public native void setFrameWidth( Number value );

    public Number framesCorrupted;

    @JsProperty( name = "framesCorrupted")
    public native Number getFramesCorrupted();

    @JsProperty( name = "framesCorrupted")
    public native void setFramesCorrupted( Number value );

    public Number framesDecoded;

    @JsProperty( name = "framesDecoded")
    public native Number getFramesDecoded();

    @JsProperty( name = "framesDecoded")
    public native void setFramesDecoded( Number value );

    public Number framesDropped;

    @JsProperty( name = "framesDropped")
    public native Number getFramesDropped();

    @JsProperty( name = "framesDropped")
    public native void setFramesDropped( Number value );

    public Number framesPerSecond;

    @JsProperty( name = "framesPerSecond")
    public native Number getFramesPerSecond();

    @JsProperty( name = "framesPerSecond")
    public native void setFramesPerSecond( Number value );

    public Number framesReceived;

    @JsProperty( name = "framesReceived")
    public native Number getFramesReceived();

    @JsProperty( name = "framesReceived")
    public native void setFramesReceived( Number value );

    public Number framesSent;

    @JsProperty( name = "framesSent")
    public native Number getFramesSent();

    @JsProperty( name = "framesSent")
    public native void setFramesSent( Number value );

    public Boolean remoteSource;

    @JsProperty( name = "remoteSource")
    public native Boolean getRemoteSource();

    @JsProperty( name = "remoteSource")
    public native void setRemoteSource( Boolean value );

    public Array<String> ssrcIds;

    @JsProperty( name = "ssrcIds")
    public native Array<String> getSsrcIds();

    @JsProperty( name = "ssrcIds")
    public native void setSsrcIds( Array<String> value );

    public String trackIdentifier;

    @JsProperty( name = "trackIdentifier")
    public native String getTrackIdentifier();

    @JsProperty( name = "trackIdentifier")
    public native void setTrackIdentifier( String value );
}
