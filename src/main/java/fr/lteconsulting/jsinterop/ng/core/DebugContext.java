package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Console;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".DebugContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:12343
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="DebugContext")
public class DebugContext
{

    /*
        Properties
    */

    public Object component;

    @JsProperty( name = "component")
    public native Object getComponent();

    @JsProperty( name = "component")
    public native void setComponent( Object value );

    public Object componentRenderElement;

    @JsProperty( name = "componentRenderElement")
    public native Object getComponentRenderElement();

    @JsProperty( name = "componentRenderElement")
    public native void setComponentRenderElement( Object value );

    public Object context;

    @JsProperty( name = "context")
    public native Object getContext();

    @JsProperty( name = "context")
    public native void setContext( Object value );

    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

    public Number nodeIndex;

    @JsProperty( name = "nodeIndex")
    public native Number getNodeIndex();

    @JsProperty( name = "nodeIndex")
    public native void setNodeIndex( Number value );

    public Array<Object> providerTokens;

    @JsProperty( name = "providerTokens")
    public native Array<Object> getProviderTokens();

    @JsProperty( name = "providerTokens")
    public native void setProviderTokens( Array<Object> value );

    public AnonymousType717 references;

    @JsProperty( name = "references")
    public native AnonymousType717 getReferences();

    @JsProperty( name = "references")
    public native void setReferences( AnonymousType717 value );

    public Object renderNode;

    @JsProperty( name = "renderNode")
    public native Object getRenderNode();

    @JsProperty( name = "renderNode")
    public native void setRenderNode( Object value );

    public ViewData view;

    @JsProperty( name = "view")
    public native ViewData getView();

    @JsProperty( name = "view")
    public native void setView( ViewData value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(logError,429,,P(d394))
      * TE Signature : S(logError,P(d394))
      * 
     */
    public native void logError(Console console);
    /** 
      * Std Signature : S(logError,429,,P(d394),P(D3))
      * TE Signature : S(logError,P(d394),P(D3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@12801
     */
    public native void logError(Console console, Object... values);
}
