package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: EvalErrorConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:36884
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EvalErrorConstructor")
public class EvalErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public EvalError prototype;

    @JsProperty( name = "prototype")
    public native EvalError getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( EvalError value );
}
