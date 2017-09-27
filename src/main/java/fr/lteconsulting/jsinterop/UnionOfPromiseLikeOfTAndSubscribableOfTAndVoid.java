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
public interface UnionOfPromiseLikeOfTAndSubscribableOfTAndVoid<T>  {
    @JsOverlay
    default PromiseLike<T> asPromiseLikeOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfPromiseLikeOfTAndSubscribableOfTAndVoid<T> ofPromiseLikeOfT(PromiseLike<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T> asSubscribableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfPromiseLikeOfTAndSubscribableOfTAndVoid<T> ofSubscribableOfT(Subscribable<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Void asVoid() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfPromiseLikeOfTAndSubscribableOfTAndVoid<T> ofVoid(Void value) {
        return Js.cast( value );
    }
    
}
