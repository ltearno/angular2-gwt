package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs".KeyValueChanges
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:1117

  * An object describing the changes in the `Map` or `{[k:string]: string}` since last time
  * `KeyValueDiffer#diff()` was invoked.
 */
@JsType(isNative=true, namespace="ng.core", name="KeyValueChanges")
public class KeyValueChangesImpl<K, V> implements KeyValueChanges<K, V>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(forEachAddedItem,429,,P(dFP1--S(?,429,,P(d3))------)<368<K-,V->>))
      * TE Signature : S(forEachAddedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@1921
      * Iterate over all added items.
     */
    public native void forEachAddedItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachChangedItem,429,,P(dFP1--S(?,429,,P(d3))------)<368<K-,V->>))
      * TE Signature : S(forEachChangedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@1793
      * Iterate over all keys for which values have changed.
     */
    public native void forEachChangedItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachItem,429,,P(dFP1--S(?,429,,P(d3))------)<368<K-,V->>))
      * TE Signature : S(forEachItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@1448
      * Iterate over all changes. `KeyValueChangeRecord` will contain information about changes
      * to each item.
     */
    public native void forEachItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachPreviousItem,429,,P(dFP1--S(?,429,,P(d3))------)<368<K-,V->>))
      * TE Signature : S(forEachPreviousItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@1641
      * Iterate over changes in the order of original Map showing where the original items
      * have moved.
     */
    public native void forEachPreviousItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachRemovedItem,429,,P(dFP1--S(?,429,,P(d3))------)<368<K-,V->>))
      * TE Signature : S(forEachRemovedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@2049
      * Iterate over all removed items.
     */
    public native void forEachRemovedItem(Action1<KeyValueChangeRecord<K, V>> fn);
}
