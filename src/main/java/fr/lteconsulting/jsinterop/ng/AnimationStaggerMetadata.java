package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationStaggerMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:7551

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link stagger stagger animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationStaggerMetadata")
public class AnimationStaggerMetadata extends AnimationMetadata
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

    public PropertyKey_UnionOfNumberAndString timings;

    @JsProperty( name = "timings")
    public native PropertyKey_UnionOfNumberAndString getTimings();

    @JsProperty( name = "timings")
    public native void setTimings( PropertyKey_UnionOfNumberAndString value );

    @JsOverlay
    public final void setTimings( Number value ) { setTimings(PropertyKey_UnionOfNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setTimings( String value ) { setTimings(PropertyKey_UnionOfNumberAndString.ofString( value )); }
}
