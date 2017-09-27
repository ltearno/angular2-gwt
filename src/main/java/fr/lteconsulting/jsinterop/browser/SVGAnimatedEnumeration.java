package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedEnumeration
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570563
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570665
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedEnumeration")
public class SVGAnimatedEnumeration
{

    /*
        Constructors
    */
    public SVGAnimatedEnumeration(){
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
