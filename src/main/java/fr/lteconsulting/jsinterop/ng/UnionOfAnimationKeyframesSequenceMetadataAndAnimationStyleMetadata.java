package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata extends AnimationMetadata  {
    @JsOverlay
    public final AnimationKeyframesSequenceMetadata asAnimationKeyframesSequenceMetadata() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata ofAnimationKeyframesSequenceMetadata(AnimationKeyframesSequenceMetadata value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final AnimationStyleMetadata asAnimationStyleMetadata() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata ofAnimationStyleMetadata(AnimationStyleMetadata value) {
        return Js.uncheckedCast( value );
    }
    
}
