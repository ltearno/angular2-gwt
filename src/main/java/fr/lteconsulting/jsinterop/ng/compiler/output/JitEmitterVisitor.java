package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/output/output_jit".JitEmitterVisitor
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/output/output_jit.d.ts:274
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="JitEmitterVisitor")
public class JitEmitterVisitor extends AbstractJsEmitterVisitor
{

    /*
        Constructors
    */
    public JitEmitterVisitor(){
    }

    /*
        Properties
    */

    public Object _evalArgNames;

    @JsProperty( name = "_evalArgNames")
    public native Object get_evalArgNames();

    @JsProperty( name = "_evalArgNames")
    public native void set_evalArgNames( Object value );

    public Object _evalArgValues;

    @JsProperty( name = "_evalArgValues")
    public native Object get_evalArgValues();

    @JsProperty( name = "_evalArgValues")
    public native void set_evalArgValues( Object value );

    public Object _evalExportedVars;

    @JsProperty( name = "_evalExportedVars")
    public native Object get_evalExportedVars();

    @JsProperty( name = "_evalExportedVars")
    public native void set_evalExportedVars( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createReturnStmt,429,,P(d578))
      * TE Signature : S(createReturnStmt,P(d578))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/output/output_jit.d.ts@439
     */
    public native void createReturnStmt(EmitterVisitorContext ctx);
    /** 
      * Std Signature : S(getArgs,C(----3----),,)
      * TE Signature : S(getArgs,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/output/output_jit.d.ts@495
     */
    public native AnonymousType717 getArgs();
    /** 
      * Std Signature : S(visitAssertNotNullExpr,3,,P(d474),P(d3))
      * TE Signature : S(visitAssertNotNullExpr,P(d474),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitAssertNotNullExpr(AssertNotNull ast, Object context);
    /** 
      * Std Signature : S(visitBinaryOperatorExpr,3,,P(d478),P(d3))
      * TE Signature : S(visitBinaryOperatorExpr,P(d478),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitBinaryOperatorExpr(BinaryOperatorExpr ast, Object context);
    /** 
      * Std Signature : S(visitCastExpr,3,,P(d475),P(d3))
      * TE Signature : S(visitCastExpr,P(d475),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitCastExpr(CastExpr ast, Object context);
    /** 
      * Std Signature : S(visitCommaExpr,3,,P(d484),P(d3))
      * TE Signature : S(visitCommaExpr,P(d484),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitCommaExpr(CommaExpr ast, Object context);
    /** 
      * Std Signature : S(visitCommentStmt,3,,P(d461),P(d3))
      * TE Signature : S(visitCommentStmt,P(d461),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitCommentStmt(CommentStmt stmt, Object context);
    /** 
      * Std Signature : S(visitConditionalExpr,3,,P(d472),P(d3))
      * TE Signature : S(visitConditionalExpr,P(d472),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitConditionalExpr(ConditionalExpr ast, Object context);
    /** 
      * Std Signature : S(visitDeclareClassStmt,3,,P(d457),P(d3))
      * TE Signature : S(visitDeclareClassStmt,P(d457),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitDeclareClassStmt(ClassStmt stmt, Object context);
    /** 
      * Std Signature : S(visitDeclareFunctionStmt,3,,P(d452),P(d3))
      * TE Signature : S(visitDeclareFunctionStmt,P(d452),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt, Object context);
    /** 
      * Std Signature : S(visitDeclareVarStmt,3,,P(d450),P(d3))
      * TE Signature : S(visitDeclareVarStmt,P(d450),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitDeclareVarStmt(DeclareVarStmt stmt, Object context);
    /** 
      * Std Signature : S(visitExpressionStmt,3,,P(d453),P(d3))
      * TE Signature : S(visitExpressionStmt,P(d453),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitExpressionStmt(ExpressionStatement stmt, Object context);
    /** 
      * Std Signature : S(visitExternalExpr,3,,P(d471),P(d3))
      * TE Signature : S(visitExternalExpr,P(d471),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitExternalExpr(ExternalExpr ast, Object context);
    /** 
      * Std Signature : S(visitFunctionExpr,3,,P(d476),P(d3))
      * TE Signature : S(visitFunctionExpr,P(d476),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitFunctionExpr(FunctionExpr ast, Object context);
    /** 
      * Std Signature : S(visitIfStmt,3,,P(d458),P(d3))
      * TE Signature : S(visitIfStmt,P(d458),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitIfStmt(IfStmt stmt, Object context);
    /** 
      * Std Signature : S(visitInstantiateExpr,3,,P(d468),P(d3))
      * TE Signature : S(visitInstantiateExpr,P(d468),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitInstantiateExpr(InstantiateExpr ast, Object context);
    /** 
      * Std Signature : S(visitInvokeFunctionExpr,3,,P(d467),P(d3))
      * TE Signature : S(visitInvokeFunctionExpr,P(d467),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitInvokeFunctionExpr(InvokeFunctionExpr ast, Object context);
    /** 
      * Std Signature : S(visitInvokeMethodExpr,3,,P(d466),P(d3))
      * TE Signature : S(visitInvokeMethodExpr,P(d466),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitInvokeMethodExpr(InvokeMethodExpr ast, Object context);
    /** 
      * Std Signature : S(visitLiteralArrayExpr,3,,P(d481),P(d3))
      * TE Signature : S(visitLiteralArrayExpr,P(d481),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitLiteralArrayExpr(LiteralArrayExpr ast, Object context);
    /** 
      * Std Signature : S(visitLiteralExpr,3,,P(d469),P(d3))
      * TE Signature : S(visitLiteralExpr,P(d469),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitLiteralExpr(LiteralExpr ast, Object context);
    /** 
      * Std Signature : S(visitLiteralMapExpr,3,,P(d483),P(d3))
      * TE Signature : S(visitLiteralMapExpr,P(d483),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitLiteralMapExpr(LiteralMapExpr ast, Object context);
    /** 
      * Std Signature : S(visitNotExpr,3,,P(d473),P(d3))
      * TE Signature : S(visitNotExpr,P(d473),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitNotExpr(NotExpr ast, Object context);
    /** 
      * Std Signature : S(visitReadKeyExpr,3,,P(d480),P(d3))
      * TE Signature : S(visitReadKeyExpr,P(d480),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitReadKeyExpr(ReadKeyExpr ast, Object context);
    /** 
      * Std Signature : S(visitReadPropExpr,3,,P(d479),P(d3))
      * TE Signature : S(visitReadPropExpr,P(d479),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitReadPropExpr(ReadPropExpr ast, Object context);
    /** 
      * Std Signature : S(visitReadVarExpr,3,,P(d462),P(d3))
      * TE Signature : S(visitReadVarExpr,P(d462),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitReadVarExpr(ReadVarExpr ast, Object context);
    /** 
      * Std Signature : S(visitReturnStmt,3,,P(d454),P(d3))
      * TE Signature : S(visitReturnStmt,P(d454),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitReturnStmt(ReturnStatement stmt, Object context);
    /** 
      * Std Signature : S(visitThrowStmt,3,,P(d460),P(d3))
      * TE Signature : S(visitThrowStmt,P(d460),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitThrowStmt(ThrowStmt stmt, Object context);
    /** 
      * Std Signature : S(visitTryCatchStmt,3,,P(d459),P(d3))
      * TE Signature : S(visitTryCatchStmt,P(d459),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitTryCatchStmt(TryCatchStmt stmt, Object context);
    /** 
      * Std Signature : S(visitWriteKeyExpr,3,,P(d464),P(d3))
      * TE Signature : S(visitWriteKeyExpr,P(d464),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitWriteKeyExpr(WriteKeyExpr expr, Object context);
    /** 
      * Std Signature : S(visitWritePropExpr,3,,P(d465),P(d3))
      * TE Signature : S(visitWritePropExpr,P(d465),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitWritePropExpr(WritePropExpr expr, Object context);
    /** 
      * Std Signature : S(visitWriteVarExpr,3,,P(d463),P(d3))
      * TE Signature : S(visitWriteVarExpr,P(d463),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitWriteVarExpr(WriteVarExpr expr, Object context);
}
