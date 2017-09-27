package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".FunctionCall
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:5356
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="FunctionCall")
public class FunctionCall extends AST
{

    /*
        Constructors
    */
    public FunctionCall(ParseSpan span, AST target, Array<Object> args){
        super(null);
    }

    /*
        Properties
    */

    public Array<Object> args;

    @JsProperty( name = "args")
    public native Array<Object> getArgs();

    @JsProperty( name = "args")
    public native void setArgs( Array<Object> value );

    public AST target;

    @JsProperty( name = "target")
    public native AST getTarget();

    @JsProperty( name = "target")
    public native void setTarget( AST value );
}
