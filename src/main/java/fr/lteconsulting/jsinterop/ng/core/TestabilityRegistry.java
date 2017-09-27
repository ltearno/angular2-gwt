package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Node;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability".TestabilityRegistry
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts:1132
  * 1 constructors
  * A global registry of {@link Testability} instances for specific elements.
 */
@JsType(isNative=true, namespace="ng.core", name="TestabilityRegistry")
public class TestabilityRegistry
{

    /*
        Constructors
    */
    public TestabilityRegistry(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(findTestabilityInTree,415,,P(d86))
      * TE Signature : S(findTestabilityInTree,P(d86))
      * 
     */
    public native Testability findTestabilityInTree(Node elem);
    /** 
      * Std Signature : S(findTestabilityInTree,415,,P(d86),P(d27))
      * TE Signature : S(findTestabilityInTree,P(d86),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@1496
     */
    public native Testability findTestabilityInTree(Node elem, Boolean findInAncestors /* optional */);
    /** 
      * Std Signature : S(getAllRootElements,7<3>,,)
      * TE Signature : S(getAllRootElements,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@1463
     */
    public native Array<Object> getAllRootElements();
    /** 
      * Std Signature : S(getAllTestabilities,7<415>,,)
      * TE Signature : S(getAllTestabilities,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@1421
     */
    public native Array<Testability> getAllTestabilities();
    /** 
      * Std Signature : S(getTestability,415,,P(d3))
      * TE Signature : S(getTestability,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@1370
     */
    public native Testability getTestability(Object elem);
    /** 
      * Std Signature : S(registerApplication,429,,P(d3),P(d415))
      * TE Signature : S(registerApplication,P(d3),P(d415))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@1301
     */
    public native void registerApplication(Object token, Testability testability);
}
