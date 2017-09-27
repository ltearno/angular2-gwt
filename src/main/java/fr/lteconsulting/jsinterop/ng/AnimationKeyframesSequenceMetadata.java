package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationKeyframesSequenceMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:4390

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link keyframes keyframes animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationKeyframesSequenceMetadata")
public class AnimationKeyframesSequenceMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public Array<AnimationStyleMetadata> steps;

    @JsProperty( name = "steps")
    public native Array<AnimationStyleMetadata> getSteps();

    @JsProperty( name = "steps")
    public native void setSteps( Array<AnimationStyleMetadata> value );
}
