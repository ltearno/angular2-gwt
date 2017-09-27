package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGZoomEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:637480
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:637721
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGZoomEvent")
public class SVGZoomEvent extends UIEvent
{

    /*
        Constructors
    */
    public SVGZoomEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public Number newScale;

    @JsProperty( name = "newScale")
    public native Number getNewScale();

    @JsProperty( name = "newScale")
    public native void setNewScale( Number value );

    public SVGPoint newTranslate;

    @JsProperty( name = "newTranslate")
    public native SVGPoint getNewTranslate();

    @JsProperty( name = "newTranslate")
    public native void setNewTranslate( SVGPoint value );

    public Number previousScale;

    @JsProperty( name = "previousScale")
    public native Number getPreviousScale();

    @JsProperty( name = "previousScale")
    public native void setPreviousScale( Number value );

    public SVGPoint previousTranslate;

    @JsProperty( name = "previousTranslate")
    public native SVGPoint getPreviousTranslate();

    @JsProperty( name = "previousTranslate")
    public native void setPreviousTranslate( SVGPoint value );

    public SVGRect zoomRectScreen;

    @JsProperty( name = "zoomRectScreen")
    public native SVGRect getZoomRectScreen();

    @JsProperty( name = "zoomRectScreen")
    public native void setZoomRectScreen( SVGRect value );
}
