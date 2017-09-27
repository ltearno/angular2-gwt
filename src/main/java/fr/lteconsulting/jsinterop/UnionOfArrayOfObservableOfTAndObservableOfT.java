package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
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
public interface UnionOfArrayOfObservableOfTAndObservableOfT<T>  {
    @JsOverlay
    default Array<Observable<T>> asArrayOfObservableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayOfObservableOfTAndObservableOfT<T> ofArrayOfObservableOfT(Array<Observable<T>> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Observable<T> asObservableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfArrayOfObservableOfTAndObservableOfT<T> ofObservableOfT(Observable<T> value) {
        return Js.cast( value );
    }
    
}
