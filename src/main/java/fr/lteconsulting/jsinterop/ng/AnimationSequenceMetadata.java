package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationSequenceMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:6436

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link sequence sequence animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationSequenceMetadata")
public class AnimationSequenceMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public AnimationOptions options;

    @JsProperty( name = "options")
    public native AnimationOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationOptions value );

    public Array<AnimationMetadata> steps;

    @JsProperty( name = "steps")
    public native Array<AnimationMetadata> getSteps();

    @JsProperty( name = "steps")
    public native void setSteps( Array<AnimationMetadata> value );
}
