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
public interface UnionOfArrayOfObservableOfObjectAndObservableOfObject  {
    @JsOverlay
    default Array<Observable<Object>> asArrayOfObservableOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObservableOfObjectAndObservableOfObject ofArrayOfObservableOfObject(Array<Observable<Object>> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Observable<Object> asObservableOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObservableOfObjectAndObservableOfObject ofObservableOfObject(Observable<Object> value) {
        return Js.cast( value );
    }
    
}
