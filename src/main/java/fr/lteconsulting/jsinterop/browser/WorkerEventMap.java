package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WorkerEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:716033
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WorkerEventMap")
public class WorkerEventMap extends AbstractWorkerEventMap
{

    /*
        Properties
    */

    public MessageEvent message;

    @JsProperty( name = "message")
    public native MessageEvent getMessage();

    @JsProperty( name = "message")
    public native void setMessage( MessageEvent value );
}
