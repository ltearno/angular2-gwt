package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedLength
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570955
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571067
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedLength")
public class SVGAnimatedLength
{

    /*
        Constructors
    */
    public SVGAnimatedLength(){
    }

    /*
        Properties
    */

    public SVGLength animVal;

    @JsProperty( name = "animVal")
    public native SVGLength getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( SVGLength value );

    public SVGLength baseVal;

    @JsProperty( name = "baseVal")
    public native SVGLength getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( SVGLength value );
}
