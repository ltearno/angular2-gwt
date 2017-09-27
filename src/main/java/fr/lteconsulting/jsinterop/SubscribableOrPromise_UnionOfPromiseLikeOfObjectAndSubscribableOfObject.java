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
public interface SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject  {
    @JsOverlay
    default PromiseLike<Object> asPromiseLikeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject ofPromiseLikeOfObject(PromiseLike<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<Object> asSubscribableOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject ofSubscribableOfObject(Subscribable<Object> value) {
        return Js.cast( value );
    }
    
}
