package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces".CanActivate
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts:360
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="CanActivate")
public class CanActivate
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(canActivate,U(-27,357<2>,88<2>),,P(d682),P(d683))
      * TE Signature : S(canActivate,P(d682),P(d683))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts@1877
     */
    public native UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean canActivate(ActivatedRouteSnapshot route, RouterStateSnapshot state);
}
