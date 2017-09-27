package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ServiceWorkerContainerEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:641951
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerContainerEventMap")
public class ServiceWorkerContainerEventMap
{

    /*
        Properties
    */

    public Event controllerchange;

    @JsProperty( name = "controllerchange")
    public native Event getControllerchange();

    @JsProperty( name = "controllerchange")
    public native void setControllerchange( Event value );

    public ServiceWorkerMessageEvent message;

    @JsProperty( name = "message")
    public native ServiceWorkerMessageEvent getMessage();

    @JsProperty( name = "message")
    public native void setMessage( ServiceWorkerMessageEvent value );
}
