package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".InvokeMethodExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:6302
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="InvokeMethodExpr")
public class InvokeMethodExpr extends Expression
{

    /*
        Constructors
    */
    public InvokeMethodExpr(Expression receiver, PropertyKey_UnionOfNumberAndString method, Array<Expression> args, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<Expression> args;

    @JsProperty( name = "args")
    public native Array<Expression> getArgs();

    @JsProperty( name = "args")
    public native void setArgs( Array<Expression> value );

    public BuiltinMethod builtin;

    @JsProperty( name = "builtin")
    public native BuiltinMethod getBuiltin();

    @JsProperty( name = "builtin")
    public native void setBuiltin( BuiltinMethod value );

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
}
