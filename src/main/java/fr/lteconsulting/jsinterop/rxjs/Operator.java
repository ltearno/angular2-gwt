package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Operator".Operator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Operator.d.ts:90
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="Operator")
public class Operator<T, R>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(call,U(-348,205,349),,P(d354<R->),P(d3))
      * TE Signature : S(call,P(d354),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Operator.d.ts@129
     */
    public native TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid call(Subscriber<R> subscriber, Object source);
}
