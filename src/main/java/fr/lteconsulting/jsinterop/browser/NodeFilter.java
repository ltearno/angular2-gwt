package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NodeFilter
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:534446
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:534518
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NodeFilter")
public class NodeFilter
{

    /*
        Static properties
    */

    @JsProperty(namespace="NodeFilter", name="FILTER_ACCEPT")
    public static Number FILTER_ACCEPT;

    @JsProperty(namespace="NodeFilter", name="FILTER_REJECT")
    public static Number FILTER_REJECT;

    @JsProperty(namespace="NodeFilter", name="FILTER_SKIP")
    public static Number FILTER_SKIP;

    @JsProperty(namespace="NodeFilter", name="SHOW_ALL")
    public static Number SHOW_ALL;

    @JsProperty(namespace="NodeFilter", name="SHOW_ATTRIBUTE")
    public static Number SHOW_ATTRIBUTE;

    @JsProperty(namespace="NodeFilter", name="SHOW_CDATA_SECTION")
    public static Number SHOW_CDATA_SECTION;

    @JsProperty(namespace="NodeFilter", name="SHOW_COMMENT")
    public static Number SHOW_COMMENT;

    @JsProperty(namespace="NodeFilter", name="SHOW_DOCUMENT")
    public static Number SHOW_DOCUMENT;

    @JsProperty(namespace="NodeFilter", name="SHOW_DOCUMENT_FRAGMENT")
    public static Number SHOW_DOCUMENT_FRAGMENT;

    @JsProperty(namespace="NodeFilter", name="SHOW_DOCUMENT_TYPE")
    public static Number SHOW_DOCUMENT_TYPE;

    @JsProperty(namespace="NodeFilter", name="SHOW_ELEMENT")
    public static Number SHOW_ELEMENT;

    @JsProperty(namespace="NodeFilter", name="SHOW_ENTITY")
    public static Number SHOW_ENTITY;

    @JsProperty(namespace="NodeFilter", name="SHOW_ENTITY_REFERENCE")
    public static Number SHOW_ENTITY_REFERENCE;

    @JsProperty(namespace="NodeFilter", name="SHOW_NOTATION")
    public static Number SHOW_NOTATION;

    @JsProperty(namespace="NodeFilter", name="SHOW_PROCESSING_INSTRUCTION")
    public static Number SHOW_PROCESSING_INSTRUCTION;

    @JsProperty(namespace="NodeFilter", name="SHOW_TEXT")
    public static Number SHOW_TEXT;

    /*
        Methods
    */
    /** 
      * Std Signature : S(acceptNode,2,,P(d86))
      * TE Signature : S(acceptNode,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@534475
     */
    public native Number acceptNode(Node n);
}
