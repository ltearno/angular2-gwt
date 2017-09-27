package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedBoolean
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570373
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:570473
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedBoolean")
public class SVGAnimatedBoolean
{

    /*
        Constructors
    */
    public SVGAnimatedBoolean(){
    }

    /*
        Properties
    */

    public Boolean animVal;

    @JsProperty( name = "animVal")
    public native Boolean getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( Boolean value );

    public Boolean baseVal;

    @JsProperty( name = "baseVal")
    public native Boolean getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( Boolean value );
}
