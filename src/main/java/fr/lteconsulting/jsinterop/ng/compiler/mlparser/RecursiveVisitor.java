package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".RecursiveVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:2899
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="RecursiveVisitor")
public class RecursiveVisitor extends Visitor
{

    /*
        Constructors
    */
    public RecursiveVisitor(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(visitChildren,3,T-,P(d3),P(d3))
      * TE Signature : S(visitChildren,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts@3302
     */
    public native <T> Object visitChildren(Object context, Object cb);
}
