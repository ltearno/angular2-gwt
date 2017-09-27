package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ReadKeyExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:10241
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ReadKeyExpr")
public class ReadKeyExpr extends Expression
{

    /*
        Constructors
    */
    public ReadKeyExpr(Expression receiver, Expression index, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Expression index;

    @JsProperty( name = "index")
    public native Expression getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Expression value );

    public Expression receiver;

    @JsProperty( name = "receiver")
    public native Expression getReceiver();

    @JsProperty( name = "receiver")
    public native void setReceiver( Expression value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(set,464,,P(d449))
      * TE Signature : S(set,P(d449))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@10532
     */
    public native WriteKeyExpr set(Expression value);
}
