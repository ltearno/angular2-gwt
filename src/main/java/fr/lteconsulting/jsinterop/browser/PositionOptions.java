package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PositionOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273084
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PositionOptions")
public class PositionOptions
{

    /*
        Properties
    */

    public Boolean enableHighAccuracy;

    @JsProperty( name = "enableHighAccuracy")
    public native Boolean getEnableHighAccuracy();

    @JsProperty( name = "enableHighAccuracy")
    public native void setEnableHighAccuracy( Boolean value );

    public Number maximumAge;

    @JsProperty( name = "maximumAge")
    public native Number getMaximumAge();

    @JsProperty( name = "maximumAge")
    public native void setMaximumAge( Number value );

    public Number timeout;

    @JsProperty( name = "timeout")
    public native Number getTimeout();

    @JsProperty( name = "timeout")
    public native void setTimeout( Number value );
}
