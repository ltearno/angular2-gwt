package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfFunction2OfObjectAndObjectAndBooleanAndString  {
    @JsOverlay
    default Function2<Object, Object, Boolean> asFunction2OfObjectAndObjectAndBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunction2OfObjectAndObjectAndBooleanAndString ofFunction2OfObjectAndObjectAndBoolean(Function2<Object, Object, Boolean> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunction2OfObjectAndObjectAndBooleanAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
