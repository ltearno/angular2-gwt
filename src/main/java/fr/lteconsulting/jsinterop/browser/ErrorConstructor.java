package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ErrorConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:36676
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ErrorConstructor")
public class ErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Error prototype;

    @JsProperty( name = "prototype")
    public native Error getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Error value );
}
