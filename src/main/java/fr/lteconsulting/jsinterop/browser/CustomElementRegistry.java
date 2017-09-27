package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: CustomElementRegistry
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:744223
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CustomElementRegistry")
public class CustomElementRegistry
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(define,289,,P(d1),P(d205))
      * TE Signature : S(define,P(d1),P(d205))
      * 
     */
    public native void define(String name, Function constructor);
    /** 
      * Std Signature : S(define,289,,P(d1),P(d205),P(d206))
      * TE Signature : S(define,P(d1),P(d205),P(d206))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@744263
     */
    public native void define(String name, Function constructor, ElementDefinitionOptions options /* optional */);
    /** 
      * Std Signature : S(get,3,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@744354
     */
    public native Object get(String name);
    /** 
      * Std Signature : S(whenDefined,25<369>,,P(d1))
      * TE Signature : S(whenDefined,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@744382
     */
    public native PromiseLike<Void> whenDefined(String name);
}
