package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: BooleanConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:18428
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="BooleanConstructor")
public class BooleanConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Boolean prototype;

    @JsProperty( name = "prototype")
    public native Boolean getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Boolean value );
}
