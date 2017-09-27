package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedTransformList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:572432
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:572565
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedTransformList")
public class SVGAnimatedTransformList
{

    /*
        Constructors
    */
    public SVGAnimatedTransformList(){
    }

    /*
        Properties
    */

    public SVGTransformList animVal;

    @JsProperty( name = "animVal")
    public native SVGTransformList getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( SVGTransformList value );

    public SVGTransformList baseVal;

    @JsProperty( name = "baseVal")
    public native SVGTransformList getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( SVGTransformList value );
}
