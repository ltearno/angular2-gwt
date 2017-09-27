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
public interface UnionOfArrayLikeOfObjectAndISchedulerAndPromiseLikeOfObjectAndSubscribableOfObject  {
    @JsOverlay
    default ArrayLike<Object> asArrayLikeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayLikeOfObjectAndISchedulerAndPromiseLikeOfObjectAndSubscribableOfObject ofArrayLikeOfObject(ArrayLike<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IScheduler asIScheduler() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayLikeOfObjectAndISchedulerAndPromiseLikeOfObjectAndSubscribableOfObject ofIScheduler(IScheduler value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<Object> asPromiseLikeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayLikeOfObjectAndISchedulerAndPromiseLikeOfObjectAndSubscribableOfObject ofPromiseLikeOfObject(PromiseLike<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<Object> asSubscribableOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayLikeOfObjectAndISchedulerAndPromiseLikeOfObjectAndSubscribableOfObject ofSubscribableOfObject(Subscribable<Object> value) {
        return Js.cast( value );
    }
    
}
