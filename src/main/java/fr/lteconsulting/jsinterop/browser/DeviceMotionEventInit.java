package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeviceMotionEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:257353
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceMotionEventInit")
public class DeviceMotionEventInit extends EventInit
{

    /*
        Properties
    */

    public DeviceAccelerationDict acceleration;

    @JsProperty( name = "acceleration")
    public native DeviceAccelerationDict getAcceleration();

    @JsProperty( name = "acceleration")
    public native void setAcceleration( DeviceAccelerationDict value );

    public DeviceAccelerationDict accelerationIncludingGravity;

    @JsProperty( name = "accelerationIncludingGravity")
    public native DeviceAccelerationDict getAccelerationIncludingGravity();

    @JsProperty( name = "accelerationIncludingGravity")
    public native void setAccelerationIncludingGravity( DeviceAccelerationDict value );

    public Number interval;

    @JsProperty( name = "interval")
    public native Number getInterval();

    @JsProperty( name = "interval")
    public native void setInterval( Number value );

    public DeviceRotationRateDict rotationRate;

    @JsProperty( name = "rotationRate")
    public native DeviceRotationRateDict getRotationRate();

    @JsProperty( name = "rotationRate")
    public native void setRotationRate( DeviceRotationRateDict value );
}
