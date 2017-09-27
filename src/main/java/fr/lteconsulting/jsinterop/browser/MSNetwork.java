package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSNetwork
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264264
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSNetwork")
public class MSNetwork extends RTCStats
{

    /*
        Properties
    */

    public MSDelay delay;

    @JsProperty( name = "delay")
    public native MSDelay getDelay();

    @JsProperty( name = "delay")
    public native void setDelay( MSDelay value );

    public MSJitter jitter;

    @JsProperty( name = "jitter")
    public native MSJitter getJitter();

    @JsProperty( name = "jitter")
    public native void setJitter( MSJitter value );

    public MSPacketLoss packetLoss;

    @JsProperty( name = "packetLoss")
    public native MSPacketLoss getPacketLoss();

    @JsProperty( name = "packetLoss")
    public native void setPacketLoss( MSPacketLoss value );

    public MSUtilization utilization;

    @JsProperty( name = "utilization")
    public native MSUtilization getUtilization();

    @JsProperty( name = "utilization")
    public native void setUtilization( MSUtilization value );
}
