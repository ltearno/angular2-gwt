package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_compiler".NgModuleCompiler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_compiler.d.ts:306
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="NgModuleCompiler")
public class NgModuleCompiler
{

    /*
        Constructors
    */
    public NgModuleCompiler(CompileReflector reflector){
    }

    /*
        Properties
    */

    public Object reflector;

    @JsProperty( name = "reflector")
    public native Object getReflector();

    @JsProperty( name = "reflector")
    public native void setReflector( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_createNgModuleFactory,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_createNgModuleFactory,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_compiler.d.ts@624
     */
    public native Object _createNgModuleFactory(Object ctx, Object reference, Object value);
    /** 
      * Std Signature : S(compile,1230,,P(d577),P(d502),P(d7<498>))
      * TE Signature : S(compile,P(d577),P(d502),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_compiler.d.ts@420
     */
    public native NgModuleCompileResult compile(OutputContext ctx, CompileNgModuleMetadata ngModuleMeta, Array<CompileProviderMetadata> extraProviders);
    /** 
      * Std Signature : S(createStub,429,,P(d577),P(d3))
      * TE Signature : S(createStub,P(d577),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ng_module_compiler.d.ts@558
     */
    public native void createStub(OutputContext ctx, Object ngModuleReference);
}
