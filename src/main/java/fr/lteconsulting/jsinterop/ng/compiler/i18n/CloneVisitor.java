package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast".CloneVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:3393
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="CloneVisitor")
public class CloneVisitor implements Visitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(visitContainer,3,,P(d597))
      * TE Signature : S(visitContainer,P(d597))
      * 
     */
    public native Object visitContainer(Container container);
    /** 
      * Std Signature : S(visitContainer,3,,P(d597),P(d3))
      * TE Signature : S(visitContainer,P(d597),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitContainer(Container container, Object context /* optional */);
    /** 
      * Std Signature : S(visitIcu,3,,P(d599))
      * TE Signature : S(visitIcu,P(d599))
      * 
     */
    public native Object visitIcu(Icu icu);
    /** 
      * Std Signature : S(visitIcu,3,,P(d599),P(d3))
      * TE Signature : S(visitIcu,P(d599),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitIcu(Icu icu, Object context /* optional */);
    /** 
      * Std Signature : S(visitIcuPlaceholder,3,,P(d602))
      * TE Signature : S(visitIcuPlaceholder,P(d602))
      * 
     */
    public native Object visitIcuPlaceholder(IcuPlaceholder ph);
    /** 
      * Std Signature : S(visitIcuPlaceholder,3,,P(d602),P(d3))
      * TE Signature : S(visitIcuPlaceholder,P(d602),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitIcuPlaceholder(IcuPlaceholder ph, Object context /* optional */);
    /** 
      * Std Signature : S(visitPlaceholder,3,,P(d601))
      * TE Signature : S(visitPlaceholder,P(d601))
      * 
     */
    public native Object visitPlaceholder(Placeholder ph);
    /** 
      * Std Signature : S(visitPlaceholder,3,,P(d601),P(d3))
      * TE Signature : S(visitPlaceholder,P(d601),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitPlaceholder(Placeholder ph, Object context /* optional */);
    /** 
      * Std Signature : S(visitTagPlaceholder,3,,P(d600))
      * TE Signature : S(visitTagPlaceholder,P(d600))
      * 
     */
    public native Object visitTagPlaceholder(TagPlaceholder ph);
    /** 
      * Std Signature : S(visitTagPlaceholder,3,,P(d600),P(d3))
      * TE Signature : S(visitTagPlaceholder,P(d600),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitTagPlaceholder(TagPlaceholder ph, Object context /* optional */);
    /** 
      * Std Signature : S(visitText,3,,P(d596))
      * TE Signature : S(visitText,P(d596))
      * 
     */
    public native Object visitText(Text text);
    /** 
      * Std Signature : S(visitText,3,,P(d596),P(d3))
      * TE Signature : S(visitText,P(d596),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitText(Text text, Object context /* optional */);
}
