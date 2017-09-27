package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLMediaElement
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:438223
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:444821
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMediaElement")
public class HTMLMediaElement implements HTMLElement
{

    /*
        Constructors
    */
    public HTMLMediaElement(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_CURRENT_DATA")
    public static Number HAVE_CURRENT_DATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_ENOUGH_DATA")
    public static Number HAVE_ENOUGH_DATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_FUTURE_DATA")
    public static Number HAVE_FUTURE_DATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_METADATA")
    public static Number HAVE_METADATA;

    @JsProperty(namespace="HTMLMediaElement", name="HAVE_NOTHING")
    public static Number HAVE_NOTHING;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_EMPTY")
    public static Number NETWORK_EMPTY;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_IDLE")
    public static Number NETWORK_IDLE;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_LOADING")
    public static Number NETWORK_LOADING;

    @JsProperty(namespace="HTMLMediaElement", name="NETWORK_NO_SOURCE")
    public static Number NETWORK_NO_SOURCE;

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

    public String accessKey;

    @JsProperty( name = "accessKey")
    public native String getAccessKey();

    @JsProperty( name = "accessKey")
    public native void setAccessKey( String value );

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

    /** 
      * Returns an AudioTrackList object with the audio tracks for a given video element.
     */
    public AudioTrackList audioTracks;

    @JsProperty( name = "audioTracks")
    public native AudioTrackList getAudioTracks();

    @JsProperty( name = "audioTracks")
    public native void setAudioTracks( AudioTrackList value );

    /** 
      * Gets or sets a value that indicates whether to start playing the media automatically.
     */
    public Boolean autoplay;

    @JsProperty( name = "autoplay")
    public native Boolean getAutoplay();

    @JsProperty( name = "autoplay")
    public native void setAutoplay( Boolean value );

    public String baseURI;

    @JsProperty( name = "baseURI")
    public native String getBaseURI();

    @JsProperty( name = "baseURI")
    public native void setBaseURI( String value );

    /** 
      * Gets a collection of buffered time ranges.
     */
    public TimeRanges buffered;

    @JsProperty( name = "buffered")
    public native TimeRanges getBuffered();

    @JsProperty( name = "buffered")
    public native void setBuffered( TimeRanges value );

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

    public String contentEditable;

    @JsProperty( name = "contentEditable")
    public native String getContentEditable();

    @JsProperty( name = "contentEditable")
    public native void setContentEditable( String value );

    /** 
      * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
     */
    public Boolean controls;

    @JsProperty( name = "controls")
    public native Boolean getControls();

    @JsProperty( name = "controls")
    public native void setControls( Boolean value );

    public String crossOrigin;

    @JsProperty( name = "crossOrigin")
    public native String getCrossOrigin();

    @JsProperty( name = "crossOrigin")
    public native void setCrossOrigin( String value );

    /** 
      * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
     */
    public String currentSrc;

    @JsProperty( name = "currentSrc")
    public native String getCurrentSrc();

    @JsProperty( name = "currentSrc")
    public native void setCurrentSrc( String value );

    /** 
      * Gets or sets the current playback position, in seconds.
     */
    public Number currentTime;

    @JsProperty( name = "currentTime")
    public native Number getCurrentTime();

    @JsProperty( name = "currentTime")
    public native void setCurrentTime( Number value );

    public DOMStringMap dataset;

    @JsProperty( name = "dataset")
    public native DOMStringMap getDataset();

    @JsProperty( name = "dataset")
    public native void setDataset( DOMStringMap value );

    public Boolean defaultMuted;

    @JsProperty( name = "defaultMuted")
    public native Boolean getDefaultMuted();

    @JsProperty( name = "defaultMuted")
    public native void setDefaultMuted( Boolean value );

    /** 
      * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
     */
    public Number defaultPlaybackRate;

    @JsProperty( name = "defaultPlaybackRate")
    public native Number getDefaultPlaybackRate();

    @JsProperty( name = "defaultPlaybackRate")
    public native void setDefaultPlaybackRate( Number value );

    public String dir;

    @JsProperty( name = "dir")
    public native String getDir();

    @JsProperty( name = "dir")
    public native void setDir( String value );

    public Boolean draggable;

    @JsProperty( name = "draggable")
    public native Boolean getDraggable();

    @JsProperty( name = "draggable")
    public native void setDraggable( Boolean value );

    /** 
      * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
     */
    public Number duration;

    @JsProperty( name = "duration")
    public native Number getDuration();

    @JsProperty( name = "duration")
    public native void setDuration( Number value );

    /** 
      * Gets information about whether the playback has ended or not.
     */
    public Boolean ended;

    @JsProperty( name = "ended")
    public native Boolean getEnded();

    @JsProperty( name = "ended")
    public native void setEnded( Boolean value );

    /** 
      * Returns an object representing the current error state of the audio or video element.
     */
    public MediaError error;

    @JsProperty( name = "error")
    public native MediaError getError();

    @JsProperty( name = "error")
    public native void setError( MediaError value );

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

    public Boolean hidden;

    @JsProperty( name = "hidden")
    public native Boolean getHidden();

    @JsProperty( name = "hidden")
    public native void setHidden( Boolean value );

    public Boolean hideFocus;

    @JsProperty( name = "hideFocus")
    public native Boolean getHideFocus();

    @JsProperty( name = "hideFocus")
    public native void setHideFocus( Boolean value );

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

    public String innerText;

    @JsProperty( name = "innerText")
    public native String getInnerText();

    @JsProperty( name = "innerText")
    public native void setInnerText( String value );

    public Boolean isContentEditable;

    @JsProperty( name = "isContentEditable")
    public native Boolean getIsContentEditable();

    @JsProperty( name = "isContentEditable")
    public native void setIsContentEditable( Boolean value );

    public String lang;

    @JsProperty( name = "lang")
    public native String getLang();

    @JsProperty( name = "lang")
    public native void setLang( String value );

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

    /** 
      * Gets or sets a flag to specify whether playback should restart after it completes.
     */
    public Boolean loop;

    @JsProperty( name = "loop")
    public native Boolean getLoop();

    @JsProperty( name = "loop")
    public native void setLoop( Boolean value );

    public MediaKeys mediaKeys;

    @JsProperty( name = "mediaKeys")
    public native MediaKeys getMediaKeys__();

    @JsProperty( name = "mediaKeys")
    public native void setMediaKeys__( MediaKeys value );

    /** 
      * Specifies the purpose of the audio or video media, such as background audio or alerts.
     */
    public String msAudioCategory;

    @JsProperty( name = "msAudioCategory")
    public native String getMsAudioCategory();

    @JsProperty( name = "msAudioCategory")
    public native void setMsAudioCategory( String value );

    /** 
      * Specifies the output device id that the audio will be sent to.
     */
    public String msAudioDeviceType;

    @JsProperty( name = "msAudioDeviceType")
    public native String getMsAudioDeviceType();

    @JsProperty( name = "msAudioDeviceType")
    public native void setMsAudioDeviceType( String value );

    public Number msContentZoomFactor;

    @JsProperty( name = "msContentZoomFactor")
    public native Number getMsContentZoomFactor();

    @JsProperty( name = "msContentZoomFactor")
    public native void setMsContentZoomFactor( Number value );

    public MSGraphicsTrust msGraphicsTrustStatus;

    @JsProperty( name = "msGraphicsTrustStatus")
    public native MSGraphicsTrust getMsGraphicsTrustStatus();

    @JsProperty( name = "msGraphicsTrustStatus")
    public native void setMsGraphicsTrustStatus( MSGraphicsTrust value );

    /** 
      * Gets the MSMediaKeys object, which is used for decrypting media data, that is associated with this media element.
     */
    public MSMediaKeys msKeys;

    @JsProperty( name = "msKeys")
    public native MSMediaKeys getMsKeys();

    @JsProperty( name = "msKeys")
    public native void setMsKeys( MSMediaKeys value );

    /** 
      * Gets or sets whether the DLNA PlayTo device is available.
     */
    public Boolean msPlayToDisabled;

    @JsProperty( name = "msPlayToDisabled")
    public native Boolean getMsPlayToDisabled();

    @JsProperty( name = "msPlayToDisabled")
    public native void setMsPlayToDisabled( Boolean value );

    /** 
      * Gets or sets the path to the preferred media source. This enables the Play To target device to stream the media content, which can be DRM protected, from a different location, such as a cloud media server.
     */
    public String msPlayToPreferredSourceUri;

    @JsProperty( name = "msPlayToPreferredSourceUri")
    public native String getMsPlayToPreferredSourceUri();

    @JsProperty( name = "msPlayToPreferredSourceUri")
    public native void setMsPlayToPreferredSourceUri( String value );

    /** 
      * Gets or sets the primary DLNA PlayTo device.
     */
    public Boolean msPlayToPrimary;

    @JsProperty( name = "msPlayToPrimary")
    public native Boolean getMsPlayToPrimary();

    @JsProperty( name = "msPlayToPrimary")
    public native void setMsPlayToPrimary( Boolean value );

    /** 
      * Gets the source associated with the media element for use by the PlayToManager.
     */
    public Object msPlayToSource;

    @JsProperty( name = "msPlayToSource")
    public native Object getMsPlayToSource();

    @JsProperty( name = "msPlayToSource")
    public native void setMsPlayToSource( Object value );

    /** 
      * Specifies whether or not to enable low-latency playback on the media element.
     */
    public Boolean msRealTime;

    @JsProperty( name = "msRealTime")
    public native Boolean getMsRealTime();

    @JsProperty( name = "msRealTime")
    public native void setMsRealTime( Boolean value );

    public String msRegionOverflow;

    @JsProperty( name = "msRegionOverflow")
    public native String getMsRegionOverflow();

    @JsProperty( name = "msRegionOverflow")
    public native void setMsRegionOverflow( String value );

    /** 
      * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
     */
    public Boolean muted;

    @JsProperty( name = "muted")
    public native Boolean getMuted();

    @JsProperty( name = "muted")
    public native void setMuted( Boolean value );

    public String namespaceURI;

    @JsProperty( name = "namespaceURI")
    public native String getNamespaceURI();

    @JsProperty( name = "namespaceURI")
    public native void setNamespaceURI( String value );

    /** 
      * Gets the current network activity for the element.
     */
    public Number networkState;

    @JsProperty( name = "networkState")
    public native Number getNetworkState();

    @JsProperty( name = "networkState")
    public native void setNetworkState( Number value );

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

    public Number offsetHeight;

    @JsProperty( name = "offsetHeight")
    public native Number getOffsetHeight();

    @JsProperty( name = "offsetHeight")
    public native void setOffsetHeight( Number value );

    public Number offsetLeft;

    @JsProperty( name = "offsetLeft")
    public native Number getOffsetLeft();

    @JsProperty( name = "offsetLeft")
    public native void setOffsetLeft( Number value );

    public Element offsetParent;

    @JsProperty( name = "offsetParent")
    public native Element getOffsetParent();

    @JsProperty( name = "offsetParent")
    public native void setOffsetParent( Element value );

    public Number offsetTop;

    @JsProperty( name = "offsetTop")
    public native Number getOffsetTop();

    @JsProperty( name = "offsetTop")
    public native void setOffsetTop( Number value );

    public Number offsetWidth;

    @JsProperty( name = "offsetWidth")
    public native Number getOffsetWidth();

    @JsProperty( name = "offsetWidth")
    public native void setOffsetWidth( Number value );

    public Function1<UIEvent, Object> onabort;

    @JsProperty( name = "onabort")
    public native Function1<UIEvent, Object> getOnabort();

    @JsProperty( name = "onabort")
    public native void setOnabort( Function1<UIEvent, Object> value );

    public Function1<UIEvent, Object> onactivate;

    @JsProperty( name = "onactivate")
    public native Function1<UIEvent, Object> getOnactivate();

    @JsProperty( name = "onactivate")
    public native void setOnactivate( Function1<UIEvent, Object> value );

    public Function1<Event, Object> onariarequest;

    @JsProperty( name = "onariarequest")
    public native Function1<Event, Object> getOnariarequest();

    @JsProperty( name = "onariarequest")
    public native void setOnariarequest( Function1<Event, Object> value );

    public Function1<UIEvent, Object> onbeforeactivate;

    @JsProperty( name = "onbeforeactivate")
    public native Function1<UIEvent, Object> getOnbeforeactivate();

    @JsProperty( name = "onbeforeactivate")
    public native void setOnbeforeactivate( Function1<UIEvent, Object> value );

    public Function1<ClipboardEvent, Object> onbeforecopy;

    @JsProperty( name = "onbeforecopy")
    public native Function1<ClipboardEvent, Object> getOnbeforecopy();

    @JsProperty( name = "onbeforecopy")
    public native void setOnbeforecopy( Function1<ClipboardEvent, Object> value );

    public Function1<ClipboardEvent, Object> onbeforecut;

    @JsProperty( name = "onbeforecut")
    public native Function1<ClipboardEvent, Object> getOnbeforecut();

    @JsProperty( name = "onbeforecut")
    public native void setOnbeforecut( Function1<ClipboardEvent, Object> value );

    public Function1<UIEvent, Object> onbeforedeactivate;

    @JsProperty( name = "onbeforedeactivate")
    public native Function1<UIEvent, Object> getOnbeforedeactivate();

    @JsProperty( name = "onbeforedeactivate")
    public native void setOnbeforedeactivate( Function1<UIEvent, Object> value );

    public Function1<ClipboardEvent, Object> onbeforepaste;

    @JsProperty( name = "onbeforepaste")
    public native Function1<ClipboardEvent, Object> getOnbeforepaste();

    @JsProperty( name = "onbeforepaste")
    public native void setOnbeforepaste( Function1<ClipboardEvent, Object> value );

    public Function1<FocusEvent, Object> onblur;

    @JsProperty( name = "onblur")
    public native Function1<FocusEvent, Object> getOnblur();

    @JsProperty( name = "onblur")
    public native void setOnblur( Function1<FocusEvent, Object> value );

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

    public Function1<Event, Object> onchange;

    @JsProperty( name = "onchange")
    public native Function1<Event, Object> getOnchange();

    @JsProperty( name = "onchange")
    public native void setOnchange( Function1<Event, Object> value );

    public Function1<MouseEvent, Object> onclick;

    @JsProperty( name = "onclick")
    public native Function1<MouseEvent, Object> getOnclick();

    @JsProperty( name = "onclick")
    public native void setOnclick( Function1<MouseEvent, Object> value );

    public Function1<Event, Object> oncommand;

    @JsProperty( name = "oncommand")
    public native Function1<Event, Object> getOncommand();

    @JsProperty( name = "oncommand")
    public native void setOncommand( Function1<Event, Object> value );

    public Function1<PointerEvent, Object> oncontextmenu;

    @JsProperty( name = "oncontextmenu")
    public native Function1<PointerEvent, Object> getOncontextmenu();

    @JsProperty( name = "oncontextmenu")
    public native void setOncontextmenu( Function1<PointerEvent, Object> value );

    public Function1<ClipboardEvent, Object> oncopy;

    @JsProperty( name = "oncopy")
    public native Function1<ClipboardEvent, Object> getOncopy();

    @JsProperty( name = "oncopy")
    public native void setOncopy( Function1<ClipboardEvent, Object> value );

    public Function1<Event, Object> oncuechange;

    @JsProperty( name = "oncuechange")
    public native Function1<Event, Object> getOncuechange();

    @JsProperty( name = "oncuechange")
    public native void setOncuechange( Function1<Event, Object> value );

    public Function1<ClipboardEvent, Object> oncut;

    @JsProperty( name = "oncut")
    public native Function1<ClipboardEvent, Object> getOncut();

    @JsProperty( name = "oncut")
    public native void setOncut( Function1<ClipboardEvent, Object> value );

    public Function1<MouseEvent, Object> ondblclick;

    @JsProperty( name = "ondblclick")
    public native Function1<MouseEvent, Object> getOndblclick();

    @JsProperty( name = "ondblclick")
    public native void setOndblclick( Function1<MouseEvent, Object> value );

    public Function1<UIEvent, Object> ondeactivate;

    @JsProperty( name = "ondeactivate")
    public native Function1<UIEvent, Object> getOndeactivate();

    @JsProperty( name = "ondeactivate")
    public native void setOndeactivate( Function1<UIEvent, Object> value );

    public Function1<DragEvent, Object> ondrag;

    @JsProperty( name = "ondrag")
    public native Function1<DragEvent, Object> getOndrag();

    @JsProperty( name = "ondrag")
    public native void setOndrag( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragend;

    @JsProperty( name = "ondragend")
    public native Function1<DragEvent, Object> getOndragend();

    @JsProperty( name = "ondragend")
    public native void setOndragend( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragenter;

    @JsProperty( name = "ondragenter")
    public native Function1<DragEvent, Object> getOndragenter();

    @JsProperty( name = "ondragenter")
    public native void setOndragenter( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragleave;

    @JsProperty( name = "ondragleave")
    public native Function1<DragEvent, Object> getOndragleave();

    @JsProperty( name = "ondragleave")
    public native void setOndragleave( Function1<DragEvent, Object> value );

    public Function1<DragEvent, Object> ondragover;

    @JsProperty( name = "ondragover")
    public native Function1<DragEvent, Object> getOndragover();

    @JsProperty( name = "ondragover")
    public native void setOndragover( Function1<DragEvent, Object> value );

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

    public Function1<Event, Object> ondurationchange;

    @JsProperty( name = "ondurationchange")
    public native Function1<Event, Object> getOndurationchange();

    @JsProperty( name = "ondurationchange")
    public native void setOndurationchange( Function1<Event, Object> value );

    public Function1<Event, Object> onemptied;

    @JsProperty( name = "onemptied")
    public native Function1<Event, Object> getOnemptied();

    @JsProperty( name = "onemptied")
    public native void setOnemptied( Function1<Event, Object> value );

    public Function1<MediaEncryptedEvent, Object> onencrypted;

    @JsProperty( name = "onencrypted")
    public native Function1<MediaEncryptedEvent, Object> getOnencrypted();

    @JsProperty( name = "onencrypted")
    public native void setOnencrypted( Function1<MediaEncryptedEvent, Object> value );

    public Function1<MediaStreamErrorEvent, Object> onended;

    @JsProperty( name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();

    @JsProperty( name = "onended")
    public native void setOnended( Function1<MediaStreamErrorEvent, Object> value );

    public Function1<ErrorEvent, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<ErrorEvent, Object> value );

    public Function1<FocusEvent, Object> onfocus;

    @JsProperty( name = "onfocus")
    public native Function1<FocusEvent, Object> getOnfocus();

    @JsProperty( name = "onfocus")
    public native void setOnfocus( Function1<FocusEvent, Object> value );

    public Function1<PointerEvent, Object> ongotpointercapture;

    @JsProperty( name = "ongotpointercapture")
    public native Function1<PointerEvent, Object> getOngotpointercapture();

    @JsProperty( name = "ongotpointercapture")
    public native void setOngotpointercapture( Function1<PointerEvent, Object> value );

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

    public Function1<KeyboardEvent, Object> onkeydown;

    @JsProperty( name = "onkeydown")
    public native Function1<KeyboardEvent, Object> getOnkeydown();

    @JsProperty( name = "onkeydown")
    public native void setOnkeydown( Function1<KeyboardEvent, Object> value );

    public Function1<KeyboardEvent, Object> onkeypress;

    @JsProperty( name = "onkeypress")
    public native Function1<KeyboardEvent, Object> getOnkeypress();

    @JsProperty( name = "onkeypress")
    public native void setOnkeypress( Function1<KeyboardEvent, Object> value );

    public Function1<KeyboardEvent, Object> onkeyup;

    @JsProperty( name = "onkeyup")
    public native Function1<KeyboardEvent, Object> getOnkeyup();

    @JsProperty( name = "onkeyup")
    public native void setOnkeyup( Function1<KeyboardEvent, Object> value );

    public Function1<Event, Object> onload;

    @JsProperty( name = "onload")
    public native Function1<Event, Object> getOnload();

    @JsProperty( name = "onload")
    public native void setOnload( Function1<Event, Object> value );

    public Function1<Event, Object> onloadeddata;

    @JsProperty( name = "onloadeddata")
    public native Function1<Event, Object> getOnloadeddata();

    @JsProperty( name = "onloadeddata")
    public native void setOnloadeddata( Function1<Event, Object> value );

    public Function1<Event, Object> onloadedmetadata;

    @JsProperty( name = "onloadedmetadata")
    public native Function1<Event, Object> getOnloadedmetadata();

    @JsProperty( name = "onloadedmetadata")
    public native void setOnloadedmetadata( Function1<Event, Object> value );

    public Function1<Event, Object> onloadstart;

    @JsProperty( name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();

    @JsProperty( name = "onloadstart")
    public native void setOnloadstart( Function1<Event, Object> value );

    public Function1<PointerEvent, Object> onlostpointercapture;

    @JsProperty( name = "onlostpointercapture")
    public native Function1<PointerEvent, Object> getOnlostpointercapture();

    @JsProperty( name = "onlostpointercapture")
    public native void setOnlostpointercapture( Function1<PointerEvent, Object> value );

    public Function1<MouseEvent, Object> onmousedown;

    @JsProperty( name = "onmousedown")
    public native Function1<MouseEvent, Object> getOnmousedown();

    @JsProperty( name = "onmousedown")
    public native void setOnmousedown( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseenter;

    @JsProperty( name = "onmouseenter")
    public native Function1<MouseEvent, Object> getOnmouseenter();

    @JsProperty( name = "onmouseenter")
    public native void setOnmouseenter( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseleave;

    @JsProperty( name = "onmouseleave")
    public native Function1<MouseEvent, Object> getOnmouseleave();

    @JsProperty( name = "onmouseleave")
    public native void setOnmouseleave( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmousemove;

    @JsProperty( name = "onmousemove")
    public native Function1<MouseEvent, Object> getOnmousemove();

    @JsProperty( name = "onmousemove")
    public native void setOnmousemove( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseout;

    @JsProperty( name = "onmouseout")
    public native Function1<MouseEvent, Object> getOnmouseout();

    @JsProperty( name = "onmouseout")
    public native void setOnmouseout( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseover;

    @JsProperty( name = "onmouseover")
    public native Function1<MouseEvent, Object> getOnmouseover();

    @JsProperty( name = "onmouseover")
    public native void setOnmouseover( Function1<MouseEvent, Object> value );

    public Function1<MouseEvent, Object> onmouseup;

    @JsProperty( name = "onmouseup")
    public native Function1<MouseEvent, Object> getOnmouseup();

    @JsProperty( name = "onmouseup")
    public native void setOnmouseup( Function1<MouseEvent, Object> value );

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

    public Function1<MSManipulationEvent, Object> onmsmanipulationstatechanged;

    @JsProperty( name = "onmsmanipulationstatechanged")
    public native Function1<MSManipulationEvent, Object> getOnmsmanipulationstatechanged();

    @JsProperty( name = "onmsmanipulationstatechanged")
    public native void setOnmsmanipulationstatechanged( Function1<MSManipulationEvent, Object> value );

    public Function1<MSMediaKeyNeededEvent, Object> onmsneedkey;

    @JsProperty( name = "onmsneedkey")
    public native Function1<MSMediaKeyNeededEvent, Object> getOnmsneedkey();

    @JsProperty( name = "onmsneedkey")
    public native void setOnmsneedkey( Function1<MSMediaKeyNeededEvent, Object> value );

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

    public Function1<ClipboardEvent, Object> onpaste;

    @JsProperty( name = "onpaste")
    public native Function1<ClipboardEvent, Object> getOnpaste();

    @JsProperty( name = "onpaste")
    public native void setOnpaste( Function1<ClipboardEvent, Object> value );

    public Function1<Event, Object> onpause;

    @JsProperty( name = "onpause")
    public native Function1<Event, Object> getOnpause();

    @JsProperty( name = "onpause")
    public native void setOnpause( Function1<Event, Object> value );

    public Function1<Event, Object> onplay;

    @JsProperty( name = "onplay")
    public native Function1<Event, Object> getOnplay();

    @JsProperty( name = "onplay")
    public native void setOnplay( Function1<Event, Object> value );

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

    public Function1<ProgressEvent, Object> onprogress;

    @JsProperty( name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();

    @JsProperty( name = "onprogress")
    public native void setOnprogress( Function1<ProgressEvent, Object> value );

    public Function1<Event, Object> onratechange;

    @JsProperty( name = "onratechange")
    public native Function1<Event, Object> getOnratechange();

    @JsProperty( name = "onratechange")
    public native void setOnratechange( Function1<Event, Object> value );

    public Function1<Event, Object> onreset;

    @JsProperty( name = "onreset")
    public native Function1<Event, Object> getOnreset();

    @JsProperty( name = "onreset")
    public native void setOnreset( Function1<Event, Object> value );

    public Function1<UIEvent, Object> onscroll;

    @JsProperty( name = "onscroll")
    public native Function1<UIEvent, Object> getOnscroll();

    @JsProperty( name = "onscroll")
    public native void setOnscroll( Function1<UIEvent, Object> value );

    public Function1<Event, Object> onseeked;

    @JsProperty( name = "onseeked")
    public native Function1<Event, Object> getOnseeked();

    @JsProperty( name = "onseeked")
    public native void setOnseeked( Function1<Event, Object> value );

    public Function1<Event, Object> onseeking;

    @JsProperty( name = "onseeking")
    public native Function1<Event, Object> getOnseeking();

    @JsProperty( name = "onseeking")
    public native void setOnseeking( Function1<Event, Object> value );

    public Function1<UIEvent, Object> onselect;

    @JsProperty( name = "onselect")
    public native Function1<UIEvent, Object> getOnselect();

    @JsProperty( name = "onselect")
    public native void setOnselect( Function1<UIEvent, Object> value );

    public Function1<Event, Object> onselectstart;

    @JsProperty( name = "onselectstart")
    public native Function1<Event, Object> getOnselectstart();

    @JsProperty( name = "onselectstart")
    public native void setOnselectstart( Function1<Event, Object> value );

    public Function1<Event, Object> onstalled;

    @JsProperty( name = "onstalled")
    public native Function1<Event, Object> getOnstalled();

    @JsProperty( name = "onstalled")
    public native void setOnstalled( Function1<Event, Object> value );

    public Function1<Event, Object> onsubmit;

    @JsProperty( name = "onsubmit")
    public native Function1<Event, Object> getOnsubmit();

    @JsProperty( name = "onsubmit")
    public native void setOnsubmit( Function1<Event, Object> value );

    public Function1<Event, Object> onsuspend;

    @JsProperty( name = "onsuspend")
    public native Function1<Event, Object> getOnsuspend();

    @JsProperty( name = "onsuspend")
    public native void setOnsuspend( Function1<Event, Object> value );

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

    public Function1<Event, Object> onvolumechange;

    @JsProperty( name = "onvolumechange")
    public native Function1<Event, Object> getOnvolumechange();

    @JsProperty( name = "onvolumechange")
    public native void setOnvolumechange( Function1<Event, Object> value );

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

    public String outerHTML;

    @JsProperty( name = "outerHTML")
    public native String getOuterHTML();

    @JsProperty( name = "outerHTML")
    public native void setOuterHTML( String value );

    public String outerText;

    @JsProperty( name = "outerText")
    public native String getOuterText();

    @JsProperty( name = "outerText")
    public native void setOuterText( String value );

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

    /** 
      * Gets a flag that specifies whether playback is paused.
     */
    public Boolean paused;

    @JsProperty( name = "paused")
    public native Boolean getPaused();

    @JsProperty( name = "paused")
    public native void setPaused( Boolean value );

    /** 
      * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
     */
    public Number playbackRate;

    @JsProperty( name = "playbackRate")
    public native Number getPlaybackRate();

    @JsProperty( name = "playbackRate")
    public native void setPlaybackRate( Number value );

    /** 
      * Gets TimeRanges for the current media resource that has been played.
     */
    public TimeRanges played;

    @JsProperty( name = "played")
    public native TimeRanges getPlayed();

    @JsProperty( name = "played")
    public native void setPlayed( TimeRanges value );

    public String prefix;

    @JsProperty( name = "prefix")
    public native String getPrefix();

    @JsProperty( name = "prefix")
    public native void setPrefix( String value );

    /** 
      * Gets or sets the current playback position, in seconds.
     */
    public String preload;

    @JsProperty( name = "preload")
    public native String getPreload();

    @JsProperty( name = "preload")
    public native void setPreload( String value );

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

    public Number readyState;

    @JsProperty( name = "readyState")
    public native Number getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( Number value );

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

    /** 
      * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
     */
    public TimeRanges seekable;

    @JsProperty( name = "seekable")
    public native TimeRanges getSeekable();

    @JsProperty( name = "seekable")
    public native void setSeekable( TimeRanges value );

    /** 
      * Gets a flag that indicates whether the the client is currently moving to a new playback position in the media resource.
     */
    public Boolean seeking;

    @JsProperty( name = "seeking")
    public native Boolean getSeeking();

    @JsProperty( name = "seeking")
    public native void setSeeking( Boolean value );

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

    public Boolean spellcheck;

    @JsProperty( name = "spellcheck")
    public native Boolean getSpellcheck();

    @JsProperty( name = "spellcheck")
    public native void setSpellcheck( Boolean value );

    /** 
      * The address or URL of the a media resource that is to be considered.
     */
    public String src;

    @JsProperty( name = "src")
    public native String getSrc();

    @JsProperty( name = "src")
    public native void setSrc( String value );

    public MediaStream srcObject;

    @JsProperty( name = "srcObject")
    public native MediaStream getSrcObject();

    @JsProperty( name = "srcObject")
    public native void setSrcObject( MediaStream value );

    public CSSStyleDeclaration style;

    @JsProperty( name = "style")
    public native CSSStyleDeclaration getStyle();

    @JsProperty( name = "style")
    public native void setStyle( CSSStyleDeclaration value );

    public Number tabIndex;

    @JsProperty( name = "tabIndex")
    public native Number getTabIndex();

    @JsProperty( name = "tabIndex")
    public native void setTabIndex( Number value );

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

    public TextTrackList textTracks;

    @JsProperty( name = "textTracks")
    public native TextTrackList getTextTracks();

    @JsProperty( name = "textTracks")
    public native void setTextTracks( TextTrackList value );

    public String title;

    @JsProperty( name = "title")
    public native String getTitle();

    @JsProperty( name = "title")
    public native void setTitle( String value );

    public VideoTrackList videoTracks;

    @JsProperty( name = "videoTracks")
    public native VideoTrackList getVideoTracks();

    @JsProperty( name = "videoTracks")
    public native void setVideoTracks( VideoTrackList value );

    /** 
      * Gets or sets the volume level for audio portions of the media element.
     */
    public Number volume;

    @JsProperty( name = "volume")
    public native Number getVolume();

    @JsProperty( name = "volume")
    public native void setVolume( Number value );

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
      * Std Signature : S(addTextTrack,336,,P(d1))
      * TE Signature : S(addTextTrack,P(d1))
      * 
     */
    public native TextTrack addTextTrack(String kind);
    /** 
      * Std Signature : S(addTextTrack,336,,P(d1),P(d1))
      * TE Signature : S(addTextTrack,P(d1),P(d1))
      * 
     */
    public native TextTrack addTextTrack(String kind, String label /* optional */);
    /** 
      * Std Signature : S(addTextTrack,336,,P(d1),P(d1),P(d1))
      * TE Signature : S(addTextTrack,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@442926
     */
    public native TextTrack addTextTrack(String kind, String label /* optional */, String language /* optional */);
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
      * added from type hierarchy
     */
    public native ShadowRoot attachShadow(ShadowRootInit shadowRootInitDict);
    /** 
      * Std Signature : S(blur,289,,)
      * TE Signature : S(blur,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void blur();
    /** 
      * Std Signature : S(canPlayType,1,,P(d1))
      * TE Signature : S(canPlayType,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@443118
      * Returns a string that specifies whether the client can play a given media resource type.
     */
    public native String canPlayType(String type);
    /** 
      * Std Signature : S(click,289,,)
      * TE Signature : S(click,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void click();
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
      * added from type hierarchy
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
      * Std Signature : S(dragDrop,27,,)
      * TE Signature : S(dragDrop,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dragDrop();
    /** 
      * Std Signature : S(focus,289,,)
      * TE Signature : S(focus,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void focus();
    /** 
      * Std Signature : S(getAttribute,1,,P(d1))
      * TE Signature : S(getAttribute,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String getAttribute(String name);
    /** 
      * Std Signature : S(getAttributeNS,1,,P(d1),P(d1))
      * TE Signature : S(getAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String getAttributeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(getAttributeNode,43,,P(d1))
      * TE Signature : S(getAttributeNode,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Attr getAttributeNode(String name);
    /** 
      * Std Signature : S(getAttributeNodeNS,43,,P(d1),P(d1))
      * TE Signature : S(getAttributeNodeNS,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Attr getAttributeNodeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(getBoundingClientRect,375,,)
      * TE Signature : S(getBoundingClientRect,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ClientRect getBoundingClientRect();
    /** 
      * Std Signature : S(getClientRects,376,,)
      * TE Signature : S(getClientRects,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ClientRectList getClientRects();
    /** 
      * Std Signature : S(getElementsByClassName,377<49>,,P(d1))
      * TE Signature : S(getElementsByClassName,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native NodeListOf<Element> getElementsByClassName(String classNames);
    /** 
      * Std Signature : S(getElementsByTagName,377<49>,,P(d1))
      * TE Signature : S(getElementsByTagName,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native NodeListOf<Element> getElementsByTagName(String name);
    /** 
      * Std Signature : S(getElementsByTagNameNS,378<240>,,P(d1),P(d1))
      * TE Signature : S(getElementsByTagNameNS,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native HTMLCollectionOf<HTMLElement> getElementsByTagNameNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(hasAttribute,27,,P(d1))
      * TE Signature : S(hasAttribute,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean hasAttribute(String name);
    /** 
      * Std Signature : S(hasAttributeNS,27,,P(d1),P(d1))
      * TE Signature : S(hasAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native Element insertAdjacentElement(String position, Element insertedElement);
    /** 
      * Std Signature : S(insertAdjacentHTML,289,,P(d1),P(d1))
      * TE Signature : S(insertAdjacentHTML,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void insertAdjacentHTML(String where, String html);
    /** 
      * Std Signature : S(insertAdjacentText,289,,P(d1),P(d1))
      * TE Signature : S(insertAdjacentText,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
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
      * Std Signature : S(load,289,,)
      * TE Signature : S(load,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@443247
      * Resets the audio or video object and loads a new media resource.
     */
    public native void load();
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
      * added from type hierarchy
     */
    public native Boolean matches(String selector);
    /** 
      * Std Signature : S(msClearEffects,289,,)
      * TE Signature : S(msClearEffects,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@443334
      * Clears all effects from the media pipeline.
     */
    public native void msClearEffects();
    /** 
      * Std Signature : S(msGetAsCastingSource,3,,)
      * TE Signature : S(msGetAsCastingSource,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@443362
     */
    public native Object msGetAsCastingSource();
    /** 
      * Std Signature : S(msGetInputContext,417,,)
      * TE Signature : S(msGetInputContext,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native MSInputMethodContext msGetInputContext();
    /** 
      * Std Signature : S(msGetRegionContent,379,,)
      * TE Signature : S(msGetRegionContent,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native MSRangeCollection msGetRegionContent();
    /** 
      * Std Signature : S(msGetUntransformedBounds,375,,)
      * TE Signature : S(msGetUntransformedBounds,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ClientRect msGetUntransformedBounds();
    /** 
      * Std Signature : S(msInsertAudioEffect,289,,P(d1),P(d27))
      * TE Signature : S(msInsertAudioEffect,P(d1),P(d27))
      * 
     */
    public native void msInsertAudioEffect(String activatableClassId, Boolean effectRequired);
    /** 
      * Std Signature : S(msInsertAudioEffect,289,,P(d1),P(d27),P(d3))
      * TE Signature : S(msInsertAudioEffect,P(d1),P(d27),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@443476
      * Inserts the specified audio effect into media pipeline.
     */
    public native void msInsertAudioEffect(String activatableClassId, Boolean effectRequired, Object config /* optional */);
    /** 
      * Std Signature : S(msMatchesSelector,27,,P(d1))
      * TE Signature : S(msMatchesSelector,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean msMatchesSelector(String selectors);
    /** 
      * Std Signature : S(msReleasePointerCapture,289,,P(d2))
      * TE Signature : S(msReleasePointerCapture,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void msReleasePointerCapture(Number pointerId);
    /** 
      * Std Signature : S(msSetMediaKeys,289,,P(d212))
      * TE Signature : S(msSetMediaKeys,P(d212))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@443574
     */
    public native void msSetMediaKeys(MSMediaKeys mediaKeys);
    /** 
      * Std Signature : S(msSetMediaProtectionManager,289,,)
      * TE Signature : S(msSetMediaProtectionManager,)
      * 
     */
    public native void msSetMediaProtectionManager();
    /** 
      * Std Signature : S(msSetMediaProtectionManager,289,,P(d3))
      * TE Signature : S(msSetMediaProtectionManager,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@443716
      * Specifies the media protection manager for a given media pipeline.
     */
    public native void msSetMediaProtectionManager(Object mediaProtectionManager /* optional */);
    /** 
      * Std Signature : S(msSetPointerCapture,289,,P(d2))
      * TE Signature : S(msSetPointerCapture,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void msSetPointerCapture(Number pointerId);
    /** 
      * Std Signature : S(msZoomTo,289,,P(d134))
      * TE Signature : S(msZoomTo,P(d134))
      * 
     */
    /** 
      * added from type hierarchy
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
      * Std Signature : S(pause,289,,)
      * TE Signature : S(pause,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@444015
      * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
     */
    public native void pause();
    /** 
      * Std Signature : S(play,289,,)
      * TE Signature : S(play,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@444106
      * Loads and starts playback of a media resource.
     */
    public native void play();
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
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void removeAttribute(String qualifiedName);
    /** 
      * Std Signature : S(removeAttributeNS,289,,P(d1),P(d1))
      * TE Signature : S(removeAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeAttributeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(removeAttributeNode,43,,P(d43))
      * TE Signature : S(removeAttributeNode,P(d43))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void requestFullscreen();
    /** 
      * Std Signature : S(requestPointerLock,289,,)
      * TE Signature : S(requestPointerLock,)
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void scroll(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scroll,289,,P(d2),P(d2))
      * TE Signature : S(scroll,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void scrollBy(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollBy,289,,P(d2),P(d2))
      * TE Signature : S(scrollBy,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void scrollTo(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,P(d2),P(d2))
      * TE Signature : S(scrollTo,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void scrollTo(Number x, Number y);
    /** 
      * Std Signature : S(setAttribute,289,,P(d1),P(d1))
      * TE Signature : S(setAttribute,P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void setAttribute(String name, String value);
    /** 
      * Std Signature : S(setAttributeNS,289,,P(d1),P(d1),P(d1))
      * TE Signature : S(setAttributeNS,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void setAttributeNS(String namespaceURI, String qualifiedName, String value);
    /** 
      * Std Signature : S(setAttributeNode,43,,P(d43))
      * TE Signature : S(setAttributeNode,P(d43))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Attr setAttributeNode(Attr newAttr);
    /** 
      * Std Signature : S(setAttributeNodeNS,43,,P(d43))
      * TE Signature : S(setAttributeNodeNS,P(d43))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Attr setAttributeNodeNS(Attr newAttr);
    /** 
      * Std Signature : S(setMediaKeys,88<369>,,P(d213))
      * TE Signature : S(setMediaKeys,P(d213))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@444124
     */
    public native Promise<Void> setMediaKeys(MediaKeys mediaKeys);
    /** 
      * Std Signature : S(setPointerCapture,289,,P(d2))
      * TE Signature : S(setPointerCapture,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void setPointerCapture(Number pointerId);
    /** 
      * Std Signature : S(webkitMatchesSelector,27,,P(d1))
      * TE Signature : S(webkitMatchesSelector,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean webkitMatchesSelector(String selectors);
    /** 
      * Std Signature : S(webkitRequestFullScreen,289,,)
      * TE Signature : S(webkitRequestFullScreen,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void webkitRequestFullScreen();
    /** 
      * Std Signature : S(webkitRequestFullscreen,289,,)
      * TE Signature : S(webkitRequestFullscreen,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void webkitRequestFullscreen();
}
