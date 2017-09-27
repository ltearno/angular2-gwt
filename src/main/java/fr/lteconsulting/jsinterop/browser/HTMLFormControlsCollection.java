package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLFormControlsCollection
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:409271
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:409415
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLFormControlsCollection")
public class HTMLFormControlsCollection extends HTMLCollectionBase
{

    /*
        Constructors
    */
    public HTMLFormControlsCollection(){
    }

    /** skipped index of type {@link Element} because already in type hierarchy */

    /*
        Methods
    */
    /** 
      * Std Signature : S(namedItem,U(-49,338),,P(d1))
      * TE Signature : S(namedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@409343
     */
    public native UnionOfElementAndHTMLCollection namedItem(String name);
}
