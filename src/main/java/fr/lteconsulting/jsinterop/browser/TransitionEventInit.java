package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TransitionEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:281304
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TransitionEventInit")
public class TransitionEventInit extends EventInit
{

    /*
        Properties
    */

    public Number elapsedTime;

    @JsProperty( name = "elapsedTime")
    public native Number getElapsedTime();

    @JsProperty( name = "elapsedTime")
    public native void setElapsedTime( Number value );

    public String propertyName;

    @JsProperty( name = "propertyName")
    public native String getPropertyName();

    @JsProperty( name = "propertyName")
    public native void setPropertyName( String value );
}
