package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.compiler.output.Expression;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter".LocalResolver
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts:371
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="LocalResolver")
public class LocalResolver
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(getLocal,449,,P(d1))
      * TE Signature : S(getLocal,P(d1))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts@409
     */
    public native Expression getLocal(String name);
}
