package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TransitionEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:659310
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:659581
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TransitionEvent")
public class TransitionEvent extends Event
{

    /*
        Constructors
    */
    public TransitionEvent(String typeArg, TransitionEventInit eventInitDict){
        super(null, null);
    }

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

    /*
        Methods
    */
    /** 
      * Std Signature : S(initTransitionEvent,289,,P(d1),P(d27),P(d27),P(d1),P(d2))
      * TE Signature : S(initTransitionEvent,P(d1),P(d27),P(d27),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@659427
     */
    public native void initTransitionEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, String propertyNameArg, Number elapsedTimeArg);
}
