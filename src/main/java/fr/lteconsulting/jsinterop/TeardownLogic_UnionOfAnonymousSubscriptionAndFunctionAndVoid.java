package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.rxjs.AnonymousSubscription;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription.d.ts:67
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid  {
    @JsOverlay
    default AnonymousSubscription asAnonymousSubscription() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid ofAnonymousSubscription(AnonymousSubscription value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Function asFunction() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid ofFunction(Function value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Void asVoid() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid ofVoid(Void value) {
        return Js.cast( value );
    }
    
}
