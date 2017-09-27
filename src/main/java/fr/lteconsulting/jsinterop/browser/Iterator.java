package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: Iterator
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:217724
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Iterator")
public class Iterator<T>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(next,364<T->,,)
      * TE Signature : S(next,)
      * 
     */
    public native IteratorResult<T> next();
    /** 
      * Std Signature : S(next,364<T->,,P(d3))
      * TE Signature : S(next,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@217754
     */
    public native IteratorResult<T> next(Object value /* optional */);
    /** 
      * Std Signature : S(return,364<T->,,)
      * TE Signature : S(return,)
      * 
     */
    @JsMethod(name = "return")
    public native IteratorResult<T> return_();
    /** 
      * Std Signature : S(return,364<T->,,P(d3))
      * TE Signature : S(return,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@217796
     */
    @JsMethod(name = "return")
    public native IteratorResult<T> return_(Object value /* optional */);
    /** 
      * Std Signature : S(throw,364<T->,,)
      * TE Signature : S(throw,)
      * 
     */
    @JsMethod(name = "throw")
    public native IteratorResult<T> throw_();
    /** 
      * Std Signature : S(throw,364<T->,,P(d3))
      * TE Signature : S(throw,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@217841
     */
    @JsMethod(name = "throw")
    public native IteratorResult<T> throw_(Object e /* optional */);
}
