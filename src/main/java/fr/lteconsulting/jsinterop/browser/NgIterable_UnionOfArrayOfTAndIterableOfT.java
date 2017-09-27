package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:299
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface NgIterable_UnionOfArrayOfTAndIterableOfT<T>  {
    @JsOverlay
    default Array<T> asArrayOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> NgIterable_UnionOfArrayOfTAndIterableOfT<T> ofArrayOfT(Array<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Iterable<T> asIterableOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> NgIterable_UnionOfArrayOfTAndIterableOfT<T> ofIterableOfT(Iterable<T> value) {
        return Js.cast( value );
    }
    
}
