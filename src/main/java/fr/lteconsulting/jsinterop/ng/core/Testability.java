package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability".Testability
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts:383
  * 1 constructors
  * The Testability service provides testing hooks that can be accessed from
  * the browser and by services such as Protractor. Each bootstrapped Angular
  * application on the page will have an instance of Testability.
 */
@JsType(isNative=true, namespace="ng.core", name="Testability")
public class Testability extends PublicTestability
{

    /*
        Constructors
    */
    public Testability(NgZone _ngZone){
    }

    /*
        Properties
    */

    public Object _ngZone;

    @JsProperty( name = "_ngZone")
    public native Object get_ngZone();

    @JsProperty( name = "_ngZone")
    public native void set_ngZone( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(decreasePendingRequestCount,2,,)
      * TE Signature : S(decreasePendingRequestCount,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@793
     */
    public native Number decreasePendingRequestCount();
    /** 
      * Std Signature : S(findBindings,7<3>,,P(d3),P(d1),P(d27))
      * TE Signature : S(findBindings,P(d3),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@982
     */
    public native Array<Object> findBindings(Object using, String provider, Boolean exactMatch);
    /** 
      * Std Signature : S(getPendingRequestCount,2,,)
      * TE Signature : S(getPendingRequestCount,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@903
     */
    public native Number getPendingRequestCount();
    /** 
      * Std Signature : S(increasePendingRequestCount,2,,)
      * TE Signature : S(increasePendingRequestCount,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/testability/testability.d.ts@750
     */
    public native Number increasePendingRequestCount();
}
