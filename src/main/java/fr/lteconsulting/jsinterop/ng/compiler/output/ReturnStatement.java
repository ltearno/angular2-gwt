package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ReturnStatement
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:14449
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ReturnStatement")
public class ReturnStatement extends Statement
{

    /*
        Constructors
    */
    public ReturnStatement(Expression value, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Expression value;

    @JsProperty( name = "value")
    public native Expression getValue();

    @JsProperty( name = "value")
    public native void setValue( Expression value );
}
