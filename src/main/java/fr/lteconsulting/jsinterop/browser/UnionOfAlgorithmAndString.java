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
public interface UnionOfAlgorithmAndString  {
    @JsOverlay
    default Algorithm asAlgorithm() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAlgorithmAndString ofAlgorithm(Algorithm value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAlgorithmAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
