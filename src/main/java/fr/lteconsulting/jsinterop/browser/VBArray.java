package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: VBArray
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:783089
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:784282
  * 1 constructors
  * Enables reading from a COM safe array, which might have an alternate lower bound, or multiple dimensions.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="VBArray")
public class VBArray<T>
{

    /*
        Constructors
    */
    public VBArray(Object safeArray){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(dimensions,2,,)
      * TE Signature : S(dimensions,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@783302
      * Returns the number of dimensions (1-based).
     */
    public native Number dimensions();
    /** 
      * Std Signature : S(getItem,T-,,P(d2))
      * TE Signature : S(getItem,P(d2))
      * 
     */
    public native T getItem(Number dimension1Index);
    /** 
      * Std Signature : S(getItem,T-,,P(d2),P(D2))
      * TE Signature : S(getItem,P(d2),P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@783452
      * Takes an index for each dimension in the array, and returns the item at the corresponding location.
     */
    public native T getItem(Number dimension1Index, Number... dimensionNIndexes);
    /** 
      * Std Signature : S(lbound,2,,)
      * TE Signature : S(lbound,)
      * 
     */
    public native Number lbound();
    /** 
      * Std Signature : S(lbound,2,,P(d2))
      * TE Signature : S(lbound,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@783667
      * Returns the smallest available index for a given dimension.
     */
    public native Number lbound(Number dimension /* optional */);
    /** 
      * Std Signature : S(toArray,7<T->,,)
      * TE Signature : S(toArray,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@784137
      * Returns a Javascript array with all the elements in the VBArray. If there are multiple dimensions,
      * each successive dimension is appended to the end of the array.
      * Example: [[1,2,3],[4,5,6]] becomes [1,2,3,4,5,6]
     */
    public native Array<T> toArray();
    /** 
      * Std Signature : S(ubound,2,,)
      * TE Signature : S(ubound,)
      * 
     */
    public native Number ubound();
    /** 
      * Std Signature : S(ubound,2,,P(d2))
      * TE Signature : S(ubound,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@783848
      * Returns the largest available index for a given dimension.
     */
    public native Number ubound(Number dimension /* optional */);
}
