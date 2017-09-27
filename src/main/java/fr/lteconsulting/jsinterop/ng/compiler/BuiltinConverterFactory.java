package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter".BuiltinConverterFactory
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts:1052
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="BuiltinConverterFactory")
public class BuiltinConverterFactory
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(createLiteralArrayConverter,F--S(?,449,,P(d7<2>))------),,P(d2))
      * TE Signature : S(createLiteralArrayConverter,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts@1100
     */
    public native BuiltinConverter createLiteralArrayConverter(Number argCount);
    /** 
      * Std Signature : S(createLiteralMapConverter,F--S(?,449,,P(d7<2>))------),,P(d7<3>))
      * TE Signature : S(createLiteralMapConverter,P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts@1169
     */
    public native BuiltinConverter createLiteralMapConverter(Array<Object> keys);
    /** 
      * Std Signature : S(createPipeConverter,F--S(?,449,,P(d7<2>))------),,P(d1),P(d2))
      * TE Signature : S(createPipeConverter,P(d1),P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts@1281
     */
    public native BuiltinConverter createPipeConverter(String name, Number argCount);
}
