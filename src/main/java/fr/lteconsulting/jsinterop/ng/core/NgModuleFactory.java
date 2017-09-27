package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory".NgModuleFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory.d.ts:1456
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="NgModuleFactory")
public class NgModuleFactory<T>
{

    /*
        Properties
    */

    public Type<T> moduleType;

    @JsProperty( name = "moduleType")
    public native Type<T> getModuleType();

    @JsProperty( name = "moduleType")
    public native void setModuleType( Type<T> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(create,371<T->,,P(d335))
      * TE Signature : S(create,P(d335))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/ng_module_factory.d.ts@1580
     */
    public native NgModuleRef<T> create(Injector parentInjector);
}
