package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationAnimateChildMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:5661

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link animateChild animateChild animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationAnimateChildMetadata")
public class AnimationAnimateChildMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public AnimationOptions options;

    @JsProperty( name = "options")
    public native AnimationOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationOptions value );
}
