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
public interface ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther>  {
    @JsOverlay
    default ArrayLike<TOther> asArrayLikeOfTOther() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TOther> ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther> ofArrayLikeOfTOther(ArrayLike<TOther> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<TOther> asPromiseLikeOfTOther() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TOther> ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther> ofPromiseLikeOfTOther(PromiseLike<TOther> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<TOther> asSubscribableOfTOther() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TOther> ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther> ofSubscribableOfTOther(Subscribable<TOther> value) {
        return Js.cast( value );
    }
    
}
