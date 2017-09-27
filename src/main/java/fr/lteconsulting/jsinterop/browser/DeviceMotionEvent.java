package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeviceMotionEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:325660
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:326198
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceMotionEvent")
public class DeviceMotionEvent extends Event
{

    /*
        Constructors
    */
    public DeviceMotionEvent(String typeArg, DeviceMotionEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public DeviceAcceleration acceleration;

    @JsProperty( name = "acceleration")
    public native DeviceAcceleration getAcceleration();

    @JsProperty( name = "acceleration")
    public native void setAcceleration( DeviceAcceleration value );

    public DeviceAcceleration accelerationIncludingGravity;

    @JsProperty( name = "accelerationIncludingGravity")
    public native DeviceAcceleration getAccelerationIncludingGravity();

    @JsProperty( name = "accelerationIncludingGravity")
    public native void setAccelerationIncludingGravity( DeviceAcceleration value );

    public Number interval;

    @JsProperty( name = "interval")
    public native Number getInterval();

    @JsProperty( name = "interval")
    public native void setInterval( Number value );

    public DeviceRotationRate rotationRate;

    @JsProperty( name = "rotationRate")
    public native DeviceRotationRate getRotationRate();

    @JsProperty( name = "rotationRate")
    public native void setRotationRate( DeviceRotationRate value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initDeviceMotionEvent,289,,P(d1),P(d27),P(d27),P(d63),P(d63),P(d64),P(d2))
      * TE Signature : S(initDeviceMotionEvent,P(d1),P(d27),P(d27),P(d63),P(d63),P(d64),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@325926
     */
    public native void initDeviceMotionEvent(String type, Boolean bubbles, Boolean cancelable, DeviceAccelerationDict acceleration, DeviceAccelerationDict accelerationIncludingGravity, DeviceRotationRateDict rotationRate, Number interval);
}
