package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ExternalExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:7496
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ExternalExpr")
public class ExternalExpr extends Expression
{

    /*
        Constructors
    */
    public ExternalExpr(ExternalReference value, Type type, Array<Type> typeParams, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<Type> typeParams;

    @JsProperty( name = "typeParams")
    public native Array<Type> getTypeParams();

    @JsProperty( name = "typeParams")
    public native void setTypeParams( Array<Type> value );

    public ExternalReference value;

    @JsProperty( name = "value")
    public native ExternalReference getValue();

    @JsProperty( name = "value")
    public native void setValue( ExternalReference value );
}
