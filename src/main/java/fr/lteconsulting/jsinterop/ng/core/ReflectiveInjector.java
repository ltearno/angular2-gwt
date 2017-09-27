package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector".ReflectiveInjector
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts:348

  * A ReflectiveDependency injection container used for instantiating objects and resolving
  * dependencies.
  * 
  * An `Injector` is a replacement for a `new` operator, which can automatically resolve the
  * constructor dependencies.
  * 
  * In typical use, application code asks for the dependencies in the constructor and they are
  * resolved by the `Injector`.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/jzjec0?p=preview))
  * 
  * The following example creates an `Injector` configured to create `Engine` and `Car`.
  * 
  * ```typescript
 */
@JsType(isNative=true, namespace="ng.core", name="ReflectiveInjector")
public class ReflectiveInjector implements Injector
{

    /*
        Static methods
    */
    /** 
      * Turns an array of provider definitions into an array of resolved providers.
      * 
      * A resolution is a process of flattening multiple nested arrays and converting individual
      * providers into an array of {@link ResolvedReflectiveProvider}s.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/AiXTHi?p=preview))
      * 
      * ```typescript
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts:2557
     */
    @JsMethod(namespace="ng.core.ReflectiveInjector", name = "resolve")
    public static native Array<ResolvedReflectiveProvider> resolve(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers);
    /** 
      * Resolves an array of providers and creates an injector from those providers.
      * 
      * The passed-in providers can be an array of `Type`, {@link Provider},
      * or a recursive array of more providers.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/ePOccA?p=preview))
      * 
      * ```typescript
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts:3524
     */
    @JsMethod(namespace="ng.core.ReflectiveInjector", name = "resolveAndCreate")
    public static native ReflectiveInjector resolveAndCreate(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers, Injector parent /* optional */);
    /** 
      * Creates an injector from previously resolved providers.
      * 
      * This API is the recommended way to construct injectors in performance-sensitive parts.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/KrSMci?p=preview))
      * 
      * ```typescript
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts:4296
     */
    @JsMethod(namespace="ng.core.ReflectiveInjector", name = "fromResolvedProviders")
    public static native ReflectiveInjector fromResolvedProviders(Array<ResolvedReflectiveProvider> providers, Injector parent /* optional */);

    /*
        Properties
    */

    /** 
      * Parent of this injector.
      * 
      * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
      * -->
      * 
      * ### Example ([live demo](http://plnkr.co/edit/eosMGo?p=preview))
      * 
      * ```typescript
      * var parent = ReflectiveInjector.resolveAndCreate([]);
      * var child = parent.resolveAndCreateChild([]);
      * expect(child.parent).toBe(parent);
      * ```
     */
    public Injector parent;

    @JsProperty( name = "parent")
    public native Injector getParent();

    @JsProperty( name = "parent")
    public native void setParent( Injector value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createChildFromResolved,624,,P(d7<341>))
      * TE Signature : S(createChildFromResolved,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@7177
      * Creates a child injector from previously resolved providers.
      * 
      * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
      * -->
      * 
      * This API is the recommended way to construct injectors in performance-sensitive parts.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/VhyfjN?p=preview))
      * 
      * ```typescript
      * class ParentProvider {}
      * class ChildProvider {}
      * 
      * var parentProviders = ReflectiveInjector.resolve([ParentProvider]);
      * var childProviders = ReflectiveInjector.resolve([ChildProvider]);
      * 
      * var parent = ReflectiveInjector.fromResolvedProviders(parentProviders);
      * var child = parent.createChildFromResolved(childProviders);
      * 
      * expect(child.get(ParentProvider) instanceof ParentProvider).toBe(true);
      * expect(child.get(ChildProvider) instanceof ChildProvider).toBe(true);
      * expect(child.get(ParentProvider)).toBe(parent.get(ParentProvider));
      * ```
     */
    public native ReflectiveInjector createChildFromResolved(Array<ResolvedReflectiveProvider> providers);
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
      * Std Signature : S(instantiateResolved,3,,P(d341))
      * TE Signature : S(instantiateResolved,P(d341))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@8809
      * Instantiates an object using a resolved provider in the context of the injector.
      * 
      * The created object does not get cached by the injector.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/ptCImQ?p=preview))
      * 
      * ```typescript
     */
    public native Object instantiateResolved(ResolvedReflectiveProvider provider);
    /** 
      * Std Signature : S(resolveAndCreateChild,624,,P(d7<U(-2<3>,336,337,338,339,340)>))
      * TE Signature : S(resolveAndCreateChild,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@6070
      * Resolves an array of providers and creates a child injector from those providers.
      * 
      * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
      * -->
      * 
      * The passed-in providers can be an array of `Type`, {@link Provider},
      * or a recursive array of more providers.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/opB3T4?p=preview))
      * 
      * ```typescript
      * class ParentProvider {}
      * class ChildProvider {}
      * 
      * var parent = ReflectiveInjector.resolveAndCreate([ParentProvider]);
      * var child = parent.resolveAndCreateChild([ChildProvider]);
      * 
      * expect(child.get(ParentProvider) instanceof ParentProvider).toBe(true);
      * expect(child.get(ChildProvider) instanceof ChildProvider).toBe(true);
      * expect(child.get(ParentProvider)).toBe(parent.get(ParentProvider));
      * ```
      * 
      * This function is slower than the corresponding `createChildFromResolved`
      * because it needs to resolve the passed-in providers first.
      * See {@link ReflectiveInjector#resolve} and {@link ReflectiveInjector#createChildFromResolved}.
     */
    public native ReflectiveInjector resolveAndCreateChild(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers);
    /** 
      * Std Signature : S(resolveAndInstantiate,3,,P(dU(-7<3>,336,337,338,339,340)))
      * TE Signature : S(resolveAndInstantiate,P(dU(-7,336,337,338,339,340)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_injector.d.ts@7977
      * Resolves a provider and instantiates an object in the context of the injector.
      * 
      * The created object does not get cached by the injector.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/yvVXoB?p=preview))
      * 
      * ```typescript
     */
    public native Object resolveAndInstantiate(Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider provider);
}
