package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".InstantiateExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:6974
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="InstantiateExpr")
public class InstantiateExpr extends Expression
{

    /*
        Constructors
    */
    public InstantiateExpr(Expression classExpr, Array<Expression> args, Type type, ParseSourceSpan sourceSpan){
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

    public Expression classExpr;

    @JsProperty( name = "classExpr")
    public native Expression getClassExpr();

    @JsProperty( name = "classExpr")
    public native void setClassExpr( Expression value );
}
