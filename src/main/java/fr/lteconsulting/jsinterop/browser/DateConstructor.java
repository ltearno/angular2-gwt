package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DateConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:33018
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:198450
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:784371
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DateConstructor")
public class DateConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Date prototype;

    @JsProperty( name = "prototype")
    public native Date getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Date value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(UTC,2,,P(d2),P(d2))
      * TE Signature : S(UTC,P(d2),P(d2))
      * 
     */
    public native Number UTC(Number year, Number month);
    /** 
      * Std Signature : S(UTC,2,,P(d2),P(d2),P(d2))
      * TE Signature : S(UTC,P(d2),P(d2),P(d2))
      * 
     */
    public native Number UTC(Number year, Number month, Number date /* optional */);
    /** 
      * Std Signature : S(UTC,2,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(UTC,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native Number UTC(Number year, Number month, Number date /* optional */, Number hours /* optional */);
    /** 
      * Std Signature : S(UTC,2,,P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(UTC,P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native Number UTC(Number year, Number month, Number date /* optional */, Number hours /* optional */, Number minutes /* optional */);
    /** 
      * Std Signature : S(UTC,2,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(UTC,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native Number UTC(Number year, Number month, Number date /* optional */, Number hours /* optional */, Number minutes /* optional */, Number seconds /* optional */);
    /** 
      * Std Signature : S(UTC,2,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(UTC,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@34423
      * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
     */
    public native Number UTC(Number year, Number month, Number date /* optional */, Number hours /* optional */, Number minutes /* optional */, Number seconds /* optional */, Number ms /* optional */);
    /** 
      * Std Signature : S(now,2,,)
      * TE Signature : S(now,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@34549
     */
    public native Number now();
    /** 
      * Std Signature : S(parse,2,,P(d1))
      * TE Signature : S(parse,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@33482
      * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
     */
    public native Number parse(String s);
}
