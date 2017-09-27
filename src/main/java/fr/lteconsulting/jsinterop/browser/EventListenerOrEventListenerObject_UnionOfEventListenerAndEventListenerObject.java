package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/browser-api/tsd/lib.es6.d.ts:744654
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject  {
    @JsOverlay
    default EventListener asEventListener() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject ofEventListener(EventListener value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EventListenerObject asEventListenerObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject ofEventListenerObject(EventListenerObject value) {
        return Js.cast( value );
    }
    
}
