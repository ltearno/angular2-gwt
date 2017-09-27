package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DOML2DeprecatedColorProperty
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:723963
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOML2DeprecatedColorProperty")
public class DOML2DeprecatedColorPropertyImpl implements DOML2DeprecatedColorProperty
{

    /*
        Properties
    */

    public String color;

    @JsProperty( name = "color")
    public native String getColor();

    @JsProperty( name = "color")
    public native void setColor( String value );
}
