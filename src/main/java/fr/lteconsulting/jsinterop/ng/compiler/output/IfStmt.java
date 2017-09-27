package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".IfStmt
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:16064
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="IfStmt")
public class IfStmt extends Statement
{

    /*
        Constructors
    */
    public IfStmt(Expression condition, Array<Statement> trueCase, Array<Statement> falseCase, ParseSourceSpan sourceSpan){
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

    public Array<Statement> falseCase;

    @JsProperty( name = "falseCase")
    public native Array<Statement> getFalseCase();

    @JsProperty( name = "falseCase")
    public native void setFalseCase( Array<Statement> value );

    public Array<Statement> trueCase;

    @JsProperty( name = "trueCase")
    public native Array<Statement> getTrueCase();

    @JsProperty( name = "trueCase")
    public native void setTrueCase( Array<Statement> value );
}
