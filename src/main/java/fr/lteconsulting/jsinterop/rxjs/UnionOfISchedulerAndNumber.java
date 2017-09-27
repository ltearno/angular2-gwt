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
public interface UnionOfISchedulerAndNumber  {
    @JsOverlay
    default IScheduler asIScheduler() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfISchedulerAndNumber ofIScheduler(IScheduler value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfISchedulerAndNumber ofNumber(Number value) {
        return Js.cast( value );
    }
    
}
