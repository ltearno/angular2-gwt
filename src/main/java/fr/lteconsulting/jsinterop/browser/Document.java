package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Document
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:329754
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:363316
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Document")
public class Document implements Node, GlobalEventHandlers, NodeSelector, DocumentEvent, ParentNode, DocumentOrShadowRoot
{

    /*
        Constructors
    */
    public Document(){
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

    /** 
      * Sets or gets the URL for the current document. 
     */
    public String URL;

    @JsProperty( name = "URL")
    public native String getURL();

    @JsProperty( name = "URL")
    public native void setURL( String value );

    /** 
      * Gets the URL for the document, stripped of any character encoding.
     */
    public String URLUnencoded;

    @JsProperty( name = "URLUnencoded")
    public native String getURLUnencoded();

    @JsProperty( name = "URLUnencoded")
    public native void setURLUnencoded( String value );

    public Element activeElement;

    @JsProperty( name = "activeElement")
    public native Element getActiveElement();

    @JsProperty( name = "activeElement")
    public native void setActiveElement( Element value );

    /** 
      * Sets or gets the color of all active links in the document.
     */
    public String alinkColor;

    @JsProperty( name = "alinkColor")
    public native String getAlinkColor();

    @JsProperty( name = "alinkColor")
    public native void setAlinkColor( String value );

    /** 
      * Returns a reference to the collection of elements contained by the object.
     */
    public HTMLAllCollection all;

    @JsProperty( name = "all")
    public native HTMLAllCollection getAll();

    @JsProperty( name = "all")
    public native void setAll( HTMLAllCollection value );

    /** 
      * Retrieves a collection of all a objects that have a name and/or id property. Objects in this collection are in HTML source order.
     */
    public HTMLCollectionOf<HTMLAnchorElement> anchors;

    @JsProperty( name = "anchors")
    public native HTMLCollectionOf<HTMLAnchorElement> getAnchors();

    @JsProperty( name = "anchors")
    public native void setAnchors( HTMLCollectionOf<HTMLAnchorElement> value );

    /** 
      * Retrieves a collection of all applet objects in the document.
     */
    public HTMLCollectionOf<HTMLAppletElement> applets;

    @JsProperty( name = "applets")
    public native HTMLCollectionOf<HTMLAppletElement> getApplets();

    @JsProperty( name = "applets")
    public native void setApplets( HTMLCollectionOf<HTMLAppletElement> value );

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

    /** 
      * Deprecated. Sets or retrieves a value that indicates the background color behind the object. 
     */
    public String bgColor;

    @JsProperty( name = "bgColor")
    public native String getBgColor();

    @JsProperty( name = "bgColor")
    public native void setBgColor( String value );

    /** 
      * Specifies the beginning and end of the document body.
     */
    public HTMLElement body;

    @JsProperty( name = "body")
    public native HTMLElement getBody();

    @JsProperty( name = "body")
    public native void setBody( HTMLElement value );

    public String characterSet;

    @JsProperty( name = "characterSet")
    public native String getCharacterSet();

    @JsProperty( name = "characterSet")
    public native void setCharacterSet( String value );

    /** 
      * Gets or sets the character set used to encode the object.
     */
    public String charset;

    @JsProperty( name = "charset")
    public native String getCharset();

    @JsProperty( name = "charset")
    public native void setCharset( String value );

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

    /** 
      * Gets a value that indicates whether standards-compliant mode is switched on for the object.
     */
    public String compatMode;

    @JsProperty( name = "compatMode")
    public native String getCompatMode();

    @JsProperty( name = "compatMode")
    public native void setCompatMode( String value );

    public String cookie;

    @JsProperty( name = "cookie")
    public native String getCookie();

    @JsProperty( name = "cookie")
    public native void setCookie( String value );

    public UnionOfHTMLScriptElementAndSVGScriptElement currentScript;

    @JsProperty( name = "currentScript")
    public native UnionOfHTMLScriptElementAndSVGScriptElement getCurrentScript();

    @JsProperty( name = "currentScript")
    public native void setCurrentScript( UnionOfHTMLScriptElementAndSVGScriptElement value );

    @JsOverlay
    public final void setCurrentScript( HTMLScriptElement value ) { setCurrentScript(UnionOfHTMLScriptElementAndSVGScriptElement.ofHTMLScriptElement( value )); }

    @JsOverlay
    public final void setCurrentScript( SVGScriptElement value ) { setCurrentScript(UnionOfHTMLScriptElementAndSVGScriptElement.ofSVGScriptElement( value )); }

    public Window defaultView;

    @JsProperty( name = "defaultView")
    public native Window getDefaultView();

    @JsProperty( name = "defaultView")
    public native void setDefaultView( Window value );

    /** 
      * Sets or gets a value that indicates whether the document can be edited.
     */
    public String designMode;

    @JsProperty( name = "designMode")
    public native String getDesignMode();

    @JsProperty( name = "designMode")
    public native void setDesignMode( String value );

    /** 
      * Sets or retrieves a value that indicates the reading order of the object. 
     */
    public String dir;

    @JsProperty( name = "dir")
    public native String getDir();

    @JsProperty( name = "dir")
    public native void setDir( String value );

    /** 
      * Gets an object representing the document type declaration associated with the current document. 
     */
    public DocumentType doctype;

    @JsProperty( name = "doctype")
    public native DocumentType getDoctype();

    @JsProperty( name = "doctype")
    public native void setDoctype( DocumentType value );

    /** 
      * Gets a reference to the root node of the document. 
     */
    public HTMLElement documentElement;

    @JsProperty( name = "documentElement")
    public native HTMLElement getDocumentElement();

    @JsProperty( name = "documentElement")
    public native void setDocumentElement( HTMLElement value );

    /** 
      * Sets or gets the security domain of the document. 
     */
    public String domain;

    @JsProperty( name = "domain")
    public native String getDomain();

    @JsProperty( name = "domain")
    public native void setDomain( String value );

    /** 
      * Retrieves a collection of all embed objects in the document.
     */
    public HTMLCollectionOf<HTMLEmbedElement> embeds;

    @JsProperty( name = "embeds")
    public native HTMLCollectionOf<HTMLEmbedElement> getEmbeds();

    @JsProperty( name = "embeds")
    public native void setEmbeds( HTMLCollectionOf<HTMLEmbedElement> value );

    /** 
      * Sets or gets the foreground (text) color of the document.
     */
    public String fgColor;

    @JsProperty( name = "fgColor")
    public native String getFgColor();

    @JsProperty( name = "fgColor")
    public native void setFgColor( String value );

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

    /** 
      * Retrieves a collection, in source order, of all form objects in the document.
     */
    public HTMLCollectionOf<HTMLFormElement> forms;

    @JsProperty( name = "forms")
    public native HTMLCollectionOf<HTMLFormElement> getForms();

    @JsProperty( name = "forms")
    public native void setForms( HTMLCollectionOf<HTMLFormElement> value );

    public Element fullscreenElement;

    @JsProperty( name = "fullscreenElement")
    public native Element getFullscreenElement();

    @JsProperty( name = "fullscreenElement")
    public native void setFullscreenElement( Element value );

    public Boolean fullscreenEnabled;

    @JsProperty( name = "fullscreenEnabled")
    public native Boolean getFullscreenEnabled();

    @JsProperty( name = "fullscreenEnabled")
    public native void setFullscreenEnabled( Boolean value );

    public HTMLHeadElement head;

    @JsProperty( name = "head")
    public native HTMLHeadElement getHead();

    @JsProperty( name = "head")
    public native void setHead( HTMLHeadElement value );

    public Boolean hidden;

    @JsProperty( name = "hidden")
    public native Boolean getHidden();

    @JsProperty( name = "hidden")
    public native void setHidden( Boolean value );

    /** 
      * Retrieves a collection, in source order, of img objects in the document.
     */
    public HTMLCollectionOf<HTMLImageElement> images;

    @JsProperty( name = "images")
    public native HTMLCollectionOf<HTMLImageElement> getImages();

    @JsProperty( name = "images")
    public native void setImages( HTMLCollectionOf<HTMLImageElement> value );

    /** 
      * Gets the implementation object of the current document. 
     */
    public DOMImplementation implementation;

    @JsProperty( name = "implementation")
    public native DOMImplementation getImplementation();

    @JsProperty( name = "implementation")
    public native void setImplementation( DOMImplementation value );

    /** 
      * Returns the character encoding used to create the webpage that is loaded into the document object.
     */
    public String inputEncoding;

    @JsProperty( name = "inputEncoding")
    public native String getInputEncoding();

    @JsProperty( name = "inputEncoding")
    public native void setInputEncoding( String value );

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

    /** 
      * Gets the date that the page was last modified, if the page supplies one. 
     */
    public String lastModified;

    @JsProperty( name = "lastModified")
    public native String getLastModified();

    @JsProperty( name = "lastModified")
    public native void setLastModified( String value );

    /** 
      * Sets or gets the color of the document links. 
     */
    public String linkColor;

    @JsProperty( name = "linkColor")
    public native String getLinkColor();

    @JsProperty( name = "linkColor")
    public native void setLinkColor( String value );

    /** 
      * Retrieves a collection of all a objects that specify the href property and all area objects in the document.
     */
    public HTMLCollectionOf<UnionOfHTMLAnchorElementAndHTMLAreaElement> links;

    @JsProperty( name = "links")
    public native HTMLCollectionOf<UnionOfHTMLAnchorElementAndHTMLAreaElement> getLinks();

    @JsProperty( name = "links")
    public native void setLinks( HTMLCollectionOf<UnionOfHTMLAnchorElementAndHTMLAreaElement> value );

    public String localName;

    @JsProperty( name = "localName")
    public native String getLocalName();

    @JsProperty( name = "localName")
    public native void setLocalName( String value );

    /** 
      * Contains information about the current URL. 
     */
    public Location location;

    @JsProperty( name = "location")
    public native Location getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Location value );

    public Boolean msCSSOMElementFloatMetrics;

    @JsProperty( name = "msCSSOMElementFloatMetrics")
    public native Boolean getMsCSSOMElementFloatMetrics();

    @JsProperty( name = "msCSSOMElementFloatMetrics")
    public native void setMsCSSOMElementFloatMetrics( Boolean value );

    public Boolean msCapsLockWarningOff;

    @JsProperty( name = "msCapsLockWarningOff")
    public native Boolean getMsCapsLockWarningOff();

    @JsProperty( name = "msCapsLockWarningOff")
    public native void setMsCapsLockWarningOff( Boolean value );

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

    /** 
      * Fires when the user aborts the download.
     */
    public Function1<UIEvent, Object> onabort;

    @JsProperty( name = "onabort")
    public native Function1<UIEvent, Object> getOnabort();

    @JsProperty( name = "onabort")
    public native void setOnabort( Function1<UIEvent, Object> value );

    /** 
      * Fires when the object is set as the active element.
     */
    public Function1<UIEvent, Object> onactivate;

    @JsProperty( name = "onactivate")
    public native Function1<UIEvent, Object> getOnactivate();

    @JsProperty( name = "onactivate")
    public native void setOnactivate( Function1<UIEvent, Object> value );

    /** 
      * Fires immediately before the object is set as the active element.
     */
    public Function1<UIEvent, Object> onbeforeactivate;

    @JsProperty( name = "onbeforeactivate")
    public native Function1<UIEvent, Object> getOnbeforeactivate();

    @JsProperty( name = "onbeforeactivate")
    public native void setOnbeforeactivate( Function1<UIEvent, Object> value );

    /** 
      * Fires immediately before the activeElement is changed from the current object to another object in the parent document.
     */
    public Function1<UIEvent, Object> onbeforedeactivate;

    @JsProperty( name = "onbeforedeactivate")
    public native Function1<UIEvent, Object> getOnbeforedeactivate();

    @JsProperty( name = "onbeforedeactivate")
    public native void setOnbeforedeactivate( Function1<UIEvent, Object> value );

    /** 
      * Fires when the object loses the input focus. 
     */
    public Function1<FocusEvent, Object> onblur;

    @JsProperty( name = "onblur")
    public native Function1<FocusEvent, Object> getOnblur();

    @JsProperty( name = "onblur")
    public native void setOnblur( Function1<FocusEvent, Object> value );

    /** 
      * Occurs when playback is possible, but would require further buffering. 
     */
    public Function1<Event, Object> oncanplay;

    @JsProperty( name = "oncanplay")
    public native Function1<Event, Object> getOncanplay();

    @JsProperty( name = "oncanplay")
    public native void setOncanplay( Function1<Event, Object> value );

    public Function1<Event, Object> oncanplaythrough;

    @JsProperty( name = "oncanplaythrough")
    public native Function1<Event, Object> getOncanplaythrough();

    @JsProperty( name = "oncanplaythrough")
    public native void setOncanplaythrough( Function1<Event, Object> value );

    /** 
      * Fires when the contents of the object or selection have changed. 
     */
    public Function1<Event, Object> onchange;

    @JsProperty( name = "onchange")
    public native Function1<Event, Object> getOnchange();

    @JsProperty( name = "onchange")
    public native void setOnchange( Function1<Event, Object> value );

    /** 
      * Fires when the user clicks the left mouse button on the object
     */
    public Function1<MouseEvent, Object> onclick;

    @JsProperty( name = "onclick")
    public native Function1<MouseEvent, Object> getOnclick();

    @JsProperty( name = "onclick")
    public native void setOnclick( Function1<MouseEvent, Object> value );

    /** 
      * Fires when the user clicks the right mouse button in the client area, opening the context menu. 
     */
    public Function1<PointerEvent, Object> oncontextmenu;

    @JsProperty( name = "oncontextmenu")
    public native Function1<PointerEvent, Object> getOncontextmenu();

    @JsProperty( name = "oncontextmenu")
    public native void setOncontextmenu( Function1<PointerEvent, Object> value );

    /** 
      * Fires when the user double-clicks the object.
     */
    public Function1<MouseEvent, Object> ondblclick;

    @JsProperty( name = "ondblclick")
    public native Function1<MouseEvent, Object> getOndblclick();

    @JsProperty( name = "ondblclick")
    public native void setOndblclick( Function1<MouseEvent, Object> value );

    /** 
      * Fires when the activeElement is changed from the current object to another object in the parent document.
     */
    public Function1<UIEvent, Object> ondeactivate;

    @JsProperty( name = "ondeactivate")
    public native Function1<UIEvent, Object> getOndeactivate();

    @JsProperty( name = "ondeactivate")
    public native void setOndeactivate( Function1<UIEvent, Object> value );

    /** 
      * Fires on the source object continuously during a drag operation.
     */
    public Function1<DragEvent, Object> ondrag;

    @JsProperty( name = "ondrag")
    public native Function1<DragEvent, Object> getOndrag();

    @JsProperty( name = "ondrag")
    public native void setOndrag( Function1<DragEvent, Object> value );

    /** 
      * Fires on the source object when the user releases the mouse at the close of a drag operation.
     */
    public Function1<DragEvent, Object> ondragend;

    @JsProperty( name = "ondragend")
    public native Function1<DragEvent, Object> getOndragend();

    @JsProperty( name = "ondragend")
    public native void setOndragend( Function1<DragEvent, Object> value );

    /** 
      * Fires on the target element when the user drags the object to a valid drop target.
     */
    public Function1<DragEvent, Object> ondragenter;

    @JsProperty( name = "ondragenter")
    public native Function1<DragEvent, Object> getOndragenter();

    @JsProperty( name = "ondragenter")
    public native void setOndragenter( Function1<DragEvent, Object> value );

    /** 
      * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
     */
    public Function1<DragEvent, Object> ondragleave;

    @JsProperty( name = "ondragleave")
    public native Function1<DragEvent, Object> getOndragleave();

    @JsProperty( name = "ondragleave")
    public native void setOndragleave( Function1<DragEvent, Object> value );

    /** 
      * Fires on the target element continuously while the user drags the object over a valid drop target.
     */
    public Function1<DragEvent, Object> ondragover;

    @JsProperty( name = "ondragover")
    public native Function1<DragEvent, Object> getOndragover();

    @JsProperty( name = "ondragover")
    public native void setOndragover( Function1<DragEvent, Object> value );

    /** 
      * Fires on the source object when the user starts to drag a text selection or selected object. 
     */
    public Function1<DragEvent, Object> ondragstart;

    @JsProperty( name = "ondragstart")
    public native Function1<DragEvent, Object> getOndragstart();

    @JsProperty( name = "ondragstart")
    public native void setOndragstart( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondrop;

    @JsProperty( name = "ondrop")
    public native Function1<DragEvent, Object> getOndrop();

    @JsProperty( name = "ondrop")
    public native void setOndrop( Function1<DragEvent, Object> value );

    /** 
      * Occurs when the duration attribute is updated. 
     */
    public Function1<Event, Object> ondurationchange;

    @JsProperty( name = "ondurationchange")
    public native Function1<Event, Object> getOndurationchange();

    @JsProperty( name = "ondurationchange")
    public native void setOndurationchange( Function1<Event, Object> value );

    /** 
      * Occurs when the media element is reset to its initial state. 
     */
    public Function1<Event, Object> onemptied;

    @JsProperty( name = "onemptied")
    public native Function1<Event, Object> getOnemptied();

    @JsProperty( name = "onemptied")
    public native void setOnemptied( Function1<Event, Object> value );

    /** 
      * Occurs when the end of playback is reached. 
     */
    public Function1<MediaStreamErrorEvent, Object> onended;

    @JsProperty( name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();

    @JsProperty( name = "onended")
    public native void setOnended( Function1<MediaStreamErrorEvent, Object> value );

    /** 
      * Fires when an error occurs during object loading.
     */
    public Function1<ErrorEvent, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<ErrorEvent, Object> value );

    /** 
      * Fires when the object receives focus. 
     */
    public Function1<FocusEvent, Object> onfocus;

    @JsProperty( name = "onfocus")
    public native Function1<FocusEvent, Object> getOnfocus();

    @JsProperty( name = "onfocus")
    public native void setOnfocus( Function1<FocusEvent, Object> value );

    public Function1<Event, Object> onfullscreenchange;

    @JsProperty( name = "onfullscreenchange")
    public native Function1<Event, Object> getOnfullscreenchange();

    @JsProperty( name = "onfullscreenchange")
    public native void setOnfullscreenchange( Function1<Event, Object> value );

    public Function1<Event, Object> onfullscreenerror;

    @JsProperty( name = "onfullscreenerror")
    public native Function1<Event, Object> getOnfullscreenerror();

    @JsProperty( name = "onfullscreenerror")
    public native void setOnfullscreenerror( Function1<Event, Object> value );

    public Function1<Event, Object> oninput;

    @JsProperty( name = "oninput")
    public native Function1<Event, Object> getOninput();

    @JsProperty( name = "oninput")
    public native void setOninput( Function1<Event, Object> value );

    public Function1<Event, Object> oninvalid;

    @JsProperty( name = "oninvalid")
    public native Function1<Event, Object> getOninvalid();

    @JsProperty( name = "oninvalid")
    public native void setOninvalid( Function1<Event, Object> value );

    /** 
      * Fires when the user presses a key.
     */
    public Function1<KeyboardEvent, Object> onkeydown;

    @JsProperty( name = "onkeydown")
    public native Function1<KeyboardEvent, Object> getOnkeydown();

    @JsProperty( name = "onkeydown")
    public native void setOnkeydown( Function1<KeyboardEvent, Object> value );

    /** 
      * Fires when the user presses an alphanumeric key.
     */
    public Function1<KeyboardEvent, Object> onkeypress;

    @JsProperty( name = "onkeypress")
    public native Function1<KeyboardEvent, Object> getOnkeypress();

    @JsProperty( name = "onkeypress")
    public native void setOnkeypress( Function1<KeyboardEvent, Object> value );

    /** 
      * Fires when the user releases a key.
     */
    public Function1<KeyboardEvent, Object> onkeyup;

    @JsProperty( name = "onkeyup")
    public native Function1<KeyboardEvent, Object> getOnkeyup();

    @JsProperty( name = "onkeyup")
    public native void setOnkeyup( Function1<KeyboardEvent, Object> value );

    /** 
      * Fires immediately after the browser loads the object. 
     */
    public Function1<Event, Object> onload;

    @JsProperty( name = "onload")
    public native Function1<Event, Object> getOnload();

    @JsProperty( name = "onload")
    public native void setOnload( Function1<Event, Object> value );

    /** 
      * Occurs when media data is loaded at the current playback position. 
     */
    public Function1<Event, Object> onloadeddata;

    @JsProperty( name = "onloadeddata")
    public native Function1<Event, Object> getOnloadeddata();

    @JsProperty( name = "onloadeddata")
    public native void setOnloadeddata( Function1<Event, Object> value );

    /** 
      * Occurs when the duration and dimensions of the media have been determined.
     */
    public Function1<Event, Object> onloadedmetadata;

    @JsProperty( name = "onloadedmetadata")
    public native Function1<Event, Object> getOnloadedmetadata();

    @JsProperty( name = "onloadedmetadata")
    public native void setOnloadedmetadata( Function1<Event, Object> value );

    /** 
      * Occurs when Internet Explorer begins looking for media data. 
     */
    public Function1<Event, Object> onloadstart;

    @JsProperty( name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();

    @JsProperty( name = "onloadstart")
    public native void setOnloadstart( Function1<Event, Object> value );

    /** 
      * Fires when the user clicks the object with either mouse button. 
     */
    public Function1<MouseEvent, Object> onmousedown;

    @JsProperty( name = "onmousedown")
    public native Function1<MouseEvent, Object> getOnmousedown();

    @JsProperty( name = "onmousedown")
    public native void setOnmousedown( Function1<MouseEvent, Object> value );

    /** 
      * Fires when the user moves the mouse over the object. 
     */
    public Function1<MouseEvent, Object> onmousemove;

    @JsProperty( name = "onmousemove")
    public native Function1<MouseEvent, Object> getOnmousemove();

    @JsProperty( name = "onmousemove")
    public native void setOnmousemove( Function1<MouseEvent, Object> value );

    /** 
      * Fires when the user moves the mouse pointer outside the boundaries of the object. 
     */
    public Function1<MouseEvent, Object> onmouseout;

    @JsProperty( name = "onmouseout")
    public native Function1<MouseEvent, Object> getOnmouseout();

    @JsProperty( name = "onmouseout")
    public native void setOnmouseout( Function1<MouseEvent, Object> value );

    /** 
      * Fires when the user moves the mouse pointer into the object.
     */
    public Function1<MouseEvent, Object> onmouseover;

    @JsProperty( name = "onmouseover")
    public native Function1<MouseEvent, Object> getOnmouseover();

    @JsProperty( name = "onmouseover")
    public native void setOnmouseover( Function1<MouseEvent, Object> value );

    /** 
      * Fires when the user releases a mouse button while the mouse is over the object. 
     */
    public Function1<MouseEvent, Object> onmouseup;

    @JsProperty( name = "onmouseup")
    public native Function1<MouseEvent, Object> getOnmouseup();

    @JsProperty( name = "onmouseup")
    public native void setOnmouseup( Function1<MouseEvent, Object> value );

    /** 
      * Fires when the wheel button is rotated. 
     */
    public Function1<WheelEvent, Object> onmousewheel;

    @JsProperty( name = "onmousewheel")
    public native Function1<WheelEvent, Object> getOnmousewheel();

    @JsProperty( name = "onmousewheel")
    public native void setOnmousewheel( Function1<WheelEvent, Object> value );

    public Function1<UIEvent, Object> onmscontentzoom;

    @JsProperty( name = "onmscontentzoom")
    public native Function1<UIEvent, Object> getOnmscontentzoom();

    @JsProperty( name = "onmscontentzoom")
    public native void setOnmscontentzoom( Function1<UIEvent, Object> value );

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

    public Function1<MSGestureEvent, Object> onmsinertiastart;

    @JsProperty( name = "onmsinertiastart")
    public native Function1<MSGestureEvent, Object> getOnmsinertiastart();

    @JsProperty( name = "onmsinertiastart")
    public native void setOnmsinertiastart( Function1<MSGestureEvent, Object> value );

    public Function1<MSManipulationEvent, Object> onmsmanipulationstatechanged;

    @JsProperty( name = "onmsmanipulationstatechanged")
    public native Function1<MSManipulationEvent, Object> getOnmsmanipulationstatechanged();

    @JsProperty( name = "onmsmanipulationstatechanged")
    public native void setOnmsmanipulationstatechanged( Function1<MSManipulationEvent, Object> value );

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

    /** 
      * Occurs when an item is removed from a Jump List of a webpage running in Site Mode. 
     */
    public Function1<MSSiteModeEvent, Object> onmssitemodejumplistitemremoved;

    @JsProperty( name = "onmssitemodejumplistitemremoved")
    public native Function1<MSSiteModeEvent, Object> getOnmssitemodejumplistitemremoved();

    @JsProperty( name = "onmssitemodejumplistitemremoved")
    public native void setOnmssitemodejumplistitemremoved( Function1<MSSiteModeEvent, Object> value );

    /** 
      * Occurs when a user clicks a button in a Thumbnail Toolbar of a webpage running in Site Mode.
     */
    public Function1<MSSiteModeEvent, Object> onmsthumbnailclick;

    @JsProperty( name = "onmsthumbnailclick")
    public native Function1<MSSiteModeEvent, Object> getOnmsthumbnailclick();

    @JsProperty( name = "onmsthumbnailclick")
    public native void setOnmsthumbnailclick( Function1<MSSiteModeEvent, Object> value );

    /** 
      * Occurs when playback is paused.
     */
    public Function1<Event, Object> onpause;

    @JsProperty( name = "onpause")
    public native Function1<Event, Object> getOnpause();

    @JsProperty( name = "onpause")
    public native void setOnpause( Function1<Event, Object> value );

    /** 
      * Occurs when the play method is requested. 
     */
    public Function1<Event, Object> onplay;

    @JsProperty( name = "onplay")
    public native Function1<Event, Object> getOnplay();

    @JsProperty( name = "onplay")
    public native void setOnplay( Function1<Event, Object> value );

    /** 
      * Occurs when the audio or video has started playing. 
     */
    public Function1<Event, Object> onplaying;

    @JsProperty( name = "onplaying")
    public native Function1<Event, Object> getOnplaying();

    @JsProperty( name = "onplaying")
    public native void setOnplaying( Function1<Event, Object> value );

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

    public Function1<Event, Object> onpointerlockchange;

    @JsProperty( name = "onpointerlockchange")
    public native Function1<Event, Object> getOnpointerlockchange();

    @JsProperty( name = "onpointerlockchange")
    public native void setOnpointerlockchange( Function1<Event, Object> value );

    public Function1<Event, Object> onpointerlockerror;

    @JsProperty( name = "onpointerlockerror")
    public native Function1<Event, Object> getOnpointerlockerror();

    @JsProperty( name = "onpointerlockerror")
    public native void setOnpointerlockerror( Function1<Event, Object> value );

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

    /** 
      * Occurs to indicate progress while downloading media data. 
     */
    public Function1<ProgressEvent, Object> onprogress;

    @JsProperty( name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();

    @JsProperty( name = "onprogress")
    public native void setOnprogress( Function1<ProgressEvent, Object> value );

    /** 
      * Occurs when the playback rate is increased or decreased. 
     */
    public Function1<Event, Object> onratechange;

    @JsProperty( name = "onratechange")
    public native Function1<Event, Object> getOnratechange();

    @JsProperty( name = "onratechange")
    public native void setOnratechange( Function1<Event, Object> value );

    /** 
      * Fires when the state of the object has changed.
     */
    public Function1<Event, Object> onreadystatechange;

    @JsProperty( name = "onreadystatechange")
    public native Function1<Event, Object> getOnreadystatechange();

    @JsProperty( name = "onreadystatechange")
    public native void setOnreadystatechange( Function1<Event, Object> value );

    /** 
      * Fires when the user resets a form. 
     */
    public Function1<Event, Object> onreset;

    @JsProperty( name = "onreset")
    public native Function1<Event, Object> getOnreset();

    @JsProperty( name = "onreset")
    public native void setOnreset( Function1<Event, Object> value );

    /** 
      * Fires when the user repositions the scroll box in the scroll bar on the object. 
     */
    public Function1<UIEvent, Object> onscroll;

    @JsProperty( name = "onscroll")
    public native Function1<UIEvent, Object> getOnscroll();

    @JsProperty( name = "onscroll")
    public native void setOnscroll( Function1<UIEvent, Object> value );

    /** 
      * Occurs when the seek operation ends. 
     */
    public Function1<Event, Object> onseeked;

    @JsProperty( name = "onseeked")
    public native Function1<Event, Object> getOnseeked();

    @JsProperty( name = "onseeked")
    public native void setOnseeked( Function1<Event, Object> value );

    /** 
      * Occurs when the current playback position is moved. 
     */
    public Function1<Event, Object> onseeking;

    @JsProperty( name = "onseeking")
    public native Function1<Event, Object> getOnseeking();

    @JsProperty( name = "onseeking")
    public native void setOnseeking( Function1<Event, Object> value );

    /** 
      * Fires when the current selection changes.
     */
    public Function1<UIEvent, Object> onselect;

    @JsProperty( name = "onselect")
    public native Function1<UIEvent, Object> getOnselect();

    @JsProperty( name = "onselect")
    public native void setOnselect( Function1<UIEvent, Object> value );

    /** 
      * Fires when the selection state of a document changes.
     */
    public Function1<Event, Object> onselectionchange;

    @JsProperty( name = "onselectionchange")
    public native Function1<Event, Object> getOnselectionchange();

    @JsProperty( name = "onselectionchange")
    public native void setOnselectionchange( Function1<Event, Object> value );

    public Function1<Event, Object> onselectstart;

    @JsProperty( name = "onselectstart")
    public native Function1<Event, Object> getOnselectstart();

    @JsProperty( name = "onselectstart")
    public native void setOnselectstart( Function1<Event, Object> value );

    /** 
      * Occurs when the download has stopped. 
     */
    public Function1<Event, Object> onstalled;

    @JsProperty( name = "onstalled")
    public native Function1<Event, Object> getOnstalled();

    @JsProperty( name = "onstalled")
    public native void setOnstalled( Function1<Event, Object> value );

    /** 
      * Fires when the user clicks the Stop button or leaves the Web page.
     */
    public Function1<Event, Object> onstop;

    @JsProperty( name = "onstop")
    public native Function1<Event, Object> getOnstop();

    @JsProperty( name = "onstop")
    public native void setOnstop( Function1<Event, Object> value );

    public Function1<Event, Object> onsubmit;

    @JsProperty( name = "onsubmit")
    public native Function1<Event, Object> getOnsubmit();

    @JsProperty( name = "onsubmit")
    public native void setOnsubmit( Function1<Event, Object> value );

    /** 
      * Occurs if the load operation has been intentionally halted. 
     */
    public Function1<Event, Object> onsuspend;

    @JsProperty( name = "onsuspend")
    public native Function1<Event, Object> getOnsuspend();

    @JsProperty( name = "onsuspend")
    public native void setOnsuspend( Function1<Event, Object> value );

    /** 
      * Occurs to indicate the current playback position.
     */
    public Function1<Event, Object> ontimeupdate;

    @JsProperty( name = "ontimeupdate")
    public native Function1<Event, Object> getOntimeupdate();

    @JsProperty( name = "ontimeupdate")
    public native void setOntimeupdate( Function1<Event, Object> value );

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

    /** 
      * Occurs when the volume is changed, or playback is muted or unmuted.
     */
    public Function1<Event, Object> onvolumechange;

    @JsProperty( name = "onvolumechange")
    public native Function1<Event, Object> getOnvolumechange();

    @JsProperty( name = "onvolumechange")
    public native void setOnvolumechange( Function1<Event, Object> value );

    /** 
      * Occurs when playback stops because the next frame of a video resource is not available. 
     */
    public Function1<Event, Object> onwaiting;

    @JsProperty( name = "onwaiting")
    public native Function1<Event, Object> getOnwaiting();

    @JsProperty( name = "onwaiting")
    public native void setOnwaiting( Function1<Event, Object> value );

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

    public HTMLCollectionOf<HTMLEmbedElement> plugins;

    @JsProperty( name = "plugins")
    public native HTMLCollectionOf<HTMLEmbedElement> getPlugins();

    @JsProperty( name = "plugins")
    public native void setPlugins( HTMLCollectionOf<HTMLEmbedElement> value );

    public Element pointerLockElement;

    @JsProperty( name = "pointerLockElement")
    public native Element getPointerLockElement();

    @JsProperty( name = "pointerLockElement")
    public native void setPointerLockElement( Element value );

    public Node previousSibling;

    @JsProperty( name = "previousSibling")
    public native Node getPreviousSibling();

    @JsProperty( name = "previousSibling")
    public native void setPreviousSibling( Node value );

    /** 
      * Retrieves a value that indicates the current state of the object.
     */
    public String readyState;

    @JsProperty( name = "readyState")
    public native String getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( String value );

    /** 
      * Gets the URL of the location that referred the user to the current page.
     */
    public String referrer;

    @JsProperty( name = "referrer")
    public native String getReferrer();

    @JsProperty( name = "referrer")
    public native void setReferrer( String value );

    /** 
      * Gets the root svg element in the document hierarchy.
     */
    public SVGSVGElement rootElement;

    @JsProperty( name = "rootElement")
    public native SVGSVGElement getRootElement();

    @JsProperty( name = "rootElement")
    public native void setRootElement( SVGSVGElement value );

    /** 
      * Retrieves a collection of all script objects in the document.
     */
    public HTMLCollectionOf<HTMLScriptElement> scripts;

    @JsProperty( name = "scripts")
    public native HTMLCollectionOf<HTMLScriptElement> getScripts();

    @JsProperty( name = "scripts")
    public native void setScripts( HTMLCollectionOf<HTMLScriptElement> value );

    public Element scrollingElement;

    @JsProperty( name = "scrollingElement")
    public native Element getScrollingElement();

    @JsProperty( name = "scrollingElement")
    public native void setScrollingElement( Element value );

    /** 
      * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
     */
    public StyleSheetList styleSheets;

    @JsProperty( name = "styleSheets")
    public native StyleSheetList getStyleSheets();

    @JsProperty( name = "styleSheets")
    public native void setStyleSheets( StyleSheetList value );

    public StyleSheetList stylesheets;

    @JsProperty( name = "stylesheets")
    public native StyleSheetList getStylesheets();

    @JsProperty( name = "stylesheets")
    public native void setStylesheets( StyleSheetList value );

    public String textContent;

    @JsProperty( name = "textContent")
    public native String getTextContent();

    @JsProperty( name = "textContent")
    public native void setTextContent( String value );

    /** 
      * Contains the title of the document.
     */
    public String title;

    @JsProperty( name = "title")
    public native String getTitle();

    @JsProperty( name = "title")
    public native void setTitle( String value );

    public String visibilityState;

    @JsProperty( name = "visibilityState")
    public native String getVisibilityState();

    @JsProperty( name = "visibilityState")
    public native void setVisibilityState( String value );

    /** 
      * Sets or gets the color of the links that the user has visited.
     */
    public String vlinkColor;

    @JsProperty( name = "vlinkColor")
    public native String getVlinkColor();

    @JsProperty( name = "vlinkColor")
    public native void setVlinkColor( String value );

    public Element webkitCurrentFullScreenElement;

    @JsProperty( name = "webkitCurrentFullScreenElement")
    public native Element getWebkitCurrentFullScreenElement();

    @JsProperty( name = "webkitCurrentFullScreenElement")
    public native void setWebkitCurrentFullScreenElement( Element value );

    public Element webkitFullscreenElement;

    @JsProperty( name = "webkitFullscreenElement")
    public native Element getWebkitFullscreenElement();

    @JsProperty( name = "webkitFullscreenElement")
    public native void setWebkitFullscreenElement( Element value );

    public Boolean webkitFullscreenEnabled;

    @JsProperty( name = "webkitFullscreenEnabled")
    public native Boolean getWebkitFullscreenEnabled();

    @JsProperty( name = "webkitFullscreenEnabled")
    public native void setWebkitFullscreenEnabled( Boolean value );

    public Boolean webkitIsFullScreen;

    @JsProperty( name = "webkitIsFullScreen")
    public native Boolean getWebkitIsFullScreen();

    @JsProperty( name = "webkitIsFullScreen")
    public native void setWebkitIsFullScreen( Boolean value );

    public String xmlEncoding;

    @JsProperty( name = "xmlEncoding")
    public native String getXmlEncoding();

    @JsProperty( name = "xmlEncoding")
    public native void setXmlEncoding( String value );

    public Boolean xmlStandalone;

    @JsProperty( name = "xmlStandalone")
    public native Boolean getXmlStandalone();

    @JsProperty( name = "xmlStandalone")
    public native void setXmlStandalone( Boolean value );

    /** 
      * Gets or sets the version attribute specified in the declaration of an XML document.
     */
    public String xmlVersion;

    @JsProperty( name = "xmlVersion")
    public native String getXmlVersion();

    @JsProperty( name = "xmlVersion")
    public native void setXmlVersion( String value );

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
      * Std Signature : S(adoptNode,86,,P(d86))
      * TE Signature : S(adoptNode,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@346772
     */
    public native Node adoptNode(Node source);
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
      * Std Signature : S(captureEvents,289,,)
      * TE Signature : S(captureEvents,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@346807
     */
    public native void captureEvents();
    /** 
      * Std Signature : S(caretRangeFromPoint,106,,P(d2),P(d2))
      * TE Signature : S(caretRangeFromPoint,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@346834
     */
    public native Range caretRangeFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@346888
     */
    public native void clear();
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
      * Std Signature : S(close,289,,)
      * TE Signature : S(close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@346993
      * Closes an output stream and forces the sent data to display.
     */
    public native void close();
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
      * Std Signature : S(createAttribute,43,,P(d1))
      * TE Signature : S(createAttribute,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@347154
      * Creates an attribute object with a specified name.
     */
    public native Attr createAttribute(String name);
    /** 
      * Std Signature : S(createAttributeNS,43,,P(d1),P(d1))
      * TE Signature : S(createAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@347195
     */
    public native Attr createAttributeNS(String namespaceURI, String qualifiedName);
    /** 
      * Std Signature : S(createCDATASection,387,,P(d1))
      * TE Signature : S(createCDATASection,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@347276
     */
    public native CDATASection createCDATASection(String data);
    /** 
      * Std Signature : S(createComment,388,,P(d1))
      * TE Signature : S(createComment,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@347455
      * Creates a comment object with the specified data.
     */
    public native Comment createComment(String data);
    /** 
      * Std Signature : S(createDocumentFragment,389,,)
      * TE Signature : S(createDocumentFragment,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@347546
      * Creates a new document.
     */
    public native DocumentFragment createDocumentFragment();
    /** 
      * Std Signature : S(createElement,240,,P(d1))
      * TE Signature : S(createElement,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@347820
      * Creates an instance of the element for the specified tag.
     */
    public native HTMLElement createElement(String tagName);
    /** 
      * Std Signature : S(createElementNS,240,,P(d1),P(d1))
      * TE Signature : S(createElementNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@347869
     */
    public native HTMLElement createElementNS(String namespaceURI, String qualifiedName);
    /** 
      * Std Signature : S(createEvent,390,,P(d1))
      * TE Signature : S(createEvent,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native AnimationEvent createEvent(String eventInterface);
    /** 
      * Std Signature : S(createExpression,391,,P(d1),P(d131))
      * TE Signature : S(createExpression,P(d1),P(d131))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@354987
     */
    public native XPathExpression createExpression(String expression, XPathNSResolver resolver);
    /** 
      * Std Signature : S(createNSResolver,131,,P(d86))
      * TE Signature : S(createNSResolver,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@355073
     */
    public native XPathNSResolver createNSResolver(Node nodeResolver);
    /** 
      * Std Signature : S(createNodeIterator,392,,P(d86))
      * TE Signature : S(createNodeIterator,P(d86))
      * 
     */
    public native NodeIterator createNodeIterator(Node root);
    /** 
      * Std Signature : S(createNodeIterator,392,,P(d86),P(d2))
      * TE Signature : S(createNodeIterator,P(d86),P(d2))
      * 
     */
    public native NodeIterator createNodeIterator(Node root, Number whatToShow /* optional */);
    /** 
      * Std Signature : S(createNodeIterator,392,,P(d86),P(d2),P(d132))
      * TE Signature : S(createNodeIterator,P(d86),P(d2),P(d132))
      * 
     */
    public native NodeIterator createNodeIterator(Node root, Number whatToShow /* optional */, NodeFilter filter /* optional */);
    /** 
      * Std Signature : S(createNodeIterator,392,,P(d86),P(d2),P(d132),P(d27))
      * TE Signature : S(createNodeIterator,P(d86),P(d2),P(d132),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@355644
      * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document. 
     */
    public native NodeIterator createNodeIterator(Node root, Number whatToShow /* optional */, NodeFilter filter /* optional */, Boolean entityReferenceExpansion /* optional */);
    /** 
      * Std Signature : S(createProcessingInstruction,393,,P(d1),P(d1))
      * TE Signature : S(createProcessingInstruction,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@355772
     */
    public native ProcessingInstruction createProcessingInstruction(String target, String data);
    /** 
      * Std Signature : S(createRange,106,,)
      * TE Signature : S(createRange,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@355997
      * Returns an empty range object that has both of its boundary points positioned at the beginning of the document. 
     */
    public native Range createRange();
    /** 
      * Std Signature : S(createTextNode,394,,P(d1))
      * TE Signature : S(createTextNode,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@356180
      * Creates a text string from the specified value. 
     */
    public native Text createTextNode(String data);
    /** 
      * Std Signature : S(createTouch,133,,P(d45),P(d47),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(createTouch,P(d45),P(d47),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@356220
     */
    public native Touch createTouch(Window view, EventTarget target, Number identifier, Number pageX, Number pageY, Number screenX, Number screenY);
    /** 
      * Std Signature : S(createTouchList,395,,)
      * TE Signature : S(createTouchList,)
      * 
     */
    public native TouchList createTouchList();
    /** 
      * Std Signature : S(createTouchList,395,,P(D133))
      * TE Signature : S(createTouchList,P(D133))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@356363
     */
    public native TouchList createTouchList(Touch... touches);
    /** 
      * Std Signature : S(createTreeWalker,396,,P(d86))
      * TE Signature : S(createTreeWalker,P(d86))
      * 
     */
    public native TreeWalker createTreeWalker(Node root);
    /** 
      * Std Signature : S(createTreeWalker,396,,P(d86),P(d2))
      * TE Signature : S(createTreeWalker,P(d86),P(d2))
      * 
     */
    public native TreeWalker createTreeWalker(Node root, Number whatToShow /* optional */);
    /** 
      * Std Signature : S(createTreeWalker,396,,P(d86),P(d2),P(d132))
      * TE Signature : S(createTreeWalker,P(d86),P(d2),P(d132))
      * 
     */
    public native TreeWalker createTreeWalker(Node root, Number whatToShow /* optional */, NodeFilter filter /* optional */);
    /** 
      * Std Signature : S(createTreeWalker,396,,P(d86),P(d2),P(d132),P(d27))
      * TE Signature : S(createTreeWalker,P(d86),P(d2),P(d132),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@356906
      * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
     */
    public native TreeWalker createTreeWalker(Node root, Number whatToShow /* optional */, NodeFilter filter /* optional */, Boolean entityReferenceExpansion /* optional */);
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
      * Std Signature : S(elementFromPoint,49,,P(d2),P(d2))
      * TE Signature : S(elementFromPoint,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Element elementFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(elementsFromPoint,7<49>,,P(d2),P(d2))
      * TE Signature : S(elementsFromPoint,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Array<Element> elementsFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(evaluate,130,,P(d1),P(d86),P(d131),P(d2),P(d130))
      * TE Signature : S(evaluate,P(d1),P(d86),P(d131),P(d2),P(d130))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@357252
     */
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, Number type, XPathResult result);
    /** 
      * Std Signature : S(execCommand,27,,P(d1))
      * TE Signature : S(execCommand,P(d1))
      * 
     */
    public native Boolean execCommand(String commandId);
    /** 
      * Std Signature : S(execCommand,27,,P(d1),P(d27))
      * TE Signature : S(execCommand,P(d1),P(d27))
      * 
     */
    public native Boolean execCommand(String commandId, Boolean showUI /* optional */);
    /** 
      * Std Signature : S(execCommand,27,,P(d1),P(d27),P(d3))
      * TE Signature : S(execCommand,P(d1),P(d27),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@357763
      * Executes a command on the current document, current selection, or the given range.
     */
    public native Boolean execCommand(String commandId, Boolean showUI /* optional */, Object value /* optional */);
    /** 
      * Std Signature : S(execCommandShowHelp,27,,P(d1))
      * TE Signature : S(execCommandShowHelp,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@358009
      * Displays help information for the given command identifier.
     */
    public native Boolean execCommandShowHelp(String commandId);
    /** 
      * Std Signature : S(exitFullscreen,289,,)
      * TE Signature : S(exitFullscreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@358062
     */
    public native void exitFullscreen();
    /** 
      * Std Signature : S(exitPointerLock,289,,)
      * TE Signature : S(exitPointerLock,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@358090
     */
    public native void exitPointerLock();
    /** 
      * Std Signature : S(focus,289,,)
      * TE Signature : S(focus,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@358238
      * Causes the element to receive the focus and executes the code specified by the onfocus event.
     */
    public native void focus();
    /** 
      * Std Signature : S(getElementById,240,,P(d1))
      * TE Signature : S(getElementById,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@358455
      * Returns a reference to the first object with the specified value of the ID or NAME attribute.
     */
    public native HTMLElement getElementById(String elementId);
    /** 
      * Std Signature : S(getElementsByClassName,378<49>,,P(d1))
      * TE Signature : S(getElementsByClassName,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@358514
     */
    public native HTMLCollectionOf<Element> getElementsByClassName(String classNames);
    /** 
      * Std Signature : S(getElementsByName,377<240>,,P(d1))
      * TE Signature : S(getElementsByName,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@358795
      * Gets a collection of objects based on the value of the NAME or ID attribute.
     */
    public native NodeListOf<HTMLElement> getElementsByName(String elementName);
    /** 
      * Std Signature : S(getElementsByTagName,377<49>,,P(d1))
      * TE Signature : S(getElementsByTagName,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@359117
      * Retrieves a collection of objects based on the specified element name.
     */
    public native NodeListOf<Element> getElementsByTagName(String tagname);
    /** 
      * Std Signature : S(getElementsByTagNameNS,378<240>,,P(d1),P(d1))
      * TE Signature : S(getElementsByTagNameNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@359181
     */
    public native HTMLCollectionOf<HTMLElement> getElementsByTagNameNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(getSelection,292,,)
      * TE Signature : S(getSelection,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Selection getSelection();
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
      * Std Signature : S(hasFocus,27,,)
      * TE Signature : S(hasFocus,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@359789
      * Gets a value indicating whether the object currently has focus.
     */
    public native Boolean hasFocus();
    /** 
      * Std Signature : S(importNode,86,,P(d86),P(d27))
      * TE Signature : S(importNode,P(d86),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@359814
     */
    public native Node importNode(Node importedNode, Boolean deep);
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
      * Std Signature : S(msElementsFromPoint,377<49>,,P(d2),P(d2))
      * TE Signature : S(msElementsFromPoint,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@359871
     */
    public native NodeListOf<Element> msElementsFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(msElementsFromRect,377<49>,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(msElementsFromRect,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@359939
     */
    public native NodeListOf<Element> msElementsFromRect(Number left, Number top, Number width, Number height);
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
      * Std Signature : S(open,281,,)
      * TE Signature : S(open,)
      * 
     */
    public native Document open();
    /** 
      * Std Signature : S(open,281,,P(d1))
      * TE Signature : S(open,P(d1))
      * 
     */
    public native Document open(String url /* optional */);
    /** 
      * Std Signature : S(open,281,,P(d1),P(d1))
      * TE Signature : S(open,P(d1),P(d1))
      * 
     */
    public native Document open(String url /* optional */, String name /* optional */);
    /** 
      * Std Signature : S(open,281,,P(d1),P(d1),P(d1))
      * TE Signature : S(open,P(d1),P(d1),P(d1))
      * 
     */
    public native Document open(String url /* optional */, String name /* optional */, String features /* optional */);
    /** 
      * Std Signature : S(open,281,,P(d1),P(d1),P(d1),P(d27))
      * TE Signature : S(open,P(d1),P(d1),P(d1),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@360811
      * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
     */
    public native Document open(String url /* optional */, String name /* optional */, String features /* optional */, Boolean replace /* optional */);
    /** 
      * Std Signature : S(queryCommandEnabled,27,,P(d1))
      * TE Signature : S(queryCommandEnabled,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@361137
      * Returns a Boolean value that indicates whether a specified command can be successfully executed using execCommand, given the current state of the document.
     */
    public native Boolean queryCommandEnabled(String commandId);
    /** 
      * Std Signature : S(queryCommandIndeterm,27,,P(d1))
      * TE Signature : S(queryCommandIndeterm,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@361384
      * Returns a Boolean value that indicates whether the specified command is in the indeterminate state.
     */
    public native Boolean queryCommandIndeterm(String commandId);
    /** 
      * Std Signature : S(queryCommandState,27,,P(d1))
      * TE Signature : S(queryCommandState,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@361605
      * Returns a Boolean value that indicates the current state of the command.
     */
    public native Boolean queryCommandState(String commandId);
    /** 
      * Std Signature : S(queryCommandSupported,27,,P(d1))
      * TE Signature : S(queryCommandSupported,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@361840
      * Returns a Boolean value that indicates whether the current command is supported on the current range.
     */
    public native Boolean queryCommandSupported(String commandId);
    /** 
      * Std Signature : S(queryCommandText,1,,P(d1))
      * TE Signature : S(queryCommandText,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@362121
      * Retrieves the string associated with a command.
     */
    public native String queryCommandText(String commandId);
    /** 
      * Std Signature : S(queryCommandValue,1,,P(d1))
      * TE Signature : S(queryCommandValue,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@362358
      * Returns the current value of the document, range, or current selection for the given command.
     */
    public native String queryCommandValue(String commandId);
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
      * Std Signature : S(releaseEvents,289,,)
      * TE Signature : S(releaseEvents,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@362408
     */
    public native void releaseEvents();
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
      * Std Signature : S(updateSettings,289,,)
      * TE Signature : S(updateSettings,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@362509
      * Allows updating the print settings for the page.
     */
    public native void updateSettings();
    /** 
      * Std Signature : S(webkitCancelFullScreen,289,,)
      * TE Signature : S(webkitCancelFullScreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@362537
     */
    public native void webkitCancelFullScreen();
    /** 
      * Std Signature : S(webkitExitFullscreen,289,,)
      * TE Signature : S(webkitExitFullscreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@362573
     */
    public native void webkitExitFullscreen();
    /** 
      * Std Signature : S(write,289,,)
      * TE Signature : S(write,)
      * 
     */
    public native void write();
    /** 
      * Std Signature : S(write,289,,P(D1))
      * TE Signature : S(write,P(D1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@362774
      * Writes one or more HTML expressions to a document in the specified window. 
     */
    public native void write(String... content);
    /** 
      * Std Signature : S(writeln,289,,)
      * TE Signature : S(writeln,)
      * 
     */
    public native void writeln();
    /** 
      * Std Signature : S(writeln,289,,P(D1))
      * TE Signature : S(writeln,P(D1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@363002
      * Writes one or more HTML expressions, followed by a carriage return, to a document in the specified window. 
     */
    public native void writeln(String... content);
}
