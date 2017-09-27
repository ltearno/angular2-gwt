package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ReadPropExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:9919
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ReadPropExpr")
public class ReadPropExpr extends Expression
{

    /*
        Constructors
    */
    public ReadPropExpr(Expression receiver, String name, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Expression receiver;

    @JsProperty( name = "receiver")
    public native Expression getReceiver();

    @JsProperty( name = "receiver")
    public native void setReceiver( Expression value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(set,465,,P(d449))
      * TE Signature : S(set,P(d449))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@10201
     */
    public native WritePropExpr set(Expression value);
}
