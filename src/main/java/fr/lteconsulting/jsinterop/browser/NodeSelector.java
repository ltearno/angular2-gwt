package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: NodeSelector
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:734205
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NodeSelector
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(querySelector,49,,P(d1))
      * TE Signature : S(querySelector,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@734333
     */
    Element querySelector(String selectors);
    /** 
      * Std Signature : S(querySelectorAll,377<49>,,P(d1))
      * TE Signature : S(querySelectorAll,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@734488
     */
    NodeListOf<Element> querySelectorAll(String selectors);
}
