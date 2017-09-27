package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".TemplateAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:554

  * An Abstract Syntax Tree node representing part of a parsed Angular template.
 */
@JsType(isNative=true, namespace="ng.compiler", name="TemplateAst")
public class TemplateAst
{

    /*
        Properties
    */

    /** 
      * The source span from which this node was parsed.
     */
    public ParseSourceSpan sourceSpan;

    @JsProperty( name = "sourceSpan")
    public native ParseSourceSpan getSourceSpan();

    @JsProperty( name = "sourceSpan")
    public native void setSourceSpan( ParseSourceSpan value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(visit,3,,P(d528),P(d3))
      * TE Signature : S(visit,P(d528),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts@849
      * Visit this node and possibly transform it.
     */
    public native Object visit(TemplateAstVisitor visitor, Object context);
}
