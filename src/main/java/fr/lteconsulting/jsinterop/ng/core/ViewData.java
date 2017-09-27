package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType1041;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ViewData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:8935

  * View instance data.
  * Attention: Adding fields to this is performance sensitive!
 */
@JsType(isNative=true, namespace="ng.core", name="ViewData")
public class ViewData
{

    /*
        Properties
    */

    public Object component;

    @JsProperty( name = "component")
    public native Object getComponent();

    @JsProperty( name = "component")
    public native void setComponent( Object value );

    public Object context;

    @JsProperty( name = "context")
    public native Object getContext();

    @JsProperty( name = "context")
    public native void setContext( Object value );

    public ViewDefinition def;

    @JsProperty( name = "def")
    public native ViewDefinition getDef();

    @JsProperty( name = "def")
    public native void setDef( ViewDefinition value );

    public Array<DisposableFn> disposables;

    @JsProperty( name = "disposables")
    public native Array<DisposableFn> getDisposables();

    @JsProperty( name = "disposables")
    public native void setDisposables( Array<DisposableFn> value );

    public AnonymousType1041 nodes;

    @JsProperty( name = "nodes")
    public native AnonymousType1041 getNodes();

    @JsProperty( name = "nodes")
    public native void setNodes( AnonymousType1041 value );

    public Array<Object> oldValues;

    @JsProperty( name = "oldValues")
    public native Array<Object> getOldValues();

    @JsProperty( name = "oldValues")
    public native void setOldValues( Array<Object> value );

    public ViewData parent;

    @JsProperty( name = "parent")
    public native ViewData getParent();

    @JsProperty( name = "parent")
    public native void setParent( ViewData value );

    public NodeDef parentNodeDef;

    @JsProperty( name = "parentNodeDef")
    public native NodeDef getParentNodeDef();

    @JsProperty( name = "parentNodeDef")
    public native void setParentNodeDef( NodeDef value );

    public Renderer2 renderer;

    @JsProperty( name = "renderer")
    public native Renderer2 getRenderer();

    @JsProperty( name = "renderer")
    public native void setRenderer( Renderer2 value );

    public RootData root;

    @JsProperty( name = "root")
    public native RootData getRoot();

    @JsProperty( name = "root")
    public native void setRoot( RootData value );

    public ViewState state;

    @JsProperty( name = "state")
    public native ViewState getState();

    @JsProperty( name = "state")
    public native void setState( ViewState value );

    public ViewData viewContainerParent;

    @JsProperty( name = "viewContainerParent")
    public native ViewData getViewContainerParent();

    @JsProperty( name = "viewContainerParent")
    public native void setViewContainerParent( ViewData value );
}
