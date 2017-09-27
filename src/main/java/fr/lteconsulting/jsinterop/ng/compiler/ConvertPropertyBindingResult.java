package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.output.Expression;
import fr.lteconsulting.jsinterop.ng.compiler.output.Statement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter".ConvertPropertyBindingResult
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts:1479
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ConvertPropertyBindingResult")
public class ConvertPropertyBindingResult
{

    /*
        Constructors
    */
    public ConvertPropertyBindingResult(Array<Statement> stmts, Expression currValExpr){
    }

    /*
        Properties
    */

    public Expression currValExpr;

    @JsProperty( name = "currValExpr")
    public native Expression getCurrValExpr();

    @JsProperty( name = "currValExpr")
    public native void setCurrValExpr( Expression value );

    public Array<Statement> stmts;

    @JsProperty( name = "stmts")
    public native Array<Statement> getStmts();

    @JsProperty( name = "stmts")
    public native void setStmts( Array<Statement> value );
}
