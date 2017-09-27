package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".ParserError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:0
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="ParserError")
public class ParserError
{

    /*
        Constructors
    */
    public ParserError(String message, String input, String errLocation, Object ctxLocation){
    }

    /*
        Properties
    */

    public Object ctxLocation;

    @JsProperty( name = "ctxLocation")
    public native Object getCtxLocation();

    @JsProperty( name = "ctxLocation")
    public native void setCtxLocation( Object value );

    public String errLocation;

    @JsProperty( name = "errLocation")
    public native String getErrLocation();

    @JsProperty( name = "errLocation")
    public native void setErrLocation( String value );

    public String input;

    @JsProperty( name = "input")
    public native String getInput();

    @JsProperty( name = "input")
    public native void setInput( String value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );
}
