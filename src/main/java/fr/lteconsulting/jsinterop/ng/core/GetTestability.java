package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability".GetTestability
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts:1579

  * Adapter interface for retrieving the `Testability` service associated for a
  * particular context.
 */
@JsType(isNative=true, namespace="ng.core", name="GetTestability")
public class GetTestability
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(addToWindow,429,,P(d416))
      * TE Signature : S(addToWindow,P(d416))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@1853
     */
    public native void addToWindow(TestabilityRegistry registry);
    /** 
      * Std Signature : S(findTestabilityInTree,415,,P(d416),P(d3),P(d27))
      * TE Signature : S(findTestabilityInTree,P(d416),P(d3),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@1907
     */
    public native Testability findTestabilityInTree(TestabilityRegistry registry, Object elem, Boolean findInAncestors);
}
