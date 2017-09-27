package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.rxjs.Subscribable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/angular4-api/tsd/rxjs/Observable.d.ts:522
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber  {
    @JsOverlay
    default PromiseLike<Number> asPromiseLikeOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber ofPromiseLikeOfNumber(PromiseLike<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<Number> asSubscribableOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber ofSubscribableOfNumber(Subscribable<Number> value) {
        return Js.cast( value );
    }
    
}
