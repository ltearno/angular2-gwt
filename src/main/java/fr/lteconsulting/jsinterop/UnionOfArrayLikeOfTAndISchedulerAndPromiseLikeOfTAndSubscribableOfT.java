package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.ArrayLike;
import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.rxjs.IScheduler;
import fr.lteconsulting.jsinterop.rxjs.Subscribable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<T>  {
    @JsOverlay
    default ArrayLike<T> asArrayLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<T> ofArrayLikeOfT(ArrayLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IScheduler asIScheduler() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<T> ofIScheduler(IScheduler value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<T> asPromiseLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<T> ofPromiseLikeOfT(PromiseLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T> asSubscribableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<T> ofSubscribableOfT(Subscribable<T> value) {
        return Js.cast( value );
    }
    
}
