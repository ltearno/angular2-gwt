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
public interface UnionOfCanvasGradientAndCanvasPatternAndString  {
    @JsOverlay
    default CanvasGradient asCanvasGradient() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCanvasGradientAndCanvasPatternAndString ofCanvasGradient(CanvasGradient value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CanvasPattern asCanvasPattern() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCanvasGradientAndCanvasPatternAndString ofCanvasPattern(CanvasPattern value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCanvasGradientAndCanvasPatternAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
