package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.AnimationMetadata;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAnimationMetadataAndArrayOfAnimationMetadata  {
    @JsOverlay
    default AnimationMetadata asAnimationMetadata() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnimationMetadataAndArrayOfAnimationMetadata ofAnimationMetadata(AnimationMetadata value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Array<AnimationMetadata> asArrayOfAnimationMetadata() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnimationMetadataAndArrayOfAnimationMetadata ofArrayOfAnimationMetadata(Array<AnimationMetadata> value) {
        return Js.cast( value );
    }
    
}
