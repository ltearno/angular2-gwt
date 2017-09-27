package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ServiceWorkerRegistrationEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:643424
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerRegistrationEventMap")
public class ServiceWorkerRegistrationEventMap
{

    /*
        Properties
    */

    public Event updatefound;

    @JsProperty( name = "updatefound")
    public native Event getUpdatefound();

    @JsProperty( name = "updatefound")
    public native void setUpdatefound( Event value );
}
