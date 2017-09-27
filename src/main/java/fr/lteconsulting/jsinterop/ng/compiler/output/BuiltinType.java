package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".BuiltinType
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:699
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="BuiltinType")
public class BuiltinType extends Type
{

    /*
        Constructors
    */
    public BuiltinType(BuiltinTypeName name, Array<TypeModifier> modifiers){
        super(null);
    }

    /*
        Properties
    */

    public BuiltinTypeName name;

    @JsProperty( name = "name")
    public native BuiltinTypeName getName();

    @JsProperty( name = "name")
    public native void setName( BuiltinTypeName value );
}
