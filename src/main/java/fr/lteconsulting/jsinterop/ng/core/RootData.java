package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".RootData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:12079
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="RootData")
public class RootData
{

    /*
        Properties
    */

    public ErrorHandler errorHandler;

    @JsProperty( name = "errorHandler")
    public native ErrorHandler getErrorHandler();

    @JsProperty( name = "errorHandler")
    public native void setErrorHandler( ErrorHandler value );

    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

    public NgModuleRef<Object> ngModule;

    @JsProperty( name = "ngModule")
    public native NgModuleRef<Object> getNgModule();

    @JsProperty( name = "ngModule")
    public native void setNgModule( NgModuleRef<Object> value );

    public Array<Array<Object>> projectableNodes;

    @JsProperty( name = "projectableNodes")
    public native Array<Array<Object>> getProjectableNodes();

    @JsProperty( name = "projectableNodes")
    public native void setProjectableNodes( Array<Array<Object>> value );

    public Renderer2 renderer;

    @JsProperty( name = "renderer")
    public native Renderer2 getRenderer();

    @JsProperty( name = "renderer")
    public native void setRenderer( Renderer2 value );

    public RendererFactory2 rendererFactory;

    @JsProperty( name = "rendererFactory")
    public native RendererFactory2 getRendererFactory();

    @JsProperty( name = "rendererFactory")
    public native void setRendererFactory( RendererFactory2 value );

    public Sanitizer sanitizer;

    @JsProperty( name = "sanitizer")
    public native Sanitizer getSanitizer();

    @JsProperty( name = "sanitizer")
    public native void setSanitizer( Sanitizer value );

    public Object selectorOrNode;

    @JsProperty( name = "selectorOrNode")
    public native Object getSelectorOrNode();

    @JsProperty( name = "selectorOrNode")
    public native void setSelectorOrNode( Object value );
}
