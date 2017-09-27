package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".DeclareVarStmt
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:13507
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="DeclareVarStmt")
public class DeclareVarStmt extends Statement
{

    /*
        Constructors
    */
    public DeclareVarStmt(String name, Expression value, Type type, Array<StmtModifier> modifiers, ParseSourceSpan sourceSpan){
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

    public Type type;

    @JsProperty( name = "type")
    public native Type getType();

    @JsProperty( name = "type")
    public native void setType( Type value );

    public Expression value;

    @JsProperty( name = "value")
    public native Expression getValue();

    @JsProperty( name = "value")
    public native void setValue( Expression value );
}
