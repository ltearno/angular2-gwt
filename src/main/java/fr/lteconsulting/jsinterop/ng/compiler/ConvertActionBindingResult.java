package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.output.ReadVarExpr;
import fr.lteconsulting.jsinterop.ng.compiler.output.Statement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter".ConvertActionBindingResult
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts:455
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ConvertActionBindingResult")
public class ConvertActionBindingResult
{

    /*
        Constructors
    */
    public ConvertActionBindingResult(Array<Statement> stmts, ReadVarExpr allowDefault){
    }

    /*
        Properties
    */

    public ReadVarExpr allowDefault;

    @JsProperty( name = "allowDefault")
    public native ReadVarExpr getAllowDefault();

    @JsProperty( name = "allowDefault")
    public native void setAllowDefault( ReadVarExpr value );

    public Array<Statement> stmts;

    @JsProperty( name = "stmts")
    public native Array<Statement> getStmts();

    @JsProperty( name = "stmts")
    public native void setStmts( Array<Statement> value );
}
