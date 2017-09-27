package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler".StyleCompiler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts:742
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="StyleCompiler")
public class StyleCompiler
{

    /*
        Constructors
    */
    public StyleCompiler(UrlResolver _urlResolver){
    }

    /*
        Properties
    */

    public Object _shadowCss;

    @JsProperty( name = "_shadowCss")
    public native Object get_shadowCss();

    @JsProperty( name = "_shadowCss")
    public native void set_shadowCss( Object value );

    public Object _urlResolver;

    @JsProperty( name = "_urlResolver")
    public native Object get_urlResolver();

    @JsProperty( name = "_urlResolver")
    public native void set_urlResolver( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_compileStyles,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_compileStyles,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts@1175
     */
    public native Object _compileStyles(Object outputCtx, Object comp, Object stylesheet, Object isComponentStylesheet);
    /** 
      * Std Signature : S(_shimIfNeeded,3,,P(d3),P(d3))
      * TE Signature : S(_shimIfNeeded,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts@1255
     */
    public native Object _shimIfNeeded(Object style, Object shim);
    /** 
      * Std Signature : S(compileComponent,1232,,P(d577),P(d496))
      * TE Signature : S(compileComponent,P(d577),P(d496))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts@878
     */
    public native CompiledStylesheet compileComponent(OutputContext outputCtx, CompileDirectiveMetadata comp);
    /** 
      * Std Signature : S(compileStyles,1232,,P(d577),P(d496),P(d501))
      * TE Signature : S(compileStyles,P(d577),P(d496),P(d501))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts@978
     */
    public native CompiledStylesheet compileStyles(OutputContext outputCtx, CompileDirectiveMetadata comp, CompileStylesheetMetadata stylesheet);
    /** 
      * Std Signature : S(needsStyleShim,27,,P(d496))
      * TE Signature : S(needsStyleShim,P(d496))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts@1114
     */
    public native Boolean needsStyleShim(CompileDirectiveMetadata comp);
}
