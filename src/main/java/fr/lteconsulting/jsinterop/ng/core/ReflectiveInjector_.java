package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector".ReflectiveInjector_
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts:8939
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="ReflectiveInjector_")
public class ReflectiveInjector_ extends ReflectiveInjector
{

    /*
        Constructors
    */
    public ReflectiveInjector_(Array<ResolvedReflectiveProvider> _providers, Injector _parent){
    }

    /*
        Properties
    */

    public String displayName;

    @JsProperty( name = "displayName")
    public native String getDisplayName();

    @JsProperty( name = "displayName")
    public native void setDisplayName( String value );

    public Array<Number> keyIds;

    @JsProperty( name = "keyIds")
    public native Array<Number> getKeyIds();

    @JsProperty( name = "keyIds")
    public native void setKeyIds( Array<Number> value );

    public Array<Object> objs;

    @JsProperty( name = "objs")
    public native Array<Object> getObjs();

    @JsProperty( name = "objs")
    public native void setObjs( Array<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_getByKey,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getByKey,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@9788
     */
    public native Object _getByKey(Object key, Object visibility, Object notFoundValue);
    /** 
      * Std Signature : S(_getByReflectiveDependency,3,,P(d3))
      * TE Signature : S(_getByReflectiveDependency,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@9743
     */
    public native Object _getByReflectiveDependency(Object dep);
    /** 
      * Std Signature : S(_getMaxNumberOfObjects,3,,)
      * TE Signature : S(_getMaxNumberOfObjects,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@9598
     */
    public native Object _getMaxNumberOfObjects();
    /** 
      * Std Signature : S(_getObjByKeyId,3,,P(d3))
      * TE Signature : S(_getObjByKeyId,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@9843
     */
    public native Object _getObjByKeyId(Object keyId);
    /** 
      * Std Signature : S(_instantiate,3,,P(d3),P(d3))
      * TE Signature : S(_instantiate,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@9680
     */
    public native Object _instantiate(Object provider, Object ResolvedReflectiveFactory);
    /** 
      * Std Signature : S(_instantiateProvider,3,,P(d3))
      * TE Signature : S(_instantiateProvider,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@9636
     */
    public native Object _instantiateProvider(Object provider);
    /** 
      * Std Signature : S(get,3,,P(d3))
      * TE Signature : S(get,P(d3))
      * 
     */
    public native Object get(Object token);
    /** 
      * Std Signature : S(get,3,,P(d3),P(d3))
      * TE Signature : S(get,P(d3),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object get(Object token, Object notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(d329<T->))
      * TE Signature : S(get,P(d329))
      * 
     */
    public native <T> T get(Type<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(d329<T->),P(dT-))
      * TE Signature : S(get,P(d329),P(d3))
      * 
     */
    public native <T> T get(Type<T> token, T notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(d331<T->))
      * TE Signature : S(get,P(d331))
      * 
     */
    public native <T> T get(InjectionToken<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(d331<T->),P(dT-))
      * TE Signature : S(get,P(d331),P(d3))
      * 
     */
    public native <T> T get(InjectionToken<T> token, T notFoundValue /* optional */);
    /** 
      * Std Signature : S(get,T-,T-,P(dU(T-331<T->,329<5>)))
      * TE Signature : S(get,P(dU(-331,329)))
      * 
     */
    public native <T> T get(UnionOfInjectionTokenOfTAndTypeOfT<T> token);
    /** 
      * Std Signature : S(get,T-,T-,P(dU(T-331<T->,329<5>)),P(dT-))
      * TE Signature : S(get,P(dU(-331,329)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T> T get(UnionOfInjectionTokenOfTAndTypeOfT<T> token, T notFoundValue /* optional */);
    /** 
      * Std Signature : S(getProviderAtIndex,341,,P(d2))
      * TE Signature : S(getProviderAtIndex,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@9531
     */
    public native ResolvedReflectiveProvider getProviderAtIndex(Number index);
}
