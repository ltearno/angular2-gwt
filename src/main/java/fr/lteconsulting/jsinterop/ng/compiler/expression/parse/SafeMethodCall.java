package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".SafeMethodCall
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:5122
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="SafeMethodCall")
public class SafeMethodCall extends AST
{

    /*
        Constructors
    */
    public SafeMethodCall(ParseSpan span, AST receiver, String name, Array<Object> args){
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

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public AST receiver;

    @JsProperty( name = "receiver")
    public native AST getReceiver();

    @JsProperty( name = "receiver")
    public native void setReceiver( AST value );
}
