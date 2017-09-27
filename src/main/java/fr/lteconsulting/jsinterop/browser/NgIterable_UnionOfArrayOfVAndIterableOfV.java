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
public interface NgIterable_UnionOfArrayOfVAndIterableOfV<V>  {
    @JsOverlay
    default Array<V> asArrayOfV() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <V> NgIterable_UnionOfArrayOfVAndIterableOfV<V> ofArrayOfV(Array<V> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Iterable<V> asIterableOfV() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <V> NgIterable_UnionOfArrayOfVAndIterableOfV<V> ofIterableOfV(Iterable<V> value) {
        return Js.cast( value );
    }
    
}
