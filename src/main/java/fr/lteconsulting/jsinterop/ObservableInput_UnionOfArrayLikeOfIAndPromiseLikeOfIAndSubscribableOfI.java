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
public interface ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>  {
    @JsOverlay
    default ArrayLike<I> asArrayLikeOfI() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <I> ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> ofArrayLikeOfI(ArrayLike<I> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<I> asPromiseLikeOfI() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <I> ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> ofPromiseLikeOfI(PromiseLike<I> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<I> asSubscribableOfI() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <I> ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> ofSubscribableOfI(Subscribable<I> value) {
        return Js.cast( value );
    }
    
}
