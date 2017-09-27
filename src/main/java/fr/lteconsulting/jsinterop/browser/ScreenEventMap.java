package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScreenEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:638202
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScreenEventMap")
public class ScreenEventMap
{

    /*
        Properties
    */

    public Event MSOrientationChange;

    @JsProperty( name = "MSOrientationChange")
    public native Event getMSOrientationChange();

    @JsProperty( name = "MSOrientationChange")
    public native void setMSOrientationChange( Event value );
}
