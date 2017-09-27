package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ThrowStmt
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:16882
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ThrowStmt")
public class ThrowStmt extends Statement
{

    /*
        Constructors
    */
    public ThrowStmt(Expression error, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Expression error;

    @JsProperty( name = "error")
    public native Expression getError();

    @JsProperty( name = "error")
    public native void setError( Expression value );
}
