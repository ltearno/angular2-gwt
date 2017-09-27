package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSPacketLoss
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264836
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSPacketLoss")
public class MSPacketLoss
{

    /*
        Properties
    */

    public Number lossRate;

    @JsProperty( name = "lossRate")
    public native Number getLossRate();

    @JsProperty( name = "lossRate")
    public native void setLossRate( Number value );

    public Number lossRateMax;

    @JsProperty( name = "lossRateMax")
    public native Number getLossRateMax();

    @JsProperty( name = "lossRateMax")
    public native void setLossRateMax( Number value );
}
