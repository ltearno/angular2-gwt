package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.rxjs.Subscription;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfFunctionAndSubscriptionAndVoid  {
    @JsOverlay
    default Function asFunction() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunctionAndSubscriptionAndVoid ofFunction(Function value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscription asSubscription() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunctionAndSubscriptionAndVoid ofSubscription(Subscription value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Void asVoid() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunctionAndSubscriptionAndVoid ofVoid(Void value) {
        return Js.cast( value );
    }
    
}
