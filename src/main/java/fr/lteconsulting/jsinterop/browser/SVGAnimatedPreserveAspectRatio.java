package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedPreserveAspectRatio
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571784
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571935
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedPreserveAspectRatio")
public class SVGAnimatedPreserveAspectRatio
{

    /*
        Constructors
    */
    public SVGAnimatedPreserveAspectRatio(){
    }

    /*
        Properties
    */

    public SVGPreserveAspectRatio animVal;

    @JsProperty( name = "animVal")
    public native SVGPreserveAspectRatio getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( SVGPreserveAspectRatio value );

    public SVGPreserveAspectRatio baseVal;

    @JsProperty( name = "baseVal")
    public native SVGPreserveAspectRatio getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( SVGPreserveAspectRatio value );
}
