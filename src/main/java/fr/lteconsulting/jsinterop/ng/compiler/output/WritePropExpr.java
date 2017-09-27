package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".WritePropExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:5878
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="WritePropExpr")
public class WritePropExpr extends Expression
{

    /*
        Constructors
    */
    public WritePropExpr(Expression receiver, String name, Expression value, Type type, ParseSourceSpan sourceSpan){
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

    public Expression receiver;

    @JsProperty( name = "receiver")
    public native Expression getReceiver();

    @JsProperty( name = "receiver")
    public native void setReceiver( Expression value );

    public Expression value;

    @JsProperty( name = "value")
    public native Expression getValue();

    @JsProperty( name = "value")
    public native void setValue( Expression value );
}
