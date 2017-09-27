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
public interface SubscribableOrPromise_UnionOfPromiseLikeOfT3AndSubscribableOfT3<T3>  {
    @JsOverlay
    default PromiseLike<T3> asPromiseLikeOfT3() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T3> SubscribableOrPromise_UnionOfPromiseLikeOfT3AndSubscribableOfT3<T3> ofPromiseLikeOfT3(PromiseLike<T3> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T3> asSubscribableOfT3() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T3> SubscribableOrPromise_UnionOfPromiseLikeOfT3AndSubscribableOfT3<T3> ofSubscribableOfT3(Subscribable<T3> value) {
        return Js.cast( value );
    }
    
}
