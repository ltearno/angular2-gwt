package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: FunctionConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:10366
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FunctionConstructor")
public class FunctionConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Function prototype;

    @JsProperty( name = "prototype")
    public native Function getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Function value );
}
