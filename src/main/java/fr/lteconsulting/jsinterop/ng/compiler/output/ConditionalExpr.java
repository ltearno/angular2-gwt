package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ConditionalExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:8020
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ConditionalExpr")
public class ConditionalExpr extends Expression
{

    /*
        Constructors
    */
    public ConditionalExpr(Expression condition, Expression trueCase, Expression falseCase, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Expression condition;

    @JsProperty( name = "condition")
    public native Expression getCondition();

    @JsProperty( name = "condition")
    public native void setCondition( Expression value );

    public Expression falseCase;

    @JsProperty( name = "falseCase")
    public native Expression getFalseCase();

    @JsProperty( name = "falseCase")
    public native void setFalseCase( Expression value );

    public Expression trueCase;

    @JsProperty( name = "trueCase")
    public native Expression getTrueCase();

    @JsProperty( name = "trueCase")
    public native void setTrueCase( Expression value );
}
