package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.compiler.expression.parse (java fr.lteconsulting.jsinterop.ng.compiler.expression.parse) package
 */
@JsType(isNative=true, namespace="ng", name="compiler.expression.parse")
public class GlobalScope_NgCompilerExpressionParse
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.compiler.expression.parse", name="EOF")
    public static Token EOF;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.compiler.expression.parse", name = "visitAstChildren")
    public static native void visitAstChildren(AST ast, AstVisitor visitor, Object context /* optional */);
    @JsMethod(namespace="ng.compiler.expression.parse", name = "isIdentifier")
    public static native Boolean isIdentifier(String input);
    @JsMethod(namespace="ng.compiler.expression.parse", name = "isQuote")
    public static native Boolean isQuote(Number code);
}
