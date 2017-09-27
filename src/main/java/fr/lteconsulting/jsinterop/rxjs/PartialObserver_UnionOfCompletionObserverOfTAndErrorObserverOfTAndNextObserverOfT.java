package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Observer.d.ts:450
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T>  {
    @JsOverlay
    default CompletionObserver<T> asCompletionObserverOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> ofCompletionObserverOfT(CompletionObserver<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ErrorObserver<T> asErrorObserverOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> ofErrorObserverOfT(ErrorObserver<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NextObserver<T> asNextObserverOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> ofNextObserverOfT(NextObserver<T> value) {
        return Js.cast( value );
    }
    
}
