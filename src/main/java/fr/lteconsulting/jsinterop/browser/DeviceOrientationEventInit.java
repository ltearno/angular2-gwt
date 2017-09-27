package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeviceOrientationEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:257576
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceOrientationEventInit")
public class DeviceOrientationEventInit extends EventInit
{

    /*
        Properties
    */

    public Boolean absolute;

    @JsProperty( name = "absolute")
    public native Boolean getAbsolute();

    @JsProperty( name = "absolute")
    public native void setAbsolute( Boolean value );

    public Number alpha;

    @JsProperty( name = "alpha")
    public native Number getAlpha();

    @JsProperty( name = "alpha")
    public native void setAlpha( Number value );

    public Number beta;

    @JsProperty( name = "beta")
    public native Number getBeta();

    @JsProperty( name = "beta")
    public native void setBeta( Number value );

    public Number gamma;

    @JsProperty( name = "gamma")
    public native Number getGamma();

    @JsProperty( name = "gamma")
    public native void setGamma( Number value );
}
