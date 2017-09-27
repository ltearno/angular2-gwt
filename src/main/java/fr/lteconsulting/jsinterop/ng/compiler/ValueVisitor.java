package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util".ValueVisitor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts:645
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="ValueVisitor")
public class ValueVisitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(visitArray,3,,P(d7<3>),P(d3))
      * TE Signature : S(visitArray,P(d7),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts@682
     */
    public native Object visitArray(Array<Object> arr, Object context);
    /** 
      * Std Signature : S(visitOther,3,,P(d3),P(d3))
      * TE Signature : S(visitOther,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts@861
     */
    public native Object visitOther(Object value, Object context);
    /** 
      * Std Signature : S(visitPrimitive,3,,P(d3),P(d3))
      * TE Signature : S(visitPrimitive,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts@810
     */
    public native Object visitPrimitive(Object value, Object context);
    /** 
      * Std Signature : S(visitStringMap,3,,P(dC(----3----)),P(d3))
      * TE Signature : S(visitStringMap,P(dC(----3----)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts@729
     */
    public native Object visitStringMap(AnonymousType717 map, Object context);
}
