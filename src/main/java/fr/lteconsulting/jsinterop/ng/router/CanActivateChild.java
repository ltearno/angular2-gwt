package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces".CanActivateChild
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts:2000
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="CanActivateChild")
public class CanActivateChild
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(canActivateChild,U(-27,357<2>,88<2>),,P(d682),P(d683))
      * TE Signature : S(canActivateChild,P(d682),P(d683))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts@3747
     */
    public native UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean canActivateChild(ActivatedRouteSnapshot childRoute, RouterStateSnapshot state);
}
