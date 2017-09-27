package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NumberConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:19744
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:202083
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NumberConstructor")
public class NumberConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    /** 
      * The value of Number.EPSILON is the difference between 1 and the smallest value greater than 1
      * that is representable as a Number value, which is approximately:
      * 2.2204460492503130808472633361816 x 10‍−‍16.
     */
    public Number EPSILON;

    @JsProperty( name = "EPSILON")
    public native Number getEPSILON();

    @JsProperty( name = "EPSILON")
    public native void setEPSILON( Number value );

    /** 
      * The value of the largest integer n such that n and n + 1 are both exactly representable as
      * a Number value.
      * The value of Number.MAX_SAFE_INTEGER is 9007199254740991 2^53 − 1.
     */
    public Number MAX_SAFE_INTEGER;

    @JsProperty( name = "MAX_SAFE_INTEGER")
    public native Number getMAX_SAFE_INTEGER();

    @JsProperty( name = "MAX_SAFE_INTEGER")
    public native void setMAX_SAFE_INTEGER( Number value );

    /** 
      * The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. 
     */
    public Number MAX_VALUE;

    @JsProperty( name = "MAX_VALUE")
    public native Number getMAX_VALUE();

    @JsProperty( name = "MAX_VALUE")
    public native void setMAX_VALUE( Number value );

    /** 
      * The value of the smallest integer n such that n and n − 1 are both exactly representable as
      * a Number value.
      * The value of Number.MIN_SAFE_INTEGER is −9007199254740991 (−(2^53 − 1)).
     */
    public Number MIN_SAFE_INTEGER;

    @JsProperty( name = "MIN_SAFE_INTEGER")
    public native Number getMIN_SAFE_INTEGER();

    @JsProperty( name = "MIN_SAFE_INTEGER")
    public native void setMIN_SAFE_INTEGER( Number value );

    /** 
      * The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. 
     */
    public Number MIN_VALUE;

    @JsProperty( name = "MIN_VALUE")
    public native Number getMIN_VALUE();

    @JsProperty( name = "MIN_VALUE")
    public native void setMIN_VALUE( Number value );

    /** 
      * A value that is less than the largest negative number that can be represented in JavaScript.
      * JavaScript displays NEGATIVE_INFINITY values as -infinity.
     */
    public Number NEGATIVE_INFINITY;

    @JsProperty( name = "NEGATIVE_INFINITY")
    public native Number getNEGATIVE_INFINITY();

    @JsProperty( name = "NEGATIVE_INFINITY")
    public native void setNEGATIVE_INFINITY( Number value );

    /** 
      * A value that is not a number.
      * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
     */
    public Number NaN;

    @JsProperty( name = "NaN")
    public native Number getNaN();

    @JsProperty( name = "NaN")
    public native void setNaN( Number value );

    /** 
      * A value greater than the largest number that can be represented in JavaScript.
      * JavaScript displays POSITIVE_INFINITY values as infinity.
     */
    public Number POSITIVE_INFINITY;

    @JsProperty( name = "POSITIVE_INFINITY")
    public native Number getPOSITIVE_INFINITY();

    @JsProperty( name = "POSITIVE_INFINITY")
    public native void setPOSITIVE_INFINITY( Number value );

    public Number prototype;

    @JsProperty( name = "prototype")
    public native Number getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(isFinite,27,,P(d2))
      * TE Signature : S(isFinite,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@202666
      * Returns true if passed value is finite.
      * Unlike the global isFinite, Number.isFinite doesn't forcibly convert the parameter to a
      * number. Only finite values of the type number, result in true.
     */
    public native Boolean isFinite(Number number);
    /** 
      * Std Signature : S(isInteger,27,,P(d2))
      * TE Signature : S(isInteger,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@202835
      * Returns true if the value passed is an integer, false otherwise.
     */
    public native Boolean isInteger(Number number);
    /** 
      * Std Signature : S(isNaN,27,,P(d2))
      * TE Signature : S(isNaN,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@203216
      * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a
      * number). Unlike the global isNaN(), Number.isNaN() doesn't forcefully convert the parameter
      * to a number. Only values of the type number, that are also NaN, result in true.
     */
    public native Boolean isNaN(Number number);
    /** 
      * Std Signature : S(isSafeInteger,27,,P(d2))
      * TE Signature : S(isSafeInteger,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@203369
      * Returns true if the value passed is a safe integer.
     */
    public native Boolean isSafeInteger(Number number);
    /** 
      * Std Signature : S(parseFloat,2,,P(d1))
      * TE Signature : S(parseFloat,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@204072
      * Converts a string to a floating-point number.
     */
    public native Number parseFloat(String string);
    /** 
      * Std Signature : S(parseInt,2,,P(d1))
      * TE Signature : S(parseInt,P(d1))
      * 
     */
    public native Number parseInt(String string);
    /** 
      * Std Signature : S(parseInt,2,,P(d1),P(d2))
      * TE Signature : S(parseInt,P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@204471
      * Converts A string to an integer.
     */
    public native Number parseInt(String string, Number radix /* optional */);
}
