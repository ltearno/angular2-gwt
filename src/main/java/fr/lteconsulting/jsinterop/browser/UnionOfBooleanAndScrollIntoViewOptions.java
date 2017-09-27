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
public interface UnionOfBooleanAndScrollIntoViewOptions  {
    @JsOverlay
    default Boolean asBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndScrollIntoViewOptions ofBoolean(Boolean value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ScrollIntoViewOptions asScrollIntoViewOptions() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndScrollIntoViewOptions ofScrollIntoViewOptions(ScrollIntoViewOptions value) {
        return Js.cast( value );
    }
    
}
