package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Promise;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler".Compiler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts:826

  * Low-level service for running the angular compiler during runtime
  * to create {@link ComponentFactory}s, which
  * can later be used to create and render a Component instance.
  * 
  * Each `@NgModule` provides an own `Compiler` to its injector,
  * that will use the directives/pipes of the ng module for compilation
  * of components.
 */
@JsType(isNative=true, namespace="ng.core", name="Compiler")
public class Compiler
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearCache,429,,)
      * TE Signature : S(clearCache,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@2506
      * Clears all caches.
     */
    public native void clearCache();
    /** 
      * Std Signature : S(clearCacheFor,429,,P(d329<3>))
      * TE Signature : S(clearCacheFor,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@2604
      * Clears the cache for the given component/ngModule.
     */
    public native void clearCacheFor(Type<Object> type);
    /** 
      * Std Signature : S(compileModuleAndAllComponentsAsync,88<1203<T->>,T-,P(d329<T->))
      * TE Signature : S(compileModuleAndAllComponentsAsync,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@1928
      * Same as {@link #compileModuleAsync} but also creates ComponentFactories for all components.
     */
    public native <T> Promise<ModuleWithComponentFactories<T>> compileModuleAndAllComponentsAsync(Type<T> moduleType);
    /** 
      * Std Signature : S(compileModuleAndAllComponentsSync,1203<T->,T-,P(d329<T->))
      * TE Signature : S(compileModuleAndAllComponentsSync,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@1717
      * Same as {@link #compileModuleSync} but also creates ComponentFactories for all components.
     */
    public native <T> ModuleWithComponentFactories<T> compileModuleAndAllComponentsSync(Type<T> moduleType);
    /** 
      * Std Signature : S(compileModuleAsync,88<376<T->>,T-,P(d329<T->))
      * TE Signature : S(compileModuleAsync,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@1526
      * Compiles the given NgModule and all of its components
     */
    public native <T> Promise<NgModuleFactory<T>> compileModuleAsync(Type<T> moduleType);
    /** 
      * Std Signature : S(compileModuleSync,376<T->,T-,P(d329<T->))
      * TE Signature : S(compileModuleSync,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@1382
      * Compiles the given NgModule and all of its components. All templates of the components listed
      * in `entryComponents` have to be inlined.
     */
    public native <T> NgModuleFactory<T> compileModuleSync(Type<T> moduleType);
    /** 
      * Std Signature : S(getNgContentSelectors,7<1>,,P(d329<3>))
      * TE Signature : S(getNgContentSelectors,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts@2405
      * Exposes the CSS-style selectors that have been used in `ngContent` directives within
      * the template of the given component.
      * This is used by the `upgrade` library to compile the appropriate transclude content
      * in the AngularJS wrapper component.
     */
    public native Array<String> getNgContentSelectors(Type<Object> component);
}
