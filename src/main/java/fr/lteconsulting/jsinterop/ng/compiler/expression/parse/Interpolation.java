package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".Interpolation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:4103
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="Interpolation")
public class Interpolation extends AST
{

    /*
        Constructors
    */
    public Interpolation(ParseSpan span, Array<Object> strings, Array<Object> expressions){
        super(null);
    }

    /*
        Properties
    */

    public Array<Object> expressions;

    @JsProperty( name = "expressions")
    public native Array<Object> getExpressions();

    @JsProperty( name = "expressions")
    public native void setExpressions( Array<Object> value );

    public Array<Object> strings;

    @JsProperty( name = "strings")
    public native Array<Object> getStrings();

    @JsProperty( name = "strings")
    public native void setStrings( Array<Object> value );
}
