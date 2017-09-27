package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".InvokeFunctionExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:6689
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="InvokeFunctionExpr")
public class InvokeFunctionExpr extends Expression
{

    /*
        Constructors
    */
    public InvokeFunctionExpr(Expression fn, Array<Expression> args, Type type, ParseSourceSpan sourceSpan){
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

    public Expression fn;

    @JsProperty( name = "fn")
    public native Expression getFn();

    @JsProperty( name = "fn")
    public native void setFn( Expression value );
}
