package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ExpressionStatement
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:14226
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ExpressionStatement")
public class ExpressionStatement extends Statement
{

    /*
        Constructors
    */
    public ExpressionStatement(Expression expr, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Expression expr;

    @JsProperty( name = "expr")
    public native Expression getExpr();

    @JsProperty( name = "expr")
    public native void setExpr( Expression value );
}
