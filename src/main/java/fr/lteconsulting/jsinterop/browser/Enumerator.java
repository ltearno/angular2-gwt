package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: Enumerator
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:782107
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:783054
  * 1 constructors
  * Allows enumerating over a COM collection, which may not have indexed item access.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Enumerator")
public class Enumerator<T>
{

    /*
        Constructors
    */
    public Enumerator(Object collection){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(atEnd,27,,)
      * TE Signature : S(atEnd,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@782392
      * Returns true if the current item is the last one in the collection, or the collection is empty,
      * or the current item is undefined.
     */
    public native Boolean atEnd();
    /** 
      * Std Signature : S(item,T-,,)
      * TE Signature : S(item,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@782481
      * Returns the current item in the collection
     */
    public native T item();
    /** 
      * Std Signature : S(moveFirst,289,,)
      * TE Signature : S(moveFirst,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@782667
      * Resets the current item in the collection to the first item. If there are no items in the collection,
      * the current item is set to undefined.
     */
    public native void moveFirst();
    /** 
      * Std Signature : S(moveNext,289,,)
      * TE Signature : S(moveNext,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@782896
      * Moves the current item to the next item in the collection. If the enumerator is at the end of
      * the collection or the collection is empty, the current item is set to undefined.
     */
    public native void moveNext();
}
