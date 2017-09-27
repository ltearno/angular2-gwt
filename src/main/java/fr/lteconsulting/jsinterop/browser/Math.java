package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Math
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:21078
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:25081
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:198673
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:248436

  * An intrinsic object that provides basic mathematics functionality and constants. 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Math")
public class Math
{

    /*
        Static properties
    */

    /** 
      * The mathematical constant e. This is Euler's number, the base of natural logarithms. 
     */
    @JsProperty(namespace="Math", name="E")
    public static Number E;

    /** 
      * The natural logarithm of 10. 
     */
    @JsProperty(namespace="Math", name="LN10")
    public static Number LN10;

    /** 
      * The natural logarithm of 2. 
     */
    @JsProperty(namespace="Math", name="LN2")
    public static Number LN2;

    /** 
      * The base-2 logarithm of e. 
     */
    @JsProperty(namespace="Math", name="LOG2E")
    public static Number LOG2E;

    /** 
      * The base-10 logarithm of e. 
     */
    @JsProperty(namespace="Math", name="LOG10E")
    public static Number LOG10E;

    /** 
      * Pi. This is the ratio of the circumference of a circle to its diameter. 
     */
    @JsProperty(namespace="Math", name="PI")
    public static Number PI;

    /** 
      * The square root of 0.5, or, equivalently, one divided by the square root of 2. 
     */
    @JsProperty(namespace="Math", name="SQRT1_2")
    public static Number SQRT1_2;

    /** 
      * The square root of 2. 
     */
    @JsProperty(namespace="Math", name="SQRT2")
    public static Number SQRT2;

    // skipped static property __@toStringTag
    /*
        Static methods
    */
    /** 
      * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
      * For example, the absolute value of -5 is the same as the absolute value of 5.
      * source : apis/browser-api/tsd/lib.es6.d.ts:22070
     */
    @JsMethod(namespace="Math", name = "abs")
    public static native Number _abs(Number x);
    /** 
      * Returns the arc cosine (or inverse cosine) of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:22218
     */
    @JsMethod(namespace="Math", name = "acos")
    public static native Number _acos(Number x);
    /** 
      * Returns the arcsine of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:22344
     */
    @JsMethod(namespace="Math", name = "asin")
    public static native Number _asin(Number x);
    /** 
      * Returns the arctangent of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:22508
     */
    @JsMethod(namespace="Math", name = "atan")
    public static native Number _atan(Number x);
    /** 
      * Returns the angle (in radians) from the X axis to a point.
      * source : apis/browser-api/tsd/lib.es6.d.ts:22779
     */
    @JsMethod(namespace="Math", name = "atan2")
    public static native Number _atan2(Number y, Number x);
    /** 
      * Returns the smallest number greater than or equal to its numeric argument.
      * source : apis/browser-api/tsd/lib.es6.d.ts:22959
     */
    @JsMethod(namespace="Math", name = "ceil")
    public static native Number _ceil(Number x);
    /** 
      * Returns the cosine of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:23127
     */
    @JsMethod(namespace="Math", name = "cos")
    public static native Number _cos(Number x);
    /** 
      * Returns e (the base of natural logarithms) raised to a power.
      * source : apis/browser-api/tsd/lib.es6.d.ts:23309
     */
    @JsMethod(namespace="Math", name = "exp")
    public static native Number _exp(Number x);
    /** 
      * Returns the greatest number less than or equal to its numeric argument.
      * source : apis/browser-api/tsd/lib.es6.d.ts:23473
     */
    @JsMethod(namespace="Math", name = "floor")
    public static native Number _floor(Number x);
    /** 
      * Returns the natural logarithm (base e) of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:23619
     */
    @JsMethod(namespace="Math", name = "log")
    public static native Number _log(Number x);
    /** 
      * Returns the larger of a set of supplied numeric expressions.
      * source : apis/browser-api/tsd/lib.es6.d.ts:23792
     */
    @JsMethod(namespace="Math", name = "max")
    public static native Number _max(Number... values);
    /** 
      * Returns the smaller of a set of supplied numeric expressions.
      * source : apis/browser-api/tsd/lib.es6.d.ts:23976
     */
    @JsMethod(namespace="Math", name = "min")
    public static native Number _min(Number... values);
    /** 
      * Returns the value of a base expression taken to a specified power.
      * source : apis/browser-api/tsd/lib.es6.d.ts:24212
     */
    @JsMethod(namespace="Math", name = "pow")
    public static native Number _pow(Number x, Number y);
    /** 
      * Returns a pseudorandom number between 0 and 1. 
      * source : apis/browser-api/tsd/lib.es6.d.ts:24309
     */
    @JsMethod(namespace="Math", name = "random")
    public static native Number _random();
    /** 
      * Returns a supplied numeric expression rounded to the nearest number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:24489
     */
    @JsMethod(namespace="Math", name = "round")
    public static native Number _round(Number x);
    /** 
      * Returns the sine of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:24656
     */
    @JsMethod(namespace="Math", name = "sin")
    public static native Number _sin(Number x);
    /** 
      * Returns the square root of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:24785
     */
    @JsMethod(namespace="Math", name = "sqrt")
    public static native Number _sqrt(Number x);
    /** 
      * Returns the tangent of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:24954
     */
    @JsMethod(namespace="Math", name = "tan")
    public static native Number _tan(Number x);
    /** 
      * Returns the number of leading zero bits in the 32-bit binary representation of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:198849
     */
    @JsMethod(namespace="Math", name = "clz32")
    public static native Number _clz32(Number x);
    /** 
      * Returns the result of 32-bit multiplication of two numbers.
      * source : apis/browser-api/tsd/lib.es6.d.ts:199026
     */
    @JsMethod(namespace="Math", name = "imul")
    public static native Number _imul(Number x, Number y);
    /** 
      * Returns the sign of the x, indicating whether x is positive, negative or zero.
      * source : apis/browser-api/tsd/lib.es6.d.ts:199219
     */
    @JsMethod(namespace="Math", name = "sign")
    public static native Number _sign(Number x);
    /** 
      * Returns the base 10 logarithm of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:199356
     */
    @JsMethod(namespace="Math", name = "log10")
    public static native Number _log10(Number x);
    /** 
      * Returns the base 2 logarithm of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:199493
     */
    @JsMethod(namespace="Math", name = "log2")
    public static native Number _log2(Number x);
    /** 
      * Returns the natural logarithm of 1 + x.
      * source : apis/browser-api/tsd/lib.es6.d.ts:199627
     */
    @JsMethod(namespace="Math", name = "log1p")
    public static native Number _log1p(Number x);
    /** 
      * Returns the result of (e^x - 1) of x (e raised to the power of x, where e is the base of
      * the natural logarithms).
      * source : apis/browser-api/tsd/lib.es6.d.ts:199844
     */
    @JsMethod(namespace="Math", name = "expm1")
    public static native Number _expm1(Number x);
    /** 
      * Returns the hyperbolic cosine of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:200025
     */
    @JsMethod(namespace="Math", name = "cosh")
    public static native Number _cosh(Number x);
    /** 
      * Returns the hyperbolic sine of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:200203
     */
    @JsMethod(namespace="Math", name = "sinh")
    public static native Number _sinh(Number x);
    /** 
      * Returns the hyperbolic tangent of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:200384
     */
    @JsMethod(namespace="Math", name = "tanh")
    public static native Number _tanh(Number x);
    /** 
      * Returns the inverse hyperbolic cosine of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:200572
     */
    @JsMethod(namespace="Math", name = "acosh")
    public static native Number _acosh(Number x);
    /** 
      * Returns the inverse hyperbolic sine of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:200759
     */
    @JsMethod(namespace="Math", name = "asinh")
    public static native Number _asinh(Number x);
    /** 
      * Returns the inverse hyperbolic tangent of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:200949
     */
    @JsMethod(namespace="Math", name = "atanh")
    public static native Number _atanh(Number x);
    /** 
      * Returns the square root of the sum of squares of its arguments.
      * source : apis/browser-api/tsd/lib.es6.d.ts:201468
     */
    @JsMethod(namespace="Math", name = "hypot")
    public static native Number _hypot(Number... values);
    /** 
      * Returns the integral part of the a numeric expression, x, removing any fractional digits.
      * If x is already an integer, the result is x.
      * source : apis/browser-api/tsd/lib.es6.d.ts:201717
     */
    @JsMethod(namespace="Math", name = "trunc")
    public static native Number _trunc(Number x);
    /** 
      * Returns the nearest single precision float representation of a number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:201883
     */
    @JsMethod(namespace="Math", name = "fround")
    public static native Number _fround(Number x);
    /** 
      * Returns an implementation-dependent approximation to the cube root of number.
      * source : apis/browser-api/tsd/lib.es6.d.ts:202057
     */
    @JsMethod(namespace="Math", name = "cbrt")
    public static native Number _cbrt(Number x);

    /*
        Properties
    */

    /*
        Methods
    */
    /** 
      * Std Signature : S(abs,2,,P(d2))
      * TE Signature : S(abs,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@22070
      * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
      * For example, the absolute value of -5 is the same as the absolute value of 5.
     */
    public native Number abs(Number x);
    /** 
      * Std Signature : S(acos,2,,P(d2))
      * TE Signature : S(acos,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@22218
      * Returns the arc cosine (or inverse cosine) of a number.
     */
    public native Number acos(Number x);
    /** 
      * Std Signature : S(acosh,2,,P(d2))
      * TE Signature : S(acosh,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@200572
      * Returns the inverse hyperbolic cosine of a number.
     */
    public native Number acosh(Number x);
    /** 
      * Std Signature : S(asin,2,,P(d2))
      * TE Signature : S(asin,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@22344
      * Returns the arcsine of a number.
     */
    public native Number asin(Number x);
    /** 
      * Std Signature : S(asinh,2,,P(d2))
      * TE Signature : S(asinh,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@200759
      * Returns the inverse hyperbolic sine of a number.
     */
    public native Number asinh(Number x);
    /** 
      * Std Signature : S(atan,2,,P(d2))
      * TE Signature : S(atan,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@22508
      * Returns the arctangent of a number.
     */
    public native Number atan(Number x);
    /** 
      * Std Signature : S(atan2,2,,P(d2),P(d2))
      * TE Signature : S(atan2,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@22779
      * Returns the angle (in radians) from the X axis to a point.
     */
    public native Number atan2(Number y, Number x);
    /** 
      * Std Signature : S(atanh,2,,P(d2))
      * TE Signature : S(atanh,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@200949
      * Returns the inverse hyperbolic tangent of a number.
     */
    public native Number atanh(Number x);
    /** 
      * Std Signature : S(cbrt,2,,P(d2))
      * TE Signature : S(cbrt,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@202057
      * Returns an implementation-dependent approximation to the cube root of number.
     */
    public native Number cbrt(Number x);
    /** 
      * Std Signature : S(ceil,2,,P(d2))
      * TE Signature : S(ceil,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@22959
      * Returns the smallest number greater than or equal to its numeric argument.
     */
    public native Number ceil(Number x);
    /** 
      * Std Signature : S(clz32,2,,P(d2))
      * TE Signature : S(clz32,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@198849
      * Returns the number of leading zero bits in the 32-bit binary representation of a number.
     */
    public native Number clz32(Number x);
    /** 
      * Std Signature : S(cos,2,,P(d2))
      * TE Signature : S(cos,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@23127
      * Returns the cosine of a number.
     */
    public native Number cos(Number x);
    /** 
      * Std Signature : S(cosh,2,,P(d2))
      * TE Signature : S(cosh,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@200025
      * Returns the hyperbolic cosine of a number.
     */
    public native Number cosh(Number x);
    /** 
      * Std Signature : S(exp,2,,P(d2))
      * TE Signature : S(exp,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@23309
      * Returns e (the base of natural logarithms) raised to a power.
     */
    public native Number exp(Number x);
    /** 
      * Std Signature : S(expm1,2,,P(d2))
      * TE Signature : S(expm1,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@199844
      * Returns the result of (e^x - 1) of x (e raised to the power of x, where e is the base of
      * the natural logarithms).
     */
    public native Number expm1(Number x);
    /** 
      * Std Signature : S(floor,2,,P(d2))
      * TE Signature : S(floor,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@23473
      * Returns the greatest number less than or equal to its numeric argument.
     */
    public native Number floor(Number x);
    /** 
      * Std Signature : S(fround,2,,P(d2))
      * TE Signature : S(fround,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@201883
      * Returns the nearest single precision float representation of a number.
     */
    public native Number fround(Number x);
    /** 
      * Std Signature : S(hypot,2,,)
      * TE Signature : S(hypot,)
      * 
     */
    public native Number hypot();
    /** 
      * Std Signature : S(hypot,2,,P(D2))
      * TE Signature : S(hypot,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@201468
      * Returns the square root of the sum of squares of its arguments.
     */
    public native Number hypot(Number... values);
    /** 
      * Std Signature : S(imul,2,,P(d2),P(d2))
      * TE Signature : S(imul,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@199026
      * Returns the result of 32-bit multiplication of two numbers.
     */
    public native Number imul(Number x, Number y);
    /** 
      * Std Signature : S(log,2,,P(d2))
      * TE Signature : S(log,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@23619
      * Returns the natural logarithm (base e) of a number.
     */
    public native Number log(Number x);
    /** 
      * Std Signature : S(log10,2,,P(d2))
      * TE Signature : S(log10,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@199356
      * Returns the base 10 logarithm of a number.
     */
    public native Number log10(Number x);
    /** 
      * Std Signature : S(log1p,2,,P(d2))
      * TE Signature : S(log1p,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@199627
      * Returns the natural logarithm of 1 + x.
     */
    public native Number log1p(Number x);
    /** 
      * Std Signature : S(log2,2,,P(d2))
      * TE Signature : S(log2,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@199493
      * Returns the base 2 logarithm of a number.
     */
    public native Number log2(Number x);
    /** 
      * Std Signature : S(max,2,,)
      * TE Signature : S(max,)
      * 
     */
    public native Number max();
    /** 
      * Std Signature : S(max,2,,P(D2))
      * TE Signature : S(max,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@23792
      * Returns the larger of a set of supplied numeric expressions.
     */
    public native Number max(Number... values);
    /** 
      * Std Signature : S(min,2,,)
      * TE Signature : S(min,)
      * 
     */
    public native Number min();
    /** 
      * Std Signature : S(min,2,,P(D2))
      * TE Signature : S(min,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@23976
      * Returns the smaller of a set of supplied numeric expressions.
     */
    public native Number min(Number... values);
    /** 
      * Std Signature : S(pow,2,,P(d2),P(d2))
      * TE Signature : S(pow,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@24212
      * Returns the value of a base expression taken to a specified power.
     */
    public native Number pow(Number x, Number y);
    /** 
      * Std Signature : S(random,2,,)
      * TE Signature : S(random,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@24309
      * Returns a pseudorandom number between 0 and 1. 
     */
    public native Number random();
    /** 
      * Std Signature : S(round,2,,P(d2))
      * TE Signature : S(round,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@24489
      * Returns a supplied numeric expression rounded to the nearest number.
     */
    public native Number round(Number x);
    /** 
      * Std Signature : S(sign,2,,P(d2))
      * TE Signature : S(sign,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@199219
      * Returns the sign of the x, indicating whether x is positive, negative or zero.
     */
    public native Number sign(Number x);
    /** 
      * Std Signature : S(sin,2,,P(d2))
      * TE Signature : S(sin,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@24656
      * Returns the sine of a number.
     */
    public native Number sin(Number x);
    /** 
      * Std Signature : S(sinh,2,,P(d2))
      * TE Signature : S(sinh,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@200203
      * Returns the hyperbolic sine of a number.
     */
    public native Number sinh(Number x);
    /** 
      * Std Signature : S(sqrt,2,,P(d2))
      * TE Signature : S(sqrt,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@24785
      * Returns the square root of a number.
     */
    public native Number sqrt(Number x);
    /** 
      * Std Signature : S(tan,2,,P(d2))
      * TE Signature : S(tan,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@24954
      * Returns the tangent of a number.
     */
    public native Number tan(Number x);
    /** 
      * Std Signature : S(tanh,2,,P(d2))
      * TE Signature : S(tanh,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@200384
      * Returns the hyperbolic tangent of a number.
     */
    public native Number tanh(Number x);
    /** 
      * Std Signature : S(trunc,2,,P(d2))
      * TE Signature : S(trunc,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@201717
      * Returns the integral part of the a numeric expression, x, removing any fractional digits.
      * If x is already an integer, the result is x.
     */
    public native Number trunc(Number x);
}
