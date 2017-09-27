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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFitToViewBox")
public class SVGFitToViewBoxImpl implements SVGFitToViewBox
{

    /*
        Properties
    */

    public SVGAnimatedPreserveAspectRatio preserveAspectRatio;

    @JsProperty( name = "preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

    @JsProperty( name = "preserveAspectRatio")
    public native void setPreserveAspectRatio( SVGAnimatedPreserveAspectRatio value );

    public SVGAnimatedRect viewBox;

    @JsProperty( name = "viewBox")
    public native SVGAnimatedRect getViewBox();

    @JsProperty( name = "viewBox")
    public native void setViewBox( SVGAnimatedRect value );
}
