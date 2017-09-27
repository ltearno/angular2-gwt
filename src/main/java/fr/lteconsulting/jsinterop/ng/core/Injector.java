package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injector".Injector
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injector.d.ts:335
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Injector
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(get,3,,P(d3))
      * TE Signature : S(get,P(d3))
      * 
     */
    Object get(Object token);
    /** 
      * Std Signature : S(get,3,,P(d3),P(d3))
      * TE Signature : S(get,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injector.d.ts@1377
      * Retrieves an instance from the injector based on the provided token.
      * If not found:
      * - Throws an error if no `notFoundValue` that is not equal to
      * Injector.THROW_IF_NOT_FOUND is given
      * - Returns the `notFoundValue` otherwise
      * VERSION 1
     */
    Object get(Object token, Object notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(d329<T->))
      * TE Signature : S(get,P(d329))
      * 
     */
    <T> T get(Type<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(d329<T->),P(dT-))
      * TE Signature : S(get,P(d329),P(d3))
      * 
     */
    <T> T get(Type<T> token, T notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(d331<T->))
      * TE Signature : S(get,P(d331))
      * 
     */
    <T> T get(InjectionToken<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(d331<T->),P(dT-))
      * TE Signature : S(get,P(d331),P(d3))
      * 
     */
    <T> T get(InjectionToken<T> token, T notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(dU(T-331<T->,329<5>)))
      * TE Signature : S(get,P(dU(-331,329)))
      * 
     */
    <T> T get(UnionOfInjectionTokenOfTAndTypeOfT<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(dU(T-331<T->,329<5>)),P(dT-))
      * TE Signature : S(get,P(dU(-331,329)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injector.d.ts@1189
      * Retrieves an instance from the injector based on the provided token.
      * If not found:
      * - Throws an error if no `notFoundValue` that is not equal to
      * Injector.THROW_IF_NOT_FOUND is given
      * - Returns the `notFoundValue` otherwise
     */
    <T> T get(UnionOfInjectionTokenOfTAndTypeOfT<T> token, T notFoundValue /* optional */);
}
