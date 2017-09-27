package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/GenerateObservable".GenerateOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/GenerateObservable.d.ts:922
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="GenerateOptions")
public class GenerateOptions<T, S> extends GenerateBaseOptions<S>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(resultSelector,T-,,P(dS-))
      * TE Signature : S(resultSelector,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/GenerateObservable.d.ts@334
      * Result selection function that accepts state and returns a value to emit.
     */
    public native T resultSelector(S state);
}
