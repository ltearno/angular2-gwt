package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".TryCatchStmt
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:16600
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="TryCatchStmt")
public class TryCatchStmt extends Statement
{

    /*
        Constructors
    */
    public TryCatchStmt(Array<Statement> bodyStmts, Array<Statement> catchStmts, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<Statement> bodyStmts;

    @JsProperty( name = "bodyStmts")
    public native Array<Statement> getBodyStmts();

    @JsProperty( name = "bodyStmts")
    public native void setBodyStmts( Array<Statement> value );

    public Array<Statement> catchStmts;

    @JsProperty( name = "catchStmts")
    public native Array<Statement> getCatchStmts();

    @JsProperty( name = "catchStmts")
    public native void setCatchStmts( Array<Statement> value );
}
