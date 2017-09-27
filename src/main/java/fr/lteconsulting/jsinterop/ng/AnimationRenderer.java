package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.UnionOfBooleanAndVoid;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import fr.lteconsulting.jsinterop.ng.core.RendererStyleFlags2;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer".AnimationRenderer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer.d.ts:2266
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationRenderer")
public class AnimationRenderer implements BaseAnimationRenderer, Renderer2
{

    /*
        Constructors
    */
    public AnimationRenderer(AnimationRendererFactory factory, String namespaceId, Renderer2 delegate, AnimationEngine engine){
    }

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

    public Renderer2 delegate;

    @JsProperty( name = "delegate")
    public native Renderer2 getDelegate();

    @JsProperty( name = "delegate")
    public native void setDelegate( Renderer2 value );

    public AnimationEngine engine;

    @JsProperty( name = "engine")
    public native AnimationEngine getEngine();

    @JsProperty( name = "engine")
    public native void setEngine( AnimationEngine value );

    public AnimationRendererFactory factory;

    @JsProperty( name = "factory")
    public native AnimationRendererFactory getFactory();

    @JsProperty( name = "factory")
    public native void setFactory( AnimationRendererFactory value );

    public String namespaceId;

    @JsProperty( name = "namespaceId")
    public native String getNamespaceId();

    @JsProperty( name = "namespaceId")
    public native void setNamespaceId( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addClass,429,,P(d3),P(d1))
      * TE Signature : S(addClass,P(d3),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void addClass(Object el, String name);
    /** 
      * Std Signature : S(appendChild,429,,P(d3),P(d3))
      * TE Signature : S(appendChild,P(d3),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void appendChild(Object parent, Object newChild);
    /** 
      * Std Signature : S(createComment,3,,P(d1))
      * TE Signature : S(createComment,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native Object createElement(String name, String namespace /* optional */);
    /** 
      * Std Signature : S(createText,3,,P(d1))
      * TE Signature : S(createText,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object createText(String value);
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void destroy();
    /** 
      * Std Signature : S(destroyNode,429,,P(d3))
      * TE Signature : S(destroyNode,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void destroyNode(Object node);
    /** 
      * Std Signature : S(disableAnimations,429,,P(d3),P(d27))
      * TE Signature : S(disableAnimations,P(d3),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void disableAnimations(Object element, Boolean value);
    /** 
      * Std Signature : S(insertBefore,429,,P(d3),P(d3),P(d3))
      * TE Signature : S(insertBefore,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void insertBefore(Object parent, Object newChild, Object refChild);
    /** 
      * Std Signature : S(listen,F--S(?,429,,)------),,P(d3),P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<3,U(-27,349)>))
      * TE Signature : S(listen,P(d3),P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Action listen(Object target, String eventName, Function1<Object, UnionOfBooleanAndVoid> callback);
    /** 
      * Std Signature : S(nextSibling,3,,P(d3))
      * TE Signature : S(nextSibling,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object nextSibling(Object node);
    /** 
      * Std Signature : S(parentNode,3,,P(d3))
      * TE Signature : S(parentNode,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void removeAttribute(Object el, String name, String namespace /* optional */);
    /** 
      * Std Signature : S(removeChild,429,,P(d3),P(d3))
      * TE Signature : S(removeChild,P(d3),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeChild(Object parent, Object oldChild);
    /** 
      * Std Signature : S(removeClass,429,,P(d3),P(d1))
      * TE Signature : S(removeClass,P(d3),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void removeStyle(Object el, String style, RendererStyleFlags2 flags /* optional */);
    /** 
      * Std Signature : S(selectRootElement,3,,P(d3))
      * TE Signature : S(selectRootElement,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void setAttribute(Object el, String name, String value, String namespace /* optional */);
    /** 
      * Std Signature : S(setProperty,429,,P(d3),P(d1),P(d3))
      * TE Signature : S(setProperty,P(d3),P(d1),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
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
      * added from type hierarchy
     */
    public native void setStyle(Object el, String style, Object value, RendererStyleFlags2 flags /* optional */);
    /** 
      * Std Signature : S(setValue,429,,P(d3),P(d1))
      * TE Signature : S(setValue,P(d3),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void setValue(Object node, String value);
}
