package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeviceLightEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:257279
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceLightEventInit")
public class DeviceLightEventInit extends EventInit
{

    /*
        Properties
    */

    public Number value;

    @JsProperty( name = "value")
    public native Number getValue();

    @JsProperty( name = "value")
    public native void setValue( Number value );
}
