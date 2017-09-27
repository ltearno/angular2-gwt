package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Document;
import fr.lteconsulting.jsinterop.browser.DocumentFragment;
import fr.lteconsulting.jsinterop.browser.Element;
import fr.lteconsulting.jsinterop.browser.Event;
import fr.lteconsulting.jsinterop.browser.HTMLElement;
import fr.lteconsulting.jsinterop.browser.HTMLInputElement;
import fr.lteconsulting.jsinterop.browser.HTMLScriptElement;
import fr.lteconsulting.jsinterop.browser.HTMLStyleElement;
import fr.lteconsulting.jsinterop.browser.MouseEvent;
import fr.lteconsulting.jsinterop.browser.Node;
import fr.lteconsulting.jsinterop.browser.Text;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter".BrowserDomAdapter
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts:69
  * 1 constructors
  * A `DomAdapter` powered by full browser DOM APIs.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="BrowserDomAdapter")
public class BrowserDomAdapter extends GenericBrowserDomAdapter
{

    /*
        Constructors
    */
    public BrowserDomAdapter(){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts:359
     */
    @JsMethod(namespace="ng.platformBrowser.BrowserDomAdapter", name = "makeCurrent")
    public static native void makeCurrent();

    /*
        Methods
    */
    /** 
      * Std Signature : S(appendChild,429,,P(d86),P(d86))
      * TE Signature : S(appendChild,P(d86),P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1759
     */
    public native void appendChild(Node el, Node node);
    /** 
      * Std Signature : S(childNodesAsList,7<3>,,P(d86))
      * TE Signature : S(childNodesAsList,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1688
     */
    public native Array<Object> childNodesAsList(Node el);
    /** 
      * Std Signature : S(clearNodes,429,,P(d86))
      * TE Signature : S(clearNodes,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1727
     */
    public native void clearNodes(Node el);
    /** 
      * Std Signature : S(content,86,,P(d86))
      * TE Signature : S(content,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1503
     */
    public native Node content(Node node);
    /** 
      * Std Signature : S(createElement,240,,P(d1))
      * TE Signature : S(createElement,P(d1))
      * 
     */
    public native HTMLElement createElement(String tagName);
    /** 
      * Std Signature : S(createElement,240,,P(d1),P(d281))
      * TE Signature : S(createElement,P(d1),P(d281))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2508
     */
    public native HTMLElement createElement(String tagName, Document doc /* optional */);
    /** 
      * Std Signature : S(createElementNS,49,,P(d1),P(d1))
      * TE Signature : S(createElementNS,P(d1),P(d1))
      * 
     */
    public native Element createElementNS(String ns, String tagName);
    /** 
      * Std Signature : S(createElementNS,49,,P(d1),P(d1),P(d281))
      * TE Signature : S(createElementNS,P(d1),P(d1),P(d281))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2573
     */
    public native Element createElementNS(String ns, String tagName, Document doc /* optional */);
    /** 
      * Std Signature : S(createEvent,77,,P(d3))
      * TE Signature : S(createEvent,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1136
     */
    public native Event createEvent(Object eventType);
    /** 
      * Std Signature : S(createMouseEvent,110,,P(d1))
      * TE Signature : S(createMouseEvent,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1083
     */
    public native MouseEvent createMouseEvent(String eventType);
    /** 
      * Std Signature : S(createScriptTag,772,,P(d1),P(d1))
      * TE Signature : S(createScriptTag,P(d1),P(d1))
      * 
     */
    public native HTMLScriptElement createScriptTag(String attrName, String attrValue);
    /** 
      * Std Signature : S(createScriptTag,772,,P(d1),P(d1),P(d281))
      * TE Signature : S(createScriptTag,P(d1),P(d1),P(d281))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2704
     */
    public native HTMLScriptElement createScriptTag(String attrName, String attrValue, Document doc /* optional */);
    /** 
      * Std Signature : S(createShadowRoot,910,,P(d240))
      * TE Signature : S(createShadowRoot,P(d240))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2868
     */
    public native DocumentFragment createShadowRoot(HTMLElement el);
    /** 
      * Std Signature : S(createStyleElement,1138,,P(d1))
      * TE Signature : S(createStyleElement,P(d1))
      * 
     */
    public native HTMLStyleElement createStyleElement(String css);
    /** 
      * Std Signature : S(createStyleElement,1138,,P(d1),P(d281))
      * TE Signature : S(createStyleElement,P(d1),P(d281))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2797
     */
    public native HTMLStyleElement createStyleElement(String css, Document doc /* optional */);
    /** 
      * Std Signature : S(createTextNode,915,,P(d1))
      * TE Signature : S(createTextNode,P(d1))
      * 
     */
    public native Text createTextNode(String text);
    /** 
      * Std Signature : S(createTextNode,915,,P(d1),P(d281))
      * TE Signature : S(createTextNode,P(d1),P(d281))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2648
     */
    public native Text createTextNode(String text, Document doc /* optional */);
    /** 
      * Std Signature : S(dispatchEvent,429,,P(d86),P(d3))
      * TE Signature : S(dispatchEvent,P(d86),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1038
     */
    public native void dispatchEvent(Node el, Object evt);
    /** 
      * Std Signature : S(firstChild,86,,P(d86))
      * TE Signature : S(firstChild,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1534
     */
    public native Node firstChild(Node el);
    /** 
      * Std Signature : S(getAttribute,1,,P(d49),P(d1))
      * TE Signature : S(getAttribute,P(d49),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@3890
     */
    public native String getAttribute(Element element, String attribute);
    /** 
      * Std Signature : S(getAttributeNS,1,,P(d49),P(d1),P(d1))
      * TE Signature : S(getAttributeNS,P(d49),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@3960
     */
    public native String getAttributeNS(Element element, String ns, String name);
    /** 
      * Std Signature : S(getBoundingClientRect,3,,P(d49))
      * TE Signature : S(getBoundingClientRect,P(d49))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4403
     */
    public native Object getBoundingClientRect(Element el);
    /** 
      * Std Signature : S(getData,1,,P(d49),P(d1))
      * TE Signature : S(getData,P(d49),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@5272
     */
    public native String getData(Element element, String name);
    /** 
      * Std Signature : S(getHost,240,,P(d240))
      * TE Signature : S(getHost,P(d240))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2979
     */
    public native HTMLElement getHost(HTMLElement el);
    /** 
      * Std Signature : S(getHref,1,,P(d49))
      * TE Signature : S(getHref,P(d49))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4897
     */
    public native String getHref(Element el);
    /** 
      * Std Signature : S(getInnerHTML,1,,P(d240))
      * TE Signature : S(getInnerHTML,P(d240))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1252
     */
    public native String getInnerHTML(HTMLElement el);
    /** 
      * Std Signature : S(getOuterHTML,1,,P(d240))
      * TE Signature : S(getOuterHTML,P(d240))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1342
     */
    public native String getOuterHTML(HTMLElement el);
    /** 
      * Std Signature : S(getProperty,3,,P(d86),P(d1))
      * TE Signature : S(getProperty,P(d86),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@505
     */
    public native Object getProperty(Node el, String name);
    /** 
      * Std Signature : S(getShadowRoot,910,,P(d240))
      * TE Signature : S(getShadowRoot,P(d240))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2925
     */
    public native DocumentFragment getShadowRoot(HTMLElement el);
    /** 
      * Std Signature : S(getTemplateContent,86,,P(d86))
      * TE Signature : S(getTemplateContent,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1295
     */
    public native Node getTemplateContent(Node el);
    /** 
      * Std Signature : S(getText,1,,P(d86))
      * TE Signature : S(getText,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2184
     */
    public native String getText(Node el);
    /** 
      * Std Signature : S(hasAttribute,27,,P(d49),P(d1))
      * TE Signature : S(hasAttribute,P(d49),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@3748
     */
    public native Boolean hasAttribute(Element element, String attribute);
    /** 
      * Std Signature : S(hasAttributeNS,27,,P(d49),P(d1),P(d1))
      * TE Signature : S(hasAttributeNS,P(d49),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@3812
     */
    public native Boolean hasAttributeNS(Element element, String ns, String attribute);
    /** 
      * Std Signature : S(hasProperty,27,,P(d86),P(d1))
      * TE Signature : S(hasProperty,P(d86),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@391
     */
    public native Boolean hasProperty(Node element, String name);
    /** 
      * Std Signature : S(insertAfter,429,,P(d86),P(d86),P(d3))
      * TE Signature : S(insertAfter,P(d86),P(d86),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2073
     */
    public native void insertAfter(Node parent, Node ref, Object node);
    /** 
      * Std Signature : S(insertAllBefore,429,,P(d86),P(d86),P(d7<86>))
      * TE Signature : S(insertAllBefore,P(d86),P(d86),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2006
     */
    public native void insertAllBefore(Node parent, Node ref, Array<Node> nodes);
    /** 
      * Std Signature : S(insertBefore,429,,P(d86),P(d86),P(d86))
      * TE Signature : S(insertBefore,P(d86),P(d86),P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1945
     */
    public native void insertBefore(Node parent, Node ref, Node node);
    /** 
      * Std Signature : S(invoke,3,,P(d86),P(d1),P(d7<3>))
      * TE Signature : S(invoke,P(d86),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@551
     */
    public native Object invoke(Node el, String methodName, Array<Object> args);
    /** 
      * Std Signature : S(isCommentNode,27,,P(d86))
      * TE Signature : S(isCommentNode,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4672
     */
    public native Boolean isCommentNode(Node node);
    /** 
      * Std Signature : S(isElementNode,27,,P(d86))
      * TE Signature : S(isElementNode,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4712
     */
    public native Boolean isElementNode(Node node);
    /** 
      * Std Signature : S(isPrevented,27,,P(d77))
      * TE Signature : S(isPrevented,P(d77))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1214
     */
    public native Boolean isPrevented(Event evt);
    /** 
      * Std Signature : S(isTemplateElement,27,,P(d86))
      * TE Signature : S(isTemplateElement,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4593
     */
    public native Boolean isTemplateElement(Node el);
    /** 
      * Std Signature : S(isTextNode,27,,P(d86))
      * TE Signature : S(isTextNode,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4635
     */
    public native Boolean isTextNode(Node node);
    /** 
      * Std Signature : S(log,429,,P(d1))
      * TE Signature : S(log,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@646
     */
    public native void log(String error);
    /** 
      * Std Signature : S(logError,429,,P(d1))
      * TE Signature : S(logError,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@611
     */
    public native void logError(String error);
    /** 
      * Std Signature : S(logGroup,429,,P(d1))
      * TE Signature : S(logGroup,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@676
     */
    public native void logGroup(String error);
    /** 
      * Std Signature : S(nextSibling,86,,P(d86))
      * TE Signature : S(nextSibling,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1573
     */
    public native Node nextSibling(Node el);
    /** 
      * Std Signature : S(nodeName,1,,P(d86))
      * TE Signature : S(nodeName,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1385
     */
    public native String nodeName(Node node);
    /** 
      * Std Signature : S(nodeValue,1,,P(d86))
      * TE Signature : S(nodeValue,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1419
     */
    public native String nodeValue(Node node);
    /** 
      * Std Signature : S(parentElement,86,,P(d86))
      * TE Signature : S(parentElement,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1613
     */
    public native Node parentElement(Node el);
    /** 
      * Std Signature : S(preventDefault,429,,P(d77))
      * TE Signature : S(preventDefault,P(d77))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1176
     */
    public native void preventDefault(Event evt);
    /** 
      * Std Signature : S(querySelector,3,,P(d49),P(d1))
      * TE Signature : S(querySelector,P(d49),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@816
     */
    public native Object querySelector(Element el, String selector);
    /** 
      * Std Signature : S(remove,86,,P(d86))
      * TE Signature : S(remove,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1915
     */
    public native Node remove(Node node);
    /** 
      * Std Signature : S(removeAttribute,429,,P(d49),P(d1))
      * TE Signature : S(removeAttribute,P(d49),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4188
     */
    public native void removeAttribute(Element element, String attribute);
    /** 
      * Std Signature : S(removeAttributeNS,429,,P(d49),P(d1),P(d1))
      * TE Signature : S(removeAttributeNS,P(d49),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4252
     */
    public native void removeAttributeNS(Element element, String ns, String name);
    /** 
      * Std Signature : S(removeChild,429,,P(d86),P(d86))
      * TE Signature : S(removeChild,P(d86),P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1804
     */
    public native void removeChild(Node el, Node node);
    /** 
      * Std Signature : S(replaceChild,429,,P(d86),P(d86),P(d86))
      * TE Signature : S(replaceChild,P(d86),P(d86),P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1849
     */
    public native void replaceChild(Node el, Node newChild, Node oldChild);
    /** 
      * Std Signature : S(setAttribute,429,,P(d49),P(d1),P(d1))
      * TE Signature : S(setAttribute,P(d49),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4032
     */
    public native void setAttribute(Element element, String name, String value);
    /** 
      * Std Signature : S(setAttributeNS,429,,P(d49),P(d1),P(d1),P(d1))
      * TE Signature : S(setAttributeNS,P(d49),P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4103
     */
    public native void setAttributeNS(Element element, String ns, String name, String value);
    /** 
      * Std Signature : S(setData,429,,P(d49),P(d1),P(d1))
      * TE Signature : S(setData,P(d49),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@5206
     */
    public native void setData(Element element, String name, String value);
    /** 
      * Std Signature : S(setInnerHTML,429,,P(d49),P(d1))
      * TE Signature : S(setInnerHTML,P(d49),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2132
     */
    public native void setInnerHTML(Element el, String value);
    /** 
      * Std Signature : S(setProperty,429,,P(d86),P(d1),P(d3))
      * TE Signature : S(setProperty,P(d86),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@446
     */
    public native void setProperty(Node el, String name, Object value);
    /** 
      * Std Signature : S(setText,429,,P(d86),P(d1))
      * TE Signature : S(setText,P(d86),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@2222
     */
    public native void setText(Node el, String value);
    /** 
      * Std Signature : S(templateAwareRoot,3,,P(d86))
      * TE Signature : S(templateAwareRoot,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@4325
     */
    public native Object templateAwareRoot(Node el);
    /** 
      * Std Signature : S(type,1,,P(d672))
      * TE Signature : S(type,P(d672))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/browser_adapter.d.ts@1461
     */
    public native String type(HTMLInputElement node);
}
