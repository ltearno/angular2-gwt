package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: PromiseLike
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:61559
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PromiseLike")
public class PromiseLike<T>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(then,25<TResult->,TResult-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,25<TResult->>))
      * TE Signature : S(then,P(dF--S(?,P(d3))------)))
      * 
     */
    public native <TResult> PromiseLike<TResult> then(Function1<T, PromiseLike<TResult>> onfulfilled);
    /** 
      * Std Signature : S(then,25<TResult->,TResult-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,25<TResult->>),P(dFP1-,R--S(?,4,,P(d3))------)<3,25<TResult->>))
      * TE Signature : S(then,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@61926
      * Attaches callbacks for the resolution and/or rejection of the Promise.
     */
    public native <TResult> PromiseLike<TResult> then(Function1<T, PromiseLike<TResult>> onfulfilled, Function1<Object, PromiseLike<TResult>> onrejected /* optional */);
}
