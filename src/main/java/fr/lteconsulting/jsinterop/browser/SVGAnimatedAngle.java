package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedAngle
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570180
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570289
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedAngle")
public class SVGAnimatedAngle
{

    /*
        Constructors
    */
    public SVGAnimatedAngle(){
    }

    /*
        Properties
    */

    public SVGAngle animVal;

    @JsProperty( name = "animVal")
    public native SVGAngle getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( SVGAngle value );

    public SVGAngle baseVal;

    @JsProperty( name = "baseVal")
    public native SVGAngle getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( SVGAngle value );
}
