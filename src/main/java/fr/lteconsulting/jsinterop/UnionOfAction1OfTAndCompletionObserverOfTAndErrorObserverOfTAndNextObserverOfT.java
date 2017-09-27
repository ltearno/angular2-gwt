package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.rxjs.CompletionObserver;
import fr.lteconsulting.jsinterop.rxjs.ErrorObserver;
import fr.lteconsulting.jsinterop.rxjs.NextObserver;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T>  {
    @JsOverlay
    default Action1<T> asAction1OfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> ofAction1OfT(Action1<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CompletionObserver<T> asCompletionObserverOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> ofCompletionObserverOfT(CompletionObserver<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ErrorObserver<T> asErrorObserverOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> ofErrorObserverOfT(ErrorObserver<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NextObserver<T> asNextObserverOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> ofNextObserverOfT(NextObserver<T> value) {
        return Js.cast( value );
    }
    
}
