package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.ArrayLike;
import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.rxjs.Subscribable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/angular4-api/tsd/rxjs/Observable.d.ts:603
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6>  {
    @JsOverlay
    default ArrayLike<T6> asArrayLikeOfT6() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T6> ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> ofArrayLikeOfT6(ArrayLike<T6> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<T6> asPromiseLikeOfT6() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T6> ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> ofPromiseLikeOfT6(PromiseLike<T6> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T6> asSubscribableOfT6() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T6> ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> ofSubscribableOfT6(Subscribable<T6> value) {
        return Js.cast( value );
    }
    
}
