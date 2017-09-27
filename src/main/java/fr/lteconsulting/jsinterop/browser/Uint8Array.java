package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function2;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: Uint8Array
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:83476
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:96500
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:222327
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:253319
  * base type: Uint8Array
  * flags: 16384
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:83476
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:96500
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:222327
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:253319
  * 4 constructors
  * A typed array of 8-bit unsigned integer values. The contents are initialized to 0. If the
  * requested number of bytes could not be allocated an exception is raised.
  * A typed array of 8-bit unsigned integer values. The contents are initialized to 0. If the 
  * requested number of bytes could not be allocated an exception is raised.
  * A typed array of 8-bit unsigned integer values. The contents are initialized to 0. If the 
  * requested number of bytes could not be allocated an exception is raised.
  * A typed array of 8-bit unsigned integer values. The contents are initialized to 0. If the
  * requested number of bytes could not be allocated an exception is raised.
  * A typed array of 8-bit unsigned integer values. The contents are initialized to 0. If the 
  * requested number of bytes could not be allocated an exception is raised.
  * A typed array of 8-bit unsigned integer values. The contents are initialized to 0. If the 
  * requested number of bytes could not be allocated an exception is raised.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Uint8Array")
public class Uint8Array
{

    /*
        Constructors
    */
    public Uint8Array(Number length){
    }
    public Uint8Array(ArrayLike<Number> array){
    }
    public Uint8Array(ArrayBuffer buffer, Number byteOffset, Number length){
    }
    public Uint8Array(Iterable<Number> elements){
    }

    @JsOverlay
    public final void setByIndex(int index, Number value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Number getByIndex(int index) {
        return (Number) Js.asArrayLike(this).getAt(index);
    }

    /*
        Static properties
    */

    /** 
      * The size in bytes of each element in the array.
     */
    @JsProperty(namespace="Uint8Array", name="BYTES_PER_ELEMENT")
    public static Number BYTES_PER_ELEMENT;

    /*
        Static methods
    */
    /** 
      * Returns a new array from a set of elements.
      * source : apis/browser-api/tsd/lib.es6.d.ts:96031
     */
    @JsMethod(namespace="Uint8Array", name = "of")
    public static native Uint8Array of(Number... items);
    /** 
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * source : apis/browser-api/tsd/lib.es6.d.ts:96379
     */
    @JsMethod(namespace="Uint8Array", name = "from")
    public static native Uint8Array from(ArrayLike<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);
    /** 
      * Creates an array from an array-like or iterable object.
      * Creates an array from an array-like or iterable object.
      * source : apis/browser-api/tsd/lib.es6.d.ts:96379
      * source : apis/browser-api/tsd/lib.es6.d.ts:223332
     */
    @JsMethod(namespace="Uint8Array", name = "from")
    public static native Uint8Array from(Iterable<Number> arrayLike, Function2<Number, Number, Number> mapfn /* optional */);

    /*
        Properties
    */

    // skipped property __@toStringTag
    /** 
      * The ArrayBuffer instance referenced by the array.
     */
    public ArrayBuffer buffer;

    @JsProperty( name = "buffer")
    public native ArrayBuffer getBuffer();

    @JsProperty( name = "buffer")
    public native void setBuffer( ArrayBuffer value );

    /** 
      * The length in bytes of the array.
     */
    public Number byteLength;

    @JsProperty( name = "byteLength")
    public native Number getByteLength();

    @JsProperty( name = "byteLength")
    public native void setByteLength( Number value );

    /** 
      * The offset in bytes of the array.
     */
    public Number byteOffset;

    @JsProperty( name = "byteOffset")
    public native Number getByteOffset();

    @JsProperty( name = "byteOffset")
    public native void setByteOffset( Number value );

    /** 
      * The length of the array.
     */
    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    // skipped method __@iterator
    /** 
      * Std Signature : S(copyWithin,29,,P(d2),P(d2))
      * TE Signature : S(copyWithin,P(d2),P(d2))
      * 
     */
    public native Uint8Array copyWithin(Number target, Number start);
    /** 
      * Std Signature : S(copyWithin,29,,P(d2),P(d2),P(d2))
      * TE Signature : S(copyWithin,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@84612
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
     */
    public native Uint8Array copyWithin(Number target, Number start, Number end /* optional */);
    /** 
      * Std Signature : S(entries,363<24<2,5>>,,)
      * TE Signature : S(entries,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@222680
      * Returns an array of key, value pairs for every entry in the array
     */
    public native IterableIterator<Tuple<Number, Number>> entries();
    /** 
      * Std Signature : S(every,27,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<2,7,29,27>))
      * TE Signature : S(every,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@85175
      * Determines whether all the members of an array satisfy the specified test.
     */
    public native Boolean every(Function3<Number, Number, Uint8Array, Boolean> callbackfn);
    /** 
      * Std Signature : S(fill,29,,P(d2))
      * TE Signature : S(fill,P(d2))
      * 
     */
    public native Uint8Array fill(Number value);
    /** 
      * Std Signature : S(fill,29,,P(d2),P(d2))
      * TE Signature : S(fill,P(d2),P(d2))
      * 
     */
    public native Uint8Array fill(Number value, Number start /* optional */);
    /** 
      * Std Signature : S(fill,29,,P(d2),P(d2),P(d2))
      * TE Signature : S(fill,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@85738
      * Returns the this object after filling the section identified by start and end with value
     */
    public native Uint8Array fill(Number value, Number start /* optional */, Number end /* optional */);
    /** 
      * Std Signature : S(filter,29,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<2,7,29,3>))
      * TE Signature : S(filter,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@86250
      * Returns the elements of an array that meet the condition specified in a callback function.
     */
    public native Uint8Array filter(Function3<Number, Number, Uint8Array, Object> callbackfn);
    /** 
      * Std Signature : S(find,2,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<2,7,7<7>,27>))
      * TE Signature : S(find,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@86933
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
     */
    public native Number find(Function3<Number, Number, Array<Number>, Boolean> predicate);
    /** 
      * Std Signature : S(findIndex,2,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<2,7,7<7>,27>))
      * TE Signature : S(findIndex,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@87622
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
     */
    public native Number findIndex(Function3<Number, Number, Array<Number>, Boolean> predicate);
    /** 
      * Std Signature : S(forEach,289,,P(dFP1-,P2-,P3--S(?,289,,P(d3),P(d4),P(d5))------)<2,7,29>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@88146
      * Performs the specified action for each element in an array.
     */
    public native void forEach(Action3<Number, Number, Uint8Array> callbackfn);
    /** 
      * Std Signature : S(indexOf,2,,P(d2))
      * TE Signature : S(indexOf,P(d2))
      * 
     */
    public native Number indexOf(Number searchElement);
    /** 
      * Std Signature : S(indexOf,2,,P(d2),P(d2))
      * TE Signature : S(indexOf,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@88541
      * Returns the index of the first occurrence of a value in an array.
     */
    public native Number indexOf(Number searchElement, Number fromIndex /* optional */);
    /** 
      * Std Signature : S(join,1,,)
      * TE Signature : S(join,)
      * 
     */
    public native String join();
    /** 
      * Std Signature : S(join,1,,P(d1))
      * TE Signature : S(join,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@88891
      * Adds all the elements of an array separated by the specified separator string.
     */
    public native String join(String separator /* optional */);
    /** 
      * Std Signature : S(keys,363<2>,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@222794
      * Returns an list of keys in the array
     */
    public native IterableIterator<Number> keys();
    /** 
      * Std Signature : S(lastIndexOf,2,,P(d2))
      * TE Signature : S(lastIndexOf,P(d2))
      * 
     */
    public native Number lastIndexOf(Number searchElement);
    /** 
      * Std Signature : S(lastIndexOf,2,,P(d2),P(d2))
      * TE Signature : S(lastIndexOf,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@89217
      * Returns the index of the last occurrence of a value in an array.
     */
    public native Number lastIndexOf(Number searchElement, Number fromIndex /* optional */);
    /** 
      * Std Signature : S(map,29,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<2,7,29,7>))
      * TE Signature : S(map,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@89841
      * Calls a defined callback function on each element of an array, and returns an array that
      * contains the results.
     */
    public native Uint8Array map(Function3<Number, Number, Uint8Array, Number> callbackfn);
    /** 
      * Std Signature : S(reduce,2,,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<2,8,8,29,8>))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native Number reduce(Function4<Number, Number, Number, Uint8Array, Number> callbackfn);
    /** 
      * Std Signature : S(reduce,2,,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<2,8,8,29,8>),P(d2))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@90612
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
     */
    public native Number reduce(Function4<Number, Number, Number, Uint8Array, Number> callbackfn, Number initialValue /* optional */);
    /** 
      * Std Signature : S(reduce,U-,U-,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<U-,2,9,29,8>),P(dU-))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@91427
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of
      * the callback function is the accumulated result, and is provided as an argument in the next
      * call to the callback function.
      * VERSION 1
     */
    public native <U> U reduce(Function4<U, Number, Number, Uint8Array, U> callbackfn, U initialValue);
    /** 
      * Std Signature : S(reduceRight,2,,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<2,8,8,29,8>))
      * TE Signature : S(reduceRight,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native Number reduceRight(Function4<Number, Number, Number, Uint8Array, Number> callbackfn);
    /** 
      * Std Signature : S(reduceRight,2,,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<2,8,8,29,8>),P(d2))
      * TE Signature : S(reduceRight,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@92250
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
     */
    public native Number reduceRight(Function4<Number, Number, Number, Uint8Array, Number> callbackfn, Number initialValue /* optional */);
    /** 
      * Std Signature : S(reduceRight,U-,U-,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<U-,2,9,29,8>),P(dU-))
      * TE Signature : S(reduceRight,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@93096
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order.
      * The return value of the callback function is the accumulated result, and is provided as an
      * argument in the next call to the callback function.
      * VERSION 1
     */
    public native <U> U reduceRight(Function4<U, Number, Number, Uint8Array, U> callbackfn, U initialValue);
    /** 
      * Std Signature : S(reverse,29,,)
      * TE Signature : S(reverse,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@93297
      * Reverses the elements in an Array.
     */
    public native Uint8Array reverse();
    /** 
      * Std Signature : S(set,289,,P(d2),P(d2))
      * TE Signature : S(set,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@93480
      * Sets a value or an array of values.
      * Sets a value or an array of values.
     */
    public native void set(Number index, Number value);
    /** 
      * Std Signature : S(set,289,,P(d5<2>))
      * TE Signature : S(set,P(d5))
      * 
     */
    public native void set(ArrayLike<Number> array);
    /** 
      * Std Signature : S(set,289,,P(d5<2>),P(d2))
      * TE Signature : S(set,P(d5),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@93743
      * Sets a value or an array of values.
      * Sets a value or an array of values.
      * VERSION 1
     */
    public native void set(ArrayLike<Number> array, Number offset /* optional */);
    /** 
      * Std Signature : S(slice,29,,)
      * TE Signature : S(slice,)
      * 
     */
    public native Uint8Array slice();
    /** 
      * Std Signature : S(slice,29,,P(d2))
      * TE Signature : S(slice,P(d2))
      * 
     */
    public native Uint8Array slice(Number start /* optional */);
    /** 
      * Std Signature : S(slice,29,,P(d2),P(d2))
      * TE Signature : S(slice,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@93998
      * Returns a section of an array.
     */
    public native Uint8Array slice(Number start /* optional */, Number end /* optional */);
    /** 
      * Std Signature : S(some,27,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<2,7,29,27>))
      * TE Signature : S(some,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@94563
      * Determines whether the specified callback function returns true for any element of an array.
     */
    public native Boolean some(Function3<Number, Number, Uint8Array, Boolean> callbackfn);
    /** 
      * Std Signature : S(sort,29,,)
      * TE Signature : S(sort,)
      * 
     */
    public native Uint8Array sort();
    /** 
      * Std Signature : S(sort,29,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<2,6,6>))
      * TE Signature : S(sort,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@94889
      * Sorts an array.
     */
    public native Uint8Array sort(Function2<Number, Number, Number> compareFn /* optional */);
    /** 
      * Std Signature : S(subarray,29,,P(d2))
      * TE Signature : S(subarray,P(d2))
      * 
     */
    public native Uint8Array subarray(Number begin);
    /** 
      * Std Signature : S(subarray,29,,P(d2),P(d2))
      * TE Signature : S(subarray,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@95237
      * Gets a new Uint8Array view of the ArrayBuffer store for this array, referencing the elements
      * at begin, inclusive, up to end, exclusive.
     */
    public native Uint8Array subarray(Number begin, Number end /* optional */);
    /** 
      * Std Signature : S(toLocaleString,1,,)
      * TE Signature : S(toLocaleString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@95377
      * Converts a number to a string by using the current locale.
     */
    public native String toLocaleString();
    /** 
      * Std Signature : S(values,363<2>,,)
      * TE Signature : S(values,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@222897
      * Returns an list of values in the array
     */
    public native IterableIterator<Number> values();
}
