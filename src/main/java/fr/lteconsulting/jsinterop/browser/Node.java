package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Node
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:531504
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:533613
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Node extends EventTarget
{

    /*
        Properties
    */

    @JsProperty( name = "attributes")
    NamedNodeMap getAttributes();

    @JsProperty( name = "attributes")
    void setAttributes( NamedNodeMap value );

    @JsProperty( name = "baseURI")
    String getBaseURI();

    @JsProperty( name = "baseURI")
    void setBaseURI( String value );

    @JsProperty( name = "childNodes")
    NodeList getChildNodes();

    @JsProperty( name = "childNodes")
    void setChildNodes( NodeList value );

    @JsProperty( name = "firstChild")
    Node getFirstChild();

    @JsProperty( name = "firstChild")
    void setFirstChild( Node value );

    @JsProperty( name = "lastChild")
    Node getLastChild();

    @JsProperty( name = "lastChild")
    void setLastChild( Node value );

    @JsProperty( name = "localName")
    String getLocalName();

    @JsProperty( name = "localName")
    void setLocalName( String value );

    @JsProperty( name = "namespaceURI")
    String getNamespaceURI();

    @JsProperty( name = "namespaceURI")
    void setNamespaceURI( String value );

    @JsProperty( name = "nextSibling")
    Node getNextSibling();

    @JsProperty( name = "nextSibling")
    void setNextSibling( Node value );

    @JsProperty( name = "nodeName")
    String getNodeName();

    @JsProperty( name = "nodeName")
    void setNodeName( String value );

    @JsProperty( name = "nodeType")
    Number getNodeType();

    @JsProperty( name = "nodeType")
    void setNodeType( Number value );

    @JsProperty( name = "nodeValue")
    String getNodeValue();

    @JsProperty( name = "nodeValue")
    void setNodeValue( String value );

    @JsProperty( name = "ownerDocument")
    Document getOwnerDocument();

    @JsProperty( name = "ownerDocument")
    void setOwnerDocument( Document value );

    @JsProperty( name = "parentElement")
    HTMLElement getParentElement();

    @JsProperty( name = "parentElement")
    void setParentElement( HTMLElement value );

    @JsProperty( name = "parentNode")
    Node getParentNode();

    @JsProperty( name = "parentNode")
    void setParentNode( Node value );

    @JsProperty( name = "previousSibling")
    Node getPreviousSibling();

    @JsProperty( name = "previousSibling")
    void setPreviousSibling( Node value );

    @JsProperty( name = "textContent")
    String getTextContent();

    @JsProperty( name = "textContent")
    void setTextContent( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(appendChild,T-,T-,P(dT-))
      * TE Signature : S(appendChild,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532144
     */
    <T> T appendChild(T newChild);
    /** 
      * Std Signature : S(cloneNode,86,,)
      * TE Signature : S(cloneNode,)
      * 
     */
    Node cloneNode();
    /** 
      * Std Signature : S(cloneNode,86,,P(d27))
      * TE Signature : S(cloneNode,P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532193
     */
    Node cloneNode(Boolean deep /* optional */);
    /** 
      * Std Signature : S(compareDocumentPosition,2,,P(d86))
      * TE Signature : S(compareDocumentPosition,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532230
     */
    Number compareDocumentPosition(Node other);
    /** 
      * Std Signature : S(contains,27,,P(d86))
      * TE Signature : S(contains,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532280
     */
    Boolean contains(Node child);
    /** 
      * Std Signature : S(hasAttributes,27,,)
      * TE Signature : S(hasAttributes,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532316
     */
    Boolean hasAttributes();
    /** 
      * Std Signature : S(hasChildNodes,27,,)
      * TE Signature : S(hasChildNodes,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532346
     */
    Boolean hasChildNodes();
    /** 
      * Std Signature : S(insertBefore,86,,P(d86),P(d86))
      * TE Signature : S(insertBefore,P(d86),P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532376
     */
    Node insertBefore(Node newChild, Node refChild);
    /** 
      * Std Signature : S(isDefaultNamespace,27,,P(d1))
      * TE Signature : S(isDefaultNamespace,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532439
     */
    Boolean isDefaultNamespace(String namespaceURI);
    /** 
      * Std Signature : S(isEqualNode,27,,P(d86))
      * TE Signature : S(isEqualNode,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532501
     */
    Boolean isEqualNode(Node arg);
    /** 
      * Std Signature : S(isSameNode,27,,P(d86))
      * TE Signature : S(isSameNode,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532538
     */
    Boolean isSameNode(Node other);
    /** 
      * Std Signature : S(lookupNamespaceURI,1,,P(d1))
      * TE Signature : S(lookupNamespaceURI,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532576
     */
    String lookupNamespaceURI(String prefix);
    /** 
      * Std Signature : S(lookupPrefix,1,,P(d1))
      * TE Signature : S(lookupPrefix,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532638
     */
    String lookupPrefix(String namespaceURI);
    /** 
      * Std Signature : S(normalize,289,,)
      * TE Signature : S(normalize,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532700
     */
    void normalize();
    /** 
      * Std Signature : S(removeChild,86,,P(d86))
      * TE Signature : S(removeChild,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532723
     */
    Node removeChild(Node oldChild);
    /** 
      * Std Signature : S(replaceChild,86,,P(d86),P(d86))
      * TE Signature : S(replaceChild,P(d86),P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@532762
     */
    Node replaceChild(Node newChild, Node oldChild);
}
