package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGFitToViewBox
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:734989
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGFitToViewBox
{

    /*
        Properties
    */

    @JsProperty( name = "preserveAspectRatio")
    SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

    @JsProperty( name = "preserveAspectRatio")
    void setPreserveAspectRatio( SVGAnimatedPreserveAspectRatio value );

    @JsProperty( name = "viewBox")
    SVGAnimatedRect getViewBox();

    @JsProperty( name = "viewBox")
    void setViewBox( SVGAnimatedRect value );
}
