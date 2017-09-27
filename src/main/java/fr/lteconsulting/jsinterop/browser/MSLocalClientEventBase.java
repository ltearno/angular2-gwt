package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSLocalClientEventBase
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264119
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSLocalClientEventBase")
public class MSLocalClientEventBase extends RTCStats
{

    /*
        Properties
    */

    public Number networkBandwidthLowEventRatio;

    @JsProperty( name = "networkBandwidthLowEventRatio")
    public native Number getNetworkBandwidthLowEventRatio();

    @JsProperty( name = "networkBandwidthLowEventRatio")
    public native void setNetworkBandwidthLowEventRatio( Number value );

    public Number networkReceiveQualityEventRatio;

    @JsProperty( name = "networkReceiveQualityEventRatio")
    public native Number getNetworkReceiveQualityEventRatio();

    @JsProperty( name = "networkReceiveQualityEventRatio")
    public native void setNetworkReceiveQualityEventRatio( Number value );
}
