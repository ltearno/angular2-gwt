package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".AstVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:6132
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="AstVisitor")
public class AstVisitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(visit,3,,P(d504))
      * TE Signature : S(visit,P(d504))
      * 
     */
    public native Object visit(AST ast);
    /** 
      * Std Signature : S(visit,3,,P(d504),P(d3))
      * TE Signature : S(visit,P(d504),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@7346
     */
    public native Object visit(AST ast, Object context /* optional */);
    /** 
      * Std Signature : S(visitBinary,3,,P(d506),P(d3))
      * TE Signature : S(visitBinary,P(d506),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6167
     */
    public native Object visitBinary(Binary ast, Object context);
    /** 
      * Std Signature : S(visitChain,3,,P(d507),P(d3))
      * TE Signature : S(visitChain,P(d507),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6216
     */
    public native Object visitChain(Chain ast, Object context);
    /** 
      * Std Signature : S(visitConditional,3,,P(d508),P(d3))
      * TE Signature : S(visitConditional,P(d508),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6263
     */
    public native Object visitConditional(Conditional ast, Object context);
    /** 
      * Std Signature : S(visitFunctionCall,3,,P(d509),P(d3))
      * TE Signature : S(visitFunctionCall,P(d509),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6322
     */
    public native Object visitFunctionCall(FunctionCall ast, Object context);
    /** 
      * Std Signature : S(visitImplicitReceiver,3,,P(d510),P(d3))
      * TE Signature : S(visitImplicitReceiver,P(d510),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6383
     */
    public native Object visitImplicitReceiver(ImplicitReceiver ast, Object context);
    /** 
      * Std Signature : S(visitInterpolation,3,,P(d511),P(d3))
      * TE Signature : S(visitInterpolation,P(d511),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6452
     */
    public native Object visitInterpolation(Interpolation ast, Object context);
    /** 
      * Std Signature : S(visitKeyedRead,3,,P(d512),P(d3))
      * TE Signature : S(visitKeyedRead,P(d512),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6515
     */
    public native Object visitKeyedRead(KeyedRead ast, Object context);
    /** 
      * Std Signature : S(visitKeyedWrite,3,,P(d513),P(d3))
      * TE Signature : S(visitKeyedWrite,P(d513),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6570
     */
    public native Object visitKeyedWrite(KeyedWrite ast, Object context);
    /** 
      * Std Signature : S(visitLiteralArray,3,,P(d514),P(d3))
      * TE Signature : S(visitLiteralArray,P(d514),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6627
     */
    public native Object visitLiteralArray(LiteralArray ast, Object context);
    /** 
      * Std Signature : S(visitLiteralMap,3,,P(d515),P(d3))
      * TE Signature : S(visitLiteralMap,P(d515),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6688
     */
    public native Object visitLiteralMap(LiteralMap ast, Object context);
    /** 
      * Std Signature : S(visitLiteralPrimitive,3,,P(d516),P(d3))
      * TE Signature : S(visitLiteralPrimitive,P(d516),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6745
     */
    public native Object visitLiteralPrimitive(LiteralPrimitive ast, Object context);
    /** 
      * Std Signature : S(visitMethodCall,3,,P(d517),P(d3))
      * TE Signature : S(visitMethodCall,P(d517),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6814
     */
    public native Object visitMethodCall(MethodCall ast, Object context);
    /** 
      * Std Signature : S(visitNonNullAssert,3,,P(d520),P(d3))
      * TE Signature : S(visitNonNullAssert,P(d520),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6978
     */
    public native Object visitNonNullAssert(NonNullAssert ast, Object context);
    /** 
      * Std Signature : S(visitPipe,3,,P(d518),P(d3))
      * TE Signature : S(visitPipe,P(d518),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6871
     */
    public native Object visitPipe(BindingPipe ast, Object context);
    /** 
      * Std Signature : S(visitPrefixNot,3,,P(d519),P(d3))
      * TE Signature : S(visitPrefixNot,P(d519),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@6923
     */
    public native Object visitPrefixNot(PrefixNot ast, Object context);
    /** 
      * Std Signature : S(visitPropertyRead,3,,P(d521),P(d3))
      * TE Signature : S(visitPropertyRead,P(d521),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@7041
     */
    public native Object visitPropertyRead(PropertyRead ast, Object context);
    /** 
      * Std Signature : S(visitPropertyWrite,3,,P(d522),P(d3))
      * TE Signature : S(visitPropertyWrite,P(d522),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@7102
     */
    public native Object visitPropertyWrite(PropertyWrite ast, Object context);
    /** 
      * Std Signature : S(visitQuote,3,,P(d523),P(d3))
      * TE Signature : S(visitQuote,P(d523),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@7165
     */
    public native Object visitQuote(Quote ast, Object context);
    /** 
      * Std Signature : S(visitSafeMethodCall,3,,P(d524),P(d3))
      * TE Signature : S(visitSafeMethodCall,P(d524),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@7212
     */
    public native Object visitSafeMethodCall(SafeMethodCall ast, Object context);
    /** 
      * Std Signature : S(visitSafePropertyRead,3,,P(d525),P(d3))
      * TE Signature : S(visitSafePropertyRead,P(d525),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@7277
     */
    public native Object visitSafePropertyRead(SafePropertyRead ast, Object context);
}
