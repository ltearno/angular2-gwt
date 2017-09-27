package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: ReadonlyArray
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:39966
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:208211
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219066
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReadonlyArray")
public class ReadonlyArray<T>
{

    @JsOverlay
    public final void setByIndex(int index, T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    /** 
      * Gets the length of the array. This is a number one higher than the highest element defined in an array.
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
      * Std Signature : S(concat,7<T->,U-,)
      * TE Signature : S(concat,)
      * 
     */
    public native <U> Array<T> concat();
    /** 
      * Std Signature : S(concat,7<T->,U-,P(DU-))
      * TE Signature : S(concat,P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@40523
      * Combines two or more arrays.
      * Combines two or more arrays.
      * Combines two or more arrays.
     */
    public native <U> Array<T> concat(U... items);
    /** 
      * Std Signature : S(concat,7<T->,,P(D7<T->))
      * TE Signature : S(concat,P(D7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@40704
      * Combines two or more arrays.
      * Combines two or more arrays.
      * Combines two or more arrays.
      * VERSION 1
     */
    public native Array<T> concat(Array<T>... items);
    /** 
      * Std Signature : S(concat,7<T->,,P(DU(T-7<T->,5)))
      * TE Signature : S(concat,P(DU(-7,3)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@40859
      * Combines two or more arrays.
      * Combines two or more arrays.
      * Combines two or more arrays.
      * VERSION 2
     */
    public native Array<T> concat(UnionOfArrayOfTAndT<T>... items);
    /** 
      * Std Signature : S(entries,363<24<2,T->>,,)
      * TE Signature : S(entries,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@219260
      * Returns an array of key, value pairs for every entry in the array
     */
    public native IterableIterator<Tuple<Number, T>> entries();
    /** 
      * Std Signature : S(every,27,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,10,27>))
      * TE Signature : S(every,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@42639
      * Determines whether all the members of an array satisfy the specified test.
     */
    public native Boolean every(Function3<T, Number, ReadonlyArray<T>, Boolean> callbackfn);
    /** 
      * Std Signature : S(filter,7<S->,S-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,10,27>))
      * TE Signature : S(filter,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@44828
      * Returns the elements of an array that meet the condition specified in a callback function.
      * Returns the elements of an array that meet the condition specified in a callback function.
     */
    public native <S> Array<S> filter(Function3<T, Number, ReadonlyArray<T>, Boolean> callbackfn);
    /** 
      * Std Signature : S(find,T-,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,10,27>))
      * TE Signature : S(find,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@208799
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
     */
    public native T find(Function3<T, Number, ReadonlyArray<T>, Boolean> predicate);
    /** 
      * Std Signature : S(findIndex,2,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,7<7>,27>))
      * TE Signature : S(findIndex,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@209461
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
     */
    public native Number findIndex(Function3<T, Number, Array<T>, Boolean> predicate);
    /** 
      * Std Signature : S(forEach,289,,P(dFP1-,P2-,P3--S(?,289,,P(d3),P(d4),P(d5))------)<T-,2,10>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@43740
      * Performs the specified action for each element in an array.
     */
    public native void forEach(Action3<T, Number, ReadonlyArray<T>> callbackfn);
    /** 
      * Std Signature : S(indexOf,2,,P(dT-))
      * TE Signature : S(indexOf,P(d3))
      * 
     */
    public native Number indexOf(T searchElement);
    /** 
      * Std Signature : S(indexOf,2,,P(dT-),P(d2))
      * TE Signature : S(indexOf,P(d3),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@41736
      * Returns the index of the first occurrence of a value in an array.
     */
    public native Number indexOf(T searchElement, Number fromIndex /* optional */);
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
      * apis/browser-api/tsd/lib.es6.d.ts@41176
      * Adds all the elements of an array separated by the specified separator string.
     */
    public native String join(String separator /* optional */);
    /** 
      * Std Signature : S(keys,363<2>,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@219370
      * Returns an list of keys in the array
     */
    public native IterableIterator<Number> keys();
    /** 
      * Std Signature : S(lastIndexOf,2,,P(dT-))
      * TE Signature : S(lastIndexOf,P(d3))
      * 
     */
    public native Number lastIndexOf(T searchElement);
    /** 
      * Std Signature : S(lastIndexOf,2,,P(dT-),P(d2))
      * TE Signature : S(lastIndexOf,P(d3),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@42105
      * Returns the index of the last occurrence of a specified value in an array.
     */
    public native Number lastIndexOf(T searchElement, Number fromIndex /* optional */);
    /** 
      * Std Signature : S(map,7<U->,U-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,10,U->))
      * TE Signature : S(map,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@44297
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     */
    public native <U> Array<U> map(Function3<T, Number, ReadonlyArray<T>, U> callbackfn);
    /** 
      * Std Signature : S(reduce,U-,U-,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<U-,T-,2,10,8>),P(dU-))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@46864
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * VERSION 1
     */
    public native <U> U reduce(Function4<U, T, Number, ReadonlyArray<T>, U> callbackfn, U initialValue);
    /** 
      * Std Signature : S(reduceRight,U-,U-,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<U-,T-,2,10,8>),P(dU-))
      * TE Signature : S(reduceRight,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@48433
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * VERSION 1
     */
    public native <U> U reduceRight(Function4<U, T, Number, ReadonlyArray<T>, U> callbackfn, U initialValue);
    /** 
      * Std Signature : S(slice,7<T->,,)
      * TE Signature : S(slice,)
      * 
     */
    public native Array<T> slice();
    /** 
      * Std Signature : S(slice,7<T->,,P(d2))
      * TE Signature : S(slice,P(d2))
      * 
     */
    public native Array<T> slice(Number start /* optional */);
    /** 
      * Std Signature : S(slice,7<T->,,P(d2),P(d2))
      * TE Signature : S(slice,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@41410
      * Returns a section of an array.
     */
    public native Array<T> slice(Number start /* optional */, Number end /* optional */);
    /** 
      * Std Signature : S(some,27,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,10,27>))
      * TE Signature : S(some,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@43236
      * Determines whether the specified callback function returns true for any element of an array.
     */
    public native Boolean some(Function3<T, Number, ReadonlyArray<T>, Boolean> callbackfn);
    /** 
      * Std Signature : S(toLocaleString,1,,)
      * TE Signature : S(toLocaleString,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@40372
     */
    public native String toLocaleString();
    /** 
      * Std Signature : S(values,363<T->,,)
      * TE Signature : S(values,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@219474
      * Returns an list of values in the array
     */
    public native IterableIterator<T> values();
}
