package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.UnionOfObservableOfTAndPromiseOfTAndT;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces".Resolve
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts:5790
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="Resolve")
public class Resolve<T>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(resolve,U(T-357<T->,88<5>,5),,P(d682),P(d683))
      * TE Signature : S(resolve,P(d682),P(d683))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/interfaces.d.ts@7158
     */
    public native UnionOfObservableOfTAndPromiseOfTAndT<T> resolve(ActivatedRouteSnapshot route, RouterStateSnapshot state);
}
