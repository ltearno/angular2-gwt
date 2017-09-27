package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".ExpansionCase
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:996
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="ExpansionCase")
public class ExpansionCase extends Node
{

    /*
        Constructors
    */
    public ExpansionCase(String value, Array<Node> expression, ParseSourceSpan sourceSpan, ParseSourceSpan valueSourceSpan, ParseSourceSpan expSourceSpan){
    }

    /*
        Properties
    */

    public ParseSourceSpan expSourceSpan;

    @JsProperty( name = "expSourceSpan")
    public native ParseSourceSpan getExpSourceSpan();

    @JsProperty( name = "expSourceSpan")
    public native void setExpSourceSpan( ParseSourceSpan value );

    public Array<Node> expression;

    @JsProperty( name = "expression")
    public native Array<Node> getExpression();

    @JsProperty( name = "expression")
    public native void setExpression( Array<Node> value );

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );

    public ParseSourceSpan valueSourceSpan;

    @JsProperty( name = "valueSourceSpan")
    public native ParseSourceSpan getValueSourceSpan();

    @JsProperty( name = "valueSourceSpan")
    public native void setValueSourceSpan( ParseSourceSpan value );
}
