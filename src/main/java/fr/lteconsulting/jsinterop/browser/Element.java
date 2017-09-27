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
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Element extends Node, GlobalEventHandlers, ElementTraversal, NodeSelector, ChildNode, ParentNode
{

    /*
        Properties
    */

    @JsProperty( name = "assignedSlot")
    HTMLSlotElement getAssignedSlot();

    @JsProperty( name = "assignedSlot")
    void setAssignedSlot( HTMLSlotElement value );

    @JsProperty( name = "classList")
    DOMTokenList getClassList();

    @JsProperty( name = "classList")
    void setClassList( DOMTokenList value );

    @JsProperty( name = "className")
    String getCssClassName();

    @JsProperty( name = "className")
    void setCssClassName( String value );

    @JsProperty( name = "clientHeight")
    Number getClientHeight();

    @JsProperty( name = "clientHeight")
    void setClientHeight( Number value );

    @JsProperty( name = "clientLeft")
    Number getClientLeft();

    @JsProperty( name = "clientLeft")
    void setClientLeft( Number value );

    @JsProperty( name = "clientTop")
    Number getClientTop();

    @JsProperty( name = "clientTop")
    void setClientTop( Number value );

    @JsProperty( name = "clientWidth")
    Number getClientWidth();

    @JsProperty( name = "clientWidth")
    void setClientWidth( Number value );

    @JsProperty( name = "id")
    String getId();

    @JsProperty( name = "id")
    void setId( String value );

    @JsProperty( name = "innerHTML")
    String getInnerHTML();

    @JsProperty( name = "innerHTML")
    void setInnerHTML( String value );

    @JsProperty( name = "msContentZoomFactor")
    Number getMsContentZoomFactor();

    @JsProperty( name = "msContentZoomFactor")
    void setMsContentZoomFactor( Number value );

    @JsProperty( name = "msRegionOverflow")
    String getMsRegionOverflow();

    @JsProperty( name = "msRegionOverflow")
    void setMsRegionOverflow( String value );

    @JsProperty( name = "onariarequest")
    Function1<Event, Object> getOnariarequest();

    @JsProperty( name = "onariarequest")
    void setOnariarequest( Function1<Event, Object> value );

    @JsProperty( name = "oncommand")
    Function1<Event, Object> getOncommand();

    @JsProperty( name = "oncommand")
    void setOncommand( Function1<Event, Object> value );

    @JsProperty( name = "ongotpointercapture")
    Function1<PointerEvent, Object> getOngotpointercapture();

    @JsProperty( name = "ongotpointercapture")
    void setOngotpointercapture( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onlostpointercapture")
    Function1<PointerEvent, Object> getOnlostpointercapture();

    @JsProperty( name = "onlostpointercapture")
    void setOnlostpointercapture( Function1<PointerEvent, Object> value );

    @JsProperty( name = "onmsgesturechange")
    Function1<MSGestureEvent, Object> getOnmsgesturechange();

    @JsProperty( name = "onmsgesturechange")
    void setOnmsgesturechange( Function1<MSGestureEvent, Object> value );

    @JsProperty( name = "onmsgesturedoubletap")
    Function1<MSGestureEvent, Object> getOnmsgesturedoubletap();

    @JsProperty( name = "onmsgesturedoubletap")
    void setOnmsgesturedoubletap( Function1<MSGestureEvent, Object> value );

    @JsProperty( name = "onmsgestureend")
    Function1<MSGestureEvent, Object> getOnmsgestureend();

    @JsProperty( name = "onmsgestureend")
    void setOnmsgestureend( Function1<MSGestureEvent, Object> value );

    @JsProperty( name = "onmsgesturehold")
    Function1<MSGestureEvent, Object> getOnmsgesturehold();

    @JsProperty( name = "onmsgesturehold")
    void setOnmsgesturehold( Function1<MSGestureEvent, Object> value );

    @JsProperty( name = "onmsgesturestart")
    Function1<MSGestureEvent, Object> getOnmsgesturestart();

    @JsProperty( name = "onmsgesturestart")
    void setOnmsgesturestart( Function1<MSGestureEvent, Object> value );

    @JsProperty( name = "onmsgesturetap")
    Function1<MSGestureEvent, Object> getOnmsgesturetap();

    @JsProperty( name = "onmsgesturetap")
    void setOnmsgesturetap( Function1<MSGestureEvent, Object> value );

    @JsProperty( name = "onmsgotpointercapture")
    Function1<MSPointerEvent, Object> getOnmsgotpointercapture();

    @JsProperty( name = "onmsgotpointercapture")
    void setOnmsgotpointercapture( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmsinertiastart")
    Function1<MSGestureEvent, Object> getOnmsinertiastart();

    @JsProperty( name = "onmsinertiastart")
    void setOnmsinertiastart( Function1<MSGestureEvent, Object> value );

    @JsProperty( name = "onmslostpointercapture")
    Function1<MSPointerEvent, Object> getOnmslostpointercapture();

    @JsProperty( name = "onmslostpointercapture")
    void setOnmslostpointercapture( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointercancel")
    Function1<MSPointerEvent, Object> getOnmspointercancel();

    @JsProperty( name = "onmspointercancel")
    void setOnmspointercancel( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointerdown")
    Function1<MSPointerEvent, Object> getOnmspointerdown();

    @JsProperty( name = "onmspointerdown")
    void setOnmspointerdown( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointerenter")
    Function1<MSPointerEvent, Object> getOnmspointerenter();

    @JsProperty( name = "onmspointerenter")
    void setOnmspointerenter( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointerleave")
    Function1<MSPointerEvent, Object> getOnmspointerleave();

    @JsProperty( name = "onmspointerleave")
    void setOnmspointerleave( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointermove")
    Function1<MSPointerEvent, Object> getOnmspointermove();

    @JsProperty( name = "onmspointermove")
    void setOnmspointermove( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointerout")
    Function1<MSPointerEvent, Object> getOnmspointerout();

    @JsProperty( name = "onmspointerout")
    void setOnmspointerout( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointerover")
    Function1<MSPointerEvent, Object> getOnmspointerover();

    @JsProperty( name = "onmspointerover")
    void setOnmspointerover( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "onmspointerup")
    Function1<MSPointerEvent, Object> getOnmspointerup();

    @JsProperty( name = "onmspointerup")
    void setOnmspointerup( Function1<MSPointerEvent, Object> value );

    @JsProperty( name = "ontouchcancel")
    Function1<TouchEvent, Object> getOntouchcancel();

    @JsProperty( name = "ontouchcancel")
    void setOntouchcancel( Function1<TouchEvent, Object> value );

    @JsProperty( name = "ontouchend")
    Function1<TouchEvent, Object> getOntouchend();

    @JsProperty( name = "ontouchend")
    void setOntouchend( Function1<TouchEvent, Object> value );

    @JsProperty( name = "ontouchmove")
    Function1<TouchEvent, Object> getOntouchmove();

    @JsProperty( name = "ontouchmove")
    void setOntouchmove( Function1<TouchEvent, Object> value );

    @JsProperty( name = "ontouchstart")
    Function1<TouchEvent, Object> getOntouchstart();

    @JsProperty( name = "ontouchstart")
    void setOntouchstart( Function1<TouchEvent, Object> value );

    @JsProperty( name = "onwebkitfullscreenchange")
    Function1<Event, Object> getOnwebkitfullscreenchange();

    @JsProperty( name = "onwebkitfullscreenchange")
    void setOnwebkitfullscreenchange( Function1<Event, Object> value );

    @JsProperty( name = "onwebkitfullscreenerror")
    Function1<Event, Object> getOnwebkitfullscreenerror();

    @JsProperty( name = "onwebkitfullscreenerror")
    void setOnwebkitfullscreenerror( Function1<Event, Object> value );

    @JsProperty( name = "outerHTML")
    String getOuterHTML();

    @JsProperty( name = "outerHTML")
    void setOuterHTML( String value );

    @JsProperty( name = "prefix")
    String getPrefix();

    @JsProperty( name = "prefix")
    void setPrefix( String value );

    @JsProperty( name = "scrollHeight")
    Number getScrollHeight();

    @JsProperty( name = "scrollHeight")
    void setScrollHeight( Number value );

    @JsProperty( name = "scrollLeft")
    Number getScrollLeft();

    @JsProperty( name = "scrollLeft")
    void setScrollLeft( Number value );

    @JsProperty( name = "scrollTop")
    Number getScrollTop();

    @JsProperty( name = "scrollTop")
    void setScrollTop( Number value );

    @JsProperty( name = "scrollWidth")
    Number getScrollWidth();

    @JsProperty( name = "scrollWidth")
    void setScrollWidth( Number value );

    @JsProperty( name = "shadowRoot")
    ShadowRoot getShadowRoot();

    @JsProperty( name = "shadowRoot")
    void setShadowRoot( ShadowRoot value );

    @JsProperty( name = "slot")
    String getSlot();

    @JsProperty( name = "slot")
    void setSlot( String value );

    @JsProperty( name = "tagName")
    String getTagName();

    @JsProperty( name = "tagName")
    void setTagName( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(attachShadow,374,,P(d137))
      * TE Signature : S(attachShadow,P(d137))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371395
     */
    ShadowRoot attachShadow(ShadowRootInit shadowRootInitDict);
    /** 
      * Std Signature : S(closest,49,,P(d1))
      * TE Signature : S(closest,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370815
     */
    Element closest(String selector);
    /** 
      * Std Signature : S(getAttribute,1,,P(d1))
      * TE Signature : S(getAttribute,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368813
     */
    String getAttribute(String name);
    /** 
      * Std Signature : S(getAttributeNS,1,,P(d1),P(d1))
      * TE Signature : S(getAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368860
     */
    String getAttributeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(getAttributeNode,43,,P(d1))
      * TE Signature : S(getAttributeNode,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368929
     */
    Attr getAttributeNode(String name);
    /** 
      * Std Signature : S(getAttributeNodeNS,43,,P(d1),P(d1))
      * TE Signature : S(getAttributeNodeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@368971
     */
    Attr getAttributeNodeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(getBoundingClientRect,375,,)
      * TE Signature : S(getBoundingClientRect,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369042
     */
    ClientRect getBoundingClientRect();
    /** 
      * Std Signature : S(getClientRects,376,,)
      * TE Signature : S(getClientRects,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369083
     */
    ClientRectList getClientRects();
    /** 
      * Std Signature : S(getElementsByClassName,377<49>,,P(d1))
      * TE Signature : S(getElementsByClassName,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370706
     */
    NodeListOf<Element> getElementsByClassName(String classNames);
    /** 
      * Std Signature : S(getElementsByTagName,377<49>,,P(d1))
      * TE Signature : S(getElementsByTagName,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369221
     */
    NodeListOf<Element> getElementsByTagName(String name);
    /** 
      * Std Signature : S(getElementsByTagNameNS,378<240>,,P(d1),P(d1))
      * TE Signature : S(getElementsByTagNameNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369282
     */
    HTMLCollectionOf<HTMLElement> getElementsByTagNameNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(hasAttribute,27,,P(d1))
      * TE Signature : S(hasAttribute,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369623
     */
    Boolean hasAttribute(String name);
    /** 
      * Std Signature : S(hasAttributeNS,27,,P(d1),P(d1))
      * TE Signature : S(hasAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369664
     */
    Boolean hasAttributeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(insertAdjacentElement,49,,P(d1),P(d49))
      * TE Signature : S(insertAdjacentElement,P(d1),P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371190
     */
    Element insertAdjacentElement(String position, Element insertedElement);
    /** 
      * Std Signature : S(insertAdjacentHTML,289,,P(d1),P(d1))
      * TE Signature : S(insertAdjacentHTML,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371277
     */
    void insertAdjacentHTML(String where, String html);
    /** 
      * Std Signature : S(insertAdjacentText,289,,P(d1),P(d1))
      * TE Signature : S(insertAdjacentText,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371336
     */
    void insertAdjacentText(String where, String text);
    /** 
      * Std Signature : S(matches,27,,P(d1))
      * TE Signature : S(matches,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370775
     */
    Boolean matches(String selector);
    /** 
      * Std Signature : S(msGetRegionContent,379,,)
      * TE Signature : S(msGetRegionContent,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369734
     */
    MSRangeCollection msGetRegionContent();
    /** 
      * Std Signature : S(msGetUntransformedBounds,375,,)
      * TE Signature : S(msGetUntransformedBounds,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369779
     */
    ClientRect msGetUntransformedBounds();
    /** 
      * Std Signature : S(msMatchesSelector,27,,P(d1))
      * TE Signature : S(msMatchesSelector,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369823
     */
    Boolean msMatchesSelector(String selectors);
    /** 
      * Std Signature : S(msReleasePointerCapture,289,,P(d2))
      * TE Signature : S(msReleasePointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369874
     */
    void msReleasePointerCapture(Number pointerId);
    /** 
      * Std Signature : S(msSetPointerCapture,289,,P(d2))
      * TE Signature : S(msSetPointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369928
     */
    void msSetPointerCapture(Number pointerId);
    /** 
      * Std Signature : S(msZoomTo,289,,P(d134))
      * TE Signature : S(msZoomTo,P(d134))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@369978
     */
    void msZoomTo(MsZoomToOptions args);
    /** 
      * Std Signature : S(releasePointerCapture,289,,P(d2))
      * TE Signature : S(releasePointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370021
     */
    void releasePointerCapture(Number pointerId);
    /** 
      * Std Signature : S(removeAttribute,289,,P(d1))
      * TE Signature : S(removeAttribute,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370073
     */
    void removeAttribute(String qualifiedName);
    /** 
      * Std Signature : S(removeAttributeNS,289,,P(d1),P(d1))
      * TE Signature : S(removeAttributeNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370123
     */
    void removeAttributeNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(removeAttributeNode,43,,P(d43))
      * TE Signature : S(removeAttributeNode,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370193
     */
    Attr removeAttributeNode(Attr oldAttr);
    /** 
      * Std Signature : S(requestFullscreen,289,,)
      * TE Signature : S(requestFullscreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370239
     */
    void requestFullscreen();
    /** 
      * Std Signature : S(requestPointerLock,289,,)
      * TE Signature : S(requestPointerLock,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370270
     */
    void requestPointerLock();
    /** 
      * Std Signature : S(scroll,289,,)
      * TE Signature : S(scroll,)
      * 
     */
    void scroll();
    /** 
      * Std Signature : S(scroll,289,,P(d136))
      * TE Signature : S(scroll,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370927
     */
    void scroll(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scroll,289,,P(d2),P(d2))
      * TE Signature : S(scroll,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370972
      * VERSION 1
     */
    void scroll(Number x, Number y);
    /** 
      * Std Signature : S(scrollBy,289,,)
      * TE Signature : S(scrollBy,)
      * 
     */
    void scrollBy();
    /** 
      * Std Signature : S(scrollBy,289,,P(d136))
      * TE Signature : S(scrollBy,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371101
     */
    void scrollBy(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollBy,289,,P(d2),P(d2))
      * TE Signature : S(scrollBy,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371148
      * VERSION 1
     */
    void scrollBy(Number x, Number y);
    /** 
      * Std Signature : S(scrollIntoView,289,,)
      * TE Signature : S(scrollIntoView,)
      * 
     */
    void scrollIntoView();
    /** 
      * Std Signature : S(scrollIntoView,289,,P(d135))
      * TE Signature : S(scrollIntoView,P(d135))
      * 
     */
    void scrollIntoView(ScrollIntoViewOptions arg /* optional */);
    /** 
      * Std Signature : S(scrollIntoView,289,,P(d27))
      * TE Signature : S(scrollIntoView,P(d27))
      * 
     */
    void scrollIntoView(Boolean arg /* optional */);
    /** 
      * Std Signature : S(scrollIntoView,289,,P(dU(-27,135)))
      * TE Signature : S(scrollIntoView,P(dU(-27,135)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370862
     */
    void scrollIntoView(UnionOfBooleanAndScrollIntoViewOptions arg /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,)
      * TE Signature : S(scrollTo,)
      * 
     */
    void scrollTo();
    /** 
      * Std Signature : S(scrollTo,289,,P(d136))
      * TE Signature : S(scrollTo,P(d136))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371012
     */
    void scrollTo(ScrollToOptions options /* optional */);
    /** 
      * Std Signature : S(scrollTo,289,,P(d2),P(d2))
      * TE Signature : S(scrollTo,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371059
      * VERSION 1
     */
    void scrollTo(Number x, Number y);
    /** 
      * Std Signature : S(setAttribute,289,,P(d1),P(d1))
      * TE Signature : S(setAttribute,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370302
     */
    void setAttribute(String name, String value);
    /** 
      * Std Signature : S(setAttributeNS,289,,P(d1),P(d1),P(d1))
      * TE Signature : S(setAttributeNS,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370355
     */
    void setAttributeNS(String namespaceURI, String qualifiedName, String value);
    /** 
      * Std Signature : S(setAttributeNode,43,,P(d43))
      * TE Signature : S(setAttributeNode,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370441
     */
    Attr setAttributeNode(Attr newAttr);
    /** 
      * Std Signature : S(setAttributeNodeNS,43,,P(d43))
      * TE Signature : S(setAttributeNodeNS,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370484
     */
    Attr setAttributeNodeNS(Attr newAttr);
    /** 
      * Std Signature : S(setPointerCapture,289,,P(d2))
      * TE Signature : S(setPointerCapture,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370529
     */
    void setPointerCapture(Number pointerId);
    /** 
      * Std Signature : S(webkitMatchesSelector,27,,P(d1))
      * TE Signature : S(webkitMatchesSelector,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370577
     */
    Boolean webkitMatchesSelector(String selectors);
    /** 
      * Std Signature : S(webkitRequestFullScreen,289,,)
      * TE Signature : S(webkitRequestFullScreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370632
     */
    void webkitRequestFullScreen();
    /** 
      * Std Signature : S(webkitRequestFullscreen,289,,)
      * TE Signature : S(webkitRequestFullscreen,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@370669
     */
    void webkitRequestFullscreen();
}
