package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".LiteralMap
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:3885
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="LiteralMap")
public class LiteralMap extends AST
{

    /*
        Constructors
    */
    public LiteralMap(ParseSpan span, Array<Object> keys, Array<Object> values){
        super(null);
    }

    /*
        Properties
    */

    public Array<Object> keys;

    @JsProperty( name = "keys")
    public native Array<Object> getKeys();

    @JsProperty( name = "keys")
    public native void setKeys( Array<Object> value );

    public Array<Object> values;

    @JsProperty( name = "values")
    public native Array<Object> getValues();

    @JsProperty( name = "values")
    public native void setValues( Array<Object> value );
}
