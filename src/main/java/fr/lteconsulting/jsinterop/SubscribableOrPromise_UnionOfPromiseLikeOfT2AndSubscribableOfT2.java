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
public interface SubscribableOrPromise_UnionOfPromiseLikeOfT2AndSubscribableOfT2<T2>  {
    @JsOverlay
    default PromiseLike<T2> asPromiseLikeOfT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T2> SubscribableOrPromise_UnionOfPromiseLikeOfT2AndSubscribableOfT2<T2> ofPromiseLikeOfT2(PromiseLike<T2> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T2> asSubscribableOfT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T2> SubscribableOrPromise_UnionOfPromiseLikeOfT2AndSubscribableOfT2<T2> ofSubscribableOfT2(Subscribable<T2> value) {
        return Js.cast( value );
    }
    
}
