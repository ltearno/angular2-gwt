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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGZoomAndPan
{

    /*
        Properties
    */

    @JsProperty( name = "zoomAndPan")
    Number getZoomAndPan();

    @JsProperty( name = "zoomAndPan")
    void setZoomAndPan( Number value );
}
