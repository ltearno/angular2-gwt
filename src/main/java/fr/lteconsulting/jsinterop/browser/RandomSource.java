package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: RandomSource
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:734547
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RandomSource")
public class RandomSource
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(getRandomValues,100,,P(d100))
      * TE Signature : S(getRandomValues,P(d100))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@734578
     */
    public native ArrayBufferView getRandomValues(ArrayBufferView array);
}
