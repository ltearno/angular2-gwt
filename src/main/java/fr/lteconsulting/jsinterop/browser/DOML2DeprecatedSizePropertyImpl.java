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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOML2DeprecatedSizeProperty")
public class DOML2DeprecatedSizePropertyImpl implements DOML2DeprecatedSizeProperty
{

    /*
        Properties
    */

    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );
}
