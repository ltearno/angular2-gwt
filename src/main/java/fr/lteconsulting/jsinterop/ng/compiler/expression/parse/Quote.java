package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".Quote
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:691
  * 1 constructors
  * Represents a quoted expression of the form:
  * 
  * quote = prefix `:` uninterpretedExpression
  * prefix = identifier
  * uninterpretedExpression = arbitrary string
  * 
  * A quoted expression is meant to be pre-processed by an AST transformer that
  * converts it into another AST that no longer contains quoted expressions.
  * It is meant to allow third-party developers to extend Angular template
  * expression language. The `uninterpretedExpression` part of the quote is
  * therefore not interpreted by the Angular's own expression parser.
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="Quote")
public class Quote extends AST
{

    /*
        Constructors
    */
    public Quote(ParseSpan span, String prefix, String uninterpretedExpression, Object location){
        super(null);
    }

    /*
        Properties
    */

    public Object location;

    @JsProperty( name = "location")
    public native Object getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Object value );

    public String prefix;

    @JsProperty( name = "prefix")
    public native String getPrefix();

    @JsProperty( name = "prefix")
    public native void setPrefix( String value );

    public String uninterpretedExpression;

    @JsProperty( name = "uninterpretedExpression")
    public native String getUninterpretedExpression();

    @JsProperty( name = "uninterpretedExpression")
    public native void setUninterpretedExpression( String value );
}
