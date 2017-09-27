package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeviceOrientationEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:326339
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:326715
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceOrientationEvent")
public class DeviceOrientationEvent extends Event
{

    /*
        Constructors
    */
    public DeviceOrientationEvent(String typeArg, DeviceOrientationEventInit eventInitDict){
        super(null, null);
    }

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

    /*
        Methods
    */
    /** 
      * Std Signature : S(initDeviceOrientationEvent,289,,P(d1),P(d27),P(d27),P(d2),P(d2),P(d2),P(d27))
      * TE Signature : S(initDeviceOrientationEvent,P(d1),P(d27),P(d27),P(d2),P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@326530
     */
    public native void initDeviceOrientationEvent(String type, Boolean bubbles, Boolean cancelable, Number alpha, Number beta, Number gamma, Boolean absolute);
}
