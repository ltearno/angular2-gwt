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
public interface ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>  {
    @JsOverlay
    default ArrayLike<R> asArrayLikeOfR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> ofArrayLikeOfR(ArrayLike<R> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<R> asPromiseLikeOfR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> ofPromiseLikeOfR(PromiseLike<R> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<R> asSubscribableOfR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> ofSubscribableOfR(Subscribable<R> value) {
        return Js.cast( value );
    }
    
}
