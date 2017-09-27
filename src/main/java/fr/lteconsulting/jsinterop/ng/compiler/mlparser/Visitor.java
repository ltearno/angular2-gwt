package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".Visitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:2387
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Visitor")
public class Visitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(visit,3,,P(d547),P(d3))
      * TE Signature : S(visit,P(d547),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@2419
     */
    public native Object visit(Node node, Object context);
    /** 
      * Std Signature : S(visitAttribute,3,,P(d550),P(d3))
      * TE Signature : S(visitAttribute,P(d550),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@2517
     */
    public native Object visitAttribute(Attribute attribute, Object context);
    /** 
      * Std Signature : S(visitComment,3,,P(d552),P(d3))
      * TE Signature : S(visitComment,P(d552),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@2624
     */
    public native Object visitComment(Comment comment, Object context);
    /** 
      * Std Signature : S(visitElement,3,,P(d549),P(d3))
      * TE Signature : S(visitElement,P(d549),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@2462
     */
    public native Object visitElement(Element element, Object context);
    /** 
      * Std Signature : S(visitExpansion,3,,P(d553),P(d3))
      * TE Signature : S(visitExpansion,P(d553),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@2679
     */
    public native Object visitExpansion(Expansion expansion, Object context);
    /** 
      * Std Signature : S(visitExpansionCase,3,,P(d554),P(d3))
      * TE Signature : S(visitExpansionCase,P(d554),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@2740
     */
    public native Object visitExpansionCase(ExpansionCase expansionCase, Object context);
    /** 
      * Std Signature : S(visitText,3,,P(d551),P(d3))
      * TE Signature : S(visitText,P(d551),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@2578
     */
    public native Object visitText(Text text, Object context);
}
