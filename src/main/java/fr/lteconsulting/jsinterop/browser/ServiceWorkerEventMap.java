package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ServiceWorkerEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:641248
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerEventMap")
public class ServiceWorkerEventMap extends AbstractWorkerEventMap
{

    /*
        Properties
    */

    public Event statechange;

    @JsProperty( name = "statechange")
    public native Event getStatechange();

    @JsProperty( name = "statechange")
    public native void setStatechange( Event value );
}
