package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".AST
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:531
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="AST")
public class AST
{

    /*
        Constructors
    */
    public AST(ParseSpan span){
    }

    /*
        Properties
    */

    public ParseSpan span;

    @JsProperty( name = "span")
    public native ParseSpan getSpan();

    @JsProperty( name = "span")
    public native void setSpan( ParseSpan value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(visit,3,,P(d505))
      * TE Signature : S(visit,P(d505))
      * 
     */
    public native Object visit(AstVisitor visitor);
    /** 
      * Std Signature : S(visit,3,,P(d505),P(d3))
      * TE Signature : S(visit,P(d505),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@618
     */
    public native Object visit(AstVisitor visitor, Object context /* optional */);
}
