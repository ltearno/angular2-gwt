package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: XSLTProcessor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:721530
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:721996
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XSLTProcessor")
public class XSLTProcessor
{

    /*
        Constructors
    */
    public XSLTProcessor(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearParameters,289,,)
      * TE Signature : S(clearParameters,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721562
     */
    public native void clearParameters();
    /** 
      * Std Signature : S(getParameter,3,,P(d1),P(d1))
      * TE Signature : S(getParameter,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721591
     */
    public native Object getParameter(String namespaceURI, String localName);
    /** 
      * Std Signature : S(importStylesheet,289,,P(d86))
      * TE Signature : S(importStylesheet,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721655
     */
    public native void importStylesheet(Node style);
    /** 
      * Std Signature : S(removeParameter,289,,P(d1),P(d1))
      * TE Signature : S(removeParameter,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721696
     */
    public native void removeParameter(String namespaceURI, String localName);
    /** 
      * Std Signature : S(reset,289,,)
      * TE Signature : S(reset,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721764
     */
    public native void reset();
    /** 
      * Std Signature : S(setParameter,289,,P(d1),P(d1),P(d3))
      * TE Signature : S(setParameter,P(d1),P(d1),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721783
     */
    public native void setParameter(String namespaceURI, String localName, Object value);
    /** 
      * Std Signature : S(transformToDocument,281,,P(d86))
      * TE Signature : S(transformToDocument,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721860
     */
    public native Document transformToDocument(Node source);
    /** 
      * Std Signature : S(transformToFragment,389,,P(d86),P(d281))
      * TE Signature : S(transformToFragment,P(d86),P(d281))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@721909
     */
    public native DocumentFragment transformToFragment(Node source, Document document);
}
