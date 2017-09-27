package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WheelEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:281855
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WheelEventInit")
public class WheelEventInit extends MouseEventInit
{

    /*
        Properties
    */

    public Number deltaMode;

    @JsProperty( name = "deltaMode")
    public native Number getDeltaMode();

    @JsProperty( name = "deltaMode")
    public native void setDeltaMode( Number value );

    public Number deltaX;

    @JsProperty( name = "deltaX")
    public native Number getDeltaX();

    @JsProperty( name = "deltaX")
    public native void setDeltaX( Number value );

    public Number deltaY;

    @JsProperty( name = "deltaY")
    public native Number getDeltaY();

    @JsProperty( name = "deltaY")
    public native void setDeltaY( Number value );

    public Number deltaZ;

    @JsProperty( name = "deltaZ")
    public native Number getDeltaZ();

    @JsProperty( name = "deltaZ")
    public native void setDeltaZ( Number value );
}
