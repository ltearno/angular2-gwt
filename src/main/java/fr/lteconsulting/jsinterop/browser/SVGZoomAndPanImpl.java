package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGZoomAndPan
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:637251
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:637326
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGZoomAndPan")
public class SVGZoomAndPanImpl implements SVGZoomAndPan
{

    /*
        Properties
    */

    public Number zoomAndPan;

    @JsProperty( name = "zoomAndPan")
    public native Number getZoomAndPan();

    @JsProperty( name = "zoomAndPan")
    public native void setZoomAndPan( Number value );
}
