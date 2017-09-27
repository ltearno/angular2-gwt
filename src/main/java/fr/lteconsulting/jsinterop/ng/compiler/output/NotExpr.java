package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".NotExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:8385
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="NotExpr")
public class NotExpr extends Expression
{

    /*
        Constructors
    */
    public NotExpr(Expression condition, ParseSourceSpan sourceSpan){
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
}
