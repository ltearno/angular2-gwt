package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_compiler".NgModuleCompileResult
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_compiler.d.ts:182
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="NgModuleCompileResult")
public class NgModuleCompileResult
{

    /*
        Constructors
    */
    public NgModuleCompileResult(String ngModuleFactoryVar){
    }

    /*
        Properties
    */

    public String ngModuleFactoryVar;

    @JsProperty( name = "ngModuleFactoryVar")
    public native String getNgModuleFactoryVar();

    @JsProperty( name = "ngModuleFactoryVar")
    public native void setNgModuleFactoryVar( String value );
}
