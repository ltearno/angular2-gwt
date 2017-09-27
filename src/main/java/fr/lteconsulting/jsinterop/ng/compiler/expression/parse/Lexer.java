package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer".Lexer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts:154
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="Lexer")
public class Lexer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(tokenize,7<854>,,P(d1))
      * TE Signature : S(tokenize,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@188
     */
    public native Array<Token> tokenize(String text);
}
