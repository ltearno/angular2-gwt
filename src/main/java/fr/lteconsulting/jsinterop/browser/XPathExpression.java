package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: XPathExpression
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:719865
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:719997
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathExpression")
public class XPathExpression
{

    /*
        Constructors
    */
    public XPathExpression(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(evaluate,130,,P(d86),P(d2),P(d130))
      * TE Signature : S(evaluate,P(d86),P(d2),P(d130))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@719899
     */
    public native XPathResult evaluate(Node contextNode, Number type, XPathResult result);
}
