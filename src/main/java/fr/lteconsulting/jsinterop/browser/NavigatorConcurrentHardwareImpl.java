package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigatorConcurrentHardware
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:733363
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigatorConcurrentHardware")
public class NavigatorConcurrentHardwareImpl implements NavigatorConcurrentHardware
{

    /*
        Properties
    */

    public Number hardwareConcurrency;

    @JsProperty( name = "hardwareConcurrency")
    public native Number getHardwareConcurrency();

    @JsProperty( name = "hardwareConcurrency")
    public native void setHardwareConcurrency( Number value );
}
