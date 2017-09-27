package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser".Parser
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser.d.ts:815
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Parser")
public class Parser
{

    /*
        Constructors
    */
    public Parser(Function1<String, TagDefinition> getTagDefinition){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(getTagDefinition,859,,P(d1))
      * TE Signature : S(getTagDefinition,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser.d.ts@868
     */
    public native TagDefinition getTagDefinition(String tagName);
    /** 
      * Std Signature : S(parse,563,,P(d1),P(d1))
      * TE Signature : S(parse,P(d1),P(d1))
      * 
     */
    public native ParseTreeResult parse(String source, String url);
    /** 
      * Std Signature : S(parse,563,,P(d1),P(d1),P(d27))
      * TE Signature : S(parse,P(d1),P(d1),P(d27))
      * 
     */
    public native ParseTreeResult parse(String source, String url, Boolean parseExpansionForms /* optional */);
    /** 
      * Std Signature : S(parse,563,,P(d1),P(d1),P(d27),P(d546))
      * TE Signature : S(parse,P(d1),P(d1),P(d27),P(d546))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser.d.ts@979
     */
    public native ParseTreeResult parse(String source, String url, Boolean parseExpansionForms /* optional */, InterpolationConfig interpolationConfig /* optional */);
}
