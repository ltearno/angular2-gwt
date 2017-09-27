package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".RecursiveAstVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:8626
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="RecursiveAstVisitor")
public class RecursiveAstVisitor extends AstVisitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(visitAll,3,,P(d7<504>),P(d3))
      * TE Signature : S(visitAll,P(d7),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts@9828
     */
    public native Object visitAll(Array<AST> asts, Object context);
}
