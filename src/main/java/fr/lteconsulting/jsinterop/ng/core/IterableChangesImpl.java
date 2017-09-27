package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Action3;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs".IterableChanges
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:996

  * An object describing the changes in the `Iterable` collection since last time
  * `IterableDiffer#diff()` was invoked.
 */
@JsType(isNative=true, namespace="ng.core", name="IterableChanges")
public class IterableChangesImpl<V> implements IterableChanges<V>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(forEachAddedItem,429,,P(dFP1--S(?,429,,P(d3))------)<365<V->>))
      * TE Signature : S(forEachAddedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@2731
      * Iterate over all added items. 
     */
    public native void forEachAddedItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachIdentityChange,429,,P(dFP1--S(?,429,,P(d3))------)<365<V->>))
      * TE Signature : S(forEachIdentityChange,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@3143
      * Iterate over all items which had their identity (as computed by the `trackByFn`) changed. 
     */
    public native void forEachIdentityChange(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachItem,429,,P(dFP1--S(?,429,,P(d3))------)<365<V->>))
      * TE Signature : S(forEachItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@1314
      * Iterate over all changes. `IterableChangeRecord` will contain information about changes
      * to each item.
     */
    public native void forEachItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachMovedItem,429,,P(dFP1--S(?,429,,P(d3))------)<365<V->>))
      * TE Signature : S(forEachMovedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@2847
      * Iterate over all moved items. 
     */
    public native void forEachMovedItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachOperation,429,,P(dFP1-,P2-,P3--S(?,429,,P(d3),P(d4),P(d5))------)<365<V->,2,10>))
      * TE Signature : S(forEachOperation,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@2360
      * Iterate over a set of operations which when applied to the original `Iterable` will produce the
      * new `Iterable`.
      * 
      * NOTE: These are not necessarily the actual operations which were applied to the original
      * `Iterable`, rather these are a set of computed operations which may not be the same as the
      * ones applied.
     */
    public native void forEachOperation(Action3<IterableChangeRecord<V>, Number, Number> fn);
    /** 
      * Std Signature : S(forEachPreviousItem,429,,P(dFP1--S(?,429,,P(d3))------)<365<V->>))
      * TE Signature : S(forEachPreviousItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@2612
      * Iterate over changes in the order of original `Iterable` showing where the original items
      * have moved.
     */
    public native void forEachPreviousItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachRemovedItem,429,,P(dFP1--S(?,429,,P(d3))------)<365<V->>))
      * TE Signature : S(forEachRemovedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@2965
      * Iterate over all removed items. 
     */
    public native void forEachRemovedItem(Action1<IterableChangeRecord<V>> fn);
}
