package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationAnimateRefMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:6028

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link useAnimation useAnimation animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationAnimateRefMetadata")
public class AnimationAnimateRefMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public AnimationReferenceMetadata animation;

    @JsProperty( name = "animation")
    public native AnimationReferenceMetadata getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( AnimationReferenceMetadata value );

    public AnimationOptions options;

    @JsProperty( name = "options")
    public native AnimationOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationOptions value );
}
