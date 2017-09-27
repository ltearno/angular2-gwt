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
public interface SubscribableOrPromise_UnionOfPromiseLikeOfTAndSubscribableOfT<T>  {
    @JsOverlay
    default PromiseLike<T> asPromiseLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> SubscribableOrPromise_UnionOfPromiseLikeOfTAndSubscribableOfT<T> ofPromiseLikeOfT(PromiseLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T> asSubscribableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> SubscribableOrPromise_UnionOfPromiseLikeOfTAndSubscribableOfT<T> ofSubscribableOfT(Subscribable<T> value) {
        return Js.cast( value );
    }
    
}
