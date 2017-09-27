package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".LiteralMapEntry
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:10824
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="LiteralMapEntry")
public class LiteralMapEntry
{

    /*
        Constructors
    */
    public LiteralMapEntry(String key, Expression value, Boolean quoted){
    }

    /*
        Properties
    */

    public String key;

    @JsProperty( name = "key")
    public native String getKey();

    @JsProperty( name = "key")
    public native void setKey( String value );

    public Boolean quoted;

    @JsProperty( name = "quoted")
    public native Boolean getQuoted();

    @JsProperty( name = "quoted")
    public native void setQuoted( Boolean value );

    public Expression value;

    @JsProperty( name = "value")
    public native Expression getValue();

    @JsProperty( name = "value")
    public native void setValue( Expression value );
}
