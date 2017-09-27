package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.core.NgModule;
import fr.lteconsulting.jsinterop.ng.core.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_resolver".NgModuleResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_resolver.d.ts:306
  * 1 constructors
  * Resolves types to {@link NgModule}.
 */
@JsType(isNative=true, namespace="ng.compiler", name="NgModuleResolver")
public class NgModuleResolver
{

    /*
        Constructors
    */
    public NgModuleResolver(CompileReflector _reflector){
    }

    /*
        Properties
    */

    public Object _reflector;

    @JsProperty( name = "_reflector")
    public native Object get_reflector();

    @JsProperty( name = "_reflector")
    public native void set_reflector( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(isNgModule,27,,P(d3))
      * TE Signature : S(isNgModule,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_resolver.d.ts@469
     */
    public native Boolean isNgModule(Object type);
    /** 
      * Std Signature : S(resolve,347,,P(d329<3>))
      * TE Signature : S(resolve,P(d329))
      * 
     */
    public native NgModule resolve(Type<Object> type);
    /** 
      * Std Signature : S(resolve,347,,P(d329<3>),P(d27))
      * TE Signature : S(resolve,P(d329),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_resolver.d.ts@505
     */
    public native NgModule resolve(Type<Object> type, Boolean throwIfNotFound /* optional */);
}
