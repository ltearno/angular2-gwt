package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/system_js_ng_module_factory_loader".SystemJsNgModuleLoader
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/system_js_ng_module_factory_loader.d.ts:585
  * 1 constructors
  * NgModuleFactoryLoader that uses SystemJS to load NgModuleFactory
 */
@JsType(isNative=true, namespace="ng.core", name="SystemJsNgModuleLoader")
public class SystemJsNgModuleLoader extends NgModuleFactoryLoader
{

    /*
        Constructors
    */
    public SystemJsNgModuleLoader(Compiler _compiler, SystemJsNgModuleLoaderConfig config){
    }

    /*
        Properties
    */

    public Object _compiler;

    @JsProperty( name = "_compiler")
    public native Object get_compiler();

    @JsProperty( name = "_compiler")
    public native void set_compiler( Object value );

    public Object _config;

    @JsProperty( name = "_config")
    public native Object get_config();

    @JsProperty( name = "_config")
    public native void set_config( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(loadAndCompile,3,,P(d3))
      * TE Signature : S(loadAndCompile,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/system_js_ng_module_factory_loader.d.ts@938
     */
    public native Object loadAndCompile(Object path);
    /** 
      * Std Signature : S(loadFactory,3,,P(d3))
      * TE Signature : S(loadFactory,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/system_js_ng_module_factory_loader.d.ts@972
     */
    public native Object loadFactory(Object path);
}
