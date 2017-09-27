package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGSVGElementEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:624113
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGSVGElementEventMap")
public class SVGSVGElementEventMap extends SVGElementEventMap
{

    /*
        Properties
    */

    public Event SVGAbort;

    @JsProperty( name = "SVGAbort")
    public native Event getSVGAbort();

    @JsProperty( name = "SVGAbort")
    public native void setSVGAbort( Event value );

    public Event SVGError;

    @JsProperty( name = "SVGError")
    public native Event getSVGError();

    @JsProperty( name = "SVGError")
    public native void setSVGError( Event value );

    public Event SVGUnload;

    @JsProperty( name = "SVGUnload")
    public native Event getSVGUnload();

    @JsProperty( name = "SVGUnload")
    public native void setSVGUnload( Event value );

    public SVGZoomEvent SVGZoom;

    @JsProperty( name = "SVGZoom")
    public native SVGZoomEvent getSVGZoom();

    @JsProperty( name = "SVGZoom")
    public native void setSVGZoom( SVGZoomEvent value );

    public UIEvent resize;

    @JsProperty( name = "resize")
    public native UIEvent getResize();

    @JsProperty( name = "resize")
    public native void setResize( UIEvent value );

    public UIEvent scroll;

    @JsProperty( name = "scroll")
    public native UIEvent getScroll();

    @JsProperty( name = "scroll")
    public native void setScroll( UIEvent value );
}
