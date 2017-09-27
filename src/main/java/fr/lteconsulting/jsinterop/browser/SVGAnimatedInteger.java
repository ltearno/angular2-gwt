package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedInteger
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570767
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570865
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedInteger")
public class SVGAnimatedInteger
{

    /*
        Constructors
    */
    public SVGAnimatedInteger(){
    }

    /*
        Properties
    */

    public Number animVal;

    @JsProperty( name = "animVal")
    public native Number getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( Number value );

    public Number baseVal;

    @JsProperty( name = "baseVal")
    public native Number getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( Number value );
}
