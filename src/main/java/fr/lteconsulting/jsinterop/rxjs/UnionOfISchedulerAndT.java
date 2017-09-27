package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfISchedulerAndT<T>  {
    @JsOverlay
    default IScheduler asIScheduler() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfISchedulerAndT<T> ofIScheduler(IScheduler value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T asT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> UnionOfISchedulerAndT<T> ofT(T value) {
        return Js.cast( value );
    }
    
}
