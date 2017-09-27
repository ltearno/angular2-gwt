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
public interface UnionOfConstrainLongRangeAndNumber  {
    @JsOverlay
    default ConstrainLongRange asConstrainLongRange() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConstrainLongRangeAndNumber ofConstrainLongRange(ConstrainLongRange value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConstrainLongRangeAndNumber ofNumber(Number value) {
        return Js.cast( value );
    }
    
}
