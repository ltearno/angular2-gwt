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
public interface UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean  {
    @JsOverlay
    default Boolean asBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean ofBoolean(Boolean value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Observable<Boolean> asObservableOfBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean ofObservableOfBoolean(Observable<Boolean> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Promise<Boolean> asPromiseOfBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndObservableOfBooleanAndPromiseOfBoolean ofPromiseOfBoolean(Promise<Boolean> value) {
        return Js.cast( value );
    }
    
}
