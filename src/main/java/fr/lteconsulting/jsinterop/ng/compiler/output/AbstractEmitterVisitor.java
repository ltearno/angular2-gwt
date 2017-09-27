package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter".AbstractEmitterVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts:1635
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="AbstractEmitterVisitor")
public class AbstractEmitterVisitor implements StatementVisitor, ExpressionVisitor
{

    /*
        Constructors
    */
    public AbstractEmitterVisitor(Boolean _escapeDollarInStrings){
    }

    /*
        Properties
    */

    public Object _escapeDollarInStrings;

    @JsProperty( name = "_escapeDollarInStrings")
    public native Object get_escapeDollarInStrings();

    @JsProperty( name = "_escapeDollarInStrings")
    public native void set_escapeDollarInStrings( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getBuiltinMethodName,1,,P(d579))
      * TE Signature : S(getBuiltinMethodName,P(d579))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2864
     */
    public native String getBuiltinMethodName(BuiltinMethod method);
    /** 
      * Std Signature : S(visitAllExpressions,429,,P(d7<449>),P(d578),P(d1))
      * TE Signature : S(visitAllExpressions,P(d7),P(d578),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@4225
     */
    public native void visitAllExpressions(Array<Expression> expressions, EmitterVisitorContext ctx, String separator);
    /** 
      * Std Signature : S(visitAllObjects,429,T-,P(dFP1--S(?,429,,P(d3))------)<T->),P(d7<T->),P(d578),P(d1))
      * TE Signature : S(visitAllObjects,P(dF--S(?,P(d3))------)),P(d7),P(d578),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@4332
     */
    public native <T> void visitAllObjects(Action1<T> handler, Array<T> expressions, EmitterVisitorContext ctx, String separator);
    /** 
      * Std Signature : S(visitAllStatements,429,,P(d7<488>),P(d578))
      * TE Signature : S(visitAllStatements,P(d7),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@4452
     */
    public native void visitAllStatements(Array<Statement> statements, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitAssertNotNullExpr,3,,P(d474),P(d578))
      * TE Signature : S(visitAssertNotNullExpr,P(d474),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3491
     */
    public native Object visitAssertNotNullExpr(AssertNotNull ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitBinaryOperatorExpr,3,,P(d478),P(d578))
      * TE Signature : S(visitBinaryOperatorExpr,P(d478),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3747
     */
    public native Object visitBinaryOperatorExpr(BinaryOperatorExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitCommaExpr,3,,P(d484),P(d578))
      * TE Signature : S(visitCommaExpr,P(d484),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@4154
     */
    public native Object visitCommaExpr(CommaExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitCommentStmt,3,,P(d461),P(d578))
      * TE Signature : S(visitCommentStmt,P(d461),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2375
     */
    public native Object visitCommentStmt(CommentStmt stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitConditionalExpr,3,,P(d472),P(d578))
      * TE Signature : S(visitConditionalExpr,P(d472),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3341
     */
    public native Object visitConditionalExpr(ConditionalExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitDeclareClassStmt,3,,P(d457),P(d578))
      * TE Signature : S(visitDeclareClassStmt,P(d457),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2062
     */
    public native Object visitDeclareClassStmt(ClassStmt stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitDeclareVarStmt,3,,P(d450),P(d578))
      * TE Signature : S(visitDeclareVarStmt,P(d450),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2451
     */
    public native Object visitDeclareVarStmt(DeclareVarStmt stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitExpressionStmt,3,,P(d453),P(d578))
      * TE Signature : S(visitExpressionStmt,P(d453),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1832
     */
    public native Object visitExpressionStmt(ExpressionStatement stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitExternalExpr,3,,P(d471),P(d578))
      * TE Signature : S(visitExternalExpr,P(d471),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3255
     */
    public native Object visitExternalExpr(ExternalExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitFunctionExpr,3,,P(d476),P(d578))
      * TE Signature : S(visitFunctionExpr,P(d476),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3574
     */
    public native Object visitFunctionExpr(FunctionExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitIfStmt,3,,P(d458),P(d578))
      * TE Signature : S(visitIfStmt,P(d458),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2150
     */
    public native Object visitIfStmt(IfStmt stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitInstantiateExpr,3,,P(d468),P(d578))
      * TE Signature : S(visitInstantiateExpr,P(d468),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3097
     */
    public native Object visitInstantiateExpr(InstantiateExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitInvokeFunctionExpr,3,,P(d467),P(d578))
      * TE Signature : S(visitInvokeFunctionExpr,P(d467),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2932
     */
    public native Object visitInvokeFunctionExpr(InvokeFunctionExpr expr, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitInvokeMethodExpr,3,,P(d466),P(d578))
      * TE Signature : S(visitInvokeMethodExpr,P(d466),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2778
     */
    public native Object visitInvokeMethodExpr(InvokeMethodExpr expr, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitLiteralArrayExpr,3,,P(d481),P(d578))
      * TE Signature : S(visitLiteralArrayExpr,P(d481),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3988
     */
    public native Object visitLiteralArrayExpr(LiteralArrayExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitLiteralExpr,3,,P(d469),P(d578))
      * TE Signature : S(visitLiteralExpr,P(d469),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3180
     */
    public native Object visitLiteralExpr(LiteralExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitLiteralMapExpr,3,,P(d483),P(d578))
      * TE Signature : S(visitLiteralMapExpr,P(d483),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@4073
     */
    public native Object visitLiteralMapExpr(LiteralMapExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitNotExpr,3,,P(d473),P(d578))
      * TE Signature : S(visitNotExpr,P(d473),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3424
     */
    public native Object visitNotExpr(NotExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitReadKeyExpr,3,,P(d480),P(d578))
      * TE Signature : S(visitReadKeyExpr,P(d480),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3913
     */
    public native Object visitReadKeyExpr(ReadKeyExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitReadPropExpr,3,,P(d479),P(d578))
      * TE Signature : S(visitReadPropExpr,P(d479),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3836
     */
    public native Object visitReadPropExpr(ReadPropExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitReadVarExpr,3,,P(d462),P(d578))
      * TE Signature : S(visitReadVarExpr,P(d462),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@3022
     */
    public native Object visitReadVarExpr(ReadVarExpr ast, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitReturnStmt,3,,P(d454),P(d578))
      * TE Signature : S(visitReturnStmt,P(d454),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1919
     */
    public native Object visitReturnStmt(ReturnStatement stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitThrowStmt,3,,P(d460),P(d578))
      * TE Signature : S(visitThrowStmt,P(d460),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2303
     */
    public native Object visitThrowStmt(ThrowStmt stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitTryCatchStmt,3,,P(d459),P(d578))
      * TE Signature : S(visitTryCatchStmt,P(d459),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2216
     */
    public native Object visitTryCatchStmt(TryCatchStmt stmt, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitWriteKeyExpr,3,,P(d464),P(d578))
      * TE Signature : S(visitWriteKeyExpr,P(d464),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2620
     */
    public native Object visitWriteKeyExpr(WriteKeyExpr expr, EmitterVisitorContext ctx);
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
      * Std Signature : S(visitWritePropExpr,3,,P(d465),P(d578))
      * TE Signature : S(visitWritePropExpr,P(d465),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2698
     */
    public native Object visitWritePropExpr(WritePropExpr expr, EmitterVisitorContext ctx);
    /** 
      * Std Signature : S(visitWriteVarExpr,3,,P(d463),P(d3))
      * TE Signature : S(visitWriteVarExpr,P(d463),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitWriteVarExpr(WriteVarExpr expr, Object context);
    /** 
      * Std Signature : S(visitWriteVarExpr,3,,P(d463),P(d578))
      * TE Signature : S(visitWriteVarExpr,P(d463),P(d578))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@2542
     */
    public native Object visitWriteVarExpr(WriteVarExpr expr, EmitterVisitorContext ctx);
}
