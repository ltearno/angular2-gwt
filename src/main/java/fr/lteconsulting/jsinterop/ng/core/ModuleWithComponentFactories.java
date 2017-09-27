package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler".ModuleWithComponentFactories
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/compiler.d.ts:495
  * 1 constructors
  * Combination of NgModuleFactory and ComponentFactorys.
 */
@JsType(isNative=true, namespace="ng.core", name="ModuleWithComponentFactories")
public class ModuleWithComponentFactories<T>
{

    /*
        Constructors
    */
    public ModuleWithComponentFactories(NgModuleFactory<T> ngModuleFactory, Array<ComponentFactory<Object>> componentFactories){
    }

    /*
        Properties
    */

    public Array<ComponentFactory<Object>> componentFactories;

    @JsProperty( name = "componentFactories")
    public native Array<ComponentFactory<Object>> getComponentFactories();

    @JsProperty( name = "componentFactories")
    public native void setComponentFactories( Array<ComponentFactory<Object>> value );

    public NgModuleFactory<T> ngModuleFactory;

    @JsProperty( name = "ngModuleFactory")
    public native NgModuleFactory<T> getNgModuleFactory();

    @JsProperty( name = "ngModuleFactory")
    public native void setNgModuleFactory( NgModuleFactory<T> value );
}
