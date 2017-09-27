package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".RenderDebugInfo
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:730
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="RenderDebugInfo")
public class RenderDebugInfo
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

    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

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
