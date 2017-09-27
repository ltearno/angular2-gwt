package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: URIErrorConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:38099
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="URIErrorConstructor")
public class URIErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public URIError prototype;

    @JsProperty( name = "prototype")
    public native URIError getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( URIError value );
}
