package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DOML2DeprecatedSizeProperty
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:724026
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface DOML2DeprecatedSizeProperty
{

    /*
        Properties
    */

    @JsProperty( name = "size")
    Number getSize();

    @JsProperty( name = "size")
    void setSize( Number value );
}
