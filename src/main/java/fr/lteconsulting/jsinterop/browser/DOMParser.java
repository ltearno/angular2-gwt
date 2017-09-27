package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: DOMParser
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322160
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322263
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMParser")
public class DOMParser
{

    /*
        Constructors
    */
    public DOMParser(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(parseFromString,281,,P(d1),P(d1))
      * TE Signature : S(parseFromString,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@322188
     */
    public native Document parseFromString(String source, String mimeType);
}
