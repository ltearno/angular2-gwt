package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfChangeDetectorRefAndTrackByFunctionOfV<V>  {
    @JsOverlay
    default ChangeDetectorRef asChangeDetectorRef() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <V> UnionOfChangeDetectorRefAndTrackByFunctionOfV<V> ofChangeDetectorRef(ChangeDetectorRef value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TrackByFunction<V> asTrackByFunctionOfV() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <V> UnionOfChangeDetectorRefAndTrackByFunctionOfV<V> ofTrackByFunctionOfV(TrackByFunction<V> value) {
        return Js.cast( value );
    }
    
}
