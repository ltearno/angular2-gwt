package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.ArrayLike;
import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.rxjs.Subscribable;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T, R>  {
    @JsOverlay
    default Function1<T, R> asFunction1OfTAndR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, R> UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T, R> ofFunction1OfTAndR(Function1<T, R> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ArrayLike<T> asArrayLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, R> UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T, R> ofArrayLikeOfT(ArrayLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<T> asPromiseLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, R> UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T, R> ofPromiseLikeOfT(PromiseLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T> asSubscribableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T, R> UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T, R> ofSubscribableOfT(Subscribable<T> value) {
        return Js.cast( value );
    }
    
}
