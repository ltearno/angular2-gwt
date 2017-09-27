package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSOutboundNetwork
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264749
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSOutboundNetwork")
public class MSOutboundNetwork extends MSNetwork
{

    /*
        Properties
    */

    public Number appliedBandwidthLimit;

    @JsProperty( name = "appliedBandwidthLimit")
    public native Number getAppliedBandwidthLimit();

    @JsProperty( name = "appliedBandwidthLimit")
    public native void setAppliedBandwidthLimit( Number value );
}
