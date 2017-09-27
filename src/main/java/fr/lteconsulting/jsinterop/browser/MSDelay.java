package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSDelay
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262493
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSDelay")
public class MSDelay
{

    /*
        Properties
    */

    public Number roundTrip;

    @JsProperty( name = "roundTrip")
    public native Number getRoundTrip();

    @JsProperty( name = "roundTrip")
    public native void setRoundTrip( Number value );

    public Number roundTripMax;

    @JsProperty( name = "roundTripMax")
    public native Number getRoundTripMax();

    @JsProperty( name = "roundTripMax")
    public native void setRoundTripMax( Number value );
}
