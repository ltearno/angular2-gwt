package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.ThetaStyleData;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfThetaStyleDataAndThetaStyleData {
    @JsOverlay
    default Array<ThetaStyleData> asArrayOfɵStyleData() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfArrayOfThetaStyleDataAndThetaStyleData ofArrayOfɵStyleData(Array<ThetaStyleData> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ThetaStyleData asɵStyleData() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfArrayOfThetaStyleDataAndThetaStyleData ofɵStyleData(ThetaStyleData value) {
        return Js.cast( value );
    }
    
}
