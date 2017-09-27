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
public interface UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject<T>  {
    @JsOverlay
    default Action1<T> asAction1OfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject<T> ofAction1OfT(Action1<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CompletionObserver<Object> asCompletionObserverOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject<T> ofCompletionObserverOfObject(CompletionObserver<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ErrorObserver<Object> asErrorObserverOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject<T> ofErrorObserverOfObject(ErrorObserver<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NextObserver<Object> asNextObserverOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject<T> ofNextObserverOfObject(NextObserver<Object> value) {
        return Js.cast( value );
    }
    
}
