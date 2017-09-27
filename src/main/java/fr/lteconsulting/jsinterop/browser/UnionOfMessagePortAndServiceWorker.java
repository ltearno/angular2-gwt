package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfMessagePortAndServiceWorker extends EventTarget  {
    @JsOverlay
    default MessagePort asMessagePort() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfMessagePortAndServiceWorker ofMessagePort(MessagePort value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ServiceWorker asServiceWorker() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfMessagePortAndServiceWorker ofServiceWorker(ServiceWorker value) {
        return Js.cast( value );
    }
    
}
