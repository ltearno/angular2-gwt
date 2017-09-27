package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".Node
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:290
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Node")
public class Node
{

    /*
        Properties
    */

    public ParseSourceSpan sourceSpan;

    @JsProperty( name = "sourceSpan")
    public native ParseSourceSpan getSourceSpan();

    @JsProperty( name = "sourceSpan")
    public native void setSourceSpan( ParseSourceSpan value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(visit,3,,P(d548),P(d3))
      * TE Signature : S(visit,P(d548),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@352
     */
    public native Object visit(Visitor visitor, Object context);
}
