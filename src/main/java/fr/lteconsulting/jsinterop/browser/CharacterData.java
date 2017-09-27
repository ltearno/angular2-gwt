package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CharacterData
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:314692
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315069
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CharacterData")
public class CharacterData implements Node, ChildNode
{

    /*
        Constructors
    */
    public CharacterData(){
    }

    /*
        Properties
    */

    public Number ATTRIBUTE_NODE;

    @JsProperty( name = "ATTRIBUTE_NODE")
    public native Number getATTRIBUTE_NODE();

    @JsProperty( name = "ATTRIBUTE_NODE")
    public native void setATTRIBUTE_NODE( Number value );

    public Number CDATA_SECTION_NODE;

    @JsProperty( name = "CDATA_SECTION_NODE")
    public native Number getCDATA_SECTION_NODE();

    @JsProperty( name = "CDATA_SECTION_NODE")
    public native void setCDATA_SECTION_NODE( Number value );

    public Number COMMENT_NODE;

    @JsProperty( name = "COMMENT_NODE")
    public native Number getCOMMENT_NODE();

    @JsProperty( name = "COMMENT_NODE")
    public native void setCOMMENT_NODE( Number value );

    public Number DOCUMENT_FRAGMENT_NODE;

    @JsProperty( name = "DOCUMENT_FRAGMENT_NODE")
    public native Number getDOCUMENT_FRAGMENT_NODE();

    @JsProperty( name = "DOCUMENT_FRAGMENT_NODE")
    public native void setDOCUMENT_FRAGMENT_NODE( Number value );

    public Number DOCUMENT_NODE;

    @JsProperty( name = "DOCUMENT_NODE")
    public native Number getDOCUMENT_NODE();

    @JsProperty( name = "DOCUMENT_NODE")
    public native void setDOCUMENT_NODE( Number value );

    public Number DOCUMENT_POSITION_CONTAINED_BY;

    @JsProperty( name = "DOCUMENT_POSITION_CONTAINED_BY")
    public native Number getDOCUMENT_POSITION_CONTAINED_BY();

    @JsProperty( name = "DOCUMENT_POSITION_CONTAINED_BY")
    public native void setDOCUMENT_POSITION_CONTAINED_BY( Number value );

    public Number DOCUMENT_POSITION_CONTAINS;

    @JsProperty( name = "DOCUMENT_POSITION_CONTAINS")
    public native Number getDOCUMENT_POSITION_CONTAINS();

    @JsProperty( name = "DOCUMENT_POSITION_CONTAINS")
    public native void setDOCUMENT_POSITION_CONTAINS( Number value );

    public Number DOCUMENT_POSITION_DISCONNECTED;

    @JsProperty( name = "DOCUMENT_POSITION_DISCONNECTED")
    public native Number getDOCUMENT_POSITION_DISCONNECTED();

    @JsProperty( name = "DOCUMENT_POSITION_DISCONNECTED")
    public native void setDOCUMENT_POSITION_DISCONNECTED( Number value );

    public Number DOCUMENT_POSITION_FOLLOWING;

    @JsProperty( name = "DOCUMENT_POSITION_FOLLOWING")
    public native Number getDOCUMENT_POSITION_FOLLOWING();

    @JsProperty( name = "DOCUMENT_POSITION_FOLLOWING")
    public native void setDOCUMENT_POSITION_FOLLOWING( Number value );

    public Number DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC;

    @JsProperty( name = "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    public native Number getDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC();

    @JsProperty( name = "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    public native void setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC( Number value );

    public Number DOCUMENT_POSITION_PRECEDING;

    @JsProperty( name = "DOCUMENT_POSITION_PRECEDING")
    public native Number getDOCUMENT_POSITION_PRECEDING();

    @JsProperty( name = "DOCUMENT_POSITION_PRECEDING")
    public native void setDOCUMENT_POSITION_PRECEDING( Number value );

    public Number DOCUMENT_TYPE_NODE;

    @JsProperty( name = "DOCUMENT_TYPE_NODE")
    public native Number getDOCUMENT_TYPE_NODE();

    @JsProperty( name = "DOCUMENT_TYPE_NODE")
    public native void setDOCUMENT_TYPE_NODE( Number value );

    public Number ELEMENT_NODE;

    @JsProperty( name = "ELEMENT_NODE")
    public native Number getELEMENT_NODE();

    @JsProperty( name = "ELEMENT_NODE")
    public native void setELEMENT_NODE( Number value );

    public Number ENTITY_NODE;

    @JsProperty( name = "ENTITY_NODE")
    public native Number getENTITY_NODE();

    @JsProperty( name = "ENTITY_NODE")
    public native void setENTITY_NODE( Number value );

    public Number ENTITY_REFERENCE_NODE;

    @JsProperty( name = "ENTITY_REFERENCE_NODE")
    public native Number getENTITY_REFERENCE_NODE();

    @JsProperty( name = "ENTITY_REFERENCE_NODE")
    public native void setENTITY_REFERENCE_NODE( Number value );

    public Number NOTATION_NODE;

    @JsProperty( name = "NOTATION_NODE")
    public native Number getNOTATION_NODE();

    @JsProperty( name = "NOTATION_NODE")
    public native void setNOTATION_NODE( Number value );

    public Number PROCESSING_INSTRUCTION_NODE;

    @JsProperty( name = "PROCESSING_INSTRUCTION_NODE")
    public native Number getPROCESSING_INSTRUCTION_NODE();

    @JsProperty( name = "PROCESSING_INSTRUCTION_NODE")
    public native void setPROCESSING_INSTRUCTION_NODE( Number value );

    public Number TEXT_NODE;

    @JsProperty( name = "TEXT_NODE")
    public native Number getTEXT_NODE();

    @JsProperty( name = "TEXT_NODE")
    public native void setTEXT_NODE( Number value );

    public NamedNodeMap attributes;

    @JsProperty( name = "attributes")
    public native NamedNodeMap getAttributes();

    @JsProperty( name = "attributes")
    public native void setAttributes( NamedNodeMap value );

    public String baseURI;

    @JsProperty( name = "baseURI")
    public native String getBaseURI();

    @JsProperty( name = "baseURI")
    public native void setBaseURI( String value );

    public NodeList childNodes;

    @JsProperty( name = "childNodes")
    public native NodeList getChildNodes();

    @JsProperty( name = "childNodes")
    public native void setChildNodes( NodeList value );

    public String data;

    @JsProperty( name = "data")
    public native String getData();

    @JsProperty( name = "data")
    public native void setData( String value );

    public Node firstChild;

    @JsProperty( name = "firstChild")
    public native Node getFirstChild();

    @JsProperty( name = "firstChild")
    public native void setFirstChild( Node value );

    public Node lastChild;

    @JsProperty( name = "lastChild")
    public native Node getLastChild();

    @JsProperty( name = "lastChild")
    public native void setLastChild( Node value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public String localName;

    @JsProperty( name = "localName")
    public native String getLocalName();

    @JsProperty( name = "localName")
    public native void setLocalName( String value );

    public String namespaceURI;

    @JsProperty( name = "namespaceURI")
    public native String getNamespaceURI();

    @JsProperty( name = "namespaceURI")
    public native void setNamespaceURI( String value );

    public Node nextSibling;

    @JsProperty( name = "nextSibling")
    public native Node getNextSibling();

    @JsProperty( name = "nextSibling")
    public native void setNextSibling( Node value );

    public String nodeName;

    @JsProperty( name = "nodeName")
    public native String getNodeName();

    @JsProperty( name = "nodeName")
    public native void setNodeName( String value );

    public Number nodeType;

    @JsProperty( name = "nodeType")
    public native Number getNodeType();

    @JsProperty( name = "nodeType")
    public native void setNodeType( Number value );

    public String nodeValue;

    @JsProperty( name = "nodeValue")
    public native String getNodeValue();

    @JsProperty( name = "nodeValue")
    public native void setNodeValue( String value );

    public Document ownerDocument;

    @JsProperty( name = "ownerDocument")
    public native Document getOwnerDocument();

    @JsProperty( name = "ownerDocument")
    public native void setOwnerDocument( Document value );

    public HTMLElement parentElement;

    @JsProperty( name = "parentElement")
    public native HTMLElement getParentElement();

    @JsProperty( name = "parentElement")
    public native void setParentElement( HTMLElement value );

    public Node parentNode;

    @JsProperty( name = "parentNode")
    public native Node getParentNode();

    @JsProperty( name = "parentNode")
    public native void setParentNode( Node value );

    public Node previousSibling;

    @JsProperty( name = "previousSibling")
    public native Node getPreviousSibling();

    @JsProperty( name = "previousSibling")
    public native void setPreviousSibling( Node value );

    public String textContent;

    @JsProperty( name = "textContent")
    public native String getTextContent();

    @JsProperty( name = "textContent")
    public native void setTextContent( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1))
      * TE Signature : S(addEventListener,P(d1))
      * 
     */
    public native void addEventListener(String type);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(appendChild,T-,T-,P(dT-))
      * TE Signature : S(appendChild,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T> T appendChild(T newChild);
    /** 
      * Std Signature : S(appendData,289,,P(d1))
      * TE Signature : S(appendData,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@314795
     */
    public native void appendData(String arg);
    /** 
      * Std Signature : S(cloneNode,86,,)
      * TE Signature : S(cloneNode,)
      * 
     */
    public native Node cloneNode();
    /** 
      * Std Signature : S(cloneNode,86,,P(d27))
      * TE Signature : S(cloneNode,P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Node cloneNode(Boolean deep /* optional */);
    /** 
      * Std Signature : S(compareDocumentPosition,2,,P(d86))
      * TE Signature : S(compareDocumentPosition,P(d86))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number compareDocumentPosition(Node other);
    /** 
      * Std Signature : S(contains,27,,P(d86))
      * TE Signature : S(contains,P(d86))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean contains(Node child);
    /** 
      * Std Signature : S(deleteData,289,,P(d2),P(d2))
      * TE Signature : S(deleteData,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@314830
     */
    public native void deleteData(Number offset, Number count);
    /** 
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(hasAttributes,27,,)
      * TE Signature : S(hasAttributes,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean hasAttributes();
    /** 
      * Std Signature : S(hasChildNodes,27,,)
      * TE Signature : S(hasChildNodes,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean hasChildNodes();
    /** 
      * Std Signature : S(insertBefore,86,,P(d86),P(d86))
      * TE Signature : S(insertBefore,P(d86),P(d86))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Node insertBefore(Node newChild, Node refChild);
    /** 
      * Std Signature : S(insertData,289,,P(d2),P(d1))
      * TE Signature : S(insertData,P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@314883
     */
    public native void insertData(Number offset, String arg);
    /** 
      * Std Signature : S(isDefaultNamespace,27,,P(d1))
      * TE Signature : S(isDefaultNamespace,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean isDefaultNamespace(String namespaceURI);
    /** 
      * Std Signature : S(isEqualNode,27,,P(d86))
      * TE Signature : S(isEqualNode,P(d86))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean isEqualNode(Node arg);
    /** 
      * Std Signature : S(isSameNode,27,,P(d86))
      * TE Signature : S(isSameNode,P(d86))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean isSameNode(Node other);
    /** 
      * Std Signature : S(lookupNamespaceURI,1,,P(d1))
      * TE Signature : S(lookupNamespaceURI,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String lookupNamespaceURI(String prefix);
    /** 
      * Std Signature : S(lookupPrefix,1,,P(d1))
      * TE Signature : S(lookupPrefix,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String lookupPrefix(String namespaceURI);
    /** 
      * Std Signature : S(normalize,289,,)
      * TE Signature : S(normalize,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void normalize();
    /** 
      * Std Signature : S(remove,289,,)
      * TE Signature : S(remove,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void remove();
    /** 
      * Std Signature : S(removeChild,86,,P(d86))
      * TE Signature : S(removeChild,P(d86))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Node removeChild(Node oldChild);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1))
      * TE Signature : S(removeEventListener,P(d1))
      * 
     */
    public native void removeEventListener(String type);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138))
      * TE Signature : S(removeEventListener,P(d1),P(d138))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(replaceChild,86,,P(d86),P(d86))
      * TE Signature : S(replaceChild,P(d86),P(d86))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Node replaceChild(Node newChild, Node oldChild);
    /** 
      * Std Signature : S(replaceData,289,,P(d2),P(d2),P(d1))
      * TE Signature : S(replaceData,P(d2),P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@314934
     */
    public native void replaceData(Number offset, Number count, String arg);
    /** 
      * Std Signature : S(substringData,1,,P(d2),P(d2))
      * TE Signature : S(substringData,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@315001
     */
    public native String substringData(Number offset, Number count);
}
