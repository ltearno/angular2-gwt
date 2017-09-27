package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".Attribute
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:1396
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Attribute")
public class Attribute extends Node
{

    /*
        Constructors
    */
    public Attribute(String name, String value, ParseSourceSpan sourceSpan, ParseSourceSpan valueSpan){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );

    public ParseSourceSpan valueSpan;

    @JsProperty( name = "valueSpan")
    public native ParseSourceSpan getValueSpan();

    @JsProperty( name = "valueSpan")
    public native void setValueSpan( ParseSourceSpan value );
}
