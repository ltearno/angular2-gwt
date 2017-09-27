package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".PrefixNot
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:4546
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="PrefixNot")
public class PrefixNot extends AST
{

    /*
        Constructors
    */
    public PrefixNot(ParseSpan span, AST expression){
        super(null);
    }

    /*
        Properties
    */

    public AST expression;

    @JsProperty( name = "expression")
    public native AST getExpression();

    @JsProperty( name = "expression")
    public native void setExpression( AST value );
}
