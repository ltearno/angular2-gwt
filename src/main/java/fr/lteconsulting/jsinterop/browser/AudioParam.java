package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioParam
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:290280
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:290834
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioParam")
public class AudioParam
{

    /*
        Constructors
    */
    public AudioParam(){
    }

    /*
        Properties
    */

    public Number defaultValue;

    @JsProperty( name = "defaultValue")
    public native Number getDefaultValue();

    @JsProperty( name = "defaultValue")
    public native void setDefaultValue( Number value );

    public Number value;

    @JsProperty( name = "value")
    public native Number getValue();

    @JsProperty( name = "value")
    public native void setValue( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(cancelScheduledValues,221,,P(d2))
      * TE Signature : S(cancelScheduledValues,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290363
     */
    public native AudioParam cancelScheduledValues(Number startTime);
    /** 
      * Std Signature : S(exponentialRampToValueAtTime,221,,P(d2),P(d2))
      * TE Signature : S(exponentialRampToValueAtTime,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290421
     */
    public native AudioParam exponentialRampToValueAtTime(Number value, Number endTime);
    /** 
      * Std Signature : S(linearRampToValueAtTime,221,,P(d2),P(d2))
      * TE Signature : S(linearRampToValueAtTime,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290499
     */
    public native AudioParam linearRampToValueAtTime(Number value, Number endTime);
    /** 
      * Std Signature : S(setTargetAtTime,221,,P(d2),P(d2),P(d2))
      * TE Signature : S(setTargetAtTime,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290572
     */
    public native AudioParam setTargetAtTime(Number target, Number startTime, Number timeConstant);
    /** 
      * Std Signature : S(setValueAtTime,221,,P(d2),P(d2))
      * TE Signature : S(setValueAtTime,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290662
     */
    public native AudioParam setValueAtTime(Number value, Number startTime);
    /** 
      * Std Signature : S(setValueCurveAtTime,221,,P(d35),P(d2),P(d2))
      * TE Signature : S(setValueCurveAtTime,P(d35),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290728
     */
    public native AudioParam setValueCurveAtTime(Float32Array values, Number startTime, Number duration);
}
