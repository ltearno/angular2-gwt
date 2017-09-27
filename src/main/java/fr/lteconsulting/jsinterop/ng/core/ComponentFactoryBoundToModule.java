package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver".ComponentFactoryBoundToModule
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory_resolver.d.ts:1125
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="ComponentFactoryBoundToModule")
public class ComponentFactoryBoundToModule<C> extends ComponentFactory<C>
{

    /*
        Constructors
    */
    public ComponentFactoryBoundToModule(ComponentFactory<C> factory, NgModuleRef<Object> ngModule){
    }

    /*
        Properties
    */

    public Object factory;

    @JsProperty( name = "factory")
    public native Object getFactory();

    @JsProperty( name = "factory")
    public native void setFactory( Object value );

    public Object ngModule;

    @JsProperty( name = "ngModule")
    public native Object getNgModule();

    @JsProperty( name = "ngModule")
    public native void setNgModule( Object value );
}
