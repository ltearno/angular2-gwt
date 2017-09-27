package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ExpressionType
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:907
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ExpressionType")
public class ExpressionType extends Type
{

    /*
        Constructors
    */
    public ExpressionType(Expression value, Array<TypeModifier> modifiers){
        super(null);
    }

    /*
        Properties
    */

    public Expression value;

    @JsProperty( name = "value")
    public native Expression getValue();

    @JsProperty( name = "value")
    public native void setValue( Expression value );
}
