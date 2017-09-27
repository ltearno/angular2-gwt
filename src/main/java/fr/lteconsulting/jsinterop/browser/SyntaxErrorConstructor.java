package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SyntaxErrorConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37624
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SyntaxErrorConstructor")
public class SyntaxErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public SyntaxError prototype;

    @JsProperty( name = "prototype")
    public native SyntaxError getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( SyntaxError value );
}
