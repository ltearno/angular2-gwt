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
public interface SubscribableOrPromise_UnionOfPromiseLikeOfOAndSubscribableOfO<O>  {
    @JsOverlay
    default PromiseLike<O> asPromiseLikeOfO() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <O> SubscribableOrPromise_UnionOfPromiseLikeOfOAndSubscribableOfO<O> ofPromiseLikeOfO(PromiseLike<O> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<O> asSubscribableOfO() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <O> SubscribableOrPromise_UnionOfPromiseLikeOfOAndSubscribableOfO<O> ofSubscribableOfO(Subscribable<O> value) {
        return Js.cast( value );
    }
    
}
