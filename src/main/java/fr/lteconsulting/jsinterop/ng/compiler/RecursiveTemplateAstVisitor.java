package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.AnonymousType1245;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".RecursiveTemplateAstVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:10430
  * 1 constructors
  * Base class that can be used to build a visitor that visits each node
  * in an template ast recursively.
 */
@JsType(isNative=true, namespace="ng.compiler", name="RecursiveTemplateAstVisitor")
public class RecursiveTemplateAstVisitor implements NullTemplateVisitor, TemplateAstVisitor
{

    /*
        Constructors
    */
    public RecursiveTemplateAstVisitor(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(visit,3,,P(d527),P(d3))
      * TE Signature : S(visit,P(d527),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visit(TemplateAst ast, Object context);
    /** 
      * Std Signature : S(visitAttr,3,,P(d539),P(d3))
      * TE Signature : S(visitAttr,P(d539),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitAttr(AttrAst ast, Object context);
    /** 
      * Std Signature : S(visitBoundText,3,,P(d540),P(d3))
      * TE Signature : S(visitBoundText,P(d540),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitBoundText(BoundTextAst ast, Object context);
    /** 
      * Std Signature : S(visitChildren,3,T-,P(d3),P(dFP1--S(?,429,,P(d3))------)<F--S(?,4,V-,P(d7<6>))------)>))
      * TE Signature : S(visitChildren,P(d3),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts@10862
     */
    public native <T> Object visitChildren(Object context, Action1<AnonymousType1245> cb);
    /** 
      * Std Signature : S(visitDirective,3,,P(d542),P(d3))
      * TE Signature : S(visitDirective,P(d542),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitDirective(DirectiveAst ast, Object context);
    /** 
      * Std Signature : S(visitDirectiveProperty,3,,P(d543),P(d3))
      * TE Signature : S(visitDirectiveProperty,P(d543),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitDirectiveProperty(BoundDirectivePropertyAst ast, Object context);
    /** 
      * Std Signature : S(visitElement,3,,P(d534),P(d3))
      * TE Signature : S(visitElement,P(d534),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitElement(ElementAst ast, Object context);
    /** 
      * Std Signature : S(visitElementProperty,3,,P(d538),P(d3))
      * TE Signature : S(visitElementProperty,P(d538),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitElementProperty(BoundElementPropertyAst ast, Object context);
    /** 
      * Std Signature : S(visitEmbeddedTemplate,3,,P(d533),P(d3))
      * TE Signature : S(visitEmbeddedTemplate,P(d533),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitEmbeddedTemplate(EmbeddedTemplateAst ast, Object context);
    /** 
      * Std Signature : S(visitEvent,3,,P(d537),P(d3))
      * TE Signature : S(visitEvent,P(d537),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitEvent(BoundEventAst ast, Object context);
    /** 
      * Std Signature : S(visitNgContent,3,,P(d529),P(d3))
      * TE Signature : S(visitNgContent,P(d529),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitNgContent(NgContentAst ast, Object context);
    /** 
      * Std Signature : S(visitReference,3,,P(d535),P(d3))
      * TE Signature : S(visitReference,P(d535),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitReference(ReferenceAst ast, Object context);
    /** 
      * Std Signature : S(visitText,3,,P(d541),P(d3))
      * TE Signature : S(visitText,P(d541),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitText(TextAst ast, Object context);
    /** 
      * Std Signature : S(visitVariable,3,,P(d536),P(d3))
      * TE Signature : S(visitVariable,P(d536),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitVariable(VariableAst ast, Object context);
}
