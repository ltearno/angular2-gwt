package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/ml_parser/xml_parser".XmlParser
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/ml_parser/xml_parser.d.ts:309
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="XmlParser")
public class XmlParser extends Parser
{

    /*
        Constructors
    */
    public XmlParser(){
        super(null);
    }

    /*
        Methods
    */
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
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/ml_parser/xml_parser.d.ts@381
     */
    public native ParseTreeResult parse(String source, String url, Boolean parseExpansionForms /* optional */);
}
