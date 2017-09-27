package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".WriteVarExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:5187
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="WriteVarExpr")
public class WriteVarExpr extends Expression
{

    /*
        Constructors
    */
    public WriteVarExpr(String name, Expression value, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Expression value;

    @JsProperty( name = "value")
    public native Expression getValue();

    @JsProperty( name = "value")
    public native void setValue( Expression value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toDeclStmt,450,,)
      * TE Signature : S(toDeclStmt,)
      * 
     */
    public native DeclareVarStmt toDeclStmt();
    /** 
      * Std Signature : S(toDeclStmt,450,,P(d447))
      * TE Signature : S(toDeclStmt,P(d447))
      * 
     */
    public native DeclareVarStmt toDeclStmt(Type type /* optional */);
    /** 
      * Std Signature : S(toDeclStmt,450,,P(d447),P(d7<455>))
      * TE Signature : S(toDeclStmt,P(d447),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@5463
     */
    public native DeclareVarStmt toDeclStmt(Type type /* optional */, Array<StmtModifier> modifiers /* optional */);
}
