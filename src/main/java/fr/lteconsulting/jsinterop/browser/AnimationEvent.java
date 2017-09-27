package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AnimationEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:283263
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:283534
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AnimationEvent")
public class AnimationEvent extends Event
{

    /*
        Constructors
    */
    public AnimationEvent(String typeArg, AnimationEventInit eventInitDict){
        super(null, null);
    }

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

    /*
        Methods
    */
    /** 
      * Std Signature : S(initAnimationEvent,289,,P(d1),P(d27),P(d27),P(d1),P(d2))
      * TE Signature : S(initAnimationEvent,P(d1),P(d27),P(d27),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@283380
     */
    public native void initAnimationEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, String animationNameArg, Number elapsedTimeArg);
}
