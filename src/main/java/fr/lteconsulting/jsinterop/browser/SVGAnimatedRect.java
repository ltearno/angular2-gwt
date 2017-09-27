package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedRect
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:572061
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:572167
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedRect")
public class SVGAnimatedRect
{

    /*
        Constructors
    */
    public SVGAnimatedRect(){
    }

    /*
        Properties
    */

    public SVGRect animVal;

    @JsProperty( name = "animVal")
    public native SVGRect getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( SVGRect value );

    public SVGRect baseVal;

    @JsProperty( name = "baseVal")
    public native SVGRect getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( SVGRect value );
}
