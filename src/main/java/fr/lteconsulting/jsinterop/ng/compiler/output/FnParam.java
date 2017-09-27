package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".FnParam
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:9076
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="FnParam")
public class FnParam
{

    /*
        Constructors
    */
    public FnParam(String name, Type type){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Type type;

    @JsProperty( name = "type")
    public native Type getType();

    @JsProperty( name = "type")
    public native void setType( Type value );
}
