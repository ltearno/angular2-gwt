package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.PromiseLike;
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
public interface UnionOfPromiseLikeOfRAndSubscribableOfRAndVoid<R>  {
    @JsOverlay
    default PromiseLike<R> asPromiseLikeOfR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> UnionOfPromiseLikeOfRAndSubscribableOfRAndVoid<R> ofPromiseLikeOfR(PromiseLike<R> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<R> asSubscribableOfR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> UnionOfPromiseLikeOfRAndSubscribableOfRAndVoid<R> ofSubscribableOfR(Subscribable<R> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Void asVoid() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> UnionOfPromiseLikeOfRAndSubscribableOfRAndVoid<R> ofVoid(Void value) {
        return Js.cast( value );
    }
    
}
