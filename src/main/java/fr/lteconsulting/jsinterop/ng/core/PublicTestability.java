package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability".PublicTestability
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts:41

  * Testability API.
  * `declare` keyword causes tsickle to generate externs, so these methods are
  * not renamed by Closure Compiler.
 */
@JsType(isNative=true, namespace="ng.core", name="PublicTestability")
public class PublicTestability
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(findProviders,7<3>,,P(d3),P(d1),P(d27))
      * TE Signature : S(findProviders,P(d3),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@309
     */
    public native Array<Object> findProviders(Object using, String provider, Boolean exactMatch);
    /** 
      * Std Signature : S(isStable,27,,)
      * TE Signature : S(isStable,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@242
     */
    public native Boolean isStable();
    /** 
      * Std Signature : S(whenStable,429,,P(d205))
      * TE Signature : S(whenStable,P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@267
     */
    public native void whenStable(Function callback);
}
