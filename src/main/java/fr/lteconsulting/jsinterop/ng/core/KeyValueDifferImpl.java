package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType983;
import fr.lteconsulting.jsinterop.browser.Map;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs".KeyValueDiffer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:299

  * A differ that tracks changes made to an object over time.
 */
@JsType(isNative=true, namespace="ng.core", name="KeyValueDiffer")
public class KeyValueDifferImpl<K, V> implements KeyValueDiffer<K, V>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(diff,1200<K-,V->,,P(d37<K-,V->))
      * TE Signature : S(diff,P(d37))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@707
      * Compute a difference between the previous state and the new `object` state.
      * Compute a difference between the previous state and the new `object` state.
     */
    public native KeyValueChanges<K, V> diff(Map<K, V> object);
    /** 
      * Std Signature : S(diff,1200<1,V->,,P(dC(V----V-----)))
      * TE Signature : S(diff,P(dC(----3----)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@1039
      * Compute a difference between the previous state and the new `object` state.
      * Compute a difference between the previous state and the new `object` state.
      * VERSION 1
     */
    public native KeyValueChanges<String, V> diff(AnonymousType983<V> object);
}
