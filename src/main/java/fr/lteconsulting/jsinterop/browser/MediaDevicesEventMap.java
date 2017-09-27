package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaDevicesEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:516484
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaDevicesEventMap")
public class MediaDevicesEventMap
{

    /*
        Properties
    */

    public Event devicechange;

    @JsProperty( name = "devicechange")
    public native Event getDevicechange();

    @JsProperty( name = "devicechange")
    public native void setDevicechange( Event value );
}
