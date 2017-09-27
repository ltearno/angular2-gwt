package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AbstractWorkerEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:722581
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AbstractWorkerEventMap")
public class AbstractWorkerEventMap
{

    /*
        Properties
    */

    public ErrorEvent error;

    @JsProperty( name = "error")
    public native ErrorEvent getError();

    @JsProperty( name = "error")
    public native void setError( ErrorEvent value );
}
