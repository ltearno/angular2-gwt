package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".LiteralPrimitive
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:3458
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="LiteralPrimitive")
public class LiteralPrimitive extends AST
{

    /*
        Constructors
    */
    public LiteralPrimitive(ParseSpan span, Object value){
        super(null);
    }

    /*
        Properties
    */

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );
}
