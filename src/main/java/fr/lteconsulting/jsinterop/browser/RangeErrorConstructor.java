package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RangeErrorConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37117
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RangeErrorConstructor")
public class RangeErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public RangeError prototype;

    @JsProperty( name = "prototype")
    public native RangeError getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( RangeError value );
}
