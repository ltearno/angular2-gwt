package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.UnionOfArrayOfObjectAndExpressionAndStatementAndType;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Set;
import fr.lteconsulting.jsinterop.ng.compiler.OutputContext;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.compiler.output (java fr.lteconsulting.jsinterop.ng.compiler.output) package
 */
@JsType(isNative=true, namespace="ng", name="compiler.output")
public class GlobalScope_NgCompilerOutput
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.compiler.output", name="DYNAMIC_TYPE")
    public static BuiltinType DYNAMIC_TYPE;

    @JsProperty(namespace="ng.compiler.output", name="INFERRED_TYPE")
    public static BuiltinType INFERRED_TYPE;

    @JsProperty(namespace="ng.compiler.output", name="BOOL_TYPE")
    public static BuiltinType BOOL_TYPE;

    @JsProperty(namespace="ng.compiler.output", name="INT_TYPE")
    public static BuiltinType INT_TYPE;

    @JsProperty(namespace="ng.compiler.output", name="NUMBER_TYPE")
    public static BuiltinType NUMBER_TYPE;

    @JsProperty(namespace="ng.compiler.output", name="STRING_TYPE")
    public static BuiltinType STRING_TYPE;

    @JsProperty(namespace="ng.compiler.output", name="FUNCTION_TYPE")
    public static BuiltinType FUNCTION_TYPE;

    @JsProperty(namespace="ng.compiler.output", name="THIS_EXPR")
    public static ReadVarExpr THIS_EXPR;

    @JsProperty(namespace="ng.compiler.output", name="SUPER_EXPR")
    public static ReadVarExpr SUPER_EXPR;

    @JsProperty(namespace="ng.compiler.output", name="CATCH_ERROR_VAR")
    public static ReadVarExpr CATCH_ERROR_VAR;

    @JsProperty(namespace="ng.compiler.output", name="CATCH_STACK_VAR")
    public static ReadVarExpr CATCH_STACK_VAR;

    @JsProperty(namespace="ng.compiler.output", name="NULL_EXPR")
    public static LiteralExpr NULL_EXPR;

    @JsProperty(namespace="ng.compiler.output", name="TYPED_NULL_EXPR")
    public static LiteralExpr TYPED_NULL_EXPR;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.compiler.output", name = "findReadVarNames")
    public static native Set<String> findReadVarNames(Array<Statement> stmts);
    @JsMethod(namespace="ng.compiler.output", name = "applySourceSpanToStatementIfNeeded")
    public static native Statement applySourceSpanToStatementIfNeeded(Statement stmt, ParseSourceSpan sourceSpan);
    @JsMethod(namespace="ng.compiler.output", name = "applySourceSpanToExpressionIfNeeded")
    public static native Expression applySourceSpanToExpressionIfNeeded(Expression expr, ParseSourceSpan sourceSpan);
    @JsMethod(namespace="ng.compiler.output", name = "variable")
    public static native ReadVarExpr variable(String name, Type type /* optional */, ParseSourceSpan sourceSpan /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "importExpr")
    public static native ExternalExpr importExpr(ExternalReference id, Array<Type> typeParams /* optional */, ParseSourceSpan sourceSpan /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "importType")
    public static native ExpressionType importType(ExternalReference id, Array<Type> typeParams /* optional */, Array<TypeModifier> typeModifiers /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "expressionType")
    public static native ExpressionType expressionType(Expression expr, Array<TypeModifier> typeModifiers /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "literalArr")
    public static native LiteralArrayExpr literalArr(Array<Expression> values, Type type /* optional */, ParseSourceSpan sourceSpan /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "literalMap")
    public static native LiteralMapExpr literalMap(Array<Object> values, MapType type /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "not")
    public static native NotExpr not(Expression expr, ParseSourceSpan sourceSpan /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "assertNotNull")
    public static native AssertNotNull assertNotNull(Expression expr, ParseSourceSpan sourceSpan /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "fn")
    public static native FunctionExpr fn(Array<FnParam> params, Array<Statement> body, Type type /* optional */, ParseSourceSpan sourceSpan /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "literal")
    public static native LiteralExpr literal(Object value, Type type /* optional */, ParseSourceSpan sourceSpan /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "toBase64String")
    public static native String toBase64String(String value);
    @JsMethod(namespace="ng.compiler.output", name = "escapeIdentifier")
    public static native Object escapeIdentifier(String input, Boolean escapeDollar, Boolean alwaysQuote /* optional */);
    @JsMethod(namespace="ng.compiler.output", name = "debugOutputAstAsTypeScript")
    public static native String debugOutputAstAsTypeScript(UnionOfArrayOfObjectAndExpressionAndStatementAndType ast);
    @JsMethod(namespace="ng.compiler.output", name = "interpretStatements")
    public static native AnonymousType717 interpretStatements(Array<Statement> statements);
    @JsMethod(namespace="ng.compiler.output", name = "jitStatements")
    public static native AnonymousType717 jitStatements(String sourceUrl, Array<Statement> statements);
    @JsMethod(namespace="ng.compiler.output", name = "convertValueToOutputAst")
    public static native Expression convertValueToOutputAst(OutputContext ctx, Object value, Type type /* optional */);
}
