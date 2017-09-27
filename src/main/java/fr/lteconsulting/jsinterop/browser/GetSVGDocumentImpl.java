package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: GetSVGDocument
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:729540
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GetSVGDocument")
public class GetSVGDocumentImpl implements GetSVGDocument
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(getSVGDocument,281,,)
      * TE Signature : S(getSVGDocument,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@729573
     */
    public native Document getSVGDocument();
}
