package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: Date
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:25093
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:34580
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:193243
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:246827
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:784431
  * 6 constructors
  * Enables basic storage and retrieval of dates and times. 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Date")
public class Date
{

    /*
        Constructors
    */
    public Date(){
    }
    public Date(Number value){
    }
    public Date(String value){
    }
    public Date(Number year, Number month, Number date, Number hours, Number minutes, Number seconds, Number ms){
    }
    public Date(Date value){
    }
    public Date(VarDate vd){
    }

    /*
        Static methods
    */
    /** 
      * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
      * source : apis/browser-api/tsd/lib.es6.d.ts:33482
     */
    @JsMethod(namespace="Date", name = "parse")
    public static native Number parse(String s);
    /** 
      * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
      * source : apis/browser-api/tsd/lib.es6.d.ts:34423
     */
    @JsMethod(namespace="Date", name = "UTC")
    public static native Number UTC(Number year, Number month, Number date /* optional */, Number hours /* optional */, Number minutes /* optional */, Number seconds /* optional */, Number ms /* optional */);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:34549
     */
    @JsMethod(namespace="Date", name = "now")
    public static native Number now();

    /*
        Methods
    */
    // skipped method __@toPrimitive
    /** 
      * Std Signature : S(getDate,2,,)
      * TE Signature : S(getDate,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26433
      * Gets the day-of-the-month, using local time. 
     */
    public native Number getDate();
    /** 
      * Std Signature : S(getDay,2,,)
      * TE Signature : S(getDay,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26615
      * Gets the day of the week, using local time. 
     */
    public native Number getDay();
    /** 
      * Std Signature : S(getFullYear,2,,)
      * TE Signature : S(getFullYear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26076
      * Gets the year, using local time. 
     */
    public native Number getFullYear();
    /** 
      * Std Signature : S(getHours,2,,)
      * TE Signature : S(getHours,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26793
      * Gets the hours in a date, using local time. 
     */
    public native Number getHours();
    /** 
      * Std Signature : S(getMilliseconds,2,,)
      * TE Signature : S(getMilliseconds,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@27403
      * Gets the milliseconds of a Date, using local time. 
     */
    public native Number getMilliseconds();
    /** 
      * Std Signature : S(getMinutes,2,,)
      * TE Signature : S(getMinutes,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26997
      * Gets the minutes of a Date object, using local time. 
     */
    public native Number getMinutes();
    /** 
      * Std Signature : S(getMonth,2,,)
      * TE Signature : S(getMonth,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26243
      * Gets the month, using local time. 
     */
    public native Number getMonth();
    /** 
      * Std Signature : S(getSeconds,2,,)
      * TE Signature : S(getSeconds,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@27201
      * Gets the seconds of a Date object, using local time. 
     */
    public native Number getSeconds();
    /** 
      * Std Signature : S(getTime,2,,)
      * TE Signature : S(getTime,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26009
      * Gets the time value in milliseconds. 
     */
    public native Number getTime();
    /** 
      * Std Signature : S(getTimezoneOffset,2,,)
      * TE Signature : S(getTimezoneOffset,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@27677
      * Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC). 
     */
    public native Number getTimezoneOffset();
    /** 
      * Std Signature : S(getUTCDate,2,,)
      * TE Signature : S(getUTCDate,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26534
      * Gets the day-of-the-month, using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCDate();
    /** 
      * Std Signature : S(getUTCDay,2,,)
      * TE Signature : S(getUTCDay,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26713
      * Gets the day of the week using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCDay();
    /** 
      * Std Signature : S(getUTCFullYear,2,,)
      * TE Signature : S(getUTCFullYear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26168
      * Gets the year using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCFullYear();
    /** 
      * Std Signature : S(getUTCHours,2,,)
      * TE Signature : S(getUTCHours,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26906
      * Gets the hours value in a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCHours();
    /** 
      * Std Signature : S(getUTCMilliseconds,2,,)
      * TE Signature : S(getUTCMilliseconds,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@27524
      * Gets the milliseconds of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCMilliseconds();
    /** 
      * Std Signature : S(getUTCMinutes,2,,)
      * TE Signature : S(getUTCMinutes,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@27108
      * Gets the minutes of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCMinutes();
    /** 
      * Std Signature : S(getUTCMonth,2,,)
      * TE Signature : S(getUTCMonth,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@26350
      * Gets the month of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCMonth();
    /** 
      * Std Signature : S(getUTCSeconds,2,,)
      * TE Signature : S(getUTCSeconds,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@27312
      * Gets the seconds of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCSeconds();
    /** 
      * Std Signature : S(getVarDate,14,,)
      * TE Signature : S(getVarDate,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@784466
     */
    public native VarDate getVarDate();
    /** 
      * Std Signature : S(setDate,2,,P(d2))
      * TE Signature : S(setDate,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@30651
      * Sets the numeric day-of-the-month value of the Date object using local time.
     */
    public native Number setDate(Number date);
    /** 
      * Std Signature : S(setFullYear,2,,P(d2))
      * TE Signature : S(setFullYear,P(d2))
      * 
     */
    public native Number setFullYear(Number year);
    /** 
      * Std Signature : S(setFullYear,2,,P(d2),P(d2))
      * TE Signature : S(setFullYear,P(d2),P(d2))
      * 
     */
    public native Number setFullYear(Number year, Number month /* optional */);
    /** 
      * Std Signature : S(setFullYear,2,,P(d2),P(d2),P(d2))
      * TE Signature : S(setFullYear,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@32102
      * Sets the year of the Date object using local time.
     */
    public native Number setFullYear(Number year, Number month /* optional */, Number date /* optional */);
    /** 
      * Std Signature : S(setHours,2,,P(d2))
      * TE Signature : S(setHours,P(d2))
      * 
     */
    public native Number setHours(Number hours);
    /** 
      * Std Signature : S(setHours,2,,P(d2),P(d2))
      * TE Signature : S(setHours,P(d2),P(d2))
      * 
     */
    public native Number setHours(Number hours, Number min /* optional */);
    /** 
      * Std Signature : S(setHours,2,,P(d2),P(d2),P(d2))
      * TE Signature : S(setHours,P(d2),P(d2),P(d2))
      * 
     */
    public native Number setHours(Number hours, Number min /* optional */, Number sec /* optional */);
    /** 
      * Std Signature : S(setHours,2,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(setHours,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@29962
      * Sets the hour value in the Date object using local time.
     */
    public native Number setHours(Number hours, Number min /* optional */, Number sec /* optional */, Number ms /* optional */);
    /** 
      * Std Signature : S(setMilliseconds,2,,P(d2))
      * TE Signature : S(setMilliseconds,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@28096
      * Sets the milliseconds value in the Date object using local time.
     */
    public native Number setMilliseconds(Number ms);
    /** 
      * Std Signature : S(setMinutes,2,,P(d2))
      * TE Signature : S(setMinutes,P(d2))
      * 
     */
    public native Number setMinutes(Number min);
    /** 
      * Std Signature : S(setMinutes,2,,P(d2),P(d2))
      * TE Signature : S(setMinutes,P(d2),P(d2))
      * 
     */
    public native Number setMinutes(Number min, Number sec /* optional */);
    /** 
      * Std Signature : S(setMinutes,2,,P(d2),P(d2),P(d2))
      * TE Signature : S(setMinutes,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@29193
      * Sets the minutes value in the Date object using local time.
     */
    public native Number setMinutes(Number min, Number sec /* optional */, Number ms /* optional */);
    /** 
      * Std Signature : S(setMonth,2,,P(d2))
      * TE Signature : S(setMonth,P(d2))
      * 
     */
    public native Number setMonth(Number month);
    /** 
      * Std Signature : S(setMonth,2,,P(d2),P(d2))
      * TE Signature : S(setMonth,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@31277
      * Sets the month value in the Date object using local time.
     */
    public native Number setMonth(Number month, Number date /* optional */);
    /** 
      * Std Signature : S(setSeconds,2,,P(d2))
      * TE Signature : S(setSeconds,P(d2))
      * 
     */
    public native Number setSeconds(Number sec);
    /** 
      * Std Signature : S(setSeconds,2,,P(d2),P(d2))
      * TE Signature : S(setSeconds,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@28575
      * Sets the seconds value in the Date object using local time.
     */
    public native Number setSeconds(Number sec, Number ms /* optional */);
    /** 
      * Std Signature : S(setTime,2,,P(d2))
      * TE Signature : S(setTime,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@27905
      * Sets the date and time value in the Date object.
     */
    public native Number setTime(Number time);
    /** 
      * Std Signature : S(setUTCDate,2,,P(d2))
      * TE Signature : S(setUTCDate,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@30871
      * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCDate(Number date);
    /** 
      * Std Signature : S(setUTCFullYear,2,,P(d2))
      * TE Signature : S(setUTCFullYear,P(d2))
      * 
     */
    public native Number setUTCFullYear(Number year);
    /** 
      * Std Signature : S(setUTCFullYear,2,,P(d2),P(d2))
      * TE Signature : S(setUTCFullYear,P(d2),P(d2))
      * 
     */
    public native Number setUTCFullYear(Number year, Number month /* optional */);
    /** 
      * Std Signature : S(setUTCFullYear,2,,P(d2),P(d2),P(d2))
      * TE Signature : S(setUTCFullYear,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@32569
      * Sets the year value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCFullYear(Number year, Number month /* optional */, Number date /* optional */);
    /** 
      * Std Signature : S(setUTCHours,2,,P(d2))
      * TE Signature : S(setUTCHours,P(d2))
      * 
     */
    public native Number setUTCHours(Number hours);
    /** 
      * Std Signature : S(setUTCHours,2,,P(d2),P(d2))
      * TE Signature : S(setUTCHours,P(d2),P(d2))
      * 
     */
    public native Number setUTCHours(Number hours, Number min /* optional */);
    /** 
      * Std Signature : S(setUTCHours,2,,P(d2),P(d2),P(d2))
      * TE Signature : S(setUTCHours,P(d2),P(d2),P(d2))
      * 
     */
    public native Number setUTCHours(Number hours, Number min /* optional */, Number sec /* optional */);
    /** 
      * Std Signature : S(setUTCHours,2,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(setUTCHours,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@30401
      * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCHours(Number hours, Number min /* optional */, Number sec /* optional */, Number ms /* optional */);
    /** 
      * Std Signature : S(setUTCMilliseconds,2,,P(d2))
      * TE Signature : S(setUTCMilliseconds,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@28315
      * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCMilliseconds(Number ms);
    /** 
      * Std Signature : S(setUTCMinutes,2,,P(d2))
      * TE Signature : S(setUTCMinutes,P(d2))
      * 
     */
    public native Number setUTCMinutes(Number min);
    /** 
      * Std Signature : S(setUTCMinutes,2,,P(d2),P(d2))
      * TE Signature : S(setUTCMinutes,P(d2),P(d2))
      * 
     */
    public native Number setUTCMinutes(Number min, Number sec /* optional */);
    /** 
      * Std Signature : S(setUTCMinutes,2,,P(d2),P(d2),P(d2))
      * TE Signature : S(setUTCMinutes,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@29557
      * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCMinutes(Number min, Number sec /* optional */, Number ms /* optional */);
    /** 
      * Std Signature : S(setUTCMonth,2,,P(d2))
      * TE Signature : S(setUTCMonth,P(d2))
      * 
     */
    public native Number setUTCMonth(Number month);
    /** 
      * Std Signature : S(setUTCMonth,2,,P(d2),P(d2))
      * TE Signature : S(setUTCMonth,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@31714
      * Sets the month value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCMonth(Number month, Number date /* optional */);
    /** 
      * Std Signature : S(setUTCSeconds,2,,P(d2))
      * TE Signature : S(setUTCSeconds,P(d2))
      * 
     */
    public native Number setUTCSeconds(Number sec);
    /** 
      * Std Signature : S(setUTCSeconds,2,,P(d2),P(d2))
      * TE Signature : S(setUTCSeconds,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@28862
      * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCSeconds(Number sec, Number ms /* optional */);
    /** 
      * Std Signature : S(toDateString,1,,)
      * TE Signature : S(toDateString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@25350
      * Returns a date as a string value. 
     */
    public native String toDateString();
    /** 
      * Std Signature : S(toISOString,1,,)
      * TE Signature : S(toISOString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@32816
      * Returns a date as a string value in ISO format. 
     */
    public native String toISOString();
    /** 
      * Std Signature : S(toJSON,1,,)
      * TE Signature : S(toJSON,)
      * 
     */
    public native String toJSON();
    /** 
      * Std Signature : S(toJSON,1,,P(d3))
      * TE Signature : S(toJSON,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@32990
      * Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object Notation (JSON) serialization. 
     */
    public native String toJSON(Object key /* optional */);
    /** 
      * Std Signature : S(toLocaleDateString,1,,)
      * TE Signature : S(toLocaleDateString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@25678
      * Returns a date as a string value appropriate to the host environment's current locale. 
      * Converts a date to a string by using the current or specified locale.
     */
    public native String toLocaleDateString();
    /** 
      * Std Signature : S(toLocaleDateString,1,,P(d1))
      * TE Signature : S(toLocaleDateString,P(d1))
      * 
     */
    public native String toLocaleDateString(String locales /* optional */);
    /** 
      * Std Signature : S(toLocaleDateString,1,,P(d1),P(d12))
      * TE Signature : S(toLocaleDateString,P(d1),P(d12))
      * 
     */
    public native String toLocaleDateString(String locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleDateString,1,,P(d7<1>))
      * TE Signature : S(toLocaleDateString,P(d7))
      * 
     */
    public native String toLocaleDateString(Array<String> locales /* optional */);
    /** 
      * Std Signature : S(toLocaleDateString,1,,P(d7<1>),P(d12))
      * TE Signature : S(toLocaleDateString,P(d7),P(d12))
      * 
     */
    public native String toLocaleDateString(Array<String> locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleDateString,1,,P(dU(-7<1>,4)))
      * TE Signature : S(toLocaleDateString,P(dU(-7,1)))
      * 
     */
    public native String toLocaleDateString(UnionOfArrayOfStringAndString locales /* optional */);
    /** 
      * Std Signature : S(toLocaleDateString,1,,P(dU(-7<1>,4)),P(d12))
      * TE Signature : S(toLocaleDateString,P(dU(-7,1)),P(d12))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@194432
      * Returns a date as a string value appropriate to the host environment's current locale. 
      * Converts a date to a string by using the current or specified locale.
      * VERSION 1
     */
    public native String toLocaleDateString(UnionOfArrayOfStringAndString locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleString,1,,)
      * TE Signature : S(toLocaleString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@25550
      * Returns a value as a string value appropriate to the host environment's current locale. 
      * Converts a date and time to a string by using the current or specified locale.
     */
    public native String toLocaleString();
    /** 
      * Std Signature : S(toLocaleString,1,,P(d1))
      * TE Signature : S(toLocaleString,P(d1))
      * 
     */
    public native String toLocaleString(String locales /* optional */);
    /** 
      * Std Signature : S(toLocaleString,1,,P(d1),P(d12))
      * TE Signature : S(toLocaleString,P(d1),P(d12))
      * 
     */
    public native String toLocaleString(String locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleString,1,,P(d7<1>))
      * TE Signature : S(toLocaleString,P(d7))
      * 
     */
    public native String toLocaleString(Array<String> locales /* optional */);
    /** 
      * Std Signature : S(toLocaleString,1,,P(d7<1>),P(d12))
      * TE Signature : S(toLocaleString,P(d7),P(d12))
      * 
     */
    public native String toLocaleString(Array<String> locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleString,1,,P(dU(-7<1>,4)))
      * TE Signature : S(toLocaleString,P(dU(-7,1)))
      * 
     */
    public native String toLocaleString(UnionOfArrayOfStringAndString locales /* optional */);
    /** 
      * Std Signature : S(toLocaleString,1,,P(dU(-7<1>,4)),P(d12))
      * TE Signature : S(toLocaleString,P(dU(-7,1)),P(d12))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@193806
      * Returns a value as a string value appropriate to the host environment's current locale. 
      * Converts a date and time to a string by using the current or specified locale.
      * VERSION 1
     */
    public native String toLocaleString(UnionOfArrayOfStringAndString locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleTimeString,1,,)
      * TE Signature : S(toLocaleTimeString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@25810
      * Returns a time as a string value appropriate to the host environment's current locale. 
      * Converts a time to a string by using the current or specified locale.
     */
    public native String toLocaleTimeString();
    /** 
      * Std Signature : S(toLocaleTimeString,1,,P(d1))
      * TE Signature : S(toLocaleTimeString,P(d1))
      * 
     */
    public native String toLocaleTimeString(String locales /* optional */);
    /** 
      * Std Signature : S(toLocaleTimeString,1,,P(d1),P(d12))
      * TE Signature : S(toLocaleTimeString,P(d1),P(d12))
      * 
     */
    public native String toLocaleTimeString(String locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleTimeString,1,,P(d7<1>))
      * TE Signature : S(toLocaleTimeString,P(d7))
      * 
     */
    public native String toLocaleTimeString(Array<String> locales /* optional */);
    /** 
      * Std Signature : S(toLocaleTimeString,1,,P(d7<1>),P(d12))
      * TE Signature : S(toLocaleTimeString,P(d7),P(d12))
      * 
     */
    public native String toLocaleTimeString(Array<String> locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toLocaleTimeString,1,,P(dU(-7<1>,4)))
      * TE Signature : S(toLocaleTimeString,P(dU(-7,1)))
      * 
     */
    public native String toLocaleTimeString(UnionOfArrayOfStringAndString locales /* optional */);
    /** 
      * Std Signature : S(toLocaleTimeString,1,,P(dU(-7<1>,4)),P(d12))
      * TE Signature : S(toLocaleTimeString,P(dU(-7,1)),P(d12))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@195063
      * Returns a time as a string value appropriate to the host environment's current locale. 
      * Converts a time to a string by using the current or specified locale.
      * VERSION 1
     */
    public native String toLocaleTimeString(UnionOfArrayOfStringAndString locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * Std Signature : S(toTimeString,1,,)
      * TE Signature : S(toTimeString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@25423
      * Returns a time as a string value. 
     */
    public native String toTimeString();
    /** 
      * Std Signature : S(toUTCString,1,,)
      * TE Signature : S(toUTCString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@32730
      * Returns a date converted to a string using Universal Coordinated Time (UTC). 
     */
    public native String toUTCString();
    /** 
      * Std Signature : S(valueOf,2,,)
      * TE Signature : S(valueOf,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@25938
      * Returns the stored time value in milliseconds since midnight, January 1, 1970 UTC. 
     */
    public native Number valueOf();
}
