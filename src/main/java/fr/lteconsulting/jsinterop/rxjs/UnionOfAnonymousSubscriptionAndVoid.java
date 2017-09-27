package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAnonymousSubscriptionAndVoid  {
    @JsOverlay
    default AnonymousSubscription asAnonymousSubscription() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousSubscriptionAndVoid ofAnonymousSubscription(AnonymousSubscription value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Void asVoid() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousSubscriptionAndVoid ofVoid(Void value) {
        return Js.cast( value );
    }
    
}
