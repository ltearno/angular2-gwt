package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".Conditional
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:1970
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="Conditional")
public class Conditional extends AST
{

    /*
        Constructors
    */
    public Conditional(ParseSpan span, AST condition, AST trueExp, AST falseExp){
        super(null);
    }

    /*
        Properties
    */

    public AST condition;

    @JsProperty( name = "condition")
    public native AST getCondition();

    @JsProperty( name = "condition")
    public native void setCondition( AST value );

    public AST falseExp;

    @JsProperty( name = "falseExp")
    public native AST getFalseExp();

    @JsProperty( name = "falseExp")
    public native void setFalseExp( AST value );

    public AST trueExp;

    @JsProperty( name = "trueExp")
    public native AST getTrueExp();

    @JsProperty( name = "trueExp")
    public native void setTrueExp( AST value );
}
