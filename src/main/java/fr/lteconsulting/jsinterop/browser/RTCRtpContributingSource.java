package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpContributingSource
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:277654
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpContributingSource")
public class RTCRtpContributingSource
{

    /*
        Properties
    */

    public Number audioLevel;

    @JsProperty( name = "audioLevel")
    public native Number getAudioLevel();

    @JsProperty( name = "audioLevel")
    public native void setAudioLevel( Number value );

    public Number csrc;

    @JsProperty( name = "csrc")
    public native Number getCsrc();

    @JsProperty( name = "csrc")
    public native void setCsrc( Number value );

    public Number timestamp;

    @JsProperty( name = "timestamp")
    public native Number getTimestamp();

    @JsProperty( name = "timestamp")
    public native void setTimestamp( Number value );
}
