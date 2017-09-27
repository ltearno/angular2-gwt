package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfStringAndThetaStyleData {
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfStringAndThetaStyleData ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ThetaStyleData asɵStyleData() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfStringAndThetaStyleData ofɵStyleData(ThetaStyleData value) {
        return Js.cast( value );
    }

}
