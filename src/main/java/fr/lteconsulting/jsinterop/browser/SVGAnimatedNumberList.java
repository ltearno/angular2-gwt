package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedNumberList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571561
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571685
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedNumberList")
public class SVGAnimatedNumberList
{

    /*
        Constructors
    */
    public SVGAnimatedNumberList(){
    }

    /*
        Properties
    */

    public SVGNumberList animVal;

    @JsProperty( name = "animVal")
    public native SVGNumberList getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( SVGNumberList value );

    public SVGNumberList baseVal;

    @JsProperty( name = "baseVal")
    public native SVGNumberList getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( SVGNumberList value );
}
