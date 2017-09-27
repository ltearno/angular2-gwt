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
public interface ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T>  {
    @JsOverlay
    default ArrayLike<T> asArrayLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T> ofArrayLikeOfT(ArrayLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<T> asPromiseLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T> ofPromiseLikeOfT(PromiseLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T> asSubscribableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T> ofSubscribableOfT(Subscribable<T> value) {
        return Js.cast( value );
    }
    
}
