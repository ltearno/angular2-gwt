package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.TupleOf5;
import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function2;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.*;
import jsinterop.base.Js;

import java.util.Iterator;

/**
 * base type: Array
 * flags: 32768
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:48601
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:60570
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:195214
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:218044
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:246444
 * base type: Array
 * flags: 16384
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:48601
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:60570
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:195214
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:218044
 * declared in: apis/browser-api/tsd/lib.es6.d.ts:246444
 * 1 constructors
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Array")
public class Array<T> {

    /*
        Constructors
    */
    public Array() {
    }

    //public Array(Number arrayLength){
    //}

    @JsOverlay
    public final static <T> Array<T> empty() {
        return new Array<T>();
    }

    @JsOverlay
    public final java.lang.Iterable<T> iterate() {
        return () -> new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public T next() {
                T result = getByIndex(index);
                index++;
                return result;
            }

            @Override
            public void remove() {
                throw new RuntimeException();
            }
        };
    }

    @JsOverlay
    public final void setByIndex(int index, T value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final T getByIndex(int index) {
        return (T) Js.asArrayLike(this).getAt(index);
    }

    /*
        Static methods
    */

    /**
     * source : apis/browser-api/tsd/lib.es6.d.ts:60480
     */
    @JsMethod(namespace = "Array", name = "isArray")
    public static native <T> Boolean isArray(Object arg);

    /**
     * Creates an array from an array-like object.
     * Creates an array from an array-like object.
     * Creates an array from an iterable object.
     * Creates an array from an iterable object.
     * source : apis/browser-api/tsd/lib.es6.d.ts:197986
     */
    @JsMethod(namespace = "Array", name = "from")
    public static native <T, U> Array<U> from(ArrayLike<T> arrayLike, Function2<T, Number, U> mapfn);

    /**
     * Creates an array from an array-like object.
     * Creates an array from an array-like object.
     * Creates an array from an iterable object.
     * Creates an array from an iterable object.
     * source : apis/browser-api/tsd/lib.es6.d.ts:197986
     * source : apis/browser-api/tsd/lib.es6.d.ts:198224
     */
    @JsMethod(namespace = "Array", name = "from")
    public static native <T> Array<T> from(ArrayLike<T> arrayLike);

    /**
     * Creates an array from an array-like object.
     * Creates an array from an array-like object.
     * Creates an array from an iterable object.
     * Creates an array from an iterable object.
     * source : apis/browser-api/tsd/lib.es6.d.ts:197986
     * source : apis/browser-api/tsd/lib.es6.d.ts:198224
     * source : apis/browser-api/tsd/lib.es6.d.ts:218789
     */
    @JsMethod(namespace = "Array", name = "from")
    public static native <T, U> Array<U> from(Iterable<T> iterable, Function2<T, Number, U> mapfn);

    /**
     * Creates an array from an array-like object.
     * Creates an array from an array-like object.
     * Creates an array from an iterable object.
     * Creates an array from an iterable object.
     * source : apis/browser-api/tsd/lib.es6.d.ts:197986
     * source : apis/browser-api/tsd/lib.es6.d.ts:198224
     * source : apis/browser-api/tsd/lib.es6.d.ts:218789
     * source : apis/browser-api/tsd/lib.es6.d.ts:219023
     */
    @JsMethod(namespace = "Array", name = "from")
    public static native <T> Array<T> from(Iterable<T> iterable);

    /**
     * Returns a new array from a set of elements.
     * source : apis/browser-api/tsd/lib.es6.d.ts:198417
     */
    //@JsMethod(namespace = "Array", name = "of")
    //public static native <T> Array<T> of(@DoNotAutobox T... items);

    @JsOverlay
    @SafeVarargs
    public final static <T> Array<T> of(@DoNotAutobox T... array )
    {
        Array<T> result = new Array<>();
        for( T item : array )
            result.push( item );
        return result;
    }

    /*
        Properties
    */

    /**
     * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
     */
    public int length;

    @JsProperty(name = "length")
    public native int getLength();

    /*
        Methods
    */
    // skipped method __@iterator
    // skipped method __@unscopables

    /**
     * Std Signature : S(concat,7,,)
     * TE Signature : S(concat,)
     */
    public native Array<T> concat();

    /**
     * Std Signature : S(concat,7,,P(DT-))
     * TE Signature : S(concat,P(D3))
     */
    public native Array<T> concat(T... items);
    /**
     * Std Signature : S(concat,7,,P(D7))
     * TE Signature : S(concat,P(D7))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@49317
     * Combines two or more arrays.
     * Combines two or more arrays.
     */
    public native Array<T> concat(Array<T>... items);
    /**
     * Std Signature : S(concat,7,,P(DU(T-7<T->,T-)))
     * TE Signature : S(concat,P(DU(-7,3)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@49472
     * Combines two or more arrays.
     * Combines two or more arrays.
     * VERSION 1
     */
    public native Array<T> concat(UnionOfArrayOfTAndT<T>... items);

    /**
     * Std Signature : S(copyWithin,7,,P(d2),P(d2))
     * TE Signature : S(copyWithin,P(d2),P(d2))
     */
    public native Array<T> copyWithin(Number target, Number start);
    /**
     * Std Signature : S(copyWithin,7,,P(d2),P(d2),P(d2))
     * TE Signature : S(copyWithin,P(d2),P(d2),P(d2))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@197604
     * Returns the this object after copying a section of the array identified by start and end
     * to the same array starting at position target
     */
    public native Array<T> copyWithin(Number target, Number start, Number end /* optional */);
    /**
     * Std Signature : S(entries,363<24<2,T->>,,)
     * TE Signature : S(entries,)
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@218230
     * Returns an array of key, value pairs for every entry in the array
     */
    public native IterableIterator<Tuple<Number, T>> entries();
    /**
     * Std Signature : S(every,27,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,7,27>))
     * TE Signature : S(every,P(dF--S(?,P(d3),P(d4),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@52692
     * Determines whether all the members of an array satisfy the specified test.
     */
    public native Boolean every(Function3<T, Number, Array<T>, Boolean> callbackfn);

    /**
     * Std Signature : S(fill,7,,P(dT-))
     * TE Signature : S(fill,P(d3))
     */
    public native Array<T> fill(T value);

    /**
     * Std Signature : S(fill,7,,P(dT-),P(d2))
     * TE Signature : S(fill,P(d3),P(d2))
     */
    public native Array<T> fill(T value, Number start /* optional */);
    /**
     * Std Signature : S(fill,7,,P(dT-),P(d2),P(d2))
     * TE Signature : S(fill,P(d3),P(d2),P(d2))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@197030
     * Returns the this object after filling the section identified by start and end with value
     */
    public native Array<T> fill(T value, Number start /* optional */, Number end /* optional */);
    /**
     * Std Signature : S(filter,7,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,7,3>))
     * TE Signature : S(filter,P(dF--S(?,P(d3),P(d4),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@57093
     * Returns the elements of an array that meet the condition specified in a callback function.
     */
    public native Array<T> filter(Function3<T, Number, Array<T>, Object> callbackfn);
    /**
     * Std Signature : S(find,T-,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,7,27>))
     * TE Signature : S(find,P(dF--S(?,P(d3),P(d4),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@195814
     * Returns the value of the first element in the array where predicate is true, and undefined
     * otherwise.
     */
    public native T find(Function3<T, Number, Array<T>, Boolean> predicate);
    /**
     * Std Signature : S(findIndex,2,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,7,27>))
     * TE Signature : S(findIndex,P(dF--S(?,P(d3),P(d4),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@196488
     * Returns the index of the first element in the array where predicate is true, and -1
     * otherwise.
     */
    public native Number findIndex(Function3<T, Number, Array<T>, Boolean> predicate);
    /**
     * Std Signature : S(forEach,289,,P(dFP1-,P2-,P3--S(?,289,,P(d3),P(d4),P(d5))------)<T-,2,7>))
     * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@53767
     * Performs the specified action for each element in an array.
     */
    public native void forEach(Action3<T, Number, Array<T>> callbackfn);

    /**
     * Std Signature : S(indexOf,2,,P(dT-))
     * TE Signature : S(indexOf,P(d3))
     */
    public native Number indexOf(T searchElement);
    /**
     * Std Signature : S(indexOf,2,,P(dT-),P(d2))
     * TE Signature : S(indexOf,P(d3),P(d2))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@51790
     * Returns the index of the first occurrence of a value in an array.
     */
    public native Number indexOf(T searchElement, Number fromIndex /* optional */);

    /**
     * Std Signature : S(join,1,,)
     * TE Signature : S(join,)
     */
    public native String join();
    /**
     * Std Signature : S(join,1,,P(d1))
     * TE Signature : S(join,P(d1))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@49789
     * Adds all the elements of an array separated by the specified separator string.
     */
    public native String join(String separator /* optional */);
    /**
     * Std Signature : S(keys,363<2>,,)
     * TE Signature : S(keys,)
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@218340
     * Returns an list of keys in the array
     */
    public native IterableIterator<Number> keys();

    /**
     * Std Signature : S(lastIndexOf,2,,P(dT-))
     * TE Signature : S(lastIndexOf,P(d3))
     */
    public native Number lastIndexOf(T searchElement);
    /**
     * Std Signature : S(lastIndexOf,2,,P(dT-),P(d2))
     * TE Signature : S(lastIndexOf,P(d3),P(d2))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@52158
     * Returns the index of the last occurrence of a specified value in an array.
     */
    public native Number lastIndexOf(T searchElement, Number fromIndex /* optional */);
    /**
     * Std Signature : S(map,21<U-,3,3,3,3>,U-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,7,U->))
     * TE Signature : S(map,P(dF--S(?,P(d3),P(d4),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@54311
     * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     */
    public native <U> TupleOf5<U, U, U, U, U> map(Function3<T, Number, Array<T>, U> callbackfn);
    /**
     * Std Signature : S(pop,T-,,)
     * TE Signature : S(pop,)
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@49170
     * Removes the last element from an array and returns it.
     */
    public native T pop();

    /**
     * Std Signature : S(push,2,,)
     * TE Signature : S(push,)
     */
    public native Number push();
    /**
     * Std Signature : S(push,2,,P(DT-))
     * TE Signature : S(push,P(D3))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@49057
     * Appends new elements to an array, and returns the new length of the array.
     */
    public native Number push(@DoNotAutobox T item);
    /**
     * Std Signature : S(reduce,U-,U-,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<U-,T-,2,7,8>),P(dU-))
     * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d3))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@58546
     * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     * VERSION 1
     */
    public native <U> U reduce(Function4<U, T, Number, Array<T>, U> callbackfn, U initialValue);
    /**
     * Std Signature : S(reduceRight,U-,U-,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<U-,T-,2,7,8>),P(dU-))
     * TE Signature : S(reduceRight,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d3))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@60089
     * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     * VERSION 1
     */
    public native <U> U reduceRight(Function4<U, T, Number, Array<T>, U> callbackfn, U initialValue);
    /**
     * Std Signature : S(reverse,7,,)
     * TE Signature : S(reverse,)
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@49887
     * Reverses the elements in an Array.
     */
    public native Array<T> reverse();
    /**
     * Std Signature : S(shift,T-,,)
     * TE Signature : S(shift,)
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@49988
     * Removes the first element from an array and returns it.
     */
    public native T shift();

    /**
     * Std Signature : S(slice,7,,)
     * TE Signature : S(slice,)
     */
    public native Array<T> slice();

    /**
     * Std Signature : S(slice,7,,P(d2))
     * TE Signature : S(slice,P(d2))
     */
    public native Array<T> slice(Number start /* optional */);
    /**
     * Std Signature : S(slice,7,,P(d2),P(d2))
     * TE Signature : S(slice,P(d2),P(d2))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@50212
     * Returns a section of an array.
     */
    public native Array<T> slice(Number start /* optional */, Number end /* optional */);
    /**
     * Std Signature : S(some,27,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,7,27>))
     * TE Signature : S(some,P(dF--S(?,P(d3),P(d4),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@53276
     * Determines whether the specified callback function returns true for any element of an array.
     */
    public native Boolean some(Function3<T, Number, Array<T>, Boolean> callbackfn);

    /**
     * Std Signature : S(sort,7,,)
     * TE Signature : S(sort,)
     */
    public native Array<T> sort();
    /**
     * Std Signature : S(sort,7,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,6,2>))
     * TE Signature : S(sort,P(dF--S(?,P(d3),P(d4))------)))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@50467
     * Sorts an array.
     */
    public native Array<T> sort(Function2<T, T, Number> compareFn /* optional */);

    /**
     * Std Signature : S(splice,7,,P(d2))
     * TE Signature : S(splice,P(d2))
     */
    public native Array<T> splice(Number start);
    /**
     * Std Signature : S(splice,7,,P(d2),P(d2))
     * TE Signature : S(splice,P(d2),P(d2))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@50821
     * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     */
    public native Array<T> splice(Number start, Number deleteCount /* optional */);
    /**
     * Std Signature : S(splice,7,,P(d2),P(d2),P(DT-))
     * TE Signature : S(splice,P(d2),P(d2),P(D3))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@51266
     * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     * VERSION 1
     */
    public native Array<T> splice(Number start, Number deleteCount, T... items);
    /**
     * Std Signature : S(toLocaleString,1,,)
     * TE Signature : S(toLocaleString,)
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@48879
     */
    public native String toLocaleString();

    /**
     * Std Signature : S(unshift,2,,)
     * TE Signature : S(unshift,)
     */
    public native Number unshift();
    /**
     * Std Signature : S(unshift,2,,P(DT-))
     * TE Signature : S(unshift,P(D3))
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@51474
     * Inserts new elements at the start of an array.
     */
    public native Number unshift(T... items);
    /**
     * Std Signature : S(values,363<T->,,)
     * TE Signature : S(values,)
     *
     */
    /**
     * apis/browser-api/tsd/lib.es6.d.ts@218444
     * Returns an list of values in the array
     */
    public native IterableIterator<T> values();
}
