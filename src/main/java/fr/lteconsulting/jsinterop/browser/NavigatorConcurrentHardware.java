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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorConcurrentHardware
{

    /*
        Properties
    */

    @JsProperty( name = "hardwareConcurrency")
    Number getHardwareConcurrency();

    @JsProperty( name = "hardwareConcurrency")
    void setHardwareConcurrency( Number value );
}
