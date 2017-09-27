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
public interface UnionOfBooleanAndMediaTrackConstraints  {
    @JsOverlay
    default Boolean asBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndMediaTrackConstraints ofBoolean(Boolean value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MediaTrackConstraints asMediaTrackConstraints() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndMediaTrackConstraints ofMediaTrackConstraints(MediaTrackConstraints value) {
        return Js.cast( value );
    }
    
}
