package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MsZoomToOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:271072
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MsZoomToOptions")
public class MsZoomToOptions
{

    /*
        Properties
    */

    public String animate;

    @JsProperty( name = "animate")
    public native String getAnimate();

    @JsProperty( name = "animate")
    public native void setAnimate( String value );

    public Number contentX;

    @JsProperty( name = "contentX")
    public native Number getContentX();

    @JsProperty( name = "contentX")
    public native void setContentX( Number value );

    public Number contentY;

    @JsProperty( name = "contentY")
    public native Number getContentY();

    @JsProperty( name = "contentY")
    public native void setContentY( Number value );

    public Number scaleFactor;

    @JsProperty( name = "scaleFactor")
    public native Number getScaleFactor();

    @JsProperty( name = "scaleFactor")
    public native void setScaleFactor( Number value );

    public String viewportX;

    @JsProperty( name = "viewportX")
    public native String getViewportX();

    @JsProperty( name = "viewportX")
    public native void setViewportX( String value );

    public String viewportY;

    @JsProperty( name = "viewportY")
    public native String getViewportY();

    @JsProperty( name = "viewportY")
    public native void setViewportY( String value );
}
