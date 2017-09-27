package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider".ResolvedReflectiveProvider
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider.d.ts:547

  * An internal resolved representation of a {@link Provider} used by the {@link Injector}.
  * 
  * It is usually created automatically by `Injector.resolveAndCreate`.
  * 
  * It can be created manually, as follows:
  * 
  * ### Example ([live demo](http://plnkr.co/edit/RfEnhh8kUEI0G3qsnIeT?p%3Dpreview&p=preview))
  * 
  * ```typescript
  * var resolvedProviders = Injector.resolve([{ provide: 'message', useValue: 'Hello' }]);
  * var injector = Injector.fromResolvedProviders(resolvedProviders);
  * 
  * expect(injector.get('message')).toEqual('Hello');
  * ```
 */
@JsType(isNative=true, namespace="ng.core", name="ResolvedReflectiveProvider")
public class ResolvedReflectiveProvider
{

    /*
        Properties
    */

    /** 
      * A key, usually a `Type<any>`.
     */
    public ReflectiveKey key;

    @JsProperty( name = "key")
    public native ReflectiveKey getKey();

    @JsProperty( name = "key")
    public native void setKey( ReflectiveKey value );

    /** 
      * Indicates if the provider is a multi-provider or a regular provider.
     */
    public Boolean multiProvider;

    @JsProperty( name = "multiProvider")
    public native Boolean getMultiProvider();

    @JsProperty( name = "multiProvider")
    public native void setMultiProvider( Boolean value );

    /** 
      * Factory function which can return an instance of an object represented by a key.
     */
    public Array<ResolvedReflectiveFactory> resolvedFactories;

    @JsProperty( name = "resolvedFactories")
    public native Array<ResolvedReflectiveFactory> getResolvedFactories();

    @JsProperty( name = "resolvedFactories")
    public native void setResolvedFactories( Array<ResolvedReflectiveFactory> value );
}
