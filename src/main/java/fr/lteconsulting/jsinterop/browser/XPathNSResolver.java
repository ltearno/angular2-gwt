package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: XPathNSResolver
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:720078
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:720170
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathNSResolver")
public class XPathNSResolver
{

    /*
        Constructors
    */
    public XPathNSResolver(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(lookupNamespaceURI,1,,P(d1))
      * TE Signature : S(lookupNamespaceURI,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@720112
     */
    public native String lookupNamespaceURI(String prefix);
}
