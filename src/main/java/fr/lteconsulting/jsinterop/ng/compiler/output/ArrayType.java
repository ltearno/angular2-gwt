package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ArrayType
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:1110
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ArrayType")
public class ArrayType extends Type
{

    /*
        Constructors
    */
    public ArrayType(Type of, Array<TypeModifier> modifiers){
        super(null);
    }

    /*
        Properties
    */

    public Type of;

    @JsProperty( name = "of")
    public native Type getOf();

    @JsProperty( name = "of")
    public native void setOf( Type value );
}
