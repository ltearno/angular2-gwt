package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".DeclareFunctionStmt
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:13837
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="DeclareFunctionStmt")
public class DeclareFunctionStmt extends Statement
{

    /*
        Constructors
    */
    public DeclareFunctionStmt(String name, Array<FnParam> params, Array<Statement> statements, Type type, Array<StmtModifier> modifiers, ParseSourceSpan sourceSpan){
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

    public Type type;

    @JsProperty( name = "type")
    public native Type getType();

    @JsProperty( name = "type")
    public native void setType( Type value );
}
