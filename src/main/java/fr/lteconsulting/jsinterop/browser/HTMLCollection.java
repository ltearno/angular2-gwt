package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLCollection
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:395066
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:395273
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLCollection")
public class HTMLCollection extends HTMLCollectionBase
{

    /*
        Constructors
    */
    public HTMLCollection(){
    }

    /** skipped index of type {@link Element} because already in type hierarchy */

    /*
        Methods
    */
    /** 
      * Std Signature : S(namedItem,49,,P(d1))
      * TE Signature : S(namedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@395218
      * Retrieves a select object or an object from an options collection.
     */
    public native Element namedItem(String name);
}
