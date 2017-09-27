package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".FunctionExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:9201
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="FunctionExpr")
public class FunctionExpr extends Expression
{

    /*
        Constructors
    */
    public FunctionExpr(Array<FnParam> params, Array<Statement> statements, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<FnParam> params;

    @JsProperty( name = "params")
    public native Array<FnParam> getParams();

    @JsProperty( name = "params")
    public native void setParams( Array<FnParam> value );

    public Array<Statement> statements;

    @JsProperty( name = "statements")
    public native Array<Statement> getStatements();

    @JsProperty( name = "statements")
    public native void setStatements( Array<Statement> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toDeclStmt,452,,P(d1))
      * TE Signature : S(toDeclStmt,P(d1))
      * 
     */
    public native DeclareFunctionStmt toDeclStmt(String name);
    /** 
      * Std Signature : S(toDeclStmt,452,,P(d1),P(d7<455>))
      * TE Signature : S(toDeclStmt,P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@9499
     */
    public native DeclareFunctionStmt toDeclStmt(String name, Array<StmtModifier> modifiers /* optional */);
}
