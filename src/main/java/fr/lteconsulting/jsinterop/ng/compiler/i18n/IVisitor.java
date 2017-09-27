package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper".IVisitor
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts:0
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="IVisitor")
public class IVisitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(visitDeclaration,3,,P(d613))
      * TE Signature : S(visitDeclaration,P(d613))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts@296
     */
    public native Object visitDeclaration(Declaration decl);
    /** 
      * Std Signature : S(visitDoctype,3,,P(d614))
      * TE Signature : S(visitDoctype,P(d614))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts@342
     */
    public native Object visitDoctype(Doctype doctype);
    /** 
      * Std Signature : S(visitTag,3,,P(d611))
      * TE Signature : S(visitTag,P(d611))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts@235
     */
    public native Object visitTag(Tag tag);
    /** 
      * Std Signature : S(visitText,3,,P(d612))
      * TE Signature : S(visitText,P(d612))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts@264
     */
    public native Object visitText(Text text);
}
