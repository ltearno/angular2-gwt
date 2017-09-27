package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ServiceWorkerMessageEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:643000
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:643254
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerMessageEvent")
public class ServiceWorkerMessageEvent extends Event
{

    /*
        Constructors
    */
    public ServiceWorkerMessageEvent(String type, ServiceWorkerMessageEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Object data;

    @JsProperty( name = "data")
    public native Object getData();

    @JsProperty( name = "data")
    public native void setData( Object value );

    public String lastEventId;

    @JsProperty( name = "lastEventId")
    public native String getLastEventId();

    @JsProperty( name = "lastEventId")
    public native void setLastEventId( String value );

    public String origin;

    @JsProperty( name = "origin")
    public native String getOrigin();

    @JsProperty( name = "origin")
    public native void setOrigin( String value );

    public Array<MessagePort> ports;

    @JsProperty( name = "ports")
    public native Array<MessagePort> getPorts();

    @JsProperty( name = "ports")
    public native void setPorts( Array<MessagePort> value );

    public UnionOfMessagePortAndServiceWorker source;

    @JsProperty( name = "source")
    public native UnionOfMessagePortAndServiceWorker getSource();

    @JsProperty( name = "source")
    public native void setSource( UnionOfMessagePortAndServiceWorker value );

    @JsOverlay
    public final void setSource( MessagePort value ) { setSource(UnionOfMessagePortAndServiceWorker.ofMessagePort( value )); }

    @JsOverlay
    public final void setSource( ServiceWorker value ) { setSource(UnionOfMessagePortAndServiceWorker.ofServiceWorker( value )); }
}
