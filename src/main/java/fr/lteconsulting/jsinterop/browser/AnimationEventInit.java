package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AnimationEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:255640
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AnimationEventInit")
public class AnimationEventInit extends EventInit
{

    /*
        Properties
    */

    public String animationName;

    @JsProperty( name = "animationName")
    public native String getAnimationName();

    @JsProperty( name = "animationName")
    public native void setAnimationName( String value );

    public Number elapsedTime;

    @JsProperty( name = "elapsedTime")
    public native Number getElapsedTime();

    @JsProperty( name = "elapsedTime")
    public native void setElapsedTime( Number value );
}
