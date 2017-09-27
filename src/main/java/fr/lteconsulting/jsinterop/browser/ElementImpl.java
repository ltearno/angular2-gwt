package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Element
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:366410
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:371731
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Element")
public class ElementImpl implements Element
{

    /*
        Constructors
    */
    public ElementImpl(){
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

    public HTMLSlotElement assignedSlot;

    @JsProperty( name = "assignedSlot")
    public native HTMLSlotElement getAssignedSlot();

    @JsProperty( name = "assignedSlot")
    public native void setAssignedSlot( HTMLSlotElement value );

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

    public Number childElementCount;

    @JsProperty( name = "childElementCount")
    public native Number getChildElementCount();

    @JsProperty( name = "childElementCount")
    public native void setChildElementCount( Number value );

    public NodeList childNodes;

    @JsProperty( name = "childNodes")
    public native NodeList getChildNodes();

    @JsProperty( name = "childNodes")
    public native void setChildNodes( NodeList value );

    public HTMLCollection children;

    @JsProperty( name = "children")
    public native HTMLCollection getChildren();

    @JsProperty( name = "children")
    public native void setChildren( HTMLCollection value );

    public DOMTokenList classList;

    @JsProperty( name = "classList")
    public native DOMTokenList getClassList();

    @JsProperty( name = "classList")
    public native void setClassList( DOMTokenList value );

    @JsProperty(name="className")
    public String cssClassName;

    @JsProperty( name = "className")
    public native String getCssClassName();

    @JsProperty( name = "className")
    public native void setCssClassName( String value );

    public Number clientHeight;

    @JsProperty( name = "clientHeight")
    public native Number getClientHeight();

    @JsProperty( name = "clientHeight")
    public native void setClientHeight( Number value );

    public Number clientLeft;

    @JsProperty( name = "clientLeft")
    public native Number getClientLeft();

    @JsProperty( name = "clientLeft")
    public native void setClientLeft( Number value );

    public Number clientTop;

    @JsProperty( name = "clientTop")
    public native Number getClientTop();

    @JsProperty( name = "clientTop")
    public native void setClientTop( Number value );

    public Number clientWidth;

    @JsProperty( name = "clientWidth")
    public native Number getClientWidth();

    @JsProperty( name = "clientWidth")
    public native void setClientWidth( Number value );

    public Node firstChild;

    @JsProperty( name = "firstChild")
    public native Node getFirstChild();

    @JsProperty( name = "firstChild")
    public native void setFirstChild( Node value );

    public Element firstElementChild;

    @JsProperty( name = "firstElementChild")
    public native Element getFirstElementChild();

    @JsProperty( name = "firstElementChild")
    public native void setFirstElementChild( Element value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public String innerHTML;

    @JsProperty( name = "innerHTML")
    public native String getInnerHTML();

    @JsProperty( name = "innerHTML")
    public native void setInnerHTML( String value );

    public Node lastChild;

    @JsProperty( name = "lastChild")
    public native Node getLastChild();

    @JsProperty( name = "lastChild")
    public native void setLastChild( Node value );

    public Element lastElementChild;

    @JsProperty( name = "lastElementChild")
    public native Element getLastElementChild();

    @JsProperty( name = "lastElementChild")
    public native void setLastElementChild( Element value );

    public String localName;

    @JsProperty( name = "localName")
    public native String getLocalName();

    @JsProperty( name = "localName")
    public native void setLocalName( String value );

    public Number msContentZoomFactor;

    @JsProperty( name = "msContentZoomFactor")
    public native Number getMsContentZoomFactor();

    @JsProperty( name = "msContentZoomFactor")
    public native void setMsContentZoomFactor( Number value );

    public String msRegionOverflow;

    @JsProperty( name = "msRegionOverflow")
    public native String getMsRegionOverflow();

    @JsProperty( name = "msRegionOverflow")
    public native void setMsRegionOverflow( String value );

    public String namespaceURI;

    @JsProperty( name = "namespaceURI")
    public native String getNamespaceURI();

    @JsProperty( name = "namespaceURI")
    public native void setNamespaceURI( String value );

    public Element nextElementSibling;

    @JsProperty( name = "nextElementSibling")
    public native Element getNextElementSibling();

    @JsProperty( name = "nextElementSibling")
    public native void setNextElementSibling( Element value );

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

    public Function1<Event, Object> onariarequest;

    @JsProperty( name = "onariarequest")
    public native Function1<Event, Object> getOnariarequest();

    @JsProperty( name = "onariarequest")
    public native void setOnariarequest( Function1<Event, Object> value );

    public Function1<Event, Object> oncommand;

    @JsProperty( name = "oncommand")
    public native Function1<Event, Object> getOncommand();

    @JsProperty( name = "oncommand")
    public native void setOncommand( Function1<Event, Object> value );

    public Function1<PointerEvent, Object> ongotpointercapture;

    @JsProperty( name = "ongotpointercapture")
    public native Function1<PointerEvent, Object> getOngotpointercapture();

    @JsProperty( name = "ongotpointercapture")
    public native void setOngotpointercapture( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onlostpointercapture;

    @JsProperty( name = "onlostpointercapture")
    public native Function1<PointerEvent, Object> getOnlostpointercapture();

    @JsProperty( name = "onlostpointercapture")
    public native void setOnlostpointercapture( Function1<PointerEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturechange;

    @JsProperty( name = "onmsgesturechange")
    public native Function1<MSGestureEvent, Object> getOnmsgesturechange();

    @JsProperty( name = "onmsgesturechange")
    public native void setOnmsgesturechange( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturedoubletap;

    @JsProperty( name = "onmsgesturedoubletap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturedoubletap();

    @JsProperty( name = "onmsgesturedoubletap")
    public native void setOnmsgesturedoubletap( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgestureend;

    @JsProperty( name = "onmsgestureend")
    public native Function1<MSGestureEvent, Object> getOnmsgestureend();

    @JsProperty( name = "onmsgestureend")
    public native void setOnmsgestureend( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturehold;

    @JsProperty( name = "onmsgesturehold")
    public native Function1<MSGestureEvent, Object> getOnmsgesturehold();

    @JsProperty( name = "onmsgesturehold")
    public native void setOnmsgesturehold( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturestart;

    @JsProperty( name = "onmsgesturestart")
    public native Function1<MSGestureEvent, Object> getOnmsgesturestart();

    @JsProperty( name = "onmsgesturestart")
    public native void setOnmsgesturestart( Function1<MSGestureEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsgesturetap;

    @JsProperty( name = "onmsgesturetap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturetap();

    @JsProperty( name = "onmsgesturetap")
    public native void setOnmsgesturetap( Function1<MSGestureEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmsgotpointercapture;

    @JsProperty( name = "onmsgotpointercapture")
    public native Function1<MSPointerEvent, Object> getOnmsgotpointercapture();

    @JsProperty( name = "onmsgotpointercapture")
    public native void setOnmsgotpointercapture( Function1<MSPointerEvent, Object> value );

    public Function1<MSGestureEvent, Object> onmsinertiastart;

    @JsProperty( name = "onmsinertiastart")
    public native Function1<MSGestureEvent, Object> getOnmsinertiastart();

    @JsProperty( name = "onmsinertiastart")
    public native void setOnmsinertiastart( Function1<MSGestureEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmslostpointercapture;

    @JsProperty( name = "onmslostpointercapture")
    public native Function1<MSPointerEvent, Object> getOnmslostpointercapture();

    @JsProperty( name = "onmslostpointercapture")
    public native void setOnmslostpointercapture( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointercancel;

    @JsProperty( name = "onmspointercancel")
    public native Function1<MSPointerEvent, Object> getOnmspointercancel();

    @JsProperty( name = "onmspointercancel")
    public native void setOnmspointercancel( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerdown;

    @JsProperty( name = "onmspointerdown")
    public native Function1<MSPointerEvent, Object> getOnmspointerdown();

    @JsProperty( name = "onmspointerdown")
    public native void setOnmspointerdown( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerenter;

    @JsProperty( name = "onmspointerenter")
    public native Function1<MSPointerEvent, Object> getOnmspointerenter();

    @JsProperty( name = "onmspointerenter")
    public native void setOnmspointerenter( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerleave;

    @JsProperty( name = "onmspointerleave")
    public native Function1<MSPointerEvent, Object> getOnmspointerleave();

    @JsProperty( name = "onmspointerleave")
    public native void setOnmspointerleave( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointermove;

    @JsProperty( name = "onmspointermove")
    public native Function1<MSPointerEvent, Object> getOnmspointermove();

    @JsProperty( name = "onmspointermove")
    public native void setOnmspointermove( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerout;

    @JsProperty( name = "onmspointerout")
    public native Function1<MSPointerEvent, Object> getOnmspointerout();

    @JsProperty( name = "onmspointerout")
    public native void setOnmspointerout( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerover;

    @JsProperty( name = "onmspointerover")
    public native Function1<MSPointerEvent, Object> getOnmspointerover();

    @JsProperty( name = "onmspointerover")
    public native void setOnmspointerover( Function1<MSPointerEvent, Object> value );

    public Function1<MSPointerEvent, Object> onmspointerup;

    @JsProperty( name = "onmspointerup")
    public native Function1<MSPointerEvent, Object> getOnmspointerup();

    @JsProperty( name = "onmspointerup")
    public native void setOnmspointerup( Function1<MSPointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointercancel;

    @JsProperty( name = "onpointercancel")
    public native Function1<PointerEvent, Object> getOnpointercancel();

    @JsProperty( name = "onpointercancel")
    public native void setOnpointercancel( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerdown;

    @JsProperty( name = "onpointerdown")
    public native Function1<PointerEvent, Object> getOnpointerdown();

    @JsProperty( name = "onpointerdown")
    public native void setOnpointerdown( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerenter;

    @JsProperty( name = "onpointerenter")
    public native Function1<PointerEvent, Object> getOnpointerenter();

    @JsProperty( name = "onpointerenter")
    public native void setOnpointerenter( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerleave;

    @JsProperty( name = "onpointerleave")
    public native Function1<PointerEvent, Object> getOnpointerleave();

    @JsProperty( name = "onpointerleave")
    public native void setOnpointerleave( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointermove;

    @JsProperty( name = "onpointermove")
    public native Function1<PointerEvent, Object> getOnpointermove();

    @JsProperty( name = "onpointermove")
    public native void setOnpointermove( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerout;

    @JsProperty( name = "onpointerout")
    public native Function1<PointerEvent, Object> getOnpointerout();

    @JsProperty( name = "onpointerout")
    public native void setOnpointerout( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerover;

    @JsProperty( name = "onpointerover")
    public native Function1<PointerEvent, Object> getOnpointerover();

    @JsProperty( name = "onpointerover")
    public native void setOnpointerover( Function1<PointerEvent, Object> value );

    public Function1<PointerEvent, Object> onpointerup;

    @JsProperty( name = "onpointerup")
    public native Function1<PointerEvent, Object> getOnpointerup();

    @JsProperty( name = "onpointerup")
    public native void setOnpointerup( Function1<PointerEvent, Object> value );

    public Function1<TouchEvent, Object> ontouchcancel;

    @JsProperty( name = "ontouchcancel")
    public native Function1<TouchEvent, Object> getOntouchcancel();

    @JsProperty( name = "ontouchcancel")
    public native void setOntouchcancel( Function1<TouchEvent, Object> value );

    public Function1<TouchEvent, Object> ontouchend;

    @JsProperty( name = "ontouchend")
    public native Function1<TouchEvent, Object> getOntouchend();

    @JsProperty( name = "ontouchend")
    public native void setOntouchend( Function1<TouchEvent, Object> value );

    public Function1<TouchEvent, Object> ontouchmove;

    @JsProperty( name = "ontouchmove")
    public native Function1<TouchEvent, Object> getOntouchmove();

    @JsProperty( name = "ontouchmove")
    public native void setOntouchmove( Function1<TouchEvent, Object> value );

    public Function1<TouchEvent, Object> ontouchstart;

    @JsProperty( name = "ontouchstart")
    public native Function1<TouchEvent, Object> getOntouchstart();

    @JsProperty( name = "ontouchstart")
    public native void setOntouchstart( Function1<TouchEvent, Object> value );

    public Function1<Event, Object> onwebkitfullscreenchange;

    @JsProperty( name = "onwebkitfullscreenchange")
    public native Function1<Event, Object> getOnwebkitfullscreenchange();

    @JsProperty( name = "onwebkitfullscreenchange")
    public native void setOnwebkitfullscreenchange( Function1<Event, Object> value );

    public Function1<Event, Object> onwebkitfullscreenerror;

    @JsProperty( name = "onwebkitfullscreenerror")
    public native Function1<Event, Object> getOnwebkitfullscreenerror();

    @JsProperty( name = "onwebkitfullscreenerror")
    public native void setOnwebkitfullscreenerror( Function1<Event, Object> value );

    public Function1<WheelEvent, Object> onwheel;

    @JsProperty( name = "onwheel")
    public native Function1<WheelEvent, Object> getOnwheel();

    @JsProperty( name = "onwheel")
    public native void setOnwheel( Function1<WheelEvent, Object> value );

    public String outerHTML;

    @JsProperty( name = "outerHTML")
    public native String getOuterHTML();

    @JsProperty( name = "outerHTML")
    public native void setOuterHTML( String value );

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

    public String prefix;

    @JsProperty( name = "prefix")
    public native String getPrefix();

    @JsProperty( name = "prefix")
    public native void setPrefix( String value );

    public Element previousElementSibling;

    @JsProperty( name = "previousElementSibling")
    public native Element getPreviousElementSibling();

    @JsProperty( name = "previousElementSibling")
    public native void setPreviousElementSibling( Element value );

    public Node previousSibling;

    @JsProperty( name = "previousSibling")
    public native Node getPreviousSibling();

    @JsProperty( name = "previousSibling")
    public native void setPreviousSibling( Node value );

    public Number scrollHeight;

    @JsProperty( name = "scrollHeight")
    public native Number getScrollHeight();

    @JsProperty( name = "scrollHeight")
    public native void setScrollHeight( Number value );

    public Number scrollLeft;

    @JsProperty( name = "scrollLeft")
    public native Number getScrollLeft();

    @JsProperty( name = "scrollLeft")
    public native void setScrollLeft( Number value );

    public Number scrollTop;

    @JsProperty( name = "scrollTop")
    public native Number getScrollTop();

    @JsProperty( name = "scrollTop")
    public native void setScrollTop( Number value );

    public Number scrollWidth;

    @JsProperty( name = "scrollWidth")
    public native Number getScrollWidth();

    @JsProperty( name = "scrollWidth")
    public native void setScrollWidth( Number value );

    public ShadowRoot shadowRoot;

    @JsProperty( name = "shadowRoot")
    public native ShadowRoot getShadowRoot();

    @JsProperty( name = "shadowRoot")
    public native void setShadowRoot( ShadowRoot value );

    public String slot;

    @JsProperty( name = "slot")
    public native String getSlot();

    @JsProperty( name = "slot")
    public native void setSlot( String value );

    public String tagName;

    @JsProperty( name = "tagName")
    public native String getTagName();

    @JsProperty( name = "tagName")
    public native void setTagName( String value );

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
      * Std Signature : S(attachShadow,374,,P(d137))
      * TE Signature : S(attachShadow,P(d137))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371395
     */
    public native ShadowRoot attachShadow(ShadowRootInit shadowRootInitDict);
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
      * Std Signature : S(closest,49,,P(d1))
      * TE Signature : S(closest,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370815
     */
    public native Element closest(String selector);
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
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(getAttribute,1,,P(d1))
      * TE Signature : S(getAttribute,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368813
     */
    public native String getAttribute(String name);
    /** 
      * Std Signature : S(getAttributeNS,1,,P(d1),P(d1))
      * TE Signature : S(getAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368860
     */
    public native String getAttributeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(getAttributeNode,43,,P(d1))
      * TE Signature : S(getAttributeNode,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368929
     */
    public native Attr getAttributeNode(String name);
    /** 
      * Std Signature : S(getAttributeNodeNS,43,,P(d1),P(d1))
      * TE Signature : S(getAttributeNodeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368971
     */
    public native Attr getAttributeNodeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(getBoundingClientRect,375,,)
      * TE Signature : S(getBoundingClientRect,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369042
     */
    public native ClientRect getBoundingClientRect();
    /** 
      * Std Signature : S(getClientRects,376,,)
      * TE Signature : S(getClientRects,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369083
     */
    public native ClientRectList getClientRects();
    /** 
      * Std Signature : S(getElementsByClassName,377<49>,,P(d1))
      * TE Signature : S(getElementsByClassName,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370706
     */
    public native NodeListOf<Element> getElementsByClassName(String classNames);
    /** 
      * Std Signature : S(getElementsByTagName,377<49>,,P(d1))
      * TE Signature : S(getElementsByTagName,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369221
     */
    public native NodeListOf<Element> getElementsByTagName(String name);
    /** 
      * Std Signature : S(getElementsByTagNameNS,378<240>,,P(d1),P(d1))
      * TE Signature : S(getElementsByTagNameNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369282
     */
    public native HTMLCollectionOf<HTMLElement> getElementsByTagNameNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(hasAttribute,27,,P(d1))
      * TE Signature : S(hasAttribute,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369623
     */
    public native Boolean hasAttribute(String name);
    /** 
      * Std Signature : S(hasAttributeNS,27,,P(d1),P(d1))
      * TE Signature : S(hasAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369664
     */
    public native Boolean hasAttributeNS(String namespaceURI, String localName);
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
      * Std Signature : S(insertAdjacentElement,49,,P(d1),P(d49))
      * TE Signature : S(insertAdjacentElement,P(d1),P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371190
     */
    public native Element insertAdjacentElement(String position, Element insertedElement);
    /** 
      * Std Signature : S(insertAdjacentHTML,289,,P(d1),P(d1))
      * TE Signature : S(insertAdjacentHTML,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371277
     */
    public native void insertAdjacentHTML(String where, String html);
    /** 
      * Std Signature : S(insertAdjacentText,289,,P(d1),P(d1))
      * TE Signature : S(insertAdjacentText,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371336
     */
    public native void insertAdjacentText(String where, String text);
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
      * Std Signature : S(matches,27,,P(d1))
      * TE Signature : S(matches,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370775
     */
    public native Boolean matches(String selector);
    /** 
      * Std Signature : S(msGetRegionContent,379,,)
      * TE Signature : S(msGetRegionContent,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369734
     */
    public native MSRangeCollection msGetRegionContent();
    /** 
      * Std Signature : S(msGetUntransformedBounds,375,,)
      * TE Signature : S(msGetUntransformedBounds,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369779
     */
    public native ClientRect msGetUntransformedBounds();
    /** 
      * Std Signature : S(msMatchesSelector,27,,P(d1))
      * TE Signature : S(msMatchesSelector,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369823
     */
    public native Boolean msMatchesSelector(String selectors);
    /** 
      * Std Signature : S(msReleasePointerCapture,289,,P(d2))
      * TE Signature : S(msReleasePointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369874
     */
    public native void msReleasePointerCapture(Number pointerId);
    /** 
      * Std Signature : S(msSetPointerCapture,289,,P(d2))
      * TE Signature : S(msSetPointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369928
     */
    public native void msSetPointerCapture(Number pointerId);
    /** 
      * Std Signature : S(msZoomTo,289,,P(d134))
      * TE Signature : S(msZoomTo,P(d134))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369978
     */
    public native void msZoomTo(MsZoomToOptions args);
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
      * Std Signature : S(querySelector,49,,P(d1))
      * TE Signature : S(querySelector,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Element querySelector(String selectors);
    /** 
      * Std Signature : S(querySelectorAll,377<49>,,P(d1))
      * TE Signature : S(querySelectorAll,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native NodeListOf<Element> querySelectorAll(String selectors);
    /** 
      * Std Signature : S(releasePointerCapture,289,,P(d2))
      * TE Signature : S(releasePointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370021
     */
    public native void releasePointerCapture(Number pointerId);
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
      * Std Signature : S(removeAttribute,289,,P(d1))
      * TE Signature : S(removeAttribute,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370073
     */
    public native void removeAttribute(String qualifiedName);
    /** 
      * Std Signature : S(removeAttributeNS,289,,P(d1),P(d1))
      * TE Signature : S(removeAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370123
     */
    public native void removeAttributeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(removeAttributeNode,43,,P(d43))
      * TE Signature : S(removeAttributeNode,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370193
     */
    public native Attr removeAttributeNode(Attr oldAttr);
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
      * Std Signature : S(requestFullscreen,289,,)
      * TE Signature : S(requestFullscreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370239
     */
    public native void requestFullscreen();
    /** 
      * Std Signature : S(requestPointerLock,289,,)
      * TE Signature : S(requestPointerLock,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370270
     */
    public native void requestPointerLock();
    /** 
      * Std Signature : S(scroll,289,,)
      * TE Signature : S(scroll,)
      * 
     */
    public native void scroll();
    /** 
      * Std Signature : S(scroll,289,,P(d136))
      * TE Signature : S(scroll,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370927
     */
    public native void scroll(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scroll,289,,P(d2),P(d2))
      * TE Signature : S(scroll,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370972
      * VERSION 1
     */
    public native void scroll(Number x, Number y);
    /** 
      * Std Signature : S(scrollBy,289,,)
      * TE Signature : S(scrollBy,)
      * 
     */
    public native void scrollBy();
    /** 
      * Std Signature : S(scrollBy,289,,P(d136))
      * TE Signature : S(scrollBy,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371101
     */
    public native void scrollBy(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollBy,289,,P(d2),P(d2))
      * TE Signature : S(scrollBy,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371148
      * VERSION 1
     */
    public native void scrollBy(Number x, Number y);
    /** 
      * Std Signature : S(scrollIntoView,289,,)
      * TE Signature : S(scrollIntoView,)
      * 
     */
    public native void scrollIntoView();
    /** 
      * Std Signature : S(scrollIntoView,289,,P(d135))
      * TE Signature : S(scrollIntoView,P(d135))
      * 
     */
    public native void scrollIntoView(ScrollIntoViewOptions arg /* optional */);
    /** 
      * Std Signature : S(scrollIntoView,289,,P(d27))
      * TE Signature : S(scrollIntoView,P(d27))
      * 
     */
    public native void scrollIntoView(Boolean arg /* optional */);
    /** 
      * Std Signature : S(scrollIntoView,289,,P(dU(-27,135)))
      * TE Signature : S(scrollIntoView,P(dU(-27,135)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370862
     */
    public native void scrollIntoView(UnionOfBooleanAndScrollIntoViewOptions arg /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,)
      * TE Signature : S(scrollTo,)
      * 
     */
    public native void scrollTo();
    /** 
      * Std Signature : S(scrollTo,289,,P(d136))
      * TE Signature : S(scrollTo,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371012
     */
    public native void scrollTo(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,P(d2),P(d2))
      * TE Signature : S(scrollTo,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371059
      * VERSION 1
     */
    public native void scrollTo(Number x, Number y);
    /** 
      * Std Signature : S(setAttribute,289,,P(d1),P(d1))
      * TE Signature : S(setAttribute,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370302
     */
    public native void setAttribute(String name, String value);
    /** 
      * Std Signature : S(setAttributeNS,289,,P(d1),P(d1),P(d1))
      * TE Signature : S(setAttributeNS,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370355
     */
    public native void setAttributeNS(String namespaceURI, String qualifiedName, String value);
    /** 
      * Std Signature : S(setAttributeNode,43,,P(d43))
      * TE Signature : S(setAttributeNode,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370441
     */
    public native Attr setAttributeNode(Attr newAttr);
    /** 
      * Std Signature : S(setAttributeNodeNS,43,,P(d43))
      * TE Signature : S(setAttributeNodeNS,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370484
     */
    public native Attr setAttributeNodeNS(Attr newAttr);
    /** 
      * Std Signature : S(setPointerCapture,289,,P(d2))
      * TE Signature : S(setPointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370529
     */
    public native void setPointerCapture(Number pointerId);
    /** 
      * Std Signature : S(webkitMatchesSelector,27,,P(d1))
      * TE Signature : S(webkitMatchesSelector,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370577
     */
    public native Boolean webkitMatchesSelector(String selectors);
    /** 
      * Std Signature : S(webkitRequestFullScreen,289,,)
      * TE Signature : S(webkitRequestFullScreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370632
     */
    public native void webkitRequestFullScreen();
    /** 
      * Std Signature : S(webkitRequestFullscreen,289,,)
      * TE Signature : S(webkitRequestFullscreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370669
     */
    public native void webkitRequestFullscreen();
}
