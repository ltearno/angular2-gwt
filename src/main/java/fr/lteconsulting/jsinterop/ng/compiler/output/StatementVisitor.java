package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".StatementVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:17097
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface StatementVisitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(visitCommentStmt,3,,P(d461),P(d3))
      * TE Signature : S(visitCommentStmt,P(d461),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17645
     */
    Object visitCommentStmt(CommentStmt stmt, Object context);
    /** 
      * Std Signature : S(visitDeclareClassStmt,3,,P(d457),P(d3))
      * TE Signature : S(visitDeclareClassStmt,P(d457),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17414
     */
    Object visitDeclareClassStmt(ClassStmt stmt, Object context);
    /** 
      * Std Signature : S(visitDeclareFunctionStmt,3,,P(d452),P(d3))
      * TE Signature : S(visitDeclareFunctionStmt,P(d452),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17204
     */
    Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt, Object context);
    /** 
      * Std Signature : S(visitDeclareVarStmt,3,,P(d450),P(d3))
      * TE Signature : S(visitDeclareVarStmt,P(d450),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17138
     */
    Object visitDeclareVarStmt(DeclareVarStmt stmt, Object context);
    /** 
      * Std Signature : S(visitExpressionStmt,3,,P(d453),P(d3))
      * TE Signature : S(visitExpressionStmt,P(d453),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17280
     */
    Object visitExpressionStmt(ExpressionStatement stmt, Object context);
    /** 
      * Std Signature : S(visitIfStmt,3,,P(d458),P(d3))
      * TE Signature : S(visitIfStmt,P(d458),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17477
     */
    Object visitIfStmt(IfStmt stmt, Object context);
    /** 
      * Std Signature : S(visitReturnStmt,3,,P(d454),P(d3))
      * TE Signature : S(visitReturnStmt,P(d454),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17351
     */
    Object visitReturnStmt(ReturnStatement stmt, Object context);
    /** 
      * Std Signature : S(visitThrowStmt,3,,P(d460),P(d3))
      * TE Signature : S(visitThrowStmt,P(d460),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17589
     */
    Object visitThrowStmt(ThrowStmt stmt, Object context);
    /** 
      * Std Signature : S(visitTryCatchStmt,3,,P(d459),P(d3))
      * TE Signature : S(visitTryCatchStmt,P(d459),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@17527
     */
    Object visitTryCatchStmt(TryCatchStmt stmt, Object context);
}
