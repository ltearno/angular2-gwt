package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSAudioSendSignal
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262050
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAudioSendSignal")
public class MSAudioSendSignal
{

    /*
        Properties
    */

    public Number noiseLevel;

    @JsProperty( name = "noiseLevel")
    public native Number getNoiseLevel();

    @JsProperty( name = "noiseLevel")
    public native void setNoiseLevel( Number value );

    public Number sendNoiseLevelCh1;

    @JsProperty( name = "sendNoiseLevelCh1")
    public native Number getSendNoiseLevelCh1();

    @JsProperty( name = "sendNoiseLevelCh1")
    public native void setSendNoiseLevelCh1( Number value );

    public Number sendSignalLevelCh1;

    @JsProperty( name = "sendSignalLevelCh1")
    public native Number getSendSignalLevelCh1();

    @JsProperty( name = "sendSignalLevelCh1")
    public native void setSendSignalLevelCh1( Number value );
}
