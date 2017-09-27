package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: XPathEvaluator
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:719456
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:719787
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathEvaluator")
public class XPathEvaluator
{

    /*
        Constructors
    */
    public XPathEvaluator(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(createExpression,391,,P(d1),P(d131))
      * TE Signature : S(createExpression,P(d1),P(d131))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@719489
     */
    public native XPathExpression createExpression(String expression, XPathNSResolver resolver);
    /** 
      * Std Signature : S(createNSResolver,131,,)
      * TE Signature : S(createNSResolver,)
      * 
     */
    public native XPathNSResolver createNSResolver();
    /** 
      * Std Signature : S(createNSResolver,131,,P(d86))
      * TE Signature : S(createNSResolver,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@719575
     */
    public native XPathNSResolver createNSResolver(Node nodeResolver /* optional */);
    /** 
      * Std Signature : S(evaluate,130,,P(d1),P(d86),P(d131),P(d2),P(d130))
      * TE Signature : S(evaluate,P(d1),P(d86),P(d131),P(d2),P(d130))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@719635
     */
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, Number type, XPathResult result);
}
