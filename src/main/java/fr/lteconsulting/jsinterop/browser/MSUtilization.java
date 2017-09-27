package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSUtilization
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:266092
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSUtilization")
public class MSUtilization
{

    /*
        Properties
    */

    public Number bandwidthEstimation;

    @JsProperty( name = "bandwidthEstimation")
    public native Number getBandwidthEstimation();

    @JsProperty( name = "bandwidthEstimation")
    public native void setBandwidthEstimation( Number value );

    public Number bandwidthEstimationAvg;

    @JsProperty( name = "bandwidthEstimationAvg")
    public native Number getBandwidthEstimationAvg();

    @JsProperty( name = "bandwidthEstimationAvg")
    public native void setBandwidthEstimationAvg( Number value );

    public Number bandwidthEstimationMax;

    @JsProperty( name = "bandwidthEstimationMax")
    public native Number getBandwidthEstimationMax();

    @JsProperty( name = "bandwidthEstimationMax")
    public native void setBandwidthEstimationMax( Number value );

    public Number bandwidthEstimationMin;

    @JsProperty( name = "bandwidthEstimationMin")
    public native Number getBandwidthEstimationMin();

    @JsProperty( name = "bandwidthEstimationMin")
    public native void setBandwidthEstimationMin( Number value );

    public Number bandwidthEstimationStdDev;

    @JsProperty( name = "bandwidthEstimationStdDev")
    public native Number getBandwidthEstimationStdDev();

    @JsProperty( name = "bandwidthEstimationStdDev")
    public native void setBandwidthEstimationStdDev( Number value );

    public Number packets;

    @JsProperty( name = "packets")
    public native Number getPackets();

    @JsProperty( name = "packets")
    public native void setPackets( Number value );
}
