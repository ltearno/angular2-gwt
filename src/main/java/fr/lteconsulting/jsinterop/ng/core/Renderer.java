package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".Renderer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:1412
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="Renderer")
public class Renderer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(animate,3,,P(d3),P(d3),P(d7<3>),P(d2),P(d2),P(d1))
      * TE Signature : S(animate,P(d3),P(d3),P(d7),P(d2),P(d2),P(d1))
      * 
     */
    public native Object animate(Object element, Object startingStyles, Array<Object> keyframes, Number duration, Number delay, String easing);
    /** 
      * Std Signature : S(animate,3,,P(d3),P(d3),P(d7<3>),P(d2),P(d2),P(d1),P(d7<3>))
      * TE Signature : S(animate,P(d3),P(d3),P(d7),P(d2),P(d2),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@3126
     */
    public native Object animate(Object element, Object startingStyles, Array<Object> keyframes, Number duration, Number delay, String easing, Array<Object> previousPlayers /* optional */);
    /** 
      * Std Signature : S(attachViewAfter,429,,P(d3),P(d7<3>))
      * TE Signature : S(attachViewAfter,P(d3),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2004
     */
    public native void attachViewAfter(Object node, Array<Object> viewRootNodes);
    /** 
      * Std Signature : S(createElement,3,,P(d3),P(d1))
      * TE Signature : S(createElement,P(d3),P(d1))
      * 
     */
    public native Object createElement(Object parentElement, String name);
    /** 
      * Std Signature : S(createElement,3,,P(d3),P(d1),P(d384))
      * TE Signature : S(createElement,P(d3),P(d1),P(d384))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1606
     */
    public native Object createElement(Object parentElement, String name, RenderDebugInfo debugInfo /* optional */);
    /** 
      * Std Signature : S(createTemplateAnchor,3,,P(d3))
      * TE Signature : S(createTemplateAnchor,P(d3))
      * 
     */
    public native Object createTemplateAnchor(Object parentElement);
    /** 
      * Std Signature : S(createTemplateAnchor,3,,P(d3),P(d384))
      * TE Signature : S(createTemplateAnchor,P(d3),P(d384))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1754
     */
    public native Object createTemplateAnchor(Object parentElement, RenderDebugInfo debugInfo /* optional */);
    /** 
      * Std Signature : S(createText,3,,P(d3),P(d1))
      * TE Signature : S(createText,P(d3),P(d1))
      * 
     */
    public native Object createText(Object parentElement, String value);
    /** 
      * Std Signature : S(createText,3,,P(d3),P(d1),P(d384))
      * TE Signature : S(createText,P(d3),P(d1),P(d384))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1843
     */
    public native Object createText(Object parentElement, String value, RenderDebugInfo debugInfo /* optional */);
    /** 
      * Std Signature : S(createViewRoot,3,,P(d3))
      * TE Signature : S(createViewRoot,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1702
     */
    public native Object createViewRoot(Object hostElement);
    /** 
      * Std Signature : S(destroyView,429,,P(d3),P(d7<3>))
      * TE Signature : S(destroyView,P(d3),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2126
     */
    public native void destroyView(Object hostElement, Array<Object> viewAllNodes);
    /** 
      * Std Signature : S(detachView,429,,P(d7<3>))
      * TE Signature : S(detachView,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2073
     */
    public native void detachView(Array<Object> viewRootNodes);
    /** 
      * Std Signature : S(invokeElementMethod,429,,P(d3),P(d1))
      * TE Signature : S(invokeElementMethod,P(d3),P(d1))
      * 
     */
    public native void invokeElementMethod(Object renderElement, String methodName);
    /** 
      * Std Signature : S(invokeElementMethod,429,,P(d3),P(d1),P(d7<3>))
      * TE Signature : S(invokeElementMethod,P(d3),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2973
     */
    public native void invokeElementMethod(Object renderElement, String methodName, Array<Object> args /* optional */);
    /** 
      * Std Signature : S(listen,205,,P(d3),P(d1),P(d205))
      * TE Signature : S(listen,P(d3),P(d1),P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2197
     */
    public native Function listen(Object renderElement, String name, Function callback);
    /** 
      * Std Signature : S(listenGlobal,205,,P(d1),P(d1),P(d205))
      * TE Signature : S(listenGlobal,P(d1),P(d1),P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2282
     */
    public native Function listenGlobal(String target, String name, Function callback);
    /** 
      * Std Signature : S(projectNodes,429,,P(d3),P(d7<3>))
      * TE Signature : S(projectNodes,P(d3),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1937
     */
    public native void projectNodes(Object parentElement, Array<Object> nodes);
    /** 
      * Std Signature : S(selectRootElement,3,,P(d3))
      * TE Signature : S(selectRootElement,P(d3))
      * 
     */
    public native Object selectRootElement(Object selectorOrNode);
    /** 
      * Std Signature : S(selectRootElement,3,,P(d3),P(d384))
      * TE Signature : S(selectRootElement,P(d3),P(d384))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1510
     */
    public native Object selectRootElement(Object selectorOrNode, RenderDebugInfo debugInfo /* optional */);
    /** 
      * Std Signature : S(setBindingDebugInfo,429,,P(d3),P(d1),P(d1))
      * TE Signature : S(setBindingDebugInfo,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2682
      * Used only in debug mode to serialize property changes to dom nodes as attributes.
     */
    public native void setBindingDebugInfo(Object renderElement, String propertyName, String propertyValue);
    /** 
      * Std Signature : S(setElementAttribute,429,,P(d3),P(d1),P(d1))
      * TE Signature : S(setElementAttribute,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2470
     */
    public native void setElementAttribute(Object renderElement, String attributeName, String attributeValue);
    /** 
      * Std Signature : S(setElementClass,429,,P(d3),P(d1),P(d27))
      * TE Signature : S(setElementClass,P(d3),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2787
     */
    public native void setElementClass(Object renderElement, String cssClassName, Boolean isAdd);
    /** 
      * Std Signature : S(setElementProperty,429,,P(d3),P(d1),P(d3))
      * TE Signature : S(setElementProperty,P(d3),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2369
     */
    public native void setElementProperty(Object renderElement, String propertyName, Object propertyValue);
    /** 
      * Std Signature : S(setElementStyle,429,,P(d3),P(d1),P(d1))
      * TE Signature : S(setElementStyle,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@2878
     */
    public native void setElementStyle(Object renderElement, String styleName, String styleValue);
    /** 
      * Std Signature : S(setText,429,,P(d3),P(d1))
      * TE Signature : S(setText,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@3067
     */
    public native void setText(Object renderNode, String text);
}
