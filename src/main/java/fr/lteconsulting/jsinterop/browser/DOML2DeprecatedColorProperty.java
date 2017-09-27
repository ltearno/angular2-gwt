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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface DOML2DeprecatedColorProperty
{

    /*
        Properties
    */

    @JsProperty( name = "color")
    String getColor();

    @JsProperty( name = "color")
    void setColor( String value );
}
