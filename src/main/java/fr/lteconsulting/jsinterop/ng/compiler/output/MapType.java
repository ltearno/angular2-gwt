package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".MapType
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:1290
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="MapType")
public class MapType extends Type
{

    /*
        Constructors
    */
    public MapType(Type valueType, Array<TypeModifier> modifiers){
        super(null);
    }

    /*
        Properties
    */

    public Type valueType;

    @JsProperty( name = "valueType")
    public native Type getValueType();

    @JsProperty( name = "valueType")
    public native void setValueType( Type value );
}
