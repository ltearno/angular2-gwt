package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver".CodegenComponentFactoryResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver.d.ts:741
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="CodegenComponentFactoryResolver")
public class CodegenComponentFactoryResolver extends ComponentFactoryResolver
{

    /*
        Constructors
    */
    public CodegenComponentFactoryResolver(Array<ComponentFactory<Object>> factories, ComponentFactoryResolver _parent, NgModuleRef<Object> _ngModule){
    }

    /*
        Properties
    */

    public Object _factories;

    @JsProperty( name = "_factories")
    public native Object get_factories();

    @JsProperty( name = "_factories")
    public native void set_factories( Object value );

    public Object _ngModule;

    @JsProperty( name = "_ngModule")
    public native Object get_ngModule();

    @JsProperty( name = "_ngModule")
    public native void set_ngModule( Object value );

    public Object _parent;

    @JsProperty( name = "_parent")
    public native Object get_parent();

    @JsProperty( name = "_parent")
    public native void set_parent( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(resolveComponentFactory,373<T->,T-,P(d3))
      * TE Signature : S(resolveComponentFactory,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver.d.ts@1022
     */
    public native <T> ComponentFactory<T> resolveComponentFactory(Object component);
}
