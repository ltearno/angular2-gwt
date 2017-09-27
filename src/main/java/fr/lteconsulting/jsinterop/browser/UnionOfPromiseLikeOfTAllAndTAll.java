package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfPromiseLikeOfTAllAndTAll<TAll>  {
    @JsOverlay
    default PromiseLike<TAll> asPromiseLikeOfTAll() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TAll> UnionOfPromiseLikeOfTAllAndTAll<TAll> ofPromiseLikeOfTAll(PromiseLike<TAll> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TAll asTAll() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <TAll> UnionOfPromiseLikeOfTAllAndTAll<TAll> ofTAll(TAll value) {
        return Js.cast( value );
    }
    
}
