package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationTransitionMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:3476

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link transition transition animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationTransitionMetadata")
public class AnimationTransitionMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public UnionOfAnimationMetadataAndArrayOfAnimationMetadata animation;

    @JsProperty( name = "animation")
    public native UnionOfAnimationMetadataAndArrayOfAnimationMetadata getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( UnionOfAnimationMetadataAndArrayOfAnimationMetadata value );

    @JsOverlay
    public final void setAnimation( AnimationMetadata value ) { setAnimation(UnionOfAnimationMetadataAndArrayOfAnimationMetadata.ofAnimationMetadata( value )); }

    @JsOverlay
    public final void setAnimation( Array<AnimationMetadata> value ) { setAnimation(UnionOfAnimationMetadataAndArrayOfAnimationMetadata.ofArrayOfAnimationMetadata( value )); }

    public String expr;

    @JsProperty( name = "expr")
    public native String getExpr();

    @JsProperty( name = "expr")
    public native void setExpr( String value );

    public AnimationOptions options;

    @JsProperty( name = "options")
    public native AnimationOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationOptions value );
}
