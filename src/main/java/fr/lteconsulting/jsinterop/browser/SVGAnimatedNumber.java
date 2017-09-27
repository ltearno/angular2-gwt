package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedNumber
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571377
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:571474
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedNumber")
public class SVGAnimatedNumber
{

    /*
        Constructors
    */
    public SVGAnimatedNumber(){
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
