package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedPoints
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:734637
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedPoints")
public class SVGAnimatedPoints
{

    /*
        Properties
    */

    public SVGPointList animatedPoints;

    @JsProperty( name = "animatedPoints")
    public native SVGPointList getAnimatedPoints();

    @JsProperty( name = "animatedPoints")
    public native void setAnimatedPoints( SVGPointList value );

    public SVGPointList points;

    @JsProperty( name = "points")
    public native SVGPointList getPoints();

    @JsProperty( name = "points")
    public native void setPoints( SVGPointList value );
}
