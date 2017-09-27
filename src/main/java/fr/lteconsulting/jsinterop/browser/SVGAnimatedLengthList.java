package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedLengthList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571154
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571278
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedLengthList")
public class SVGAnimatedLengthList
{

    /*
        Constructors
    */
    public SVGAnimatedLengthList(){
    }

    /*
        Properties
    */

    public SVGLengthList animVal;

    @JsProperty( name = "animVal")
    public native SVGLengthList getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( SVGLengthList value );

    public SVGLengthList baseVal;

    @JsProperty( name = "baseVal")
    public native SVGLengthList getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( SVGLengthList value );
}
