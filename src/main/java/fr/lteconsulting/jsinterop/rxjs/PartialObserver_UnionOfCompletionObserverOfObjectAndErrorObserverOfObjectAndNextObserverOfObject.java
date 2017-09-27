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
public interface PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject  {
    @JsOverlay
    default CompletionObserver<Object> asCompletionObserverOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject ofCompletionObserverOfObject(CompletionObserver<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ErrorObserver<Object> asErrorObserverOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject ofErrorObserverOfObject(ErrorObserver<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NextObserver<Object> asNextObserverOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject ofNextObserverOfObject(NextObserver<Object> value) {
        return Js.cast( value );
    }
    
}
