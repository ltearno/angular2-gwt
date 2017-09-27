package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TimeRanges
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:657909
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:658043
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TimeRanges")
public class TimeRanges
{

    /*
        Constructors
    */
    public TimeRanges(){
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(end,2,,P(d2))
      * TE Signature : S(end,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@657967
     */
    public native Number end(Number index);
    /** 
      * Std Signature : S(start,2,,P(d2))
      * TE Signature : S(start,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@657999
     */
    public native Number start(Number index);
}
