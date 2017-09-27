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
public interface UnionOfConstrainDoubleRangeAndNumber  {
    @JsOverlay
    default ConstrainDoubleRange asConstrainDoubleRange() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConstrainDoubleRangeAndNumber ofConstrainDoubleRange(ConstrainDoubleRange value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfConstrainDoubleRangeAndNumber ofNumber(Number value) {
        return Js.cast( value );
    }
    
}
