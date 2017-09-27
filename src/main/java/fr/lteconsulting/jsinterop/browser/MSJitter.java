package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSJitter
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264009
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSJitter")
public class MSJitter
{

    /*
        Properties
    */

    public Number interArrival;

    @JsProperty( name = "interArrival")
    public native Number getInterArrival();

    @JsProperty( name = "interArrival")
    public native void setInterArrival( Number value );

    public Number interArrivalMax;

    @JsProperty( name = "interArrivalMax")
    public native Number getInterArrivalMax();

    @JsProperty( name = "interArrivalMax")
    public native void setInterArrivalMax( Number value );

    public Number interArrivalSD;

    @JsProperty( name = "interArrivalSD")
    public native Number getInterArrivalSD();

    @JsProperty( name = "interArrivalSD")
    public native void setInterArrivalSD( Number value );
}
