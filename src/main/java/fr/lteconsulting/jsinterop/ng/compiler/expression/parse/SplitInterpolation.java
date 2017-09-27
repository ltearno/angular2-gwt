package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser".SplitInterpolation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts:222
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="SplitInterpolation")
public class SplitInterpolation
{

    /*
        Constructors
    */
    public SplitInterpolation(Array<String> strings, Array<String> expressions, Array<Number> offsets){
    }

    /*
        Properties
    */

    public Array<String> expressions;

    @JsProperty( name = "expressions")
    public native Array<String> getExpressions();

    @JsProperty( name = "expressions")
    public native void setExpressions( Array<String> value );

    public Array<Number> offsets;

    @JsProperty( name = "offsets")
    public native Array<Number> getOffsets();

    @JsProperty( name = "offsets")
    public native void setOffsets( Array<Number> value );

    public Array<String> strings;

    @JsProperty( name = "strings")
    public native Array<String> getStrings();

    @JsProperty( name = "strings")
    public native void setStrings( Array<String> value );
}
