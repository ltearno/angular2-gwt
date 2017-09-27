package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAnimatedString
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:572248
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:572345
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedString")
public class SVGAnimatedString
{

    /*
        Constructors
    */
    public SVGAnimatedString(){
    }

    /*
        Properties
    */

    public String animVal;

    @JsProperty( name = "animVal")
    public native String getAnimVal();

    @JsProperty( name = "animVal")
    public native void setAnimVal( String value );

    public String baseVal;

    @JsProperty( name = "baseVal")
    public native String getBaseVal();

    @JsProperty( name = "baseVal")
    public native void setBaseVal( String value );
}
