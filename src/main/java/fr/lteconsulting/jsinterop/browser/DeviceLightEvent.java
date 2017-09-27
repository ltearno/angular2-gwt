package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeviceLightEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:325436
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:325523
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceLightEvent")
public class DeviceLightEvent extends Event
{

    /*
        Constructors
    */
    public DeviceLightEvent(String typeArg, DeviceLightEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Number value;

    @JsProperty( name = "value")
    public native Number getValue();

    @JsProperty( name = "value")
    public native void setValue( Number value );
}
