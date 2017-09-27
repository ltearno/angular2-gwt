package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: XMLSerializer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:719294
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:719381
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XMLSerializer")
public class XMLSerializer
{

    /*
        Constructors
    */
    public XMLSerializer(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(serializeToString,1,,P(d86))
      * TE Signature : S(serializeToString,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@719326
     */
    public native String serializeToString(Node target);
}
