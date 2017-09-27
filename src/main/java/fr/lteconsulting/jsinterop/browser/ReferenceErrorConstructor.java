package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ReferenceErrorConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37360
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReferenceErrorConstructor")
public class ReferenceErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public ReferenceError prototype;

    @JsProperty( name = "prototype")
    public native ReferenceError getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( ReferenceError value );
}
