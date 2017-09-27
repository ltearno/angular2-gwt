package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Document;
import fr.lteconsulting.jsinterop.browser.Element;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.browser.HTMLDocument;
import fr.lteconsulting.jsinterop.browser.HTMLElement;
import fr.lteconsulting.jsinterop.browser.HTMLStyleElement;
import fr.lteconsulting.jsinterop.browser.History;
import fr.lteconsulting.jsinterop.browser.Location;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.browser.Node;
import fr.lteconsulting.jsinterop.browser.Text;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.prebuilt.Function3;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter".DomAdapter
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts:415

  * Provides DOM operations in an environment-agnostic way.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="DomAdapter")
public class DomAdapter
{

    /*
        Properties
    */

    /** 
      * Maps attribute names to their corresponding property names for cases
      * where attribute name doesn't match property name.
     */
    public AnonymousType817 attrToPropMap;

    @JsProperty( name = "attrToPropMap")
    public native AnonymousType817 getAttrToPropMap();

    @JsProperty( name = "attrToPropMap")
    public native void setAttrToPropMap( AnonymousType817 value );

    public Function3<Object, Object, Object, Object> on;

    @JsProperty( name = "on")
    public native Function3<Object, Object, Object, Object> getOn();

    @JsProperty( name = "on")
    public native void setOn( Function3<Object, Object, Object, Object> value );

    public Function3<Object, Object, Object, Function> onAndCancel;

    @JsProperty( name = "onAndCancel")
    public native Function3<Object, Object, Object, Function> getOnAndCancel();

    @JsProperty( name = "onAndCancel")
    public native void setOnAndCancel( Function3<Object, Object, Object, Function> value );

    public Type<Object> resourceLoaderType;

    @JsProperty( name = "resourceLoaderType")
    public native Type<Object> getResourceLoaderType();

    @JsProperty( name = "resourceLoaderType")
    public native void setResourceLoaderType( Type<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addClass,3,,P(d3),P(d1))
      * TE Signature : S(addClass,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4177
     */
    public native Object addClass(Object element, String cssClassName);
    /** 
      * Std Signature : S(adoptNode,86,,P(d86))
      * TE Signature : S(adoptNode,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6039
     */
    public native Node adoptNode(Node node);
    /** 
      * Std Signature : S(appendChild,3,,P(d3),P(d3))
      * TE Signature : S(appendChild,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2544
     */
    public native Object appendChild(Object el, Object node);
    /** 
      * Std Signature : S(attributeMap,37<1,3>,,P(d3))
      * TE Signature : S(attributeMap,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4706
     */
    public native Map<String, String> attributeMap(Object element);
    /** 
      * Std Signature : S(childNodes,7<86>,,P(d3))
      * TE Signature : S(childNodes,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2415
     */
    public native Array<Node> childNodes(Object el);
    /** 
      * Std Signature : S(childNodesAsList,7<86>,,P(d3))
      * TE Signature : S(childNodesAsList,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2457
     */
    public native Array<Node> childNodesAsList(Object el);
    /** 
      * Std Signature : S(classList,7<3>,,P(d3))
      * TE Signature : S(classList,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4132
     */
    public native Array<Object> classList(Object element);
    /** 
      * Std Signature : S(clearNodes,3,,P(d3))
      * TE Signature : S(clearNodes,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2505
     */
    public native Object clearNodes(Object el);
    /** 
      * Std Signature : S(clone,86,,P(d86))
      * TE Signature : S(clone,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3936
     */
    public native Node clone(Node node);
    /** 
      * Std Signature : S(contains,27,,P(d3),P(d3))
      * TE Signature : S(contains,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1296
     */
    public native Boolean contains(Object nodeA, Object nodeB);
    /** 
      * Std Signature : S(content,3,,P(d3))
      * TE Signature : S(content,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2232
     */
    public native Object content(Object node);
    /** 
      * Std Signature : S(createComment,3,,P(d1))
      * TE Signature : S(createComment,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3291
     */
    public native Object createComment(String text);
    /** 
      * Std Signature : S(createElement,240,,P(d3))
      * TE Signature : S(createElement,P(d3))
      * 
     */
    public native HTMLElement createElement(Object tagName);
    /** 
      * Std Signature : S(createElement,240,,P(d3),P(d3))
      * TE Signature : S(createElement,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3391
     */
    public native HTMLElement createElement(Object tagName, Object doc /* optional */);
    /** 
      * Std Signature : S(createElementNS,49,,P(d1),P(d1))
      * TE Signature : S(createElementNS,P(d1),P(d1))
      * 
     */
    public native Element createElementNS(String ns, String tagName);
    /** 
      * Std Signature : S(createElementNS,49,,P(d1),P(d1),P(d3))
      * TE Signature : S(createElementNS,P(d1),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3457
     */
    public native Element createElementNS(String ns, String tagName, Object doc /* optional */);
    /** 
      * Std Signature : S(createEvent,3,,P(d1))
      * TE Signature : S(createEvent,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1754
     */
    public native Object createEvent(String eventType);
    /** 
      * Std Signature : S(createHtmlDocument,1251,,)
      * TE Signature : S(createHtmlDocument,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5437
     */
    public native HTMLDocument createHtmlDocument();
    /** 
      * Std Signature : S(createMouseEvent,3,,P(d3))
      * TE Signature : S(createMouseEvent,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1702
     */
    public native Object createMouseEvent(Object eventType);
    /** 
      * Std Signature : S(createScriptTag,240,,P(d1),P(d1))
      * TE Signature : S(createScriptTag,P(d1),P(d1))
      * 
     */
    public native HTMLElement createScriptTag(String attrName, String attrValue);
    /** 
      * Std Signature : S(createScriptTag,240,,P(d1),P(d1),P(d3))
      * TE Signature : S(createScriptTag,P(d1),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3596
     */
    public native HTMLElement createScriptTag(String attrName, String attrValue, Object doc /* optional */);
    /** 
      * Std Signature : S(createShadowRoot,3,,P(d3))
      * TE Signature : S(createShadowRoot,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3762
     */
    public native Object createShadowRoot(Object el);
    /** 
      * Std Signature : S(createStyleElement,1138,,P(d1))
      * TE Signature : S(createStyleElement,P(d1))
      * 
     */
    public native HTMLStyleElement createStyleElement(String css);
    /** 
      * Std Signature : S(createStyleElement,1138,,P(d1),P(d3))
      * TE Signature : S(createStyleElement,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3687
     */
    public native HTMLStyleElement createStyleElement(String css, Object doc /* optional */);
    /** 
      * Std Signature : S(createTemplate,240,,P(d3))
      * TE Signature : S(createTemplate,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3338
     */
    public native HTMLElement createTemplate(Object html);
    /** 
      * Std Signature : S(createTextNode,915,,P(d1))
      * TE Signature : S(createTextNode,P(d1))
      * 
     */
    public native Text createTextNode(String text);
    /** 
      * Std Signature : S(createTextNode,915,,P(d1),P(d3))
      * TE Signature : S(createTextNode,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3536
     */
    public native Text createTextNode(String text, Object doc /* optional */);
    /** 
      * Std Signature : S(dispatchEvent,3,,P(d3),P(d3))
      * TE Signature : S(dispatchEvent,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1650
     */
    public native Object dispatchEvent(Object el, Object evt);
    /** 
      * Std Signature : S(elementMatches,27,,P(d3),P(d1))
      * TE Signature : S(elementMatches,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5643
     */
    public native Boolean elementMatches(Object n, String selector);
    /** 
      * Std Signature : S(firstChild,86,,P(d3))
      * TE Signature : S(firstChild,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2270
     */
    public native Node firstChild(Object el);
    /** 
      * Std Signature : S(getAnimationPrefix,1,,)
      * TE Signature : S(getAnimationPrefix,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6892
     */
    public native String getAnimationPrefix();
    /** 
      * Std Signature : S(getAttribute,1,,P(d3),P(d1))
      * TE Signature : S(getAttribute,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4920
     */
    public native String getAttribute(Object element, String attribute);
    /** 
      * Std Signature : S(getAttributeNS,1,,P(d3),P(d1),P(d1))
      * TE Signature : S(getAttributeNS,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4995
     */
    public native String getAttributeNS(Object element, String ns, String attribute);
    /** 
      * Std Signature : S(getBaseHref,1,,P(d281))
      * TE Signature : S(getBaseHref,P(d281))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6490
     */
    public native String getBaseHref(Document doc);
    /** 
      * Std Signature : S(getBoundingClientRect,3,,P(d3))
      * TE Signature : S(getBoundingClientRect,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5486
     */
    public native Object getBoundingClientRect(Object el);
    /** 
      * Std Signature : S(getChecked,27,,P(d3))
      * TE Signature : S(getChecked,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3193
     */
    public native Boolean getChecked(Object el);
    /** 
      * Std Signature : S(getComputedStyle,3,,P(d3))
      * TE Signature : S(getComputedStyle,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6692
     */
    public native Object getComputedStyle(Object element);
    /** 
      * Std Signature : S(getCookie,1,,P(d1))
      * TE Signature : S(getCookie,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@7060
     */
    public native String getCookie(String name);
    /** 
      * Std Signature : S(getData,1,,P(d3),P(d1))
      * TE Signature : S(getData,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6742
     */
    public native String getData(Object element, String name);
    /** 
      * Std Signature : S(getDistributedNodes,7<86>,,P(d3))
      * TE Signature : S(getDistributedNodes,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3885
     */
    public native Array<Node> getDistributedNodes(Object el);
    /** 
      * Std Signature : S(getElementsByClassName,7<240>,,P(d3),P(d1))
      * TE Signature : S(getElementsByClassName,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3974
     */
    public native Array<HTMLElement> getElementsByClassName(Object element, String name);
    /** 
      * Std Signature : S(getElementsByTagName,7<240>,,P(d3),P(d1))
      * TE Signature : S(getElementsByTagName,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4054
     */
    public native Array<HTMLElement> getElementsByTagName(Object element, String name);
    /** 
      * Std Signature : S(getEventKey,1,,P(d3))
      * TE Signature : S(getEventKey,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6125
     */
    public native String getEventKey(Object event);
    /** 
      * Std Signature : S(getGlobalEventTarget,3,,P(d281),P(d1))
      * TE Signature : S(getGlobalEventTarget,P(d281),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6345
     */
    public native Object getGlobalEventTarget(Document doc, String target);
    /** 
      * Std Signature : S(getHistory,749,,)
      * TE Signature : S(getHistory,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6416
     */
    public native History getHistory();
    /** 
      * Std Signature : S(getHost,3,,P(d3))
      * TE Signature : S(getHost,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3849
     */
    public native Object getHost(Object el);
    /** 
      * Std Signature : S(getHref,1,,P(d3))
      * TE Signature : S(getHref,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6081
     */
    public native String getHref(Object element);
    /** 
      * Std Signature : S(getInnerHTML,1,,P(d3))
      * TE Signature : S(getInnerHTML,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1893
     */
    public native String getInnerHTML(Object el);
    /** 
      * Std Signature : S(getLocation,750,,)
      * TE Signature : S(getLocation,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6452
     */
    public native Location getLocation();
    /** 
      * Std Signature : S(getOuterHTML,1,,P(d3))
      * TE Signature : S(getOuterHTML,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2058
     */
    public native String getOuterHTML(Object el);
    /** 
      * Std Signature : S(getProperty,3,,P(d49),P(d1))
      * TE Signature : S(getProperty,P(d49),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@810
     */
    public native Object getProperty(Element el, String name);
    /** 
      * Std Signature : S(getShadowRoot,3,,P(d3))
      * TE Signature : S(getShadowRoot,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3807
     */
    public native Object getShadowRoot(Object el);
    /** 
      * Std Signature : S(getStyle,1,,P(d3),P(d1))
      * TE Signature : S(getStyle,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4512
     */
    public native String getStyle(Object element, String styleName);
    /** 
      * Std Signature : S(getTemplateContent,3,,P(d3))
      * TE Signature : S(getTemplateContent,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2011
      * Returns content if el is a <template> element, null otherwise. 
     */
    public native Object getTemplateContent(Object el);
    /** 
      * Std Signature : S(getText,1,,P(d3))
      * TE Signature : S(getText,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3004
     */
    public native String getText(Object el);
    /** 
      * Std Signature : S(getTitle,1,,P(d281))
      * TE Signature : S(getTitle,P(d281))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5536
     */
    public native String getTitle(Document doc);
    /** 
      * Std Signature : S(getTransitionEnd,1,,)
      * TE Signature : S(getTransitionEnd,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6935
     */
    public native String getTransitionEnd();
    /** 
      * Std Signature : S(getUserAgent,1,,)
      * TE Signature : S(getUserAgent,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6585
     */
    public native String getUserAgent();
    /** 
      * Std Signature : S(getValue,1,,P(d3))
      * TE Signature : S(getValue,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3101
     */
    public native String getValue(Object el);
    /** 
      * Std Signature : S(hasAttribute,27,,P(d3),P(d1))
      * TE Signature : S(hasAttribute,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4768
     */
    public native Boolean hasAttribute(Object element, String attribute);
    /** 
      * Std Signature : S(hasAttributeNS,27,,P(d3),P(d1),P(d1))
      * TE Signature : S(hasAttributeNS,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4837
     */
    public native Boolean hasAttributeNS(Object element, String ns, String attribute);
    /** 
      * Std Signature : S(hasClass,27,,P(d3),P(d1))
      * TE Signature : S(hasClass,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4302
     */
    public native Boolean hasClass(Object element, String cssClassName);
    /** 
      * Std Signature : S(hasProperty,27,,P(d3),P(d1))
      * TE Signature : S(hasProperty,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@677
     */
    public native Boolean hasProperty(Object element, String name);
    /** 
      * Std Signature : S(hasShadowRoot,27,,P(d3))
      * TE Signature : S(hasShadowRoot,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5898
     */
    public native Boolean hasShadowRoot(Object node);
    /** 
      * Std Signature : S(hasStyle,27,,P(d3),P(d1))
      * TE Signature : S(hasStyle,P(d3),P(d1))
      * 
     */
    public native Boolean hasStyle(Object element, String styleName);
    /** 
      * Std Signature : S(hasStyle,27,,P(d3),P(d1),P(d1))
      * TE Signature : S(hasStyle,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4576
     */
    public native Boolean hasStyle(Object element, String styleName, String styleValue /* optional */);
    /** 
      * Std Signature : S(importIntoDoc,86,,P(d86))
      * TE Signature : S(importIntoDoc,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5993
     */
    public native Node importIntoDoc(Node node);
    /** 
      * Std Signature : S(insertAfter,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(insertAfter,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2887
     */
    public native Object insertAfter(Object parent, Object el, Object node);
    /** 
      * Std Signature : S(insertAllBefore,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(insertAllBefore,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2817
     */
    public native Object insertAllBefore(Object parent, Object ref, Object nodes);
    /** 
      * Std Signature : S(insertBefore,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(insertBefore,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2751
     */
    public native Object insertBefore(Object parent, Object ref, Object node);
    /** 
      * Std Signature : S(invoke,3,,P(d49),P(d1),P(d7<3>))
      * TE Signature : S(invoke,P(d49),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@868
     */
    public native Object invoke(Element el, String methodName, Array<Object> args);
    /** 
      * Std Signature : S(isCommentNode,27,,P(d3))
      * TE Signature : S(isCommentNode,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5802
     */
    public native Boolean isCommentNode(Object node);
    /** 
      * Std Signature : S(isElementNode,27,,P(d3))
      * TE Signature : S(isElementNode,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5850
     */
    public native Boolean isElementNode(Object node);
    /** 
      * Std Signature : S(isPrevented,27,,P(d3))
      * TE Signature : S(isPrevented,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1848
     */
    public native Boolean isPrevented(Object evt);
    /** 
      * Std Signature : S(isShadowRoot,27,,P(d3))
      * TE Signature : S(isShadowRoot,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5946
     */
    public native Boolean isShadowRoot(Object node);
    /** 
      * Std Signature : S(isTemplateElement,27,,P(d3))
      * TE Signature : S(isTemplateElement,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5707
     */
    public native Boolean isTemplateElement(Object el);
    /** 
      * Std Signature : S(isTextNode,27,,P(d3))
      * TE Signature : S(isTextNode,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5757
     */
    public native Boolean isTextNode(Object node);
    /** 
      * Std Signature : S(log,3,,P(d3))
      * TE Signature : S(log,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@980
     */
    public native Object log(Object error);
    /** 
      * Std Signature : S(logError,3,,P(d3))
      * TE Signature : S(logError,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@940
     */
    public native Object logError(Object error);
    /** 
      * Std Signature : S(logGroup,3,,P(d3))
      * TE Signature : S(logGroup,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1015
     */
    public native Object logGroup(Object error);
    /** 
      * Std Signature : S(logGroupEnd,3,,)
      * TE Signature : S(logGroupEnd,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1055
     */
    public native Object logGroupEnd();
    /** 
      * Std Signature : S(nextSibling,86,,P(d3))
      * TE Signature : S(nextSibling,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2317
     */
    public native Node nextSibling(Object el);
    /** 
      * Std Signature : S(nodeName,1,,P(d3))
      * TE Signature : S(nodeName,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2102
     */
    public native String nodeName(Object node);
    /** 
      * Std Signature : S(nodeValue,1,,P(d3))
      * TE Signature : S(nodeValue,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2144
     */
    public native String nodeValue(Object node);
    /** 
      * Std Signature : S(parentElement,86,,P(d3))
      * TE Signature : S(parentElement,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2365
     */
    public native Node parentElement(Object el);
    /** 
      * Std Signature : S(parse,3,,P(d1))
      * TE Signature : S(parse,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1352
     */
    public native Object parse(String templateHtml);
    /** 
      * Std Signature : S(performanceNow,2,,)
      * TE Signature : S(performanceNow,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6853
     */
    public native Number performanceNow();
    /** 
      * Std Signature : S(preventDefault,3,,P(d3))
      * TE Signature : S(preventDefault,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1804
     */
    public native Object preventDefault(Object evt);
    /** 
      * Std Signature : S(querySelector,3,,P(d3),P(d1))
      * TE Signature : S(querySelector,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1399
     */
    public native Object querySelector(Object el, String selector);
    /** 
      * Std Signature : S(querySelectorAll,7<3>,,P(d3),P(d1))
      * TE Signature : S(querySelectorAll,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@1459
     */
    public native Array<Object> querySelectorAll(Object el, String selector);
    /** 
      * Std Signature : S(remove,86,,P(d3))
      * TE Signature : S(remove,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2715
     */
    public native Node remove(Object el);
    /** 
      * Std Signature : S(removeAttribute,3,,P(d3),P(d1))
      * TE Signature : S(removeAttribute,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5241
     */
    public native Object removeAttribute(Object element, String attribute);
    /** 
      * Std Signature : S(removeAttributeNS,3,,P(d3),P(d1),P(d1))
      * TE Signature : S(removeAttributeNS,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5309
     */
    public native Object removeAttributeNS(Object element, String ns, String attribute);
    /** 
      * Std Signature : S(removeChild,3,,P(d3),P(d3))
      * TE Signature : S(removeChild,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2595
     */
    public native Object removeChild(Object el, Object node);
    /** 
      * Std Signature : S(removeClass,3,,P(d3),P(d1))
      * TE Signature : S(removeClass,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4238
     */
    public native Object removeClass(Object element, String cssClassName);
    /** 
      * Std Signature : S(removeStyle,3,,P(d3),P(d1))
      * TE Signature : S(removeStyle,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4448
     */
    public native Object removeStyle(Object element, String styleName);
    /** 
      * Std Signature : S(replaceChild,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(replaceChild,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2646
     */
    public native Object replaceChild(Object el, Object newNode, Object oldNode);
    /** 
      * Std Signature : S(resetBaseElement,429,,)
      * TE Signature : S(resetBaseElement,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6546
     */
    public native void resetBaseElement();
    /** 
      * Std Signature : S(resolveAndSetHref,3,,P(d3),P(d1),P(d1))
      * TE Signature : S(resolveAndSetHref,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6171
     */
    public native Object resolveAndSetHref(Object element, String baseUrl, String href);
    /** 
      * Std Signature : S(setAttribute,3,,P(d3),P(d1),P(d1))
      * TE Signature : S(setAttribute,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5077
     */
    public native Object setAttribute(Object element, String name, String value);
    /** 
      * Std Signature : S(setAttributeNS,3,,P(d3),P(d1),P(d1),P(d1))
      * TE Signature : S(setAttributeNS,P(d3),P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5152
     */
    public native Object setAttributeNS(Object element, String ns, String name, String value);
    /** 
      * Std Signature : S(setChecked,3,,P(d3),P(d27))
      * TE Signature : S(setChecked,P(d3),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3236
     */
    public native Object setChecked(Object el, Boolean value);
    /** 
      * Std Signature : S(setCookie,3,,P(d1),P(d1))
      * TE Signature : S(setCookie,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@7113
     */
    public native Object setCookie(String name, String value);
    /** 
      * Std Signature : S(setData,3,,P(d3),P(d1),P(d1))
      * TE Signature : S(setData,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6622
     */
    public native Object setData(Object element, String name, String value);
    /** 
      * Std Signature : S(setInnerHTML,3,,P(d3),P(d3))
      * TE Signature : S(setInnerHTML,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2951
     */
    public native Object setInnerHTML(Object el, Object value);
    /** 
      * Std Signature : S(setProperty,3,,P(d49),P(d1),P(d3))
      * TE Signature : S(setProperty,P(d49),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@740
     */
    public native Object setProperty(Element el, String name, Object value);
    /** 
      * Std Signature : S(setStyle,3,,P(d3),P(d1),P(d1))
      * TE Signature : S(setStyle,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4367
     */
    public native Object setStyle(Object element, String styleName, String styleValue);
    /** 
      * Std Signature : S(setText,3,,P(d3),P(d1))
      * TE Signature : S(setText,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3050
     */
    public native Object setText(Object el, String value);
    /** 
      * Std Signature : S(setTitle,3,,P(d281),P(d1))
      * TE Signature : S(setTitle,P(d281),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5582
     */
    public native Object setTitle(Document doc, String newTitle);
    /** 
      * Std Signature : S(setValue,3,,P(d3),P(d1))
      * TE Signature : S(setValue,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@3141
     */
    public native Object setValue(Object el, String value);
    /** 
      * Std Signature : S(supportsAnimation,27,,)
      * TE Signature : S(supportsAnimation,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6976
     */
    public native Boolean supportsAnimation();
    /** 
      * Std Signature : S(supportsCookies,27,,)
      * TE Signature : S(supportsCookies,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@7019
     */
    public native Boolean supportsCookies();
    /** 
      * Std Signature : S(supportsDOMEvents,27,,)
      * TE Signature : S(supportsDOMEvents,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6253
     */
    public native Boolean supportsDOMEvents();
    /** 
      * Std Signature : S(supportsNativeShadowDOM,27,,)
      * TE Signature : S(supportsNativeShadowDOM,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6296
     */
    public native Boolean supportsNativeShadowDOM();
    /** 
      * Std Signature : S(supportsWebAnimation,27,,)
      * TE Signature : S(supportsWebAnimation,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@6807
     */
    public native Boolean supportsWebAnimation();
    /** 
      * Std Signature : S(tagName,1,,P(d3))
      * TE Signature : S(tagName,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@4662
     */
    public native String tagName(Object element);
    /** 
      * Std Signature : S(templateAwareRoot,3,,P(d3))
      * TE Signature : S(templateAwareRoot,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@5391
     */
    public native Object templateAwareRoot(Object el);
    /** 
      * Std Signature : S(type,1,,P(d3))
      * TE Signature : S(type,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_adapter.d.ts@2194
     */
    public native String type(Object node);
}
