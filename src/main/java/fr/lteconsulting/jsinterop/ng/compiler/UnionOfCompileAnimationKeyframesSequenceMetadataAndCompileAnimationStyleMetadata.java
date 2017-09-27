package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata extends CompileAnimationMetadata  {
    @JsOverlay
    public final CompileAnimationKeyframesSequenceMetadata asCompileAnimationKeyframesSequenceMetadata() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata ofCompileAnimationKeyframesSequenceMetadata(CompileAnimationKeyframesSequenceMetadata value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final CompileAnimationStyleMetadata asCompileAnimationStyleMetadata() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata ofCompileAnimationStyleMetadata(CompileAnimationStyleMetadata value) {
        return Js.uncheckedCast( value );
    }
    
}
