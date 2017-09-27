package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: LinkStyle
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:731548
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="LinkStyle")
public class LinkStyle
{

    /*
        Properties
    */

    public StyleSheet sheet;

    @JsProperty( name = "sheet")
    public native StyleSheet getSheet();

    @JsProperty( name = "sheet")
    public native void setSheet( StyleSheet value );
}
