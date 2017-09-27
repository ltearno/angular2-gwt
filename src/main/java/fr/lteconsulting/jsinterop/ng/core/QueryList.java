package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfObjectAndT;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list".QueryList
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts:248

  * An unmodifiable list of items that Angular keeps up to date when the state
  * of the application changes.
  * 
  * The type of object that {@link ViewChildren}, {@link ContentChildren}, and {@link QueryList}
  * provide.
  * 
  * Implements an iterable interface, therefore it can be used in both ES6
  * javascript `for (var i of items)` loops as well as in Angular templates with
  * `*ngFor="let i of myList"`.
  * 
  * Changes can be observed by subscribing to the changes `Observable`.
  * 
  * NOTE: In the future this class will implement an `Observable` interface.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/RX8sJnQYl9FWuSCWme5z?p=preview))
  * ```typescript
 */
@JsType(isNative=true, namespace="ng.core", name="QueryList")
public class QueryList<T>
{

    /*
        Properties
    */

    public Object _dirty;

    @JsProperty( name = "_dirty")
    public native Object get_dirty();

    @JsProperty( name = "_dirty")
    public native void set_dirty( Object value );

    public Object _emitter;

    @JsProperty( name = "_emitter")
    public native Object get_emitter();

    @JsProperty( name = "_emitter")
    public native void set_emitter( Object value );

    public Object _results;

    @JsProperty( name = "_results")
    public native Object get_results();

    @JsProperty( name = "_results")
    public native void set_results( Object value );

    public Observable<Object> changes;

    @JsProperty( name = "changes")
    public native Observable<Object> getChanges();

    @JsProperty( name = "changes")
    public native void setChanges( Observable<Object> value );

    /** 
      * internal 
     */
    public Boolean dirty;

    @JsProperty( name = "dirty")
    public native Boolean getDirty();

    @JsProperty( name = "dirty")
    public native void setDirty( Boolean value );

    public T first;

    @JsProperty( name = "first")
    public native T getFirst();

    @JsProperty( name = "first")
    public native void setFirst( T value );

    public T last;

    @JsProperty( name = "last")
    public native T getLast();

    @JsProperty( name = "last")
    public native void setLast( T value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2775
      * internal 
     */
    public native void destroy();
    /** 
      * Std Signature : S(filter,7<T3>,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T3,2,7<7>,27>))
      * TE Signature : S(filter,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@1596
      * See
      * [Array.filter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)
     */
    public native Array<T> filter(Function3<T, Number, Array<T>, Boolean> fn);
    /** 
      * Std Signature : S(find,T3,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T3,2,7<7>,27>))
      * TE Signature : S(find,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@1806
      * See
      * [Array.find](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/find)
     */
    public native T find(Function3<T, Number, Array<T>, Boolean> fn);
    /** 
      * Std Signature : S(forEach,429,,P(dFP1-,P2-,P3--S(?,429,,P(d3),P(d4),P(d5))------)<T3,2,7<7>>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2269
      * See
      * [Array.forEach](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach)
     */
    public native void forEach(Action3<T, Number, Array<T>> fn);
    /** 
      * Std Signature : S(map,7<U->,U-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T3,2,7<7>,U->))
      * TE Signature : S(map,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@1388
      * See
      * [Array.map](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map)
     */
    public native <U> Array<U> map(Function3<T, Number, Array<T>, U> fn);
    /** 
      * Std Signature : S(notifyOnChanges,429,,)
      * TE Signature : S(notifyOnChanges,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2635
     */
    public native void notifyOnChanges();
    /** 
      * Std Signature : S(reduce,U-,U-,P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<U-,T3,2,7<9>,8>),P(dU-))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2028
      * See
      * [Array.reduce](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reduce)
     */
    public native <U> U reduce(Function4<U, T, Number, Array<T>, U> fn, U init);
    /** 
      * Std Signature : S(reset,429,,P(d7<U(T-2<3>,T6)>))
      * TE Signature : S(reset,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2595
     */
    public native void reset(Array<UnionOfArrayOfObjectAndT<T>> res);
    /** 
      * Std Signature : S(setDirty,429,,)
      * TE Signature : S(setDirty,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2684
      * internal 
     */
    public native void setDirty();
    /** 
      * Std Signature : S(some,27,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T3,2,7<7>,27>))
      * TE Signature : S(some,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2478
      * See
      * [Array.some](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/some)
     */
    public native Boolean some(Function3<T, Number, Array<T>, Boolean> fn);
    /** 
      * Std Signature : S(toArray,7<T3>,,)
      * TE Signature : S(toArray,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/query_list.d.ts@2551
     */
    public native Array<T> toArray();
}
