package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfObservableOfTAndPromiseOfTAndT<T>  {
    @JsOverlay
    default Observable<T> asObservableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfObservableOfTAndPromiseOfTAndT<T> ofObservableOfT(Observable<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Promise<T> asPromiseOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfObservableOfTAndPromiseOfTAndT<T> ofPromiseOfT(Promise<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfObservableOfTAndPromiseOfTAndT<T> ofT(T value) {
        return Js.cast( value );
    }
    
}
