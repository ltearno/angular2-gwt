package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: DOMImplementation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:321742
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322073
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMImplementation")
public class DOMImplementation
{

    /*
        Constructors
    */
    public DOMImplementation(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(createDocument,281,,P(d1),P(d1),P(d123))
      * TE Signature : S(createDocument,P(d1),P(d1),P(d123))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@321778
     */
    public native Document createDocument(String namespaceURI, String qualifiedName, DocumentType doctype);
    /** 
      * Std Signature : S(createDocumentType,123,,P(d1),P(d1),P(d1))
      * TE Signature : S(createDocumentType,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@321890
     */
    public native DocumentType createDocumentType(String qualifiedName, String publicId, String systemId);
    /** 
      * Std Signature : S(createHTMLDocument,281,,P(d1))
      * TE Signature : S(createHTMLDocument,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@321987
     */
    public native Document createHTMLDocument(String title);
    /** 
      * Std Signature : S(hasFeature,27,,)
      * TE Signature : S(hasFeature,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@322036
     */
    public native Boolean hasFeature();
}
