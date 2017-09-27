package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver".ComponentFactoryResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver.d.ts:538
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ComponentFactoryResolver")
public class ComponentFactoryResolver
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.core.ComponentFactoryResolver", name="NULL")
    public static ComponentFactoryResolver NULL;

    /*
        Methods
    */
    /** 
      * Std Signature : S(resolveComponentFactory,373<T->,T-,P(d329<T->))
      * TE Signature : S(resolveComponentFactory,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver.d.ts@662
     */
    public native <T> ComponentFactory<T> resolveComponentFactory(Type<T> component);
}
