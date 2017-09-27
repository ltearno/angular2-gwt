package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces".CanDeactivate
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts:3880
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="CanDeactivate")
public class CanDeactivate<T>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(canDeactivate,U(-27,357<2>,88<2>),,P(dT-),P(d682),P(d683))
      * TE Signature : S(canDeactivate,P(d3),P(d682),P(d683))
      * 
     */
    public native UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean canDeactivate(T component, ActivatedRouteSnapshot currentRoute, RouterStateSnapshot currentState);
    /** 
      * Std Signature : S(canDeactivate,U(-27,357<2>,88<2>),,P(dT-),P(d682),P(d683),P(d683))
      * TE Signature : S(canDeactivate,P(d3),P(d682),P(d683),P(d683))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts@5604
     */
    public native UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean canDeactivate(T component, ActivatedRouteSnapshot currentRoute, RouterStateSnapshot currentState, RouterStateSnapshot nextState /* optional */);
}
