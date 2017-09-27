package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: GeneratorFunctionConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:217041
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GeneratorFunctionConstructor")
public class GeneratorFunctionConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public GeneratorFunction prototype;

    @JsProperty( name = "prototype")
    public native GeneratorFunction getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( GeneratorFunction value );
}
