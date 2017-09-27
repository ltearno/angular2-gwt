package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node".DebugNode
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts:414
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="DebugNode")
public class DebugNode
{

    /*
        Constructors
    */
    public DebugNode(Object nativeNode, DebugNode parent, DebugContext _debugContext){
    }

    /*
        Properties
    */

    public Object _debugContext;

    @JsProperty( name = "_debugContext")
    public native Object get_debugContext();

    @JsProperty( name = "_debugContext")
    public native void set_debugContext( Object value );

    public Object componentInstance;

    @JsProperty( name = "componentInstance")
    public native Object getComponentInstance();

    @JsProperty( name = "componentInstance")
    public native void setComponentInstance( Object value );

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

    public Array<EventListener> listeners;

    @JsProperty( name = "listeners")
    public native Array<EventListener> getListeners();

    @JsProperty( name = "listeners")
    public native void setListeners( Array<EventListener> value );

    public Object nativeNode;

    @JsProperty( name = "nativeNode")
    public native Object getNativeNode();

    @JsProperty( name = "nativeNode")
    public native void setNativeNode( Object value );

    public DebugElement parent;

    @JsProperty( name = "parent")
    public native DebugElement getParent();

    @JsProperty( name = "parent")
    public native void setParent( DebugElement value );

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

    public String source;

    @JsProperty( name = "source")
    public native String getSource();

    @JsProperty( name = "source")
    public native void setSource( String value );
}
