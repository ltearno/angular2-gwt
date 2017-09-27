package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeySystemConfiguration
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268201
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeySystemConfiguration")
public class MediaKeySystemConfiguration
{

    /*
        Properties
    */

    public Array<MediaKeySystemMediaCapability> audioCapabilities;

    @JsProperty( name = "audioCapabilities")
    public native Array<MediaKeySystemMediaCapability> getAudioCapabilities();

    @JsProperty( name = "audioCapabilities")
    public native void setAudioCapabilities( Array<MediaKeySystemMediaCapability> value );

    public String distinctiveIdentifier;

    @JsProperty( name = "distinctiveIdentifier")
    public native String getDistinctiveIdentifier();

    @JsProperty( name = "distinctiveIdentifier")
    public native void setDistinctiveIdentifier( String value );

    public Array<String> initDataTypes;

    @JsProperty( name = "initDataTypes")
    public native Array<String> getInitDataTypes();

    @JsProperty( name = "initDataTypes")
    public native void setInitDataTypes( Array<String> value );

    public String persistentState;

    @JsProperty( name = "persistentState")
    public native String getPersistentState();

    @JsProperty( name = "persistentState")
    public native void setPersistentState( String value );

    public Array<MediaKeySystemMediaCapability> videoCapabilities;

    @JsProperty( name = "videoCapabilities")
    public native Array<MediaKeySystemMediaCapability> getVideoCapabilities();

    @JsProperty( name = "videoCapabilities")
    public native void setVideoCapabilities( Array<MediaKeySystemMediaCapability> value );
}
