package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TypeErrorConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37868
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TypeErrorConstructor")
public class TypeErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public TypeError prototype;

    @JsProperty( name = "prototype")
    public native TypeError getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( TypeError value );
}
