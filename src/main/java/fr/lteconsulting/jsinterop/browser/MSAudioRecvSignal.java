package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSAudioRecvSignal
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:261640
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAudioRecvSignal")
public class MSAudioRecvSignal
{

    /*
        Properties
    */

    public Number initialSignalLevelRMS;

    @JsProperty( name = "initialSignalLevelRMS")
    public native Number getInitialSignalLevelRMS();

    @JsProperty( name = "initialSignalLevelRMS")
    public native void setInitialSignalLevelRMS( Number value );

    public Number recvNoiseLevelCh1;

    @JsProperty( name = "recvNoiseLevelCh1")
    public native Number getRecvNoiseLevelCh1();

    @JsProperty( name = "recvNoiseLevelCh1")
    public native void setRecvNoiseLevelCh1( Number value );

    public Number recvSignalLevelCh1;

    @JsProperty( name = "recvSignalLevelCh1")
    public native Number getRecvSignalLevelCh1();

    @JsProperty( name = "recvSignalLevelCh1")
    public native void setRecvSignalLevelCh1( Number value );

    public Number renderLoopbackSignalLevel;

    @JsProperty( name = "renderLoopbackSignalLevel")
    public native Number getRenderLoopbackSignalLevel();

    @JsProperty( name = "renderLoopbackSignalLevel")
    public native void setRenderLoopbackSignalLevel( Number value );

    public Number renderNoiseLevel;

    @JsProperty( name = "renderNoiseLevel")
    public native Number getRenderNoiseLevel();

    @JsProperty( name = "renderNoiseLevel")
    public native void setRenderNoiseLevel( Number value );

    public Number renderSignalLevel;

    @JsProperty( name = "renderSignalLevel")
    public native Number getRenderSignalLevel();

    @JsProperty( name = "renderSignalLevel")
    public native void setRenderSignalLevel( Number value );
}
