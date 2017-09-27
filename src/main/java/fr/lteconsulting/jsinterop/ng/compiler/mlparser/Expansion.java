package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".Expansion
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:604
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Expansion")
public class Expansion extends Node
{

    /*
        Constructors
    */
    public Expansion(String switchValue, String type, Array<ExpansionCase> cases, ParseSourceSpan sourceSpan, ParseSourceSpan switchValueSourceSpan){
    }

    /*
        Properties
    */

    public Array<ExpansionCase> cases;

    @JsProperty( name = "cases")
    public native Array<ExpansionCase> getCases();

    @JsProperty( name = "cases")
    public native void setCases( Array<ExpansionCase> value );

    public String switchValue;

    @JsProperty( name = "switchValue")
    public native String getSwitchValue();

    @JsProperty( name = "switchValue")
    public native void setSwitchValue( String value );

    public ParseSourceSpan switchValueSourceSpan;

    @JsProperty( name = "switchValueSourceSpan")
    public native ParseSourceSpan getSwitchValueSourceSpan();

    @JsProperty( name = "switchValueSourceSpan")
    public native void setSwitchValueSourceSpan( ParseSourceSpan value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
