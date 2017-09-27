package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Iterable;
import fr.lteconsulting.jsinterop.browser.NgIterable_UnionOfArrayOfVAndIterableOfV;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs".IterableDiffer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:428

  * A strategy for tracking changes over time to an iterable. Used by {@link NgFor} to
  * respond to changes in an iterable by effecting equivalent changes in the DOM.
 */
@JsType(isNative=true, namespace="ng.core", name="IterableDiffer")
public class IterableDifferImpl<V> implements IterableDiffer<V>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(diff,1197<V->,,P(d6<V->))
      * TE Signature : S(diff,P(d6))
      * 
     */
    public native IterableChanges<V> diff(Iterable<V> object);
    /** 
      * Std Signature : S(diff,1197<V->,,P(d7<V->))
      * TE Signature : S(diff,P(d7))
      * 
     */
    public native IterableChanges<V> diff(Array<V> object);
    /** 
      * Std Signature : S(diff,1197<V->,,P(dU(V-7<V->,6<5>)))
      * TE Signature : S(diff,P(dU(-7,6)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@939
      * Compute a difference between the previous state and the new `object` state.
     */
    public native IterableChanges<V> diff(NgIterable_UnionOfArrayOfVAndIterableOfV<V> object);
}
