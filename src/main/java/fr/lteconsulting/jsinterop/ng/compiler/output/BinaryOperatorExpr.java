package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".BinaryOperatorExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:9582
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="BinaryOperatorExpr")
public class BinaryOperatorExpr extends Expression
{

    /*
        Constructors
    */
    public BinaryOperatorExpr(BinaryOperator operator, Expression lhs, Expression rhs, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Expression lhs;

    @JsProperty( name = "lhs")
    public native Expression getLhs();

    @JsProperty( name = "lhs")
    public native void setLhs( Expression value );

    public BinaryOperator operator;

    @JsProperty( name = "operator")
    public native BinaryOperator getOperator();

    @JsProperty( name = "operator")
    public native void setOperator( BinaryOperator value );

    public Expression rhs;

    @JsProperty( name = "rhs")
    public native Expression getRhs();

    @JsProperty( name = "rhs")
    public native void setRhs( Expression value );
}
