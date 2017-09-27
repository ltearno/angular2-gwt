package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.ng.core.RendererFactory2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_renderer".DomRendererFactory2
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/dom_renderer.d.ts:864
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="DomRendererFactory2")
public class DomRendererFactory2 extends RendererFactory2
{

    /*
        Constructors
    */
    public DomRendererFactory2(EventManager eventManager, DomSharedStylesHost sharedStylesHost){
    }

    /*
        Properties
    */

    public Object defaultRenderer;

    @JsProperty( name = "defaultRenderer")
    public native Object getDefaultRenderer();

    @JsProperty( name = "defaultRenderer")
    public native void setDefaultRenderer( Object value );

    public Object eventManager;

    @JsProperty( name = "eventManager")
    public native Object getEventManager();

    @JsProperty( name = "eventManager")
    public native void setEventManager( Object value );

    public Object rendererByCompId;

    @JsProperty( name = "rendererByCompId")
    public native Object getRendererByCompId();

    @JsProperty( name = "rendererByCompId")
    public native void setRendererByCompId( Object value );

    public Object sharedStylesHost;

    @JsProperty( name = "sharedStylesHost")
    public native Object getSharedStylesHost();

    @JsProperty( name = "sharedStylesHost")
    public native void setSharedStylesHost( Object value );
}
