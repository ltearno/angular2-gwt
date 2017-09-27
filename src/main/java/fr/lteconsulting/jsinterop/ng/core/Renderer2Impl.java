package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.UnionOfBooleanAndVoid;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".Renderer2
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:4680
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="Renderer2")
public class Renderer2Impl implements Renderer2
{

    /*
        Properties
    */

    /** 
      * This field can be used to store arbitrary data on this renderer instance.
      * This is useful for renderers that delegate to other renderers.
     */
    public AnonymousType717 data;

    @JsProperty( name = "data")
    public native AnonymousType717 getData();

    @JsProperty( name = "data")
    public native void setData( AnonymousType717 value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addClass,429,,P(d3),P(d1))
      * TE Signature : S(addClass,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6371
     */
    public native void addClass(Object el, String name);
    /** 
      * Std Signature : S(appendChild,429,,P(d3),P(d3))
      * TE Signature : S(appendChild,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5423
     */
    public native void appendChild(Object parent, Object newChild);
    /** 
      * Std Signature : S(createComment,3,,P(d1))
      * TE Signature : S(createComment,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5088
     */
    public native Object createComment(String value);
    /** 
      * Std Signature : S(createElement,3,,P(d1))
      * TE Signature : S(createElement,P(d1))
      * 
     */
    public native Object createElement(String name);
    /** 
      * Std Signature : S(createElement,3,,P(d1),P(d1))
      * TE Signature : S(createElement,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5014
     */
    public native Object createElement(String name, String namespace /* optional */);
    /** 
      * Std Signature : S(createText,3,,P(d1))
      * TE Signature : S(createText,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5136
     */
    public native Object createText(String value);
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@4984
     */
    public native void destroy();
    /** 
      * Std Signature : S(destroyNode,429,,P(d3))
      * TE Signature : S(destroyNode,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5390
      * This property is allowed to be null / undefined,
      * in which case the view engine won't call it.
      * This is used as a performance optimization for production mode.
     */
    public native void destroyNode(Object node);
    /** 
      * Std Signature : S(insertBefore,429,,P(d3),P(d3),P(d3))
      * TE Signature : S(insertBefore,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5483
     */
    public native void insertBefore(Object parent, Object newChild, Object refChild);
    /** 
      * Std Signature : S(listen,F--S(?,429,,)------),,P(d3),P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<3,U(-27,349)>))
      * TE Signature : S(listen,P(d3),P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6779
     */
    public native Action listen(Object target, String eventName, Function1<Object, UnionOfBooleanAndVoid> callback);
    /** 
      * Std Signature : S(nextSibling,3,,P(d3))
      * TE Signature : S(nextSibling,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6145
      * Attention: On WebWorkers, this will always return a value,
      * as we are asking for a result synchronously. I.e.
      * the caller can't rely on checking whether this is null or not.
     */
    public native Object nextSibling(Object node);
    /** 
      * Std Signature : S(parentNode,3,,P(d3))
      * TE Signature : S(parentNode,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5895
      * Attention: On WebWorkers, this will always return a value,
      * as we are asking for a result synchronously. I.e.
      * the caller can't rely on checking whether this is null or not.
     */
    public native Object parentNode(Object node);
    /** 
      * Std Signature : S(removeAttribute,429,,P(d3),P(d1))
      * TE Signature : S(removeAttribute,P(d3),P(d1))
      * 
     */
    public native void removeAttribute(Object el, String name);
    /** 
      * Std Signature : S(removeAttribute,429,,P(d3),P(d1),P(d1))
      * TE Signature : S(removeAttribute,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6285
     */
    public native void removeAttribute(Object el, String name, String namespace /* optional */);
    /** 
      * Std Signature : S(removeChild,429,,P(d3),P(d3))
      * TE Signature : S(removeChild,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5559
     */
    public native void removeChild(Object parent, Object oldChild);
    /** 
      * Std Signature : S(removeClass,429,,P(d3),P(d1))
      * TE Signature : S(removeClass,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6423
     */
    public native void removeClass(Object el, String name);
    /** 
      * Std Signature : S(removeStyle,429,,P(d3),P(d1))
      * TE Signature : S(removeStyle,P(d3),P(d1))
      * 
     */
    public native void removeStyle(Object el, String style);
    /** 
      * Std Signature : S(removeStyle,429,,P(d3),P(d1),P(d385))
      * TE Signature : S(removeStyle,P(d3),P(d1),P(d385))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6572
     */
    public native void removeStyle(Object el, String style, RendererStyleFlags2 flags /* optional */);
    /** 
      * Std Signature : S(selectRootElement,3,,P(d3))
      * TE Signature : S(selectRootElement,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@5619
     */
    public native Object selectRootElement(Object selectorOrNode);
    /** 
      * Std Signature : S(setAttribute,429,,P(d3),P(d1),P(d1))
      * TE Signature : S(setAttribute,P(d3),P(d1),P(d1))
      * 
     */
    public native void setAttribute(Object el, String name, String value);
    /** 
      * Std Signature : S(setAttribute,429,,P(d3),P(d1),P(d1),P(d1))
      * TE Signature : S(setAttribute,P(d3),P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6187
     */
    public native void setAttribute(Object el, String name, String value, String namespace /* optional */);
    /** 
      * Std Signature : S(setProperty,429,,P(d3),P(d1),P(d3))
      * TE Signature : S(setProperty,P(d3),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6657
     */
    public native void setProperty(Object el, String name, Object value);
    /** 
      * Std Signature : S(setStyle,429,,P(d3),P(d1),P(d3))
      * TE Signature : S(setStyle,P(d3),P(d1),P(d3))
      * 
     */
    public native void setStyle(Object el, String style, Object value);
    /** 
      * Std Signature : S(setStyle,429,,P(d3),P(d1),P(d3),P(d385))
      * TE Signature : S(setStyle,P(d3),P(d1),P(d3),P(d385))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6478
     */
    public native void setStyle(Object el, String style, Object value, RendererStyleFlags2 flags /* optional */);
    /** 
      * Std Signature : S(setValue,429,,P(d3),P(d1))
      * TE Signature : S(setValue,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@6724
     */
    public native void setValue(Object node, String value);
}
