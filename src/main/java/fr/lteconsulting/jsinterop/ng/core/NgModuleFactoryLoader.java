package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Promise;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory_loader".NgModuleFactoryLoader
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory_loader.d.ts:257

  * Used to load ng module factories.
 */
@JsType(isNative=true, namespace="ng.core", name="NgModuleFactoryLoader")
public class NgModuleFactoryLoader
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(load,88<376<3>>,,P(d1))
      * TE Signature : S(load,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory_loader.d.ts@372
     */
    public native Promise<NgModuleFactory<Object>> load(String path);
}
