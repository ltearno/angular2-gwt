package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.output.Expression;
import fr.lteconsulting.jsinterop.ng.compiler.schema.ElementSchemaRegistry;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/view_compiler/view_compiler".ViewCompiler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/view_compiler/view_compiler.d.ts:568
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ViewCompiler")
public class ViewCompiler
{

    /*
        Constructors
    */
    public ViewCompiler(CompilerConfig _config, CompileReflector _reflector, ElementSchemaRegistry _schemaRegistry){
    }

    /*
        Properties
    */

    public Object _config;

    @JsProperty( name = "_config")
    public native Object get_config();

    @JsProperty( name = "_config")
    public native void set_config( Object value );

    public Object _reflector;

    @JsProperty( name = "_reflector")
    public native Object get_reflector();

    @JsProperty( name = "_reflector")
    public native void set_reflector( Object value );

    public Object _schemaRegistry;

    @JsProperty( name = "_schemaRegistry")
    public native Object get_schemaRegistry();

    @JsProperty( name = "_schemaRegistry")
    public native void set_schemaRegistry( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(compileComponent,1233,,P(d577),P(d496),P(d7<527>),P(d449),P(d7<1221>))
      * TE Signature : S(compileComponent,P(d577),P(d496),P(d7),P(d449),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/view_compiler/view_compiler.d.ts@795
     */
    public native ViewCompileResult compileComponent(OutputContext outputCtx, CompileDirectiveMetadata component, Array<TemplateAst> template, Expression styles, Array<CompilePipeSummary> usedPipes);
}
