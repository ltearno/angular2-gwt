package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs".KeyValueDifferFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:2527

  * Provides a factory for {@link KeyValueDiffer}.
 */
@JsType(isNative=true, namespace="ng.core", name="KeyValueDifferFactory")
public class KeyValueDifferFactory
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(create,1201<K-,V->,K-,V-,)
      * TE Signature : S(create,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@2820
      * Create a `KeyValueDiffer`.
     */
    public native <K, V> KeyValueDiffer<K, V> create();
    /** 
      * Std Signature : S(create,1201<K-,V->,K-,V-,P(d366))
      * TE Signature : S(create,P(d366))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@2965
      * Create a `KeyValueDiffer`.
      * VERSION 1
     */
    public native <K, V> KeyValueDiffer<K, V> create(ChangeDetectorRef _cdr /* optional */);
    /** 
      * Std Signature : S(supports,27,,P(d3))
      * TE Signature : S(supports,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@2733
      * Test to see if the differ knows how to diff this kind of object.
     */
    public native Boolean supports(Object objects);
}
